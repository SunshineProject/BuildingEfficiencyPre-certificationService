
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeatExchangeTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeatExchangeTypePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}HeatExchangeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatExchangeTypePropertyType", propOrder = {
    "heatExchangeType"
})
public class HeatExchangeTypePropertyType {

    @XmlElement(name = "HeatExchangeType", required = true)
    protected HeatExchangeTypeType heatExchangeType;

    /**
     * Gets the value of the heatExchangeType property.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypeType }
     *     
     */
    public HeatExchangeTypeType getHeatExchangeType() {
        return heatExchangeType;
    }

    /**
     * Sets the value of the heatExchangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypeType }
     *     
     */
    public void setHeatExchangeType(HeatExchangeTypeType value) {
        this.heatExchangeType = value;
    }

    public boolean isSetHeatExchangeType() {
        return (this.heatExchangeType!= null);
    }

}
