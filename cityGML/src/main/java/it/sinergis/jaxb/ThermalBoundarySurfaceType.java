
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AngleType;
import net.opengis.gml.ReferenceType;


/**
 * <p>Java class for ThermalBoundarySurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermalBoundarySurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="azimuth" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *         &lt;element name="inclination" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ThermalBoundarySurfaceTypeTypeType"/>
 *         &lt;element name="composedOf" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}SurfaceComponentPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="partOf" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ThermalZonePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="correspondsTo" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalBoundarySurfaceType", propOrder = {
    "azimuth",
    "inclination",
    "type",
    "composedOf",
    "partOf",
    "correspondsTo"
})
public class ThermalBoundarySurfaceType
    extends AbstractCityObjectType
{

    protected AngleType azimuth;
    protected AngleType inclination;
    @XmlElement(required = true)
    protected ThermalBoundarySurfaceTypeTypeType type;
    @XmlElement(required = true)
    protected List<SurfaceComponentPropertyType> composedOf;
    protected List<ThermalZonePropertyType> partOf;
    protected ReferenceType correspondsTo;

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setAzimuth(AngleType value) {
        this.azimuth = value;
    }

    public boolean isSetAzimuth() {
        return (this.azimuth!= null);
    }

    /**
     * Gets the value of the inclination property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getInclination() {
        return inclination;
    }

    /**
     * Sets the value of the inclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setInclination(AngleType value) {
        this.inclination = value;
    }

    public boolean isSetInclination() {
        return (this.inclination!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ThermalBoundarySurfaceTypeTypeType }
     *     
     */
    public ThermalBoundarySurfaceTypeTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermalBoundarySurfaceTypeTypeType }
     *     
     */
    public void setType(ThermalBoundarySurfaceTypeTypeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the composedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceComponentPropertyType }
     * 
     * 
     */
    public List<SurfaceComponentPropertyType> getComposedOf() {
        if (composedOf == null) {
            composedOf = new ArrayList<SurfaceComponentPropertyType>();
        }
        return this.composedOf;
    }

    public boolean isSetComposedOf() {
        return ((this.composedOf!= null)&&(!this.composedOf.isEmpty()));
    }

    public void unsetComposedOf() {
        this.composedOf = null;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThermalZonePropertyType }
     * 
     * 
     */
    public List<ThermalZonePropertyType> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<ThermalZonePropertyType>();
        }
        return this.partOf;
    }

    public boolean isSetPartOf() {
        return ((this.partOf!= null)&&(!this.partOf.isEmpty()));
    }

    public void unsetPartOf() {
        this.partOf = null;
    }

    /**
     * Gets the value of the correspondsTo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCorrespondsTo() {
        return correspondsTo;
    }

    /**
     * Sets the value of the correspondsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCorrespondsTo(ReferenceType value) {
        this.correspondsTo = value;
    }

    public boolean isSetCorrespondsTo() {
        return (this.correspondsTo!= null);
    }

}
