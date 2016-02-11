
package it.sinergis.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.ExternalReferenceType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ReferenceType;


/**
 * <p>Java class for EnergyConversionSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyConversionSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="efficiencyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedNominalPower" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nominalEfficiency" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="productAndInstallationDocument" type="{http://www.opengis.net/citygml/2.0}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="yearOfManufacture" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="has" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}OperationModePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consumes" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergySourcePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="installedIn" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyConversionSystemType", propOrder = {
    "efficiencyIndicator",
    "installedNominalPower",
    "model",
    "nominalEfficiency",
    "number",
    "productAndInstallationDocument",
    "yearOfManufacture",
    "has",
    "consumes",
    "installedIn"
})
@XmlSeeAlso({
    DistrictNetworkSubstationType.class,
    BoilerType.class,
    ElectricalResistanceType.class,
    CombinedHeatPowerType.class,
    HeatPumpType.class,
    MechanicalVentilationType.class,
    _SolarEnergySystemType.class
})
public class EnergyConversionSystemType
    extends AbstractFeatureType
{

    protected String efficiencyIndicator;
    protected MeasureType installedNominalPower;
    protected String model;
    protected MeasureType nominalEfficiency;
    protected BigInteger number;
    protected ExternalReferenceType productAndInstallationDocument;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfManufacture;
    protected List<OperationModePropertyType> has;
    @XmlElement(required = true)
    protected List<EnergySourcePropertyType> consumes;
    protected ReferenceType installedIn;

    /**
     * Gets the value of the efficiencyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiencyIndicator() {
        return efficiencyIndicator;
    }

    /**
     * Sets the value of the efficiencyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiencyIndicator(String value) {
        this.efficiencyIndicator = value;
    }

    public boolean isSetEfficiencyIndicator() {
        return (this.efficiencyIndicator!= null);
    }

    /**
     * Gets the value of the installedNominalPower property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInstalledNominalPower() {
        return installedNominalPower;
    }

    /**
     * Sets the value of the installedNominalPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInstalledNominalPower(MeasureType value) {
        this.installedNominalPower = value;
    }

    public boolean isSetInstalledNominalPower() {
        return (this.installedNominalPower!= null);
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    public boolean isSetModel() {
        return (this.model!= null);
    }

    /**
     * Gets the value of the nominalEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalEfficiency() {
        return nominalEfficiency;
    }

    /**
     * Sets the value of the nominalEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalEfficiency(MeasureType value) {
        this.nominalEfficiency = value;
    }

    public boolean isSetNominalEfficiency() {
        return (this.nominalEfficiency!= null);
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    public boolean isSetNumber() {
        return (this.number!= null);
    }

    /**
     * Gets the value of the productAndInstallationDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReferenceType }
     *     
     */
    public ExternalReferenceType getProductAndInstallationDocument() {
        return productAndInstallationDocument;
    }

    /**
     * Sets the value of the productAndInstallationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReferenceType }
     *     
     */
    public void setProductAndInstallationDocument(ExternalReferenceType value) {
        this.productAndInstallationDocument = value;
    }

    public boolean isSetProductAndInstallationDocument() {
        return (this.productAndInstallationDocument!= null);
    }

    /**
     * Gets the value of the yearOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Sets the value of the yearOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfManufacture(XMLGregorianCalendar value) {
        this.yearOfManufacture = value;
    }

    public boolean isSetYearOfManufacture() {
        return (this.yearOfManufacture!= null);
    }

    /**
     * Gets the value of the has property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the has property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationModePropertyType }
     * 
     * 
     */
    public List<OperationModePropertyType> getHas() {
        if (has == null) {
            has = new ArrayList<OperationModePropertyType>();
        }
        return this.has;
    }

    public boolean isSetHas() {
        return ((this.has!= null)&&(!this.has.isEmpty()));
    }

    public void unsetHas() {
        this.has = null;
    }

    /**
     * Gets the value of the consumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySourcePropertyType }
     * 
     * 
     */
    public List<EnergySourcePropertyType> getConsumes() {
        if (consumes == null) {
            consumes = new ArrayList<EnergySourcePropertyType>();
        }
        return this.consumes;
    }

    public boolean isSetConsumes() {
        return ((this.consumes!= null)&&(!this.consumes.isEmpty()));
    }

    public void unsetConsumes() {
        this.consumes = null;
    }

    /**
     * Gets the value of the installedIn property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getInstalledIn() {
        return installedIn;
    }

    /**
     * Sets the value of the installedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setInstalledIn(ReferenceType value) {
        this.installedIn = value;
    }

    public boolean isSetInstalledIn() {
        return (this.installedIn!= null);
    }

}
