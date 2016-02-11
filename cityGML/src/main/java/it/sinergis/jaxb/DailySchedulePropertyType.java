
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailySchedulePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailySchedulePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}DailySchedule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailySchedulePropertyType", propOrder = {
    "dailySchedule"
})
public class DailySchedulePropertyType {

    @XmlElement(name = "DailySchedule", required = true)
    protected DailyScheduleType dailySchedule;

    /**
     * Gets the value of the dailySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link DailyScheduleType }
     *     
     */
    public DailyScheduleType getDailySchedule() {
        return dailySchedule;
    }

    /**
     * Sets the value of the dailySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyScheduleType }
     *     
     */
    public void setDailySchedule(DailyScheduleType value) {
        this.dailySchedule = value;
    }

    public boolean isSetDailySchedule() {
        return (this.dailySchedule!= null);
    }

}
