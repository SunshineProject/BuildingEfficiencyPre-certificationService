
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for MechanicalVentilationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MechanicalVentilationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemType">
 *       &lt;sequence>
 *         &lt;element name="heatRecovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recuperationFactor" type="{http://www.opengis.net/gml}ScaleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MechanicalVentilationType", propOrder = {
    "heatRecovery",
    "recuperationFactor"
})
public class MechanicalVentilationType
    extends EnergyConversionSystemType
{

    protected boolean heatRecovery;
    @XmlElement(required = true)
    protected ScaleType recuperationFactor;

    /**
     * Gets the value of the heatRecovery property.
     * 
     */
    public boolean isHeatRecovery() {
        return heatRecovery;
    }

    /**
     * Sets the value of the heatRecovery property.
     * 
     */
    public void setHeatRecovery(boolean value) {
        this.heatRecovery = value;
    }

    public boolean isSetHeatRecovery() {
        return true;
    }

    /**
     * Gets the value of the recuperationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getRecuperationFactor() {
        return recuperationFactor;
    }

    /**
     * Sets the value of the recuperationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setRecuperationFactor(ScaleType value) {
        this.recuperationFactor = value;
    }

    public boolean isSetRecuperationFactor() {
        return (this.recuperationFactor!= null);
    }

}
