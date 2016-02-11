
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * <p>Java class for _TimeSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TimeSeriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temporalExtent" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/>
 *         &lt;element name="variableProperties" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TimeValuesPropertiesPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_TimeSeriesType", propOrder = {
    "id",
    "temporalExtent",
    "variableProperties"
})
@XmlSeeAlso({
    RegularTimeSeriesType.class,
    IrregularTimeSeriesType.class
})
public abstract class _TimeSeriesType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected TimePeriodPropertyType temporalExtent;
    protected TimeValuesPropertiesPropertyType variableProperties;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the temporalExtent property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getTemporalExtent() {
        return temporalExtent;
    }

    /**
     * Sets the value of the temporalExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setTemporalExtent(TimePeriodPropertyType value) {
        this.temporalExtent = value;
    }

    public boolean isSetTemporalExtent() {
        return (this.temporalExtent!= null);
    }

    /**
     * Gets the value of the variableProperties property.
     * 
     * @return
     *     possible object is
     *     {@link TimeValuesPropertiesPropertyType }
     *     
     */
    public TimeValuesPropertiesPropertyType getVariableProperties() {
        return variableProperties;
    }

    /**
     * Sets the value of the variableProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeValuesPropertiesPropertyType }
     *     
     */
    public void setVariableProperties(TimeValuesPropertiesPropertyType value) {
        this.variableProperties = value;
    }

    public boolean isSetVariableProperties() {
        return (this.variableProperties!= null);
    }

}
