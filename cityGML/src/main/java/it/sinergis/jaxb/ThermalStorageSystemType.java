
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.VolumeType;


/**
 * <p>Java class for ThermalStorageSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermalStorageSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_StorageSystemType">
 *       &lt;sequence>
 *         &lt;element name="averageTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="medium" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="thermalLossesFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.opengis.net/gml}VolumeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalStorageSystemType", propOrder = {
    "averageTemperature",
    "medium",
    "thermalLossesFactor",
    "volume"
})
public class ThermalStorageSystemType
    extends _StorageSystemType
{

    protected MeasureType averageTemperature;
    protected CodeType medium;
    protected MeasureType thermalLossesFactor;
    protected VolumeType volume;

    /**
     * Gets the value of the averageTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAverageTemperature() {
        return averageTemperature;
    }

    /**
     * Sets the value of the averageTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAverageTemperature(MeasureType value) {
        this.averageTemperature = value;
    }

    public boolean isSetAverageTemperature() {
        return (this.averageTemperature!= null);
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMedium(CodeType value) {
        this.medium = value;
    }

    public boolean isSetMedium() {
        return (this.medium!= null);
    }

    /**
     * Gets the value of the thermalLossesFactor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getThermalLossesFactor() {
        return thermalLossesFactor;
    }

    /**
     * Sets the value of the thermalLossesFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setThermalLossesFactor(MeasureType value) {
        this.thermalLossesFactor = value;
    }

    public boolean isSetThermalLossesFactor() {
        return (this.thermalLossesFactor!= null);
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    public boolean isSetVolume() {
        return (this.volume!= null);
    }

}
