
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for DailyScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayType" type="{http://www.opengis.net/gml}CodeType"/>
 *         &lt;element name="schedule" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyScheduleType", propOrder = {
    "dayType",
    "schedule"
})
public class DailyScheduleType {

    @XmlElement(required = true)
    protected CodeType dayType;
    @XmlElement(required = true)
    protected _TimeSeriesPropertyType schedule;

    /**
     * Gets the value of the dayType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDayType(CodeType value) {
        this.dayType = value;
    }

    public boolean isSetDayType() {
        return (this.dayType!= null);
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public _TimeSeriesPropertyType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public void setSchedule(_TimeSeriesPropertyType value) {
        this.schedule = value;
    }

    public boolean isSetSchedule() {
        return (this.schedule!= null);
    }

}
