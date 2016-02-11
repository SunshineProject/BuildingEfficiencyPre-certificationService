
package it.sinergis.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java class for EnergyConversionSystemPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyConversionSystemPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystem"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyConversionSystemPropertyType", propOrder = {
    "energyConversionSystem"
})
public class EnergyConversionSystemPropertyType {

    @XmlElementRef(name = "EnergyConversionSystem", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EnergyConversionSystemType> energyConversionSystem;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the energyConversionSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link _SolarEnergySystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolarThermalSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CombinedHeatPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoilerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictNetworkSubstationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElectricalResistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MechanicalVentilationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyConversionSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeatPumpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhotovoltaicSystemType }{@code >}
     *     
     */
    public JAXBElement<? extends EnergyConversionSystemType> getEnergyConversionSystem() {
        return energyConversionSystem;
    }

    /**
     * Sets the value of the energyConversionSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link _SolarEnergySystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolarThermalSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CombinedHeatPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoilerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictNetworkSubstationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElectricalResistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MechanicalVentilationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyConversionSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeatPumpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhotovoltaicSystemType }{@code >}
     *     
     */
    public void setEnergyConversionSystem(JAXBElement<? extends EnergyConversionSystemType> value) {
        this.energyConversionSystem = value;
    }

    public boolean isSetEnergyConversionSystem() {
        return (this.energyConversionSystem!= null);
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}
