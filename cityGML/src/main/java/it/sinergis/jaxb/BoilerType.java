
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoilerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoilerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemType">
 *       &lt;sequence>
 *         &lt;element name="condensation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoilerType", propOrder = {
    "condensation"
})
public class BoilerType
    extends EnergyConversionSystemType
{

    protected boolean condensation;

    /**
     * Gets the value of the condensation property.
     * 
     */
    public boolean isCondensation() {
        return condensation;
    }

    /**
     * Sets the value of the condensation property.
     * 
     */
    public void setCondensation(boolean value) {
        this.condensation = value;
    }

    public boolean isSetCondensation() {
        return true;
    }

}
