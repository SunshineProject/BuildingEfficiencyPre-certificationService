
package it.sinergis.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.VolumeType;


/**
 * <p>Java class for DHWFacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DHWFacilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}FacilitiesType">
 *       &lt;sequence>
 *         &lt;element name="numberOfBath" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfShower" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfWashBasin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="waterStorageVolume" type="{http://www.opengis.net/gml}VolumeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHWFacilitiesType", propOrder = {
    "numberOfBath",
    "numberOfShower",
    "numberOfWashBasin",
    "waterStorageVolume"
})
public class DHWFacilitiesType
    extends FacilitiesType
{

    protected BigInteger numberOfBath;
    protected BigInteger numberOfShower;
    protected BigInteger numberOfWashBasin;
    protected VolumeType waterStorageVolume;

    /**
     * Gets the value of the numberOfBath property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBath() {
        return numberOfBath;
    }

    /**
     * Sets the value of the numberOfBath property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBath(BigInteger value) {
        this.numberOfBath = value;
    }

    public boolean isSetNumberOfBath() {
        return (this.numberOfBath!= null);
    }

    /**
     * Gets the value of the numberOfShower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfShower() {
        return numberOfShower;
    }

    /**
     * Sets the value of the numberOfShower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfShower(BigInteger value) {
        this.numberOfShower = value;
    }

    public boolean isSetNumberOfShower() {
        return (this.numberOfShower!= null);
    }

    /**
     * Gets the value of the numberOfWashBasin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfWashBasin() {
        return numberOfWashBasin;
    }

    /**
     * Sets the value of the numberOfWashBasin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfWashBasin(BigInteger value) {
        this.numberOfWashBasin = value;
    }

    public boolean isSetNumberOfWashBasin() {
        return (this.numberOfWashBasin!= null);
    }

    /**
     * Gets the value of the waterStorageVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getWaterStorageVolume() {
        return waterStorageVolume;
    }

    /**
     * Sets the value of the waterStorageVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setWaterStorageVolume(VolumeType value) {
        this.waterStorageVolume = value;
    }

    public boolean isSetWaterStorageVolume() {
        return (this.waterStorageVolume!= null);
    }

}
