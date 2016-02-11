
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsorptancePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsorptancePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}Absorptance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsorptancePropertyType", propOrder = {
    "absorptance"
})
public class AbsorptancePropertyType {

    @XmlElement(name = "Absorptance", required = true)
    protected AbsorptanceType absorptance;

    /**
     * Gets the value of the absorptance property.
     * 
     * @return
     *     possible object is
     *     {@link AbsorptanceType }
     *     
     */
    public AbsorptanceType getAbsorptance() {
        return absorptance;
    }

    /**
     * Sets the value of the absorptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsorptanceType }
     *     
     */
    public void setAbsorptance(AbsorptanceType value) {
        this.absorptance = value;
    }

    public boolean isSetAbsorptance() {
        return (this.absorptance!= null);
    }

}
