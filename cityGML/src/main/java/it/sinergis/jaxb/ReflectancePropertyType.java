
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReflectancePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReflectancePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}Reflectance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReflectancePropertyType", propOrder = {
    "reflectance"
})
public class ReflectancePropertyType {

    @XmlElement(name = "Reflectance", required = true)
    protected ReflectanceType reflectance;

    /**
     * Gets the value of the reflectance property.
     * 
     * @return
     *     possible object is
     *     {@link ReflectanceType }
     *     
     */
    public ReflectanceType getReflectance() {
        return reflectance;
    }

    /**
     * Sets the value of the reflectance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectanceType }
     *     
     */
    public void setReflectance(ReflectanceType value) {
        this.reflectance = value;
    }

    public boolean isSetReflectance() {
        return (this.reflectance!= null);
    }

}
