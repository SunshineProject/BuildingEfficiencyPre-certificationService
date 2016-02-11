
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeValuesPropertiesPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeValuesPropertiesPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TimeValuesProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeValuesPropertiesPropertyType", propOrder = {
    "timeValuesProperties"
})
public class TimeValuesPropertiesPropertyType {

    @XmlElement(name = "TimeValuesProperties", required = true)
    protected TimeValuesPropertiesType timeValuesProperties;

    /**
     * Gets the value of the timeValuesProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TimeValuesPropertiesType }
     *     
     */
    public TimeValuesPropertiesType getTimeValuesProperties() {
        return timeValuesProperties;
    }

    /**
     * Sets the value of the timeValuesProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeValuesPropertiesType }
     *     
     */
    public void setTimeValuesProperties(TimeValuesPropertiesType value) {
        this.timeValuesProperties = value;
    }

    public boolean isSetTimeValuesProperties() {
        return (this.timeValuesProperties!= null);
    }

}
