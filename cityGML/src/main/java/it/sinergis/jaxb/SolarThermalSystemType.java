
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolarThermalSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolarThermalSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SolarEnergySystemType">
 *       &lt;sequence>
 *         &lt;element name="technologyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolarThermalSystemType", propOrder = {
    "technologyType"
})
public class SolarThermalSystemType
    extends _SolarEnergySystemType
{

    protected String technologyType;

    /**
     * Gets the value of the technologyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyType() {
        return technologyType;
    }

    /**
     * Sets the value of the technologyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyType(String value) {
        this.technologyType = value;
    }

    public boolean isSetTechnologyType() {
        return (this.technologyType!= null);
    }

}
