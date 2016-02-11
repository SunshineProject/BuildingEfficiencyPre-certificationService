
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ScheduleLoD1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD1Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_ScheduleType">
 *       &lt;sequence>
 *         &lt;element name="dailyUsageEndingTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dailyUsageStartingTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="idleValue" type="{http://www.opengis.net/gml}MeasureType"/>
 *         &lt;element name="usageDaysPerYear" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="usageValue" type="{http://www.opengis.net/gml}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD1Type", propOrder = {
    "dailyUsageEndingTime",
    "dailyUsageStartingTime",
    "idleValue",
    "usageDaysPerYear",
    "usageValue"
})
public class ScheduleLoD1Type
    extends _ScheduleType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dailyUsageEndingTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dailyUsageStartingTime;
    @XmlElement(required = true)
    protected MeasureType idleValue;
    protected double usageDaysPerYear;
    @XmlElement(required = true)
    protected MeasureType usageValue;

    /**
     * Gets the value of the dailyUsageEndingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDailyUsageEndingTime() {
        return dailyUsageEndingTime;
    }

    /**
     * Sets the value of the dailyUsageEndingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDailyUsageEndingTime(XMLGregorianCalendar value) {
        this.dailyUsageEndingTime = value;
    }

    public boolean isSetDailyUsageEndingTime() {
        return (this.dailyUsageEndingTime!= null);
    }

    /**
     * Gets the value of the dailyUsageStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDailyUsageStartingTime() {
        return dailyUsageStartingTime;
    }

    /**
     * Sets the value of the dailyUsageStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDailyUsageStartingTime(XMLGregorianCalendar value) {
        this.dailyUsageStartingTime = value;
    }

    public boolean isSetDailyUsageStartingTime() {
        return (this.dailyUsageStartingTime!= null);
    }

    /**
     * Gets the value of the idleValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getIdleValue() {
        return idleValue;
    }

    /**
     * Sets the value of the idleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setIdleValue(MeasureType value) {
        this.idleValue = value;
    }

    public boolean isSetIdleValue() {
        return (this.idleValue!= null);
    }

    /**
     * Gets the value of the usageDaysPerYear property.
     * 
     */
    public double getUsageDaysPerYear() {
        return usageDaysPerYear;
    }

    /**
     * Sets the value of the usageDaysPerYear property.
     * 
     */
    public void setUsageDaysPerYear(double value) {
        this.usageDaysPerYear = value;
    }

    public boolean isSetUsageDaysPerYear() {
        return true;
    }

    /**
     * Gets the value of the usageValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUsageValue() {
        return usageValue;
    }

    /**
     * Sets the value of the usageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUsageValue(MeasureType value) {
        this.usageValue = value;
    }

    public boolean isSetUsageValue() {
        return (this.usageValue!= null);
    }

}
