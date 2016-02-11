
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.LengthType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for LayerComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayerComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="areaFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="thickness" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/>
 *         &lt;element name="material" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}AbstractMaterialPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerComponentType", propOrder = {
    "areaFraction",
    "thickness",
    "material"
})
public class LayerComponentType
    extends AbstractFeatureType
{

    @XmlElement(defaultValue = "100.0")
    protected ScaleType areaFraction;
    protected LengthType thickness;
    @XmlElement(required = true)
    protected AbstractMaterialPropertyType material;

    /**
     * Gets the value of the areaFraction property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getAreaFraction() {
        return areaFraction;
    }

    /**
     * Sets the value of the areaFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setAreaFraction(ScaleType value) {
        this.areaFraction = value;
    }

    public boolean isSetAreaFraction() {
        return (this.areaFraction!= null);
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setThickness(LengthType value) {
        this.thickness = value;
    }

    public boolean isSetThickness() {
        return (this.thickness!= null);
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMaterialPropertyType }
     *     
     */
    public AbstractMaterialPropertyType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMaterialPropertyType }
     *     
     */
    public void setMaterial(AbstractMaterialPropertyType value) {
        this.material = value;
    }

    public boolean isSetMaterial() {
        return (this.material!= null);
    }

}
