
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyCarrierPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyCarrierPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyCarrier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyCarrierPropertyType", propOrder = {
    "energyCarrier"
})
public class EnergyCarrierPropertyType {

    @XmlElement(name = "EnergyCarrier", required = true)
    protected EnergyCarrierType energyCarrier;

    /**
     * Gets the value of the energyCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCarrierType }
     *     
     */
    public EnergyCarrierType getEnergyCarrier() {
        return energyCarrier;
    }

    /**
     * Sets the value of the energyCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCarrierType }
     *     
     */
    public void setEnergyCarrier(EnergyCarrierType value) {
        this.energyCarrier = value;
    }

    public boolean isSetEnergyCarrier() {
        return (this.energyCarrier!= null);
    }

}
