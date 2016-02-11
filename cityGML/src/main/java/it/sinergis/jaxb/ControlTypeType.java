
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledVariable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="setPoint" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlTypeType", propOrder = {
    "controlledVariable",
    "setPoint"
})
public class ControlTypeType {

    @XmlElement(required = true)
    protected String controlledVariable;
    @XmlElement(required = true)
    protected _SchedulePropertyType setPoint;

    /**
     * Gets the value of the controlledVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlledVariable() {
        return controlledVariable;
    }

    /**
     * Sets the value of the controlledVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlledVariable(String value) {
        this.controlledVariable = value;
    }

    public boolean isSetControlledVariable() {
        return (this.controlledVariable!= null);
    }

    /**
     * Gets the value of the setPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getSetPoint() {
        return setPoint;
    }

    /**
     * Sets the value of the setPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setSetPoint(_SchedulePropertyType value) {
        this.setPoint = value;
    }

    public boolean isSetSetPoint() {
        return (this.setPoint!= null);
    }

}
