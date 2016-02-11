
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegularTimeSeriesPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularTimeSeriesPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}RegularTimeSeries"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularTimeSeriesPropertyType", propOrder = {
    "regularTimeSeries"
})
public class RegularTimeSeriesPropertyType {

    @XmlElement(name = "RegularTimeSeries", required = true)
    protected RegularTimeSeriesType regularTimeSeries;

    /**
     * Gets the value of the regularTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link RegularTimeSeriesType }
     *     
     */
    public RegularTimeSeriesType getRegularTimeSeries() {
        return regularTimeSeries;
    }

    /**
     * Sets the value of the regularTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularTimeSeriesType }
     *     
     */
    public void setRegularTimeSeries(RegularTimeSeriesType value) {
        this.regularTimeSeries = value;
    }

    public boolean isSetRegularTimeSeries() {
        return (this.regularTimeSeries!= null);
    }

}
