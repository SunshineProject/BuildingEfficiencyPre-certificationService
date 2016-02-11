
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD0PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD0PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ScheduleLoD0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD0PropertyType", propOrder = {
    "scheduleLoD0"
})
public class ScheduleLoD0PropertyType {

    @XmlElement(name = "ScheduleLoD0", required = true)
    protected ScheduleLoD0Type scheduleLoD0;

    /**
     * Gets the value of the scheduleLoD0 property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLoD0Type }
     *     
     */
    public ScheduleLoD0Type getScheduleLoD0() {
        return scheduleLoD0;
    }

    /**
     * Sets the value of the scheduleLoD0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLoD0Type }
     *     
     */
    public void setScheduleLoD0(ScheduleLoD0Type value) {
        this.scheduleLoD0 = value;
    }

    public boolean isSetScheduleLoD0() {
        return (this.scheduleLoD0 != null);
    }

}
