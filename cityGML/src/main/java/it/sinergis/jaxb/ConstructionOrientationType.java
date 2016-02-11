
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * <p>Java class for ConstructionOrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionOrientationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baseConstruction" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ConstructionPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionOrientationType", propOrder = {
    "orientation",
    "baseConstruction"
})
public class ConstructionOrientationType
    extends AbstractCityObjectType
{

    protected boolean orientation;
    @XmlElement(required = true)
    protected ConstructionPropertyType baseConstruction;

    /**
     * Gets the value of the orientation property.
     * 
     */
    public boolean isOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     */
    public void setOrientation(boolean value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return true;
    }

    /**
     * Gets the value of the baseConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionPropertyType }
     *     
     */
    public ConstructionPropertyType getBaseConstruction() {
        return baseConstruction;
    }

    /**
     * Sets the value of the baseConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionPropertyType }
     *     
     */
    public void setBaseConstruction(ConstructionPropertyType value) {
        this.baseConstruction = value;
    }

    public boolean isSetBaseConstruction() {
        return (this.baseConstruction!= null);
    }

}
