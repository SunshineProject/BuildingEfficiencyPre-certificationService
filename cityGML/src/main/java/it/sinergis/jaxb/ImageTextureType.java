
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for ImageTextureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageTextureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="repeatS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repeatT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageTextureType", propOrder = {
    "url",
    "repeatS",
    "repeatT"
})
public class ImageTextureType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected boolean repeatS;
    protected boolean repeatT;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the repeatS property.
     * 
     */
    public boolean isRepeatS() {
        return repeatS;
    }

    /**
     * Sets the value of the repeatS property.
     * 
     */
    public void setRepeatS(boolean value) {
        this.repeatS = value;
    }

    public boolean isSetRepeatS() {
        return true;
    }

    /**
     * Gets the value of the repeatT property.
     * 
     */
    public boolean isRepeatT() {
        return repeatT;
    }

    /**
     * Sets the value of the repeatT property.
     * 
     */
    public void setRepeatT(boolean value) {
        this.repeatT = value;
    }

    public boolean isSetRepeatT() {
        return true;
    }

}
