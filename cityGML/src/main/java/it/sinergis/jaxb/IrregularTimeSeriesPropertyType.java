
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrregularTimeSeriesPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrregularTimeSeriesPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}IrregularTimeSeries"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularTimeSeriesPropertyType", propOrder = {
    "irregularTimeSeries"
})
public class IrregularTimeSeriesPropertyType {

    @XmlElement(name = "IrregularTimeSeries", required = true)
    protected IrregularTimeSeriesType irregularTimeSeries;

    /**
     * Gets the value of the irregularTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link IrregularTimeSeriesType }
     *     
     */
    public IrregularTimeSeriesType getIrregularTimeSeries() {
        return irregularTimeSeries;
    }

    /**
     * Sets the value of the irregularTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrregularTimeSeriesType }
     *     
     */
    public void setIrregularTimeSeries(IrregularTimeSeriesType value) {
        this.irregularTimeSeries = value;
    }

    public boolean isSetIrregularTimeSeries() {
        return (this.irregularTimeSeries!= null);
    }

}
