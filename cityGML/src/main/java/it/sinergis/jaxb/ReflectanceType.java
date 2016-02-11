
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReflectanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReflectanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="surface" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}SurfaceSideType"/>
 *         &lt;element name="wavelengthRange" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}WavelengthRangeTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReflectanceType", propOrder = {
    "percentage",
    "surface",
    "wavelengthRange"
})
public class ReflectanceType {

    protected double percentage;
    @XmlElement(required = true)
    protected SurfaceSideType surface;
    @XmlElement(required = true)
    protected WavelengthRangeTypeType wavelengthRange;

    /**
     * Gets the value of the percentage property.
     * 
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(double value) {
        this.percentage = value;
    }

    public boolean isSetPercentage() {
        return true;
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceSideType }
     *     
     */
    public SurfaceSideType getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceSideType }
     *     
     */
    public void setSurface(SurfaceSideType value) {
        this.surface = value;
    }

    public boolean isSetSurface() {
        return (this.surface!= null);
    }

    /**
     * Gets the value of the wavelengthRange property.
     * 
     * @return
     *     possible object is
     *     {@link WavelengthRangeTypeType }
     *     
     */
    public WavelengthRangeTypeType getWavelengthRange() {
        return wavelengthRange;
    }

    /**
     * Sets the value of the wavelengthRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WavelengthRangeTypeType }
     *     
     */
    public void setWavelengthRange(WavelengthRangeTypeType value) {
        this.wavelengthRange = value;
    }

    public boolean isSetWavelengthRange() {
        return (this.wavelengthRange!= null);
    }

}
