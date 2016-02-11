
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShadingTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShadingTypePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ShadingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShadingTypePropertyType", propOrder = {
    "shadingType"
})
public class ShadingTypePropertyType {

    @XmlElement(name = "ShadingType", required = true)
    protected ShadingTypeType shadingType;

    /**
     * Gets the value of the shadingType property.
     * 
     * @return
     *     possible object is
     *     {@link ShadingTypeType }
     *     
     */
    public ShadingTypeType getShadingType() {
        return shadingType;
    }

    /**
     * Sets the value of the shadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShadingTypeType }
     *     
     */
    public void setShadingType(ShadingTypeType value) {
        this.shadingType = value;
    }

    public boolean isSetShadingType() {
        return (this.shadingType!= null);
    }

}
