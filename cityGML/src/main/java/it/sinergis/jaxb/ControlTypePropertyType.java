
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlTypePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ControlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlTypePropertyType", propOrder = {
    "controlType"
})
public class ControlTypePropertyType {

    @XmlElement(name = "ControlType", required = true)
    protected ControlTypeType controlType;

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlTypeType }
     *     
     */
    public ControlTypeType getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTypeType }
     *     
     */
    public void setControlType(ControlTypeType value) {
        this.controlType = value;
    }

    public boolean isSetControlType() {
        return (this.controlType!= null);
    }

}
