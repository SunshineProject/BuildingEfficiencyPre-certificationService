package it.sinergis.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import net.opengis.gml.AreaType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.ScaleType;
import net.opengis.gml.VolumeType;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * it.sinergis.jaxb package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 */
@XmlRegistry
public class ObjectFactory {
	
	private final static QName _BuildingType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"buildingType");
	private final static QName _YearOfRefurbishment_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"yearOfRefurbishment");
	private final static QName _RefurbishmentClass_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"refurbishmentClass");
	private final static QName _Has_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "has");
	private final static QName _EnergyCarrier_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EnergyCarrier");
	private final static QName _Construction_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Construction");
	private final static QName _ShadingType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ShadingType");
	private final static QName _HeatExchangeType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"HeatExchangeType");
	private final static QName _DistrictNetworkSubstation_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "DistrictNetworkSubstation");
	private final static QName _Emittance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Emittance");
	private final static QName _ThermalBoundarySurface_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "ThermalBoundarySurface");
	private final static QName _Glazing_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "Glazing");
	private final static QName _AtticType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"atticType");
	private final static QName _SolarThermalSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"SolarThermalSystem");
	private final static QName _Transmittance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Transmittance");
	private final static QName __StorageSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"_StorageSystem");
	private final static QName _PowerDistributionSystem_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "PowerDistributionSystem");
	private final static QName _BasementType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"basementType");
	private final static QName _EnergyDemand_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EnergyDemand");
	private final static QName _Absorptance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Absorptance");
	private final static QName _Occupancy_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Occupancy");
	private final static QName _BuildingUnit_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"BuildingUnit");
	private final static QName _OpaqueMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"OpaqueMaterial");
	private final static QName _ConstructionStyle_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"constructionStyle");
	private final static QName _ReferenceGeoCoordinates_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "referenceGeoCoordinates");
	private final static QName _EnergySupply_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EnergySupply");
	private final static QName _ThermalZones_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"thermalZones");
	private final static QName _ThermalStorageSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ThermalStorageSystem");
	private final static QName _ConstructionOrientation1_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "constructionOrientation");
	private final static QName _RidgeHeight_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ridgeHeight");
	private final static QName _EnergyCoverage_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EnergyCoverage");
	private final static QName _Boiler_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "Boiler");
	private final static QName _UsageZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"UsageZone");
	private final static QName __TimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"_TimeSeries");
	private final static QName _Layer_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "Layer");
	private final static QName _ThermalDistributionSystem_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "ThermalDistributionSystem");
	private final static QName _OperationMode_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"OperationMode");
	private final static QName _EnergyDistributionSystem_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "EnergyDistributionSystem");
	private final static QName _AbstractMaterial_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"AbstractMaterial");
	private final static QName _RegularTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"RegularTimeSeries");
	private final static QName _SurfaceComponent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"SurfaceComponent");
	private final static QName _EnergyConversionSystem_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "EnergyConversionSystem");
	private final static QName _OpenableRatio_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"openableRatio");
	private final static QName _TimeValuesProperties_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"TimeValuesProperties");
	private final static QName _OutdoorShading_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"outdoorShading");
	private final static QName _Reflectance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Reflectance");
	private final static QName _UsageZones_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"usageZones");
	private final static QName _EquippedWith_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"equippedWith");
	private final static QName _ScheduleLoD1_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ScheduleLoD1");
	private final static QName _ScheduleLoD0_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ScheduleLoD0");
	private final static QName _ScheduleLoD3_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ScheduleLoD3");
	private final static QName _ScheduleLoD2_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ScheduleLoD2");
	private final static QName _ReferenceHeatedFloorArea_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "referenceHeatedFloorArea");
	private final static QName _IrregularTimeSeries_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"IrregularTimeSeries");
	private final static QName _DailySchedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"DailySchedule");
	private final static QName _EnergyDemands_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"energyDemands");
	private final static QName _Facilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Facilities");
	private final static QName _PowerStorageSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"PowerStorageSystem");
	private final static QName _CorrespondsTo_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"correspondsTo");
	private final static QName _Gas_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "Gas");
	private final static QName _HeatPump_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0", "HeatPump");
	private final static QName _BasementCeilingHeightAboveGroundSurface_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "basementCeilingHeightAboveGroundSurface");
	private final static QName __Schedule_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"_Schedule");
	private final static QName _EavesHeight_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"eavesHeight");
	private final static QName _EnergyPerformanceCertification_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "energyPerformanceCertification");
	private final static QName __SolarEnergySystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"_SolarEnergySystem");
	private final static QName _MechanicalVentilation_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "MechanicalVentilation");
	private final static QName _ControlType_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ControlType");
	private final static QName _AverageStoreyHeight_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"averageStoreyHeight");
	private final static QName _PhotovoltaicSystem_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"PhotovoltaicSystem");
	private final static QName _Landmarked_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"landmarked");
	private final static QName _EnergySource_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EnergySource");
	private final static QName _Household_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"Household");
	private final static QName _Construction1_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"construction");
	private final static QName _GrossVolume_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"grossVolume");
	private final static QName _ImageTexture_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ImageTexture");
	private final static QName _ElectricalAppliances_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ElectricalAppliances");
	private final static QName _ThermalZone_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ThermalZone");
	private final static QName _MeasurementPoint_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"MeasurementPoint");
	private final static QName _ConstructionOrientation_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "ConstructionOrientation");
	private final static QName _DHWFacilities_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"DHWFacilities");
	private final static QName _ElectricalResistance_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"ElectricalResistance");
	private final static QName _IndoorShading_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"indoorShading");
	private final static QName _LayerComponent_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"LayerComponent");
	private final static QName _CombinedHeatPower_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"CombinedHeatPower");
	private final static QName _EndUseUnit_QNAME = new QName("http://www.sig3d.org/citygml/2.0/energy/0.5.0",
			"EndUseUnit");
	private final static QName _ElectricalAppliancesTypeElectricalPower_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "electricalPower");
	private final static QName _ElectricalAppliancesTypeName_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "name");
	private final static QName _ElectricalAppliancesTypeHeatLosses_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "heatLosses");
	private final static QName _ThermalZoneTypeIndirectlyHeatedAreaRatio_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "indirectlyHeatedAreaRatio");
	private final static QName _ThermalZoneTypeRelates_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "relates");
	private final static QName _ThermalZoneTypeInfiltrationRate_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "infiltrationRate");
	private final static QName _ThermalZoneTypeBoundedBy_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "boundedBy");
	private final static QName _ThermalZoneTypeHeatedFloorArea_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "heatedFloorArea");
	private final static QName _ThermalZoneTypeEffectiveThermalCapacity_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "effectiveThermalCapacity");
	private final static QName _ThermalZoneTypeAdditionalThermalBridgeUValue_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "additionalThermalBridgeUValue");
	private final static QName _ThermalZoneTypeCooledFloorArea_QNAME = new QName(
			"http://www.sig3d.org/citygml/2.0/energy/0.5.0", "cooledFloorArea");
	
	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * it.sinergis.jaxb
	 */
	public ObjectFactory() {
	}
	
	/**
	 * Create an instance of {@link EnergyCarrierType }
	 */
	public EnergyCarrierType createEnergyCarrierType() {
		return new EnergyCarrierType();
	}
	
	/**
	 * Create an instance of {@link ReflectanceType }
	 */
	public ReflectanceType createReflectanceType() {
		return new ReflectanceType();
	}
	
	/**
	 * Create an instance of {@link UsageZonePropertyType }
	 */
	public UsageZonePropertyType createUsageZonePropertyType() {
		return new UsageZonePropertyType();
	}
	
	/**
	 * Create an instance of {@link ThermalZoneType }
	 */
	public ThermalZoneType createThermalZoneType() {
		return new ThermalZoneType();
	}
	
	/**
	 * Create an instance of {@link BuildingUnitType }
	 */
	public BuildingUnitType createBuildingUnitType() {
		return new BuildingUnitType();
	}
	
	/**
	 * Create an instance of {@link PowerStorageSystemType }
	 */
	public PowerStorageSystemType createPowerStorageSystemType() {
		return new PowerStorageSystemType();
	}
	
	/**
	 * Create an instance of {@link EmittanceType }
	 */
	public EmittanceType createEmittanceType() {
		return new EmittanceType();
	}
	
	/**
	 * Create an instance of {@link EnergyConversionSystemPropertyType }
	 */
	public EnergyConversionSystemPropertyType createEnergyConversionSystemPropertyType() {
		return new EnergyConversionSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link OperationModeType }
	 */
	public OperationModeType createOperationModeType() {
		return new OperationModeType();
	}
	
	/**
	 * Create an instance of {@link ThermalBoundarySurfacePropertyType }
	 */
	public ThermalBoundarySurfacePropertyType createThermalBoundarySurfacePropertyType() {
		return new ThermalBoundarySurfacePropertyType();
	}
	
	/**
	 * Create an instance of {@link _SolarEnergySystemPropertyType }
	 */
	public _SolarEnergySystemPropertyType create_SolarEnergySystemPropertyType() {
		return new _SolarEnergySystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergyDistributionSystemType }
	 */
	public EnergyDistributionSystemType createEnergyDistributionSystemType() {
		return new EnergyDistributionSystemType();
	}
	
	/**
	 * Create an instance of {@link ThermalBoundarySurfaceType }
	 */
	public ThermalBoundarySurfaceType createThermalBoundarySurfaceType() {
		return new ThermalBoundarySurfaceType();
	}
	
	/**
	 * Create an instance of {@link EnergyConversionSystemType }
	 */
	public EnergyConversionSystemType createEnergyConversionSystemType() {
		return new EnergyConversionSystemType();
	}
	
	/**
	 * Create an instance of {@link ThermalDistributionSystemType }
	 */
	public ThermalDistributionSystemType createThermalDistributionSystemType() {
		return new ThermalDistributionSystemType();
	}
	
	/**
	 * Create an instance of {@link ShadingTypePropertyType }
	 */
	public ShadingTypePropertyType createShadingTypePropertyType() {
		return new ShadingTypePropertyType();
	}
	
	/**
	 * Create an instance of {@link DistrictNetworkSubstationType }
	 */
	public DistrictNetworkSubstationType createDistrictNetworkSubstationType() {
		return new DistrictNetworkSubstationType();
	}
	
	/**
	 * Create an instance of {@link FacilitiesType }
	 */
	public FacilitiesType createFacilitiesType() {
		return new FacilitiesType();
	}
	
	/**
	 * Create an instance of {@link DailyScheduleType }
	 */
	public DailyScheduleType createDailyScheduleType() {
		return new DailyScheduleType();
	}
	
	/**
	 * Create an instance of {@link UsageZoneType }
	 */
	public UsageZoneType createUsageZoneType() {
		return new UsageZoneType();
	}
	
	/**
	 * Create an instance of {@link OccupancyType }
	 */
	public OccupancyType createOccupancyType() {
		return new OccupancyType();
	}
	
	/**
	 * Create an instance of {@link EnergyDemandPropertyType }
	 */
	public EnergyDemandPropertyType createEnergyDemandPropertyType() {
		return new EnergyDemandPropertyType();
	}
	
	/**
	 * Create an instance of {@link BoilerType }
	 */
	public BoilerType createBoilerType() {
		return new BoilerType();
	}
	
	/**
	 * Create an instance of {@link PowerDistributionSystemType }
	 */
	public PowerDistributionSystemType createPowerDistributionSystemType() {
		return new PowerDistributionSystemType();
	}
	
	/**
	 * Create an instance of {@link ElectricalAppliancesType }
	 */
	public ElectricalAppliancesType createElectricalAppliancesType() {
		return new ElectricalAppliancesType();
	}
	
	/**
	 * Create an instance of {@link RegularTimeSeriesType }
	 */
	public RegularTimeSeriesType createRegularTimeSeriesType() {
		return new RegularTimeSeriesType();
	}
	
	/**
	 * Create an instance of {@link ImageTextureType }
	 */
	public ImageTextureType createImageTextureType() {
		return new ImageTextureType();
	}
	
	/**
	 * Create an instance of {@link SurfaceComponentType }
	 */
	public SurfaceComponentType createSurfaceComponentType() {
		return new SurfaceComponentType();
	}
	
	/**
	 * Create an instance of {@link OpaqueMaterialType }
	 */
	public OpaqueMaterialType createOpaqueMaterialType() {
		return new OpaqueMaterialType();
	}
	
	/**
	 * Create an instance of {@link EnergyDemandType }
	 */
	public EnergyDemandType createEnergyDemandType() {
		return new EnergyDemandType();
	}
	
	/**
	 * Create an instance of {@link LayerComponentType }
	 */
	public LayerComponentType createLayerComponentType() {
		return new LayerComponentType();
	}
	
	/**
	 * Create an instance of {@link AbsorptanceType }
	 */
	public AbsorptanceType createAbsorptanceType() {
		return new AbsorptanceType();
	}
	
	/**
	 * Create an instance of {@link IrregularTimeSeriesType }
	 */
	public IrregularTimeSeriesType createIrregularTimeSeriesType() {
		return new IrregularTimeSeriesType();
	}
	
	/**
	 * Create an instance of {@link ConstructionPropertyType }
	 */
	public ConstructionPropertyType createConstructionPropertyType() {
		return new ConstructionPropertyType();
	}
	
	/**
	 * Create an instance of {@link TransmittanceType }
	 */
	public TransmittanceType createTransmittanceType() {
		return new TransmittanceType();
	}
	
	/**
	 * Create an instance of {@link TimeValuesPropertiesType }
	 */
	public TimeValuesPropertiesType createTimeValuesPropertiesType() {
		return new TimeValuesPropertiesType();
	}
	
	/**
	 * Create an instance of {@link ElectricalResistanceType }
	 */
	public ElectricalResistanceType createElectricalResistanceType() {
		return new ElectricalResistanceType();
	}
	
	/**
	 * Create an instance of {@link EnergyCoverageType }
	 */
	public EnergyCoverageType createEnergyCoverageType() {
		return new EnergyCoverageType();
	}
	
	/**
	 * Create an instance of {@link CombinedHeatPowerType }
	 */
	public CombinedHeatPowerType createCombinedHeatPowerType() {
		return new CombinedHeatPowerType();
	}
	
	/**
	 * Create an instance of {@link DHWFacilitiesType }
	 */
	public DHWFacilitiesType createDHWFacilitiesType() {
		return new DHWFacilitiesType();
	}
	
	/**
	 * Create an instance of {@link HeatExchangeTypeType }
	 */
	public HeatExchangeTypeType createHeatExchangeTypeType() {
		return new HeatExchangeTypeType();
	}
	
	/**
	 * Create an instance of {@link EndUseUnitType }
	 */
	public EndUseUnitType createEndUseUnitType() {
		return new EndUseUnitType();
	}
	
	/**
	 * Create an instance of {@link HouseholdType }
	 */
	public HouseholdType createHouseholdType() {
		return new HouseholdType();
	}
	
	/**
	 * Create an instance of {@link MeasurementPointType }
	 */
	public MeasurementPointType createMeasurementPointType() {
		return new MeasurementPointType();
	}
	
	/**
	 * Create an instance of {@link HeatPumpType }
	 */
	public HeatPumpType createHeatPumpType() {
		return new HeatPumpType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD3Type }
	 */
	public ScheduleLoD3Type createScheduleLoD3Type() {
		return new ScheduleLoD3Type();
	}
	
	/**
	 * Create an instance of {@link ConstructionType }
	 */
	public ConstructionType createConstructionType() {
		return new ConstructionType();
	}
	
	/**
	 * Create an instance of {@link ConstructionOrientationType }
	 */
	public ConstructionOrientationType createConstructionOrientationType() {
		return new ConstructionOrientationType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD2Type }
	 */
	public ScheduleLoD2Type createScheduleLoD2Type() {
		return new ScheduleLoD2Type();
	}
	
	/**
	 * Create an instance of {@link MechanicalVentilationType }
	 */
	public MechanicalVentilationType createMechanicalVentilationType() {
		return new MechanicalVentilationType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD1Type }
	 */
	public ScheduleLoD1Type createScheduleLoD1Type() {
		return new ScheduleLoD1Type();
	}
	
	/**
	 * Create an instance of {@link ControlTypeType }
	 */
	public ControlTypeType createControlTypeType() {
		return new ControlTypeType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD0Type }
	 */
	public ScheduleLoD0Type createScheduleLoD0Type() {
		return new ScheduleLoD0Type();
	}
	
	/**
	 * Create an instance of {@link PhotovoltaicSystemType }
	 */
	public PhotovoltaicSystemType createPhotovoltaicSystemType() {
		return new PhotovoltaicSystemType();
	}
	
	/**
	 * Create an instance of {@link GasType }
	 */
	public GasType createGasType() {
		return new GasType();
	}
	
	/**
	 * Create an instance of {@link LayerType }
	 */
	public LayerType createLayerType() {
		return new LayerType();
	}
	
	/**
	 * Create an instance of {@link ConstructionOrientationPropertyType }
	 */
	public ConstructionOrientationPropertyType createConstructionOrientationPropertyType() {
		return new ConstructionOrientationPropertyType();
	}
	
	/**
	 * Create an instance of {@link ThermalStorageSystemType }
	 */
	public ThermalStorageSystemType createThermalStorageSystemType() {
		return new ThermalStorageSystemType();
	}
	
	/**
	 * Create an instance of {@link ShadingTypeType }
	 */
	public ShadingTypeType createShadingTypeType() {
		return new ShadingTypeType();
	}
	
	/**
	 * Create an instance of {@link SolarThermalSystemType }
	 */
	public SolarThermalSystemType createSolarThermalSystemType() {
		return new SolarThermalSystemType();
	}
	
	/**
	 * Create an instance of {@link ThermalZonePropertyType }
	 */
	public ThermalZonePropertyType createThermalZonePropertyType() {
		return new ThermalZonePropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergySupplyType }
	 */
	public EnergySupplyType createEnergySupplyType() {
		return new EnergySupplyType();
	}
	
	/**
	 * Create an instance of {@link GlazingType }
	 */
	public GlazingType createGlazingType() {
		return new GlazingType();
	}
	
	/**
	 * Create an instance of {@link EnergySourceType }
	 */
	public EnergySourceType createEnergySourceType() {
		return new EnergySourceType();
	}
	
	/**
	 * Create an instance of {@link AbsorptancePropertyType }
	 */
	public AbsorptancePropertyType createAbsorptancePropertyType() {
		return new AbsorptancePropertyType();
	}
	
	/**
	 * Create an instance of {@link OccupancyPropertyType }
	 */
	public OccupancyPropertyType createOccupancyPropertyType() {
		return new OccupancyPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergySourcePropertyType }
	 */
	public EnergySourcePropertyType createEnergySourcePropertyType() {
		return new EnergySourcePropertyType();
	}
	
	/**
	 * Create an instance of {@link PowerStorageSystemPropertyType }
	 */
	public PowerStorageSystemPropertyType createPowerStorageSystemPropertyType() {
		return new PowerStorageSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link EmittancePropertyType }
	 */
	public EmittancePropertyType createEmittancePropertyType() {
		return new EmittancePropertyType();
	}
	
	/**
	 * Create an instance of {@link RegularTimeSeriesPropertyType }
	 */
	public RegularTimeSeriesPropertyType createRegularTimeSeriesPropertyType() {
		return new RegularTimeSeriesPropertyType();
	}
	
	/**
	 * Create an instance of {@link TransmittancePropertyType }
	 */
	public TransmittancePropertyType createTransmittancePropertyType() {
		return new TransmittancePropertyType();
	}
	
	/**
	 * Create an instance of {@link _SchedulePropertyType }
	 */
	public _SchedulePropertyType create_SchedulePropertyType() {
		return new _SchedulePropertyType();
	}
	
	/**
	 * Create an instance of {@link FacilitiesPropertyType }
	 */
	public FacilitiesPropertyType createFacilitiesPropertyType() {
		return new FacilitiesPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergySupplyPropertyType }
	 */
	public EnergySupplyPropertyType createEnergySupplyPropertyType() {
		return new EnergySupplyPropertyType();
	}
	
	/**
	 * Create an instance of {@link LayerComponentPropertyType }
	 */
	public LayerComponentPropertyType createLayerComponentPropertyType() {
		return new LayerComponentPropertyType();
	}
	
	/**
	 * Create an instance of {@link DHWFacilitiesPropertyType }
	 */
	public DHWFacilitiesPropertyType createDHWFacilitiesPropertyType() {
		return new DHWFacilitiesPropertyType();
	}
	
	/**
	 * Create an instance of {@link DistrictNetworkSubstationPropertyType }
	 */
	public DistrictNetworkSubstationPropertyType createDistrictNetworkSubstationPropertyType() {
		return new DistrictNetworkSubstationPropertyType();
	}
	
	/**
	 * Create an instance of {@link SurfaceComponentPropertyType }
	 */
	public SurfaceComponentPropertyType createSurfaceComponentPropertyType() {
		return new SurfaceComponentPropertyType();
	}
	
	/**
	 * Create an instance of {@link ImageTexturePropertyType }
	 */
	public ImageTexturePropertyType createImageTexturePropertyType() {
		return new ImageTexturePropertyType();
	}
	
	/**
	 * Create an instance of {@link OperationModePropertyType }
	 */
	public OperationModePropertyType createOperationModePropertyType() {
		return new OperationModePropertyType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD2PropertyType }
	 */
	public ScheduleLoD2PropertyType createScheduleLoD2PropertyType() {
		return new ScheduleLoD2PropertyType();
	}
	
	/**
	 * Create an instance of {@link GlazingPropertyType }
	 */
	public GlazingPropertyType createGlazingPropertyType() {
		return new GlazingPropertyType();
	}
	
	/**
	 * Create an instance of {@link MechanicalVentilationPropertyType }
	 */
	public MechanicalVentilationPropertyType createMechanicalVentilationPropertyType() {
		return new MechanicalVentilationPropertyType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD0PropertyType }
	 */
	public ScheduleLoD0PropertyType createScheduleLoD0PropertyType() {
		return new ScheduleLoD0PropertyType();
	}
	
	/**
	 * Create an instance of {@link BuildingUnitPropertyType }
	 */
	public BuildingUnitPropertyType createBuildingUnitPropertyType() {
		return new BuildingUnitPropertyType();
	}
	
	/**
	 * Create an instance of {@link IrregularTimeSeriesPropertyType }
	 */
	public IrregularTimeSeriesPropertyType createIrregularTimeSeriesPropertyType() {
		return new IrregularTimeSeriesPropertyType();
	}
	
	/**
	 * Create an instance of {@link ThermalStorageSystemPropertyType }
	 */
	public ThermalStorageSystemPropertyType createThermalStorageSystemPropertyType() {
		return new ThermalStorageSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link ElectricalAppliancesPropertyType }
	 */
	public ElectricalAppliancesPropertyType createElectricalAppliancesPropertyType() {
		return new ElectricalAppliancesPropertyType();
	}
	
	/**
	 * Create an instance of {@link TimeValuesPropertiesPropertyType }
	 */
	public TimeValuesPropertiesPropertyType createTimeValuesPropertiesPropertyType() {
		return new TimeValuesPropertiesPropertyType();
	}
	
	/**
	 * Create an instance of {@link ReflectancePropertyType }
	 */
	public ReflectancePropertyType createReflectancePropertyType() {
		return new ReflectancePropertyType();
	}
	
	/**
	 * Create an instance of {@link HeatExchangeTypePropertyType }
	 */
	public HeatExchangeTypePropertyType createHeatExchangeTypePropertyType() {
		return new HeatExchangeTypePropertyType();
	}
	
	/**
	 * Create an instance of {@link MeasurementPointPropertyType }
	 */
	public MeasurementPointPropertyType createMeasurementPointPropertyType() {
		return new MeasurementPointPropertyType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD3PropertyType }
	 */
	public ScheduleLoD3PropertyType createScheduleLoD3PropertyType() {
		return new ScheduleLoD3PropertyType();
	}
	
	/**
	 * Create an instance of {@link SolarThermalSystemPropertyType }
	 */
	public SolarThermalSystemPropertyType createSolarThermalSystemPropertyType() {
		return new SolarThermalSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergyCarrierPropertyType }
	 */
	public EnergyCarrierPropertyType createEnergyCarrierPropertyType() {
		return new EnergyCarrierPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergyDistributionSystemPropertyType }
	 */
	public EnergyDistributionSystemPropertyType createEnergyDistributionSystemPropertyType() {
		return new EnergyDistributionSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link GasPropertyType }
	 */
	public GasPropertyType createGasPropertyType() {
		return new GasPropertyType();
	}
	
	/**
	 * Create an instance of {@link LayerPropertyType }
	 */
	public LayerPropertyType createLayerPropertyType() {
		return new LayerPropertyType();
	}
	
	/**
	 * Create an instance of {@link _TimeSeriesPropertyType }
	 */
	public _TimeSeriesPropertyType create_TimeSeriesPropertyType() {
		return new _TimeSeriesPropertyType();
	}
	
	/**
	 * Create an instance of {@link AbstractMaterialPropertyType }
	 */
	public AbstractMaterialPropertyType createAbstractMaterialPropertyType() {
		return new AbstractMaterialPropertyType();
	}
	
	/**
	 * Create an instance of {@link HouseholdPropertyType }
	 */
	public HouseholdPropertyType createHouseholdPropertyType() {
		return new HouseholdPropertyType();
	}
	
	/**
	 * Create an instance of {@link ScheduleLoD1PropertyType }
	 */
	public ScheduleLoD1PropertyType createScheduleLoD1PropertyType() {
		return new ScheduleLoD1PropertyType();
	}
	
	/**
	 * Create an instance of {@link ThermalDistributionSystemPropertyType }
	 */
	public ThermalDistributionSystemPropertyType createThermalDistributionSystemPropertyType() {
		return new ThermalDistributionSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link OpaqueMaterialPropertyType }
	 */
	public OpaqueMaterialPropertyType createOpaqueMaterialPropertyType() {
		return new OpaqueMaterialPropertyType();
	}
	
	/**
	 * Create an instance of {@link ElectricalResistancePropertyType }
	 */
	public ElectricalResistancePropertyType createElectricalResistancePropertyType() {
		return new ElectricalResistancePropertyType();
	}
	
	/**
	 * Create an instance of {@link CombinedHeatPowerPropertyType }
	 */
	public CombinedHeatPowerPropertyType createCombinedHeatPowerPropertyType() {
		return new CombinedHeatPowerPropertyType();
	}
	
	/**
	 * Create an instance of {@link EnergyCoveragePropertyType }
	 */
	public EnergyCoveragePropertyType createEnergyCoveragePropertyType() {
		return new EnergyCoveragePropertyType();
	}
	
	/**
	 * Create an instance of {@link _StorageSystemPropertyType }
	 */
	public _StorageSystemPropertyType create_StorageSystemPropertyType() {
		return new _StorageSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link PhotovoltaicSystemPropertyType }
	 */
	public PhotovoltaicSystemPropertyType createPhotovoltaicSystemPropertyType() {
		return new PhotovoltaicSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link EndUseUnitPropertyType }
	 */
	public EndUseUnitPropertyType createEndUseUnitPropertyType() {
		return new EndUseUnitPropertyType();
	}
	
	/**
	 * Create an instance of {@link HeatPumpPropertyType }
	 */
	public HeatPumpPropertyType createHeatPumpPropertyType() {
		return new HeatPumpPropertyType();
	}
	
	/**
	 * Create an instance of {@link PowerDistributionSystemPropertyType }
	 */
	public PowerDistributionSystemPropertyType createPowerDistributionSystemPropertyType() {
		return new PowerDistributionSystemPropertyType();
	}
	
	/**
	 * Create an instance of {@link DailySchedulePropertyType }
	 */
	public DailySchedulePropertyType createDailySchedulePropertyType() {
		return new DailySchedulePropertyType();
	}
	
	/**
	 * Create an instance of {@link ControlTypePropertyType }
	 */
	public ControlTypePropertyType createControlTypePropertyType() {
		return new ControlTypePropertyType();
	}
	
	/**
	 * Create an instance of {@link BoilerPropertyType }
	 */
	public BoilerPropertyType createBoilerPropertyType() {
		return new BoilerPropertyType();
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "buildingType", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<CodeType> createBuildingType(CodeType value) {
		return new JAXBElement<CodeType>(_BuildingType_QNAME, CodeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "yearOfRefurbishment", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<XMLGregorianCalendar> createYearOfRefurbishment(XMLGregorianCalendar value) {
		return new JAXBElement<XMLGregorianCalendar>(_YearOfRefurbishment_QNAME, XMLGregorianCalendar.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "refurbishmentClass", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<String> createRefurbishmentClass(String value) {
		return new JAXBElement<String>(_RefurbishmentClass_QNAME, String.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyConversionSystemPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "has", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<EnergyConversionSystemPropertyType> createHas(EnergyConversionSystemPropertyType value) {
		return new JAXBElement<EnergyConversionSystemPropertyType>(_Has_QNAME,
				EnergyConversionSystemPropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyCarrierType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergyCarrier", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<EnergyCarrierType> createEnergyCarrier(EnergyCarrierType value) {
		return new JAXBElement<EnergyCarrierType>(_EnergyCarrier_QNAME, EnergyCarrierType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Construction", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<ConstructionType> createConstruction(ConstructionType value) {
		return new JAXBElement<ConstructionType>(_Construction_QNAME, ConstructionType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ShadingTypeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ShadingType", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<ShadingTypeType> createShadingType(ShadingTypeType value) {
		return new JAXBElement<ShadingTypeType>(_ShadingType_QNAME, ShadingTypeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "HeatExchangeType", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<HeatExchangeTypeType> createHeatExchangeType(HeatExchangeTypeType value) {
		return new JAXBElement<HeatExchangeTypeType>(_HeatExchangeType_QNAME, HeatExchangeTypeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DistrictNetworkSubstationType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "DistrictNetworkSubstation", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<DistrictNetworkSubstationType> createDistrictNetworkSubstation(
			DistrictNetworkSubstationType value) {
		return new JAXBElement<DistrictNetworkSubstationType>(_DistrictNetworkSubstation_QNAME,
				DistrictNetworkSubstationType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EmittanceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Emittance", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<EmittanceType> createEmittance(EmittanceType value) {
		return new JAXBElement<EmittanceType>(_Emittance_QNAME, EmittanceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalBoundarySurfaceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ThermalBoundarySurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<ThermalBoundarySurfaceType> createThermalBoundarySurface(ThermalBoundarySurfaceType value) {
		return new JAXBElement<ThermalBoundarySurfaceType>(_ThermalBoundarySurface_QNAME,
				ThermalBoundarySurfaceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GlazingType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Glazing", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "AbstractMaterial")
	public JAXBElement<GlazingType> createGlazing(GlazingType value) {
		return new JAXBElement<GlazingType>(_Glazing_QNAME, GlazingType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConditioningTypeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "atticType", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<ConditioningTypeType> createAtticType(ConditioningTypeType value) {
		return new JAXBElement<ConditioningTypeType>(_AtticType_QNAME, ConditioningTypeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SolarThermalSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "SolarThermalSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_SolarEnergySystem")
	public JAXBElement<SolarThermalSystemType> createSolarThermalSystem(SolarThermalSystemType value) {
		return new JAXBElement<SolarThermalSystemType>(_SolarThermalSystem_QNAME, SolarThermalSystemType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TransmittanceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Transmittance", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<TransmittanceType> createTransmittance(TransmittanceType value) {
		return new JAXBElement<TransmittanceType>(_Transmittance_QNAME, TransmittanceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link _StorageSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "_StorageSystem", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<_StorageSystemType> create_StorageSystem(_StorageSystemType value) {
		return new JAXBElement<_StorageSystemType>(__StorageSystem_QNAME, _StorageSystemType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PowerDistributionSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "PowerDistributionSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyDistributionSystem")
	public JAXBElement<PowerDistributionSystemType> createPowerDistributionSystem(PowerDistributionSystemType value) {
		return new JAXBElement<PowerDistributionSystemType>(_PowerDistributionSystem_QNAME,
				PowerDistributionSystemType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConditioningTypeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "basementType", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<ConditioningTypeType> createBasementType(ConditioningTypeType value) {
		return new JAXBElement<ConditioningTypeType>(_BasementType_QNAME, ConditioningTypeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergyDemand", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergyDemandType> createEnergyDemand(EnergyDemandType value) {
		return new JAXBElement<EnergyDemandType>(_EnergyDemand_QNAME, EnergyDemandType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AbsorptanceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Absorptance", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<AbsorptanceType> createAbsorptance(AbsorptanceType value) {
		return new JAXBElement<AbsorptanceType>(_Absorptance_QNAME, AbsorptanceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OccupancyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Occupancy", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<OccupancyType> createOccupancy(OccupancyType value) {
		return new JAXBElement<OccupancyType>(_Occupancy_QNAME, OccupancyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BuildingUnitType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "BuildingUnit", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<BuildingUnitType> createBuildingUnit(BuildingUnitType value) {
		return new JAXBElement<BuildingUnitType>(_BuildingUnit_QNAME, BuildingUnitType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OpaqueMaterialType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "OpaqueMaterial", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "AbstractMaterial")
	public JAXBElement<OpaqueMaterialType> createOpaqueMaterial(OpaqueMaterialType value) {
		return new JAXBElement<OpaqueMaterialType>(_OpaqueMaterial_QNAME, OpaqueMaterialType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "constructionStyle", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<String> createConstructionStyle(String value) {
		return new JAXBElement<String>(_ConstructionStyle_QNAME, String.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "referenceGeoCoordinates", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<PointPropertyType> createReferenceGeoCoordinates(PointPropertyType value) {
		return new JAXBElement<PointPropertyType>(_ReferenceGeoCoordinates_QNAME, PointPropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergySupplyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergySupply", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergySupplyType> createEnergySupply(EnergySupplyType value) {
		return new JAXBElement<EnergySupplyType>(_EnergySupply_QNAME, EnergySupplyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalZonePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "thermalZones", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<ThermalZonePropertyType> createThermalZones(ThermalZonePropertyType value) {
		return new JAXBElement<ThermalZonePropertyType>(_ThermalZones_QNAME, ThermalZonePropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalStorageSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ThermalStorageSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_StorageSystem")
	public JAXBElement<ThermalStorageSystemType> createThermalStorageSystem(ThermalStorageSystemType value) {
		return new JAXBElement<ThermalStorageSystemType>(_ThermalStorageSystem_QNAME, ThermalStorageSystemType.class,
				null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionOrientationPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "constructionOrientation", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
	public JAXBElement<ConstructionOrientationPropertyType> createConstructionOrientation1(
			ConstructionOrientationPropertyType value) {
		return new JAXBElement<ConstructionOrientationPropertyType>(_ConstructionOrientation1_QNAME,
				ConstructionOrientationPropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ridgeHeight", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<LengthType> createRidgeHeight(LengthType value) {
		return new JAXBElement<LengthType>(_RidgeHeight_QNAME, LengthType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyCoverageType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergyCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergyCoverageType> createEnergyCoverage(EnergyCoverageType value) {
		return new JAXBElement<EnergyCoverageType>(_EnergyCoverage_QNAME, EnergyCoverageType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BoilerType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Boiler", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<BoilerType> createBoiler(BoilerType value) {
		return new JAXBElement<BoilerType>(_Boiler_QNAME, BoilerType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UsageZoneType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "UsageZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<UsageZoneType> createUsageZone(UsageZoneType value) {
		return new JAXBElement<UsageZoneType>(_UsageZone_QNAME, UsageZoneType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link _TimeSeriesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "_TimeSeries", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<_TimeSeriesType> create_TimeSeries(_TimeSeriesType value) {
		return new JAXBElement<_TimeSeriesType>(__TimeSeries_QNAME, _TimeSeriesType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Layer", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<LayerType> createLayer(LayerType value) {
		return new JAXBElement<LayerType>(_Layer_QNAME, LayerType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalDistributionSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ThermalDistributionSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyDistributionSystem")
	public JAXBElement<ThermalDistributionSystemType> createThermalDistributionSystem(
			ThermalDistributionSystemType value) {
		return new JAXBElement<ThermalDistributionSystemType>(_ThermalDistributionSystem_QNAME,
				ThermalDistributionSystemType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OperationModeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "OperationMode", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<OperationModeType> createOperationMode(OperationModeType value) {
		return new JAXBElement<OperationModeType>(_OperationMode_QNAME, OperationModeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDistributionSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergyDistributionSystem", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergyDistributionSystemType> createEnergyDistributionSystem(EnergyDistributionSystemType value) {
		return new JAXBElement<EnergyDistributionSystemType>(_EnergyDistributionSystem_QNAME,
				EnergyDistributionSystemType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMaterialType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "AbstractMaterial", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<AbstractMaterialType> createAbstractMaterial(AbstractMaterialType value) {
		return new JAXBElement<AbstractMaterialType>(_AbstractMaterial_QNAME, AbstractMaterialType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "RegularTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_TimeSeries")
	public JAXBElement<RegularTimeSeriesType> createRegularTimeSeries(RegularTimeSeriesType value) {
		return new JAXBElement<RegularTimeSeriesType>(_RegularTimeSeries_QNAME, RegularTimeSeriesType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceComponentType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "SurfaceComponent", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<SurfaceComponentType> createSurfaceComponent(SurfaceComponentType value) {
		return new JAXBElement<SurfaceComponentType>(_SurfaceComponent_QNAME, SurfaceComponentType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyConversionSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergyConversionSystem", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergyConversionSystemType> createEnergyConversionSystem(EnergyConversionSystemType value) {
		return new JAXBElement<EnergyConversionSystemType>(_EnergyConversionSystem_QNAME,
				EnergyConversionSystemType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "openableRatio", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfOpening")
	public JAXBElement<ScaleType> createOpenableRatio(ScaleType value) {
		return new JAXBElement<ScaleType>(_OpenableRatio_QNAME, ScaleType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TimeValuesPropertiesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "TimeValuesProperties", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<TimeValuesPropertiesType> createTimeValuesProperties(TimeValuesPropertiesType value) {
		return new JAXBElement<TimeValuesPropertiesType>(_TimeValuesProperties_QNAME, TimeValuesPropertiesType.class,
				null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ShadingTypePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "outdoorShading", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfOpening")
	public JAXBElement<ShadingTypePropertyType> createOutdoorShading(ShadingTypePropertyType value) {
		return new JAXBElement<ShadingTypePropertyType>(_OutdoorShading_QNAME, ShadingTypePropertyType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReflectanceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Reflectance", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<ReflectanceType> createReflectance(ReflectanceType value) {
		return new JAXBElement<ReflectanceType>(_Reflectance_QNAME, ReflectanceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UsageZonePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "usageZones", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<UsageZonePropertyType> createUsageZones(UsageZonePropertyType value) {
		return new JAXBElement<UsageZonePropertyType>(_UsageZones_QNAME, UsageZonePropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link _SolarEnergySystemPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "equippedWith", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBoundarySurface")
	public JAXBElement<_SolarEnergySystemPropertyType> createEquippedWith(_SolarEnergySystemPropertyType value) {
		return new JAXBElement<_SolarEnergySystemPropertyType>(_EquippedWith_QNAME,
				_SolarEnergySystemPropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleLoD1Type }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ScheduleLoD1", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_Schedule")
	public JAXBElement<ScheduleLoD1Type> createScheduleLoD1(ScheduleLoD1Type value) {
		return new JAXBElement<ScheduleLoD1Type>(_ScheduleLoD1_QNAME, ScheduleLoD1Type.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleLoD0Type }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ScheduleLoD0", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_Schedule")
	public JAXBElement<ScheduleLoD0Type> createScheduleLoD0(ScheduleLoD0Type value) {
		return new JAXBElement<ScheduleLoD0Type>(_ScheduleLoD0_QNAME, ScheduleLoD0Type.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleLoD3Type }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ScheduleLoD3", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_Schedule")
	public JAXBElement<ScheduleLoD3Type> createScheduleLoD3(ScheduleLoD3Type value) {
		return new JAXBElement<ScheduleLoD3Type>(_ScheduleLoD3_QNAME, ScheduleLoD3Type.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleLoD2Type }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ScheduleLoD2", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_Schedule")
	public JAXBElement<ScheduleLoD2Type> createScheduleLoD2(ScheduleLoD2Type value) {
		return new JAXBElement<ScheduleLoD2Type>(_ScheduleLoD2_QNAME, ScheduleLoD2Type.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "referenceHeatedFloorArea", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<AreaType> createReferenceHeatedFloorArea(AreaType value) {
		return new JAXBElement<AreaType>(_ReferenceHeatedFloorArea_QNAME, AreaType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link IrregularTimeSeriesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "IrregularTimeSeries", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_TimeSeries")
	public JAXBElement<IrregularTimeSeriesType> createIrregularTimeSeries(IrregularTimeSeriesType value) {
		return new JAXBElement<IrregularTimeSeriesType>(_IrregularTimeSeries_QNAME, IrregularTimeSeriesType.class,
				null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DailyScheduleType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "DailySchedule", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<DailyScheduleType> createDailySchedule(DailyScheduleType value) {
		return new JAXBElement<DailyScheduleType>(_DailySchedule_QNAME, DailyScheduleType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergyDemandPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "energyDemands", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
	public JAXBElement<EnergyDemandPropertyType> createEnergyDemands(EnergyDemandPropertyType value) {
		return new JAXBElement<EnergyDemandPropertyType>(_EnergyDemands_QNAME, EnergyDemandPropertyType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FacilitiesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Facilities", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<FacilitiesType> createFacilities(FacilitiesType value) {
		return new JAXBElement<FacilitiesType>(_Facilities_QNAME, FacilitiesType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PowerStorageSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "PowerStorageSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_StorageSystem")
	public JAXBElement<PowerStorageSystemType> createPowerStorageSystem(PowerStorageSystemType value) {
		return new JAXBElement<PowerStorageSystemType>(_PowerStorageSystem_QNAME, PowerStorageSystemType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalBoundarySurfacePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "correspondsTo", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBoundarySurface")
	public JAXBElement<ThermalBoundarySurfacePropertyType> createCorrespondsTo(ThermalBoundarySurfacePropertyType value) {
		return new JAXBElement<ThermalBoundarySurfacePropertyType>(_CorrespondsTo_QNAME,
				ThermalBoundarySurfacePropertyType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GasType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Gas", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "AbstractMaterial")
	public JAXBElement<GasType> createGas(GasType value) {
		return new JAXBElement<GasType>(_Gas_QNAME, GasType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link HeatPumpType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "HeatPump", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<HeatPumpType> createHeatPump(HeatPumpType value) {
		return new JAXBElement<HeatPumpType>(_HeatPump_QNAME, HeatPumpType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "basementCeilingHeightAboveGroundSurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<LengthType> createBasementCeilingHeightAboveGroundSurface(LengthType value) {
		return new JAXBElement<LengthType>(_BasementCeilingHeightAboveGroundSurface_QNAME, LengthType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link _ScheduleType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "_Schedule", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<_ScheduleType> create_Schedule(_ScheduleType value) {
		return new JAXBElement<_ScheduleType>(__Schedule_QNAME, _ScheduleType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "eavesHeight", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<LengthType> createEavesHeight(LengthType value) {
		return new JAXBElement<LengthType>(_EavesHeight_QNAME, LengthType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "energyPerformanceCertification", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<String> createEnergyPerformanceCertification(String value) {
		return new JAXBElement<String>(_EnergyPerformanceCertification_QNAME, String.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link _SolarEnergySystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "_SolarEnergySystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<_SolarEnergySystemType> create_SolarEnergySystem(_SolarEnergySystemType value) {
		return new JAXBElement<_SolarEnergySystemType>(__SolarEnergySystem_QNAME, _SolarEnergySystemType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MechanicalVentilationType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "MechanicalVentilation", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<MechanicalVentilationType> createMechanicalVentilation(MechanicalVentilationType value) {
		return new JAXBElement<MechanicalVentilationType>(_MechanicalVentilation_QNAME,
				MechanicalVentilationType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ControlTypeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ControlType", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<ControlTypeType> createControlType(ControlTypeType value) {
		return new JAXBElement<ControlTypeType>(_ControlType_QNAME, ControlTypeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "averageStoreyHeight", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<LengthType> createAverageStoreyHeight(LengthType value) {
		return new JAXBElement<LengthType>(_AverageStoreyHeight_QNAME, LengthType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PhotovoltaicSystemType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "PhotovoltaicSystem", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "_SolarEnergySystem")
	public JAXBElement<PhotovoltaicSystemType> createPhotovoltaicSystem(PhotovoltaicSystemType value) {
		return new JAXBElement<PhotovoltaicSystemType>(_PhotovoltaicSystem_QNAME, PhotovoltaicSystemType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "landmarked", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<Boolean> createLandmarked(Boolean value) {
		return new JAXBElement<Boolean>(_Landmarked_QNAME, Boolean.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EnergySourceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EnergySource", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EnergySourceType> createEnergySource(EnergySourceType value) {
		return new JAXBElement<EnergySourceType>(_EnergySource_QNAME, EnergySourceType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "Household", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<HouseholdType> createHousehold(HouseholdType value) {
		return new JAXBElement<HouseholdType>(_Household_QNAME, HouseholdType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionPropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "construction", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
	public JAXBElement<ConstructionPropertyType> createConstruction1(ConstructionPropertyType value) {
		return new JAXBElement<ConstructionPropertyType>(_Construction1_QNAME, ConstructionPropertyType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link VolumeType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "grossVolume", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
	public JAXBElement<VolumeType> createGrossVolume(VolumeType value) {
		return new JAXBElement<VolumeType>(_GrossVolume_QNAME, VolumeType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ImageTextureType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ImageTexture", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<ImageTextureType> createImageTexture(ImageTextureType value) {
		return new JAXBElement<ImageTextureType>(_ImageTexture_QNAME, ImageTextureType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalAppliancesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ElectricalAppliances", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "Facilities")
	public JAXBElement<ElectricalAppliancesType> createElectricalAppliances(ElectricalAppliancesType value) {
		return new JAXBElement<ElectricalAppliancesType>(_ElectricalAppliances_QNAME, ElectricalAppliancesType.class,
				null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalZoneType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ThermalZone", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<ThermalZoneType> createThermalZone(ThermalZoneType value) {
		return new JAXBElement<ThermalZoneType>(_ThermalZone_QNAME, ThermalZoneType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementPointType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "MeasurementPoint", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
	public JAXBElement<MeasurementPointType> createMeasurementPoint(MeasurementPointType value) {
		return new JAXBElement<MeasurementPointType>(_MeasurementPoint_QNAME, MeasurementPointType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionOrientationType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ConstructionOrientation", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
	public JAXBElement<ConstructionOrientationType> createConstructionOrientation(ConstructionOrientationType value) {
		return new JAXBElement<ConstructionOrientationType>(_ConstructionOrientation_QNAME,
				ConstructionOrientationType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DHWFacilitiesType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "DHWFacilities", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "Facilities")
	public JAXBElement<DHWFacilitiesType> createDHWFacilities(DHWFacilitiesType value) {
		return new JAXBElement<DHWFacilitiesType>(_DHWFacilities_QNAME, DHWFacilitiesType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalResistanceType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "ElectricalResistance", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<ElectricalResistanceType> createElectricalResistance(ElectricalResistanceType value) {
		return new JAXBElement<ElectricalResistanceType>(_ElectricalResistance_QNAME, ElectricalResistanceType.class,
				null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ShadingTypePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "indoorShading", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfOpening")
	public JAXBElement<ShadingTypePropertyType> createIndoorShading(ShadingTypePropertyType value) {
		return new JAXBElement<ShadingTypePropertyType>(_IndoorShading_QNAME, ShadingTypePropertyType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LayerComponentType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "LayerComponent", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<LayerComponentType> createLayerComponent(LayerComponentType value) {
		return new JAXBElement<LayerComponentType>(_LayerComponent_QNAME, LayerComponentType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CombinedHeatPowerType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "CombinedHeatPower", substitutionHeadNamespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", substitutionHeadName = "EnergyConversionSystem")
	public JAXBElement<CombinedHeatPowerType> createCombinedHeatPower(CombinedHeatPowerType value) {
		return new JAXBElement<CombinedHeatPowerType>(_CombinedHeatPower_QNAME, CombinedHeatPowerType.class, null,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndUseUnitType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "EndUseUnit", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
	public JAXBElement<EndUseUnitType> createEndUseUnit(EndUseUnitType value) {
		return new JAXBElement<EndUseUnitType>(_EndUseUnit_QNAME, EndUseUnitType.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "electricalPower", scope = ElectricalAppliancesType.class)
	public JAXBElement<MeasureType> createElectricalAppliancesTypeElectricalPower(MeasureType value) {
		return new JAXBElement<MeasureType>(_ElectricalAppliancesTypeElectricalPower_QNAME, MeasureType.class,
				ElectricalAppliancesType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "name", scope = ElectricalAppliancesType.class)
	public JAXBElement<String> createElectricalAppliancesTypeName(String value) {
		return new JAXBElement<String>(_ElectricalAppliancesTypeName_QNAME, String.class,
				ElectricalAppliancesType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link HeatExchangeTypePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "heatLosses", scope = ElectricalAppliancesType.class)
	public JAXBElement<HeatExchangeTypePropertyType> createElectricalAppliancesTypeHeatLosses(
			HeatExchangeTypePropertyType value) {
		return new JAXBElement<HeatExchangeTypePropertyType>(_ElectricalAppliancesTypeHeatLosses_QNAME,
				HeatExchangeTypePropertyType.class, ElectricalAppliancesType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "indirectlyHeatedAreaRatio", scope = ThermalZoneType.class)
	public JAXBElement<ScaleType> createThermalZoneTypeIndirectlyHeatedAreaRatio(ScaleType value) {
		return new JAXBElement<ScaleType>(_ThermalZoneTypeIndirectlyHeatedAreaRatio_QNAME, ScaleType.class,
				ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UsageZonePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "relates", scope = ThermalZoneType.class)
	public JAXBElement<UsageZonePropertyType> createThermalZoneTypeRelates(UsageZonePropertyType value) {
		return new JAXBElement<UsageZonePropertyType>(_ThermalZoneTypeRelates_QNAME, UsageZonePropertyType.class,
				ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "infiltrationRate", scope = ThermalZoneType.class)
	public JAXBElement<MeasureType> createThermalZoneTypeInfiltrationRate(MeasureType value) {
		return new JAXBElement<MeasureType>(_ThermalZoneTypeInfiltrationRate_QNAME, MeasureType.class,
				ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ThermalBoundarySurfacePropertyType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "boundedBy", scope = ThermalZoneType.class)
	public JAXBElement<ThermalBoundarySurfacePropertyType> createThermalZoneTypeBoundedBy(
			ThermalBoundarySurfacePropertyType value) {
		return new JAXBElement<ThermalBoundarySurfacePropertyType>(_ThermalZoneTypeBoundedBy_QNAME,
				ThermalBoundarySurfacePropertyType.class, ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "heatedFloorArea", scope = ThermalZoneType.class)
	public JAXBElement<AreaType> createThermalZoneTypeHeatedFloorArea(AreaType value) {
		return new JAXBElement<AreaType>(_ThermalZoneTypeHeatedFloorArea_QNAME, AreaType.class, ThermalZoneType.class,
				value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "effectiveThermalCapacity", scope = ThermalZoneType.class)
	public JAXBElement<MeasureType> createThermalZoneTypeEffectiveThermalCapacity(MeasureType value) {
		return new JAXBElement<MeasureType>(_ThermalZoneTypeEffectiveThermalCapacity_QNAME, MeasureType.class,
				ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "additionalThermalBridgeUValue", scope = ThermalZoneType.class)
	public JAXBElement<MeasureType> createThermalZoneTypeAdditionalThermalBridgeUValue(MeasureType value) {
		return new JAXBElement<MeasureType>(_ThermalZoneTypeAdditionalThermalBridgeUValue_QNAME, MeasureType.class,
				ThermalZoneType.class, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}
	 */
	@XmlElementDecl(namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", name = "cooledFloorArea", scope = ThermalZoneType.class)
	public JAXBElement<AreaType> createThermalZoneTypeCooledFloorArea(AreaType value) {
		return new JAXBElement<AreaType>(_ThermalZoneTypeCooledFloorArea_QNAME, AreaType.class, ThermalZoneType.class,
				value);
	}
	
}
