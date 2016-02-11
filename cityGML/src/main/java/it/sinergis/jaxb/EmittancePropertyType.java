
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmittancePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmittancePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}Emittance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmittancePropertyType", propOrder = {
    "emittance"
})
public class EmittancePropertyType {

    @XmlElement(name = "Emittance", required = true)
    protected EmittanceType emittance;

    /**
     * Gets the value of the emittance property.
     * 
     * @return
     *     possible object is
     *     {@link EmittanceType }
     *     
     */
    public EmittanceType getEmittance() {
        return emittance;
    }

    /**
     * Sets the value of the emittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmittanceType }
     *     
     */
    public void setEmittance(EmittanceType value) {
        this.emittance = value;
    }

    public boolean isSetEmittance() {
        return (this.emittance!= null);
    }

}
