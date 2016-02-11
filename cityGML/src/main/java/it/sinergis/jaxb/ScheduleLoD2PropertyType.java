
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD2PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD2PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ScheduleLoD2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD2PropertyType", propOrder = {
    "scheduleLoD2"
})
public class ScheduleLoD2PropertyType {

    @XmlElement(name = "ScheduleLoD2", required = true)
    protected ScheduleLoD2Type scheduleLoD2;

    /**
     * Gets the value of the scheduleLoD2 property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLoD2Type }
     *     
     */
    public ScheduleLoD2Type getScheduleLoD2() {
        return scheduleLoD2;
    }

    /**
     * Sets the value of the scheduleLoD2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLoD2Type }
     *     
     */
    public void setScheduleLoD2(ScheduleLoD2Type value) {
        this.scheduleLoD2 = value;
    }

    public boolean isSetScheduleLoD2() {
        return (this.scheduleLoD2 != null);
    }

}
