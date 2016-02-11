
package it.sinergis.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerStorageSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerStorageSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_StorageSystemType">
 *       &lt;sequence>
 *         &lt;element name="batteryTechnology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerStorageSystemType", propOrder = {
    "batteryTechnology",
    "powerCapacity"
})
public class PowerStorageSystemType
    extends _StorageSystemType
{

    protected String batteryTechnology;
    protected BigInteger powerCapacity;

    /**
     * Gets the value of the batteryTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryTechnology() {
        return batteryTechnology;
    }

    /**
     * Sets the value of the batteryTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryTechnology(String value) {
        this.batteryTechnology = value;
    }

    public boolean isSetBatteryTechnology() {
        return (this.batteryTechnology!= null);
    }

    /**
     * Gets the value of the powerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPowerCapacity() {
        return powerCapacity;
    }

    /**
     * Sets the value of the powerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPowerCapacity(BigInteger value) {
        this.powerCapacity = value;
    }

    public boolean isSetPowerCapacity() {
        return (this.powerCapacity!= null);
    }

}
