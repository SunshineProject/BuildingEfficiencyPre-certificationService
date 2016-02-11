
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for EnergyCarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyCarrierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="co2EmissionFactor" type="{http://www.opengis.net/gml}MeasureType"/>
 *         &lt;element name="energyDensity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="primaryEnergyFactor" type="{http://www.opengis.net/gml}MeasureType"/>
 *         &lt;element name="type" type="{http://www.opengis.net/gml}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyCarrierType", propOrder = {
    "co2EmissionFactor",
    "energyDensity",
    "primaryEnergyFactor",
    "type"
})
public class EnergyCarrierType {

    @XmlElement(required = true)
    protected MeasureType co2EmissionFactor;
    protected MeasureType energyDensity;
    @XmlElement(required = true)
    protected MeasureType primaryEnergyFactor;
    @XmlElement(required = true)
    protected CodeType type;

    /**
     * Gets the value of the co2EmissionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCo2EmissionFactor() {
        return co2EmissionFactor;
    }

    /**
     * Sets the value of the co2EmissionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCo2EmissionFactor(MeasureType value) {
        this.co2EmissionFactor = value;
    }

    public boolean isSetCo2EmissionFactor() {
        return (this.co2EmissionFactor!= null);
    }

    /**
     * Gets the value of the energyDensity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEnergyDensity() {
        return energyDensity;
    }

    /**
     * Sets the value of the energyDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEnergyDensity(MeasureType value) {
        this.energyDensity = value;
    }

    public boolean isSetEnergyDensity() {
        return (this.energyDensity!= null);
    }

    /**
     * Gets the value of the primaryEnergyFactor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPrimaryEnergyFactor() {
        return primaryEnergyFactor;
    }

    /**
     * Sets the value of the primaryEnergyFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPrimaryEnergyFactor(MeasureType value) {
        this.primaryEnergyFactor = value;
    }

    public boolean isSetPrimaryEnergyFactor() {
        return (this.primaryEnergyFactor!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

}
