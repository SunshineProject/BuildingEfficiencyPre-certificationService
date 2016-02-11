
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * <p>Java class for AbstractMaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMaterialType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="referenceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageTexture" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ImageTexturePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMaterialType", propOrder = {
    "referenceURI",
    "imageTexture"
})
@XmlSeeAlso({
    OpaqueMaterialType.class,
    GasType.class,
    GlazingType.class
})
public abstract class AbstractMaterialType
    extends AbstractCityObjectType
{

    @XmlSchemaType(name = "anyURI")
    protected List<String> referenceURI;
    protected ImageTexturePropertyType imageTexture;

    /**
     * Gets the value of the referenceURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceURI() {
        if (referenceURI == null) {
            referenceURI = new ArrayList<String>();
        }
        return this.referenceURI;
    }

    public boolean isSetReferenceURI() {
        return ((this.referenceURI!= null)&&(!this.referenceURI.isEmpty()));
    }

    public void unsetReferenceURI() {
        this.referenceURI = null;
    }

    /**
     * Gets the value of the imageTexture property.
     * 
     * @return
     *     possible object is
     *     {@link ImageTexturePropertyType }
     *     
     */
    public ImageTexturePropertyType getImageTexture() {
        return imageTexture;
    }

    /**
     * Sets the value of the imageTexture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageTexturePropertyType }
     *     
     */
    public void setImageTexture(ImageTexturePropertyType value) {
        this.imageTexture = value;
    }

    public boolean isSetImageTexture() {
        return (this.imageTexture!= null);
    }

}
