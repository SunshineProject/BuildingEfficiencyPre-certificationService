
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementPointPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementPointPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}MeasurementPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementPointPropertyType", propOrder = {
    "measurementPoint"
})
public class MeasurementPointPropertyType {

    @XmlElement(name = "MeasurementPoint", required = true)
    protected MeasurementPointType measurementPoint;

    /**
     * Gets the value of the measurementPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPointType }
     *     
     */
    public MeasurementPointType getMeasurementPoint() {
        return measurementPoint;
    }

    /**
     * Sets the value of the measurementPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPointType }
     *     
     */
    public void setMeasurementPoint(MeasurementPointType value) {
        this.measurementPoint = value;
    }

    public boolean isSetMeasurementPoint() {
        return (this.measurementPoint!= null);
    }

}
