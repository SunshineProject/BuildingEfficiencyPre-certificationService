package it.sininergis.sunshine.sdmToAde;

import it.sinergis.jaxb.AbsorptanceType;
import it.sinergis.jaxb.BuildingUnitPropertyType;
import it.sinergis.jaxb.BuildingUnitType;
import it.sinergis.jaxb.ConstructionPropertyType;
import it.sinergis.jaxb.ConstructionType;
import it.sinergis.jaxb.ObjectFactory;
import it.sinergis.jaxb.UsageZonePropertyType;
import it.sinergis.jaxb.UsageZoneType;
import it.sinergis.modelloBuilding.MyBuilding;
import it.sininergis.sunshine.retiveData.Constant;
import it.sininergis.sunshine.retiveData.MyConnection;
import it.sininergis.sunshine.retiveData.RetriveData;
import it.sininergis.sunshine.retiveData.TestGeometry;

import java.io.File;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import net.opengis.gml.AreaType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.citygml4j.CityGMLContext;
import org.citygml4j.builder.CityGMLBuilder;
import org.citygml4j.builder.jaxb.JAXBBuilder;
import org.citygml4j.builder.jaxb.JAXBContextPath;
import org.citygml4j.builder.jaxb.marshal.JAXBMarshaller;
import org.citygml4j.factory.DimensionMismatchException;
import org.citygml4j.factory.GMLGeometryFactory;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.AbstractBoundarySurface;
import org.citygml4j.model.citygml.building.BoundarySurfaceProperty;
import org.citygml4j.model.citygml.building.Building;
import org.citygml4j.model.citygml.building.GroundSurface;
import org.citygml4j.model.citygml.building.RoofSurface;
import org.citygml4j.model.citygml.building.WallSurface;
import org.citygml4j.model.citygml.core.CityModel;
import org.citygml4j.model.citygml.core.CityObjectMember;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurface;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.model.gml.geometry.complexes.CompositeSurface;
import org.citygml4j.model.gml.geometry.primitives.Polygon;
import org.citygml4j.model.gml.geometry.primitives.Solid;
import org.citygml4j.model.gml.geometry.primitives.SolidProperty;
import org.citygml4j.model.gml.geometry.primitives.SurfaceProperty;
import org.citygml4j.model.module.citygml.CityGMLVersion;
import org.citygml4j.util.gmlid.DefaultGMLIdManager;
import org.citygml4j.util.gmlid.GMLIdManager;
import org.citygml4j.xml.io.CityGMLOutputFactory;
import org.citygml4j.xml.io.writer.CityGMLWriteException;
import org.citygml4j.xml.io.writer.CityGMLWriter;
import org.citygml4j.xml.schema.SchemaHandler;
import org.postgis.PGgeometry;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class GenerateAde {
	static final Logger logger = Logger.getLogger(GenerateAde.class);
	static final String urlAde = Constant.URLADE;
	static final String urlResult = Constant.OUTPUTFILE;
	
	//generatore di uid casuali perl il citygml (penso importante sia unico per problemi di conciorrenza)
	static final GMLIdManager gmlIdManager = DefaultGMLIdManager.getInstance();
	
	//
	private CityGMLContext ctx;
	private CityGMLBuilder builder;
	private CityGMLWriter writer;
	
	private JAXBMarshaller marshaller;
	private ObjectFactory jaxbFactory;
	private JAXBContext jaxbCtx;
	
	public static void main(String[] args) throws JAXBException, CityGMLWriteException, SAXException,
			DimensionMismatchException {
		GenerateAde t = new GenerateAde();
		//t.mainSequence();
		t.generateXML(urlResult, "ferrara");
	}
	
	public void generateXML(String xmlLocation, String pilot) throws CityGMLWriteException, SAXException,
			JAXBException, DimensionMismatchException {
		BasicConfigurator.configure();
		logger.debug("setting up citygml4j context and JAXB builder!");
		energyAdeBuilder(urlAde, urlResult);
		LinkedList<MyBuilding> buildings = RetriveData.getBuildingList(pilot);
		System.out.println(buildings.size());
		CityModel cityModel = new CityModel();
		for (MyBuilding mb : buildings) {
			Building building1 = new Building();
			TestGeometry.generateBoundary(building1, mb, this);
			
			//energyPerformanceCertification(building1, mb.get);
			building1.setId(pilot + "-" + mb.getId() + "");
			
			buildingEndConstruction(building1, mb.getEnd());
			buildingRefurbishment(building1, mb.getRefurbishmentlevel());
			//buildingFunction(building1, mb.getNature());
			buildingUse(building1, mb.getUsages());
			buildingUsageZoneTypeGenerator(building1, mb);
			
			if (mb != null) {
				//building1.setYearOfConstruction(mb.getEnd());
			}
			//cityModel.setBoundedBy(building1.calcBoundedBy(false));
			//cityModel.a
			cityModel.addCityObjectMember(new CityObjectMember(building1));
			
		}
		
		writer.write(cityModel);
		writer.close();
		
	}
	
	public static void recuperaGeomTest(Building building) {
		Connection psqlC = MyConnection.get_connection();
		Statement stmt = null;
		try {
			stmt = psqlC.createStatement();
			
			String query = "select geom,classid  from ferrara.building where gid = 10976";
			ResultSet rs = stmt.executeQuery(query);
			
			ArrayList<PGgeometry> buildings = new ArrayList<PGgeometry>();
			while (rs.next()) {
				buildings.add((PGgeometry) rs.getObject("geom"));
				
			}
			//TestGeometry.generateQualcosa(building, (MultiPolygon) buildings.get(0).getGeometry(), 0.0, 10.0);
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//TODO gestioni delle ecezioni, capire cosa e come fare 
	public void energyAdeBuilder(String urlAde, String urlResult) throws CityGMLWriteException, SAXException,
			JAXBException {
		
		ctx = new CityGMLContext();
		builder = ctx.createCityGMLBuilder();
		
		SchemaHandler schemaHandler = SchemaHandler.newInstance();
		schemaHandler.parseSchema(new File(urlAde));
		
		JAXBBuilder builder = ctx.createJAXBBuilder();
		marshaller = builder.createJAXBMarshaller();
		jaxbFactory = new ObjectFactory();
		String contextPath = JAXBContextPath.getContextPath("it.sinergis.jaxb");
		jaxbCtx = JAXBContext.newInstance(contextPath);
		
		CityGMLOutputFactory out = builder.createCityGMLOutputFactory(CityGMLVersion.v2_0_0, schemaHandler);
		writer = out.createCityGMLWriter(new File(urlResult), "UTF-8");
		
		writer.setPrefixes(CityGMLVersion.DEFAULT);
		writer.setPrefix("energy", "http://www.sig3d.org/citygml/2.0/energy/0.5.0");
		writer.setSchemaLocations(CityGMLVersion.DEFAULT);
		writer.setSchemaLocation("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
				"http://www.sig3d.org/citygml/2.0/energy/0.5.0/xsd/energy.xsd");
		writer.setIndentString("  ");
		
		PGgeometry p = new PGgeometry();
		
		//return writer;
		
	}
	
	public void geometryGeneration(Building building) throws DimensionMismatchException {
		GMLGeometryFactory geom = new GMLGeometryFactory();
		Polygon ground = geom.createLinearPolygon(new double[] { 0, 0, 0, 0, 12, 0, 6, 12, 0, 6, 0, 0, 0, 0, 0 }, 3);
		Polygon wall_1 = geom.createLinearPolygon(new double[] { 6, 0, 0, 6, 12, 0, 6, 12, 6, 6, 0, 6, 6, 0, 0 }, 3);
		Polygon wall_2 = geom.createLinearPolygon(new double[] { 0, 0, 0, 0, 0, 6, 0, 12, 6, 0, 12, 0, 0, 0, 0 }, 3);
		Polygon wall_3 = geom.createLinearPolygon(
				new double[] { 0, 0, 0, 6, 0, 0, 6, 0, 6, 3, 0, 9, 0, 0, 6, 0, 0, 0 }, 3);
		Polygon wall_4 = geom.createLinearPolygon(new double[] { 6, 12, 0, 0, 12, 0, 0, 12, 6, 3, 12, 9, 6, 12, 6, 6,
				12, 0 }, 3);
		Polygon roof_1 = geom.createLinearPolygon(new double[] { 6, 0, 6, 6, 12, 6, 3, 12, 9, 3, 0, 9, 6, 0, 6 }, 3);
		Polygon roof_2 = geom.createLinearPolygon(new double[] { 0, 0, 6, 3, 0, 9, 3, 12, 9, 0, 12, 6, 0, 0, 6 }, 3);
		
		ground.setId(gmlIdManager.generateUUID());
		wall_1.setId(gmlIdManager.generateUUID());
		wall_2.setId(gmlIdManager.generateUUID());
		wall_3.setId(gmlIdManager.generateUUID());
		wall_4.setId(gmlIdManager.generateUUID());
		roof_1.setId(gmlIdManager.generateUUID());
		roof_2.setId(gmlIdManager.generateUUID());
		
		// lod2 solid
		List<SurfaceProperty> surfaceMember = new ArrayList<SurfaceProperty>();
		surfaceMember.add(new SurfaceProperty('#' + ground.getId()));
		surfaceMember.add(new SurfaceProperty('#' + wall_1.getId()));
		surfaceMember.add(new SurfaceProperty('#' + wall_2.getId()));
		surfaceMember.add(new SurfaceProperty('#' + wall_3.getId()));
		surfaceMember.add(new SurfaceProperty('#' + wall_4.getId()));
		surfaceMember.add(new SurfaceProperty('#' + roof_1.getId()));
		surfaceMember.add(new SurfaceProperty('#' + roof_2.getId()));
		
		CompositeSurface compositeSurface = new CompositeSurface();
		compositeSurface.setSurfaceMember(surfaceMember);
		Solid solid = new Solid();
		solid.setExterior(new SurfaceProperty(compositeSurface));
		
		//building.setLod2Solid(new SolidProperty(solid));
		
		List<BoundarySurfaceProperty> boundedBy = new ArrayList<BoundarySurfaceProperty>();
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_GROUND_SURFACE, ground));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_WALL_SURFACE, wall_1));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_WALL_SURFACE, wall_2));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_WALL_SURFACE, wall_3));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_WALL_SURFACE, wall_4));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_ROOF_SURFACE, roof_1));
		boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_ROOF_SURFACE, roof_2));
		
		//TOTO Capire bene cosa ci serve
		building.setLod2Solid(new SolidProperty(solid));
		building.setBoundedBySurface(boundedBy);
		
		//return new SolidProperty(solid);
		
	}
	
	/*
	 * Importato dall'esempio ser e per la geometrie consgtestualizate al tipo (capire se serve o rimuove)
	 */
	private static BoundarySurfaceProperty createBoundarySurface(CityGMLClass type, Polygon geometry) {
		AbstractBoundarySurface boundarySurface = null;
		
		switch (type) {
			case BUILDING_WALL_SURFACE:
				boundarySurface = new WallSurface();
				break;
			case BUILDING_ROOF_SURFACE:
				boundarySurface = new RoofSurface();
				break;
			case BUILDING_GROUND_SURFACE:
				boundarySurface = new GroundSurface();
				break;
			default:
				break;
		}
		
		if (boundarySurface != null) {
			boundarySurface.setLod2MultiSurface(new MultiSurfaceProperty(new MultiSurface(geometry)));
			return new BoundarySurfaceProperty(boundarySurface);
		}
		
		return null;
	}
	
	/*
	 * 
	 */
	public void buildingUsageZoneTypeGenerator(Building building, MyBuilding mb) {
		UsageZonePropertyType usageZones = new UsageZonePropertyType();
		
		UsageZoneType usageZone = new UsageZoneType();
		if (mb.getFloor() != null) {
			usageZone.getUsedFloorNumbers();
			List<BigInteger> floorl = usageZone.getUsedFloorNumbers();
			for (int i = 0; i < mb.getFloor(); i++) {
				floorl.add(new BigInteger(i + ""));
			}
		}
		
		CodeType c1 = new CodeType();
		//TODO cambiare da residential costante alla tipologia coretta
		c1.setValue("residential");
		usageZone.setUsageZoneClass(c1);
		AreaType a = new AreaType();
		a.setUom("meter");
		a.setValue(mb.getArea());
		usageZone.setUsedArea(a);
		List<BuildingUnitPropertyType> l = usageZone.getContains();
		
		//usageZone.setId(value);
		
		usageZones.setUsageZone(usageZone);
		Element buildingUnitElemet2 = marshaller.marshalDOMElement(jaxbFactory.createUsageZones(usageZones), jaxbCtx);
		ADEComponent newADE2 = new ADEComponent(buildingUnitElemet2);
		building.addGenericApplicationPropertyOfBuilding(newADE2);
		
		//return null;
	}
	
	public void energyPerformanceCertification(Building building, String peformance) {
		Element buildingUnitElemet = marshaller.marshalDOMElement(jaxbFactory
				.createEnergyPerformanceCertification(peformance));
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		building.addGenericApplicationPropertyOfBuilding(newADE);
	}
	
	public void buildingType(Building building, String type) {
		
		CodeType cd = new CodeType();
		cd.setCodeSpace("space");
		cd.setValue("value");
		
		Element buildingUnitElemet = marshaller.marshalDOMElement(jaxbFactory.createBuildingType(cd));
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		building.addGenericApplicationPropertyOfBuilding(newADE);
	}
	
	/*
	 * AbsorptanceType a = new AbsorptanceType(); //SurfaceSideType s = new SurfaceSide Element newADE1 = new
	 * ADEComponent(buildingUnitElemet1); building.addGenericApplicationPropertyOfBuilding(newADE1);
	 */
	public void absorptanceType(Building building, Double percentage) {
		AbsorptanceType a = new AbsorptanceType();
		a.setPercentage(percentage);
		Element buildingUnitElemet = marshaller.marshalDOMElement(jaxbFactory.createAbsorptance(a), jaxbCtx);
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		
		building.addGenericApplicationPropertyOfBuilding(newADE);
		
	}
	
	/*
	 * BuildingUnitType buildingUnit = new BuildingUnitType(); buildingUnit.setOwnerName("è casa mia");
	 * BoundingShapeType s = new BoundingShapeType(); buildingUnit.setBoundedBy(s); //int s =
	 * buildingUnit.getName().size(); System.out.println(buildingUnit.getOwnerName()); Element buildingUnitElemet =
	 * marshaller .marshalDOMElement(jaxbFactory.createBuildingUnit(buildingUnit), jaxbCtx); ADEComponent newADE = new
	 * ADEComponent(buildingUnitElemet); building.addGenericApplicationProperty
	 */
	
	public void buildingUnitType(Building building, String owner) {
		BuildingUnitType buildingUnit = new BuildingUnitType();
		buildingUnit.setOwnerName(owner);
		
		//buildingUnit.set_GenericApplicationPropertyOfCityObject(null);
		
		//buildingUnit.set_GenericAttribute(null);
		
		Element buildingUnitElemet = marshaller
				.marshalDOMElement(jaxbFactory.createBuildingUnit(buildingUnit), jaxbCtx);
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		building.addGenericApplicationPropertyOfBuilding(newADE);
		
	}
	
	public ADEComponent buildConstructionType(Double u_value) {
		if (u_value == null)
			return null;
		ConstructionPropertyType cpt = new ConstructionPropertyType();
		ConstructionType ct = new ConstructionType();
		MeasureType mt = new MeasureType();
		mt.setUom("W/(m^2K)");
		mt.setValue(u_value);
		
		ct.setUValue(mt);
		cpt.setConstruction(ct);
		
		Element buildingUnitElemet = marshaller.marshalDOMElement(jaxbFactory.createConstruction1(cpt), jaxbCtx);
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		
		return newADE;
	}
	
	public void buildingEndConstruction(Building building, Integer year) {
		if (year == null)
			return;
		GregorianCalendar gc = new GregorianCalendar(year, 0, 0);
		building.setYearOfConstruction(gc);
		
	}
	
	public void buildingRefurbishment(Building building, String ref) {
		if (ref == null)
			return;
		//GregorianCalendar gc = new GregorianCalendar(year, 0, 0);
		Element buildingUnitElemet = marshaller.marshalDOMElement(jaxbFactory.createRefurbishmentClass(ref), jaxbCtx);
		ADEComponent newADE = new ADEComponent(buildingUnitElemet);
		building.addGenericApplicationPropertyOfAbstractBuilding(newADE);
		
	}
	
	public void buildingFunction(Building building, String nature) {
		if (nature == null)
			return;
		Code c = new Code(nature);
		LinkedList<Code> cl = new LinkedList<Code>();
		cl.add(c);
		building.setFunction(cl);
		
	}
	
	public void buildingUse(Building building, LinkedList<String> usi) {
		if (usi == null || usi.size() < 1)
			return;
		LinkedList<Code> cl = new LinkedList<Code>();
		for (String uso : usi) {
			Code c = new Code(uso);
			cl.add(c);
		}
		building.setFunction(cl);
		
	}
	
}
