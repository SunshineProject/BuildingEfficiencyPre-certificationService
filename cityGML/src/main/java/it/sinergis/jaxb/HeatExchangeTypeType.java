
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for HeatExchangeTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeatExchangeTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convectiveFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="latentFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="radiantFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.opengis.net/gml}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatExchangeTypeType", propOrder = {
    "convectiveFraction",
    "latentFraction",
    "radiantFraction",
    "totalValue"
})
public class HeatExchangeTypeType {

    protected ScaleType convectiveFraction;
    protected ScaleType latentFraction;
    protected ScaleType radiantFraction;
    @XmlElement(required = true)
    protected MeasureType totalValue;

    /**
     * Gets the value of the convectiveFraction property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getConvectiveFraction() {
        return convectiveFraction;
    }

    /**
     * Sets the value of the convectiveFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setConvectiveFraction(ScaleType value) {
        this.convectiveFraction = value;
    }

    public boolean isSetConvectiveFraction() {
        return (this.convectiveFraction!= null);
    }

    /**
     * Gets the value of the latentFraction property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getLatentFraction() {
        return latentFraction;
    }

    /**
     * Sets the value of the latentFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setLatentFraction(ScaleType value) {
        this.latentFraction = value;
    }

    public boolean isSetLatentFraction() {
        return (this.latentFraction!= null);
    }

    /**
     * Gets the value of the radiantFraction property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getRadiantFraction() {
        return radiantFraction;
    }

    /**
     * Sets the value of the radiantFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setRadiantFraction(ScaleType value) {
        this.radiantFraction = value;
    }

    public boolean isSetRadiantFraction() {
        return (this.radiantFraction!= null);
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalValue(MeasureType value) {
        this.totalValue = value;
    }

    public boolean isSetTotalValue() {
        return (this.totalValue!= null);
    }

}
