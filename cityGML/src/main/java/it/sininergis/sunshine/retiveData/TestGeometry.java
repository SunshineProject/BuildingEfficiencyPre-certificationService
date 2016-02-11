package it.sininergis.sunshine.retiveData;

import it.sinergis.modelloBuilding.MyBuilding;
import it.sininergis.sunshine.sdmToAde.GenerateAde;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
import org.citygml4j.model.gml.geometry.aggregates.MultiSurface;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.model.gml.geometry.complexes.CompositeSurface;
import org.citygml4j.model.gml.geometry.primitives.Solid;
import org.citygml4j.model.gml.geometry.primitives.SolidProperty;
import org.citygml4j.model.gml.geometry.primitives.SurfaceProperty;
import org.citygml4j.util.gmlid.DefaultGMLIdManager;
import org.citygml4j.util.gmlid.GMLIdManager;
import org.postgis.LinearRing;
import org.postgis.MultiPolygon;
import org.postgis.PGgeometry;
import org.postgis.Point;
import org.postgis.Polygon;

public class TestGeometry {
	static final GMLIdManager gmlIdManager = DefaultGMLIdManager.getInstance();
	
	public static void main(String args[]) throws SQLException, DimensionMismatchException {
		//MyConnection mc = new MyConnection();
		Connection psqlC = MyConnection.get_connection();
		Statement stmt = null;
		stmt = psqlC.createStatement();
		String query = "select geom,classid  from ferrara.building where gid = 10976";
		ResultSet rs = stmt.executeQuery(query);
		
		ArrayList<PGgeometry> buildings = new ArrayList<PGgeometry>();
		while (rs.next()) {
			buildings.add((PGgeometry) rs.getObject("geom"));
			
		}
		//buildings.get(0).toString()
		/*
		 * MultiPolygon mp = (MultiPolygon) buildings.get(0).getGeometry(); System.out.println(mp.toString());
		 * System.out.println(mp.getPolygons().length); System.out.println(buildings.get(0).getGeometry().numPoints());
		 * System.out.println(buildings.get(0).getGeometry().getType());
		 * System.out.println(buildings.get(0).getGeometry().MULTIPOLYGON); for (int i = 0; i < mp.getPolygons().length;
		 * i++) { Polygon po = mp.getPolygon(i); System.out.println("RINGS:\t" + po.numRings());
		 * //System.out.println("geoms:\t" + po.numGeoms()); for (int j = 0; j < po.numRings(); j++) { for (int k = 0; k
		 * < po.getRing(j).numPoints(); k++) { System.out.println((j) + "\t" + k + "\t" + po.getRing(j).getPoint(k)); }
		 * //System.out.println((i + 1) + "\t" + j + "\t" + buildings.get(0).getGeometry().getPoint(i)); } }
		 */
		Building building1 = new Building();
		//generateQualcosa(building1, (MultiPolygon) buildings.get(0).getGeometry(), 0.0, 10.0);
		
		//System.out.println(buildings.get(0).getGeometry().getPoint(0));
	}
	
	public static void generateBoundary(Building building, MyBuilding myBuilding, GenerateAde genade)
			throws DimensionMismatchException {
		MultiPolygon multypolig = myBuilding.getMultiPolygon();
		double base, altezza = 0;
		if (myBuilding.getElev_val() == null) {
			base = 0;
		}
		else {
			base = myBuilding.getElev_val();
		}
		
		if (myBuilding.getHeight_val() == null || myBuilding.getHeight_val() <= 0) {
			//TODO lancia ecezzione 			
		}
		else {
			altezza = base + myBuilding.getElev_val();
		}
		
		List<SurfaceProperty> surfaceMember = new ArrayList<SurfaceProperty>();
		List<BoundarySurfaceProperty> boundedBy = new ArrayList<BoundarySurfaceProperty>();
		
		for (int i = 0; i < multypolig.getPolygons().length; i++) {
			Polygon po = multypolig.getPolygon(i);
			
			org.citygml4j.model.gml.geometry.primitives.Polygon roof = generaPiano(po, altezza, false);
			surfaceMember.add(new SurfaceProperty('#' + roof.getId()));
			ADEComponent aroof = genade.buildConstructionType(myBuilding.getU_roof());
			boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_ROOF_SURFACE, roof, aroof));
			
			org.citygml4j.model.gml.geometry.primitives.Polygon ground = generaPiano(po, base, true);
			surfaceMember.add(new SurfaceProperty('#' + ground.getId()));
			ADEComponent aground = genade.buildConstructionType(myBuilding.getU_roof());
			
			boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_GROUND_SURFACE, ground, aground));
			
			for (int j = 0; j < po.numRings(); j++) {
				LinearRing lr = po.getRing(j);
				//generaTeto()
				for (int k = 0; k < lr.numPoints() - 1; k++) {
					org.citygml4j.model.gml.geometry.primitives.Polygon wall = generaMuro(lr.getPoint(k),
							lr.getPoint(k + 1), base, altezza);
					surfaceMember.add(new SurfaceProperty('#' + wall.getId()));
					ADEComponent afloor = genade.buildConstructionType(myBuilding.getU_floor());
					boundedBy.add(createBoundarySurface(CityGMLClass.BUILDING_WALL_SURFACE, wall, afloor));
				}
			}
			
			CompositeSurface compositeSurface = new CompositeSurface();
			compositeSurface.setSurfaceMember(surfaceMember);
			Solid solid = new Solid();
			solid.setExterior(new SurfaceProperty(compositeSurface));
			
			building.setLod2Solid(new SolidProperty(solid));
			building.setBoundedBySurface(boundedBy);
			
		}
		
	}
	
	public static org.citygml4j.model.gml.geometry.primitives.Polygon generaMuro(Point p1, Point p2, double base,
			double altezza) throws DimensionMismatchException {
		GMLGeometryFactory geom = new GMLGeometryFactory();
		ArrayList<Double> ard = new ArrayList<Double>();
		
		//angolo basso sinistra
		ard.add(p1.getX());
		ard.add(p1.getY());
		ard.add(base);
		//angolo alto sinistra:
		ard.add(p1.getX());
		ard.add(p1.getY());
		ard.add(altezza);
		//angolo alto destra:
		ard.add(p2.getX());
		ard.add(p2.getY());
		ard.add(altezza);
		//angolo basso destra:
		ard.add(p2.getX());
		ard.add(p2.getY());
		ard.add(base);
		//ritorno all'inizio
		ard.add(p1.getX());
		ard.add(p1.getY());
		ard.add(base);
		
		org.citygml4j.model.gml.geometry.primitives.Polygon wall = geom.createLinearPolygon(ard, 3);
		wall.setId(gmlIdManager.generateUUID());
		return wall;
		
	}
	
	public static org.citygml4j.model.gml.geometry.primitives.Polygon generaPiano(Polygon po, Double altezza,
			boolean verso) throws DimensionMismatchException {
		GMLGeometryFactory geom = new GMLGeometryFactory();
		Object[] ol = new Object[po.numRings()];
		
		for (int j = 0; j < po.numRings(); j++) {
			LinearRing lr = po.getRing(j);
			//generaTeto()
			ArrayList<Double> ld = new ArrayList<Double>();
			if (verso) {
				for (int k = 0; k < lr.numPoints(); k++) {
					Point s = lr.getPoint(k);
					ld.add(s.getX());
					ld.add(s.getY());
					ld.add(altezza);
					
				}
			}
			else {
				for (int k = lr.numPoints() - 1; k > 0; k--) {
					Point s = lr.getPoint(k);
					ld.add(s.getX());
					ld.add(s.getY());
					ld.add(altezza);
					
				}
				
			}
			//System.out.println(ld);
			ol[j] = ld;
		}
		org.citygml4j.model.gml.geometry.primitives.Polygon wall = geom.createLinearPolygon(ol, 3);
		//System.out.println(geom.createLinearPolygon(ol, 3));
		wall.setId(gmlIdManager.generateUUID());
		return wall;
		
	}
	
	private static BoundarySurfaceProperty createBoundarySurface(CityGMLClass type,
			org.citygml4j.model.gml.geometry.primitives.Polygon geometry, ADEComponent contructionType) {
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
			
			if (contructionType != null) {
				
				//boundarySurface.addGenericApplicationPropertyOfBoundarySurface(contructionType);
				boundarySurface.addGenericApplicationPropertyOfCityObject(contructionType);
			}
			return new BoundarySurfaceProperty(boundarySurface);
		}
		
		//assegno i valori di u_value sulla possibilità 
		
		return null;
	}
	
}
