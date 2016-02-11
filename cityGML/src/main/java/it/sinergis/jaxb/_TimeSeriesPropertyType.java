
package it.sinergis.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _TimeSeriesPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TimeSeriesPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeries"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_TimeSeriesPropertyType", propOrder = {
    "_TimeSeries"
})
public class _TimeSeriesPropertyType {

    @XmlElementRef(name = "_TimeSeries", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class)
    protected JAXBElement<? extends _TimeSeriesType> _TimeSeries;

    /**
     * Gets the value of the _TimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link _TimeSeriesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IrregularTimeSeriesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     *     
     */
    public JAXBElement<? extends _TimeSeriesType> get_TimeSeries() {
        return _TimeSeries;
    }

    /**
     * Sets the value of the _TimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link _TimeSeriesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IrregularTimeSeriesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegularTimeSeriesType }{@code >}
     *     
     */
    public void set_TimeSeries(JAXBElement<? extends _TimeSeriesType> value) {
        this._TimeSeries = value;
    }

    public boolean isSet_TimeSeries() {
        return (this._TimeSeries!= null);
    }

}
