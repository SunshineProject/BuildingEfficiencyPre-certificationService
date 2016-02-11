
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PowerDistributionSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerDistributionSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyDistributionSystemType">
 *       &lt;sequence>
 *         &lt;element name="current" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="voltage" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerDistributionSystemType", propOrder = {
    "current",
    "voltage"
})
public class PowerDistributionSystemType
    extends EnergyDistributionSystemType
{

    protected MeasureType current;
    protected MeasureType voltage;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCurrent(MeasureType value) {
        this.current = value;
    }

    public boolean isSetCurrent() {
        return (this.current!= null);
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setVoltage(MeasureType value) {
        this.voltage = value;
    }

    public boolean isSetVoltage() {
        return (this.voltage!= null);
    }

}
