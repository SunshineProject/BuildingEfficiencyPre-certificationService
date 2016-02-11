
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ThermalDistributionSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermalDistributionSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyDistributionSystemType">
 *       &lt;sequence>
 *         &lt;element name="isCirculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="medium" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="nominalFlow" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="returnTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="supplyTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="thermalLossesFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalDistributionSystemType", propOrder = {
    "isCirculation",
    "medium",
    "nominalFlow",
    "returnTemperature",
    "supplyTemperature",
    "thermalLossesFactor"
})
public class ThermalDistributionSystemType
    extends EnergyDistributionSystemType
{

    protected Boolean isCirculation;
    protected CodeType medium;
    protected MeasureType nominalFlow;
    protected MeasureType returnTemperature;
    protected MeasureType supplyTemperature;
    protected MeasureType thermalLossesFactor;

    /**
     * Gets the value of the isCirculation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCirculation() {
        return isCirculation;
    }

    /**
     * Sets the value of the isCirculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCirculation(Boolean value) {
        this.isCirculation = value;
    }

    public boolean isSetIsCirculation() {
        return (this.isCirculation!= null);
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMedium(CodeType value) {
        this.medium = value;
    }

    public boolean isSetMedium() {
        return (this.medium!= null);
    }

    /**
     * Gets the value of the nominalFlow property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalFlow() {
        return nominalFlow;
    }

    /**
     * Sets the value of the nominalFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalFlow(MeasureType value) {
        this.nominalFlow = value;
    }

    public boolean isSetNominalFlow() {
        return (this.nominalFlow!= null);
    }

    /**
     * Gets the value of the returnTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getReturnTemperature() {
        return returnTemperature;
    }

    /**
     * Sets the value of the returnTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setReturnTemperature(MeasureType value) {
        this.returnTemperature = value;
    }

    public boolean isSetReturnTemperature() {
        return (this.returnTemperature!= null);
    }

    /**
     * Gets the value of the supplyTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSupplyTemperature() {
        return supplyTemperature;
    }

    /**
     * Sets the value of the supplyTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSupplyTemperature(MeasureType value) {
        this.supplyTemperature = value;
    }

    public boolean isSetSupplyTemperature() {
        return (this.supplyTemperature!= null);
    }

    /**
     * Gets the value of the thermalLossesFactor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getThermalLossesFactor() {
        return thermalLossesFactor;
    }

    /**
     * Sets the value of the thermalLossesFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setThermalLossesFactor(MeasureType value) {
        this.thermalLossesFactor = value;
    }

    public boolean isSetThermalLossesFactor() {
        return (this.thermalLossesFactor!= null);
    }

}
