
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD1PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD1PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ScheduleLoD1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD1PropertyType", propOrder = {
    "scheduleLoD1"
})
public class ScheduleLoD1PropertyType {

    @XmlElement(name = "ScheduleLoD1", required = true)
    protected ScheduleLoD1Type scheduleLoD1;

    /**
     * Gets the value of the scheduleLoD1 property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLoD1Type }
     *     
     */
    public ScheduleLoD1Type getScheduleLoD1() {
        return scheduleLoD1;
    }

    /**
     * Sets the value of the scheduleLoD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLoD1Type }
     *     
     */
    public void setScheduleLoD1(ScheduleLoD1Type value) {
        this.scheduleLoD1 = value;
    }

    public boolean isSetScheduleLoD1() {
        return (this.scheduleLoD1 != null);
    }

}
