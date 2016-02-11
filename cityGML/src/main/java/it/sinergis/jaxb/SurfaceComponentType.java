
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.ReferenceType;


/**
 * <p>Java class for SurfaceComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.opengis.net/gml}AreaType"/>
 *         &lt;element name="isGroundCoupled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSunExposed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relates" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *         &lt;element name="adjacentTo" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ThermalZonePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceComponentType", propOrder = {
    "area",
    "isGroundCoupled",
    "isSunExposed",
    "relates",
    "adjacentTo"
})
public class SurfaceComponentType
    extends AbstractCityObjectType
{

    @XmlElement(required = true)
    protected AreaType area;
    protected boolean isGroundCoupled;
    protected boolean isSunExposed;
    protected ReferenceType relates;
    protected ThermalZonePropertyType adjacentTo;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setArea(AreaType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the isGroundCoupled property.
     * 
     */
    public boolean isIsGroundCoupled() {
        return isGroundCoupled;
    }

    /**
     * Sets the value of the isGroundCoupled property.
     * 
     */
    public void setIsGroundCoupled(boolean value) {
        this.isGroundCoupled = value;
    }

    public boolean isSetIsGroundCoupled() {
        return true;
    }

    /**
     * Gets the value of the isSunExposed property.
     * 
     */
    public boolean isIsSunExposed() {
        return isSunExposed;
    }

    /**
     * Sets the value of the isSunExposed property.
     * 
     */
    public void setIsSunExposed(boolean value) {
        this.isSunExposed = value;
    }

    public boolean isSetIsSunExposed() {
        return true;
    }

    /**
     * Gets the value of the relates property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRelates() {
        return relates;
    }

    /**
     * Sets the value of the relates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRelates(ReferenceType value) {
        this.relates = value;
    }

    public boolean isSetRelates() {
        return (this.relates!= null);
    }

    /**
     * Gets the value of the adjacentTo property.
     * 
     * @return
     *     possible object is
     *     {@link ThermalZonePropertyType }
     *     
     */
    public ThermalZonePropertyType getAdjacentTo() {
        return adjacentTo;
    }

    /**
     * Sets the value of the adjacentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermalZonePropertyType }
     *     
     */
    public void setAdjacentTo(ThermalZonePropertyType value) {
        this.adjacentTo = value;
    }

    public boolean isSetAdjacentTo() {
        return (this.adjacentTo!= null);
    }

}
