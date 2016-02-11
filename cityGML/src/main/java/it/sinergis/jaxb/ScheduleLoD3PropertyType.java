
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD3PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD3PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ScheduleLoD3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD3PropertyType", propOrder = {
    "scheduleLoD3"
})
public class ScheduleLoD3PropertyType {

    @XmlElement(name = "ScheduleLoD3", required = true)
    protected ScheduleLoD3Type scheduleLoD3;

    /**
     * Gets the value of the scheduleLoD3 property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleLoD3Type }
     *     
     */
    public ScheduleLoD3Type getScheduleLoD3() {
        return scheduleLoD3;
    }

    /**
     * Sets the value of the scheduleLoD3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleLoD3Type }
     *     
     */
    public void setScheduleLoD3(ScheduleLoD3Type value) {
        this.scheduleLoD3 = value;
    }

    public boolean isSetScheduleLoD3() {
        return (this.scheduleLoD3 != null);
    }

}
