
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransmittancePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransmittancePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}Transmittance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmittancePropertyType", propOrder = {
    "transmittance"
})
public class TransmittancePropertyType {

    @XmlElement(name = "Transmittance", required = true)
    protected TransmittanceType transmittance;

    /**
     * Gets the value of the transmittance property.
     * 
     * @return
     *     possible object is
     *     {@link TransmittanceType }
     *     
     */
    public TransmittanceType getTransmittance() {
        return transmittance;
    }

    /**
     * Sets the value of the transmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmittanceType }
     *     
     */
    public void setTransmittance(TransmittanceType value) {
        this.transmittance = value;
    }

    public boolean isSetTransmittance() {
        return (this.transmittance!= null);
    }

}
