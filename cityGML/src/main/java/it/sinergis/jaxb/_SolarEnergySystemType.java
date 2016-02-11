
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AngleType;
import net.opengis.gml.AreaType;
import net.opengis.gml.ReferenceType;


/**
 * <p>Java class for _SolarEnergySystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_SolarEnergySystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemType">
 *       &lt;sequence>
 *         &lt;element name="collectorSurface" type="{http://www.opengis.net/gml}AreaType"/>
 *         &lt;element name="panelAzimuth" type="{http://www.opengis.net/gml}AngleType"/>
 *         &lt;element name="panelInclination" type="{http://www.opengis.net/gml}AngleType"/>
 *         &lt;element name="installedOn" type="{http://www.opengis.net/gml}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_SolarEnergySystemType", propOrder = {
    "collectorSurface",
    "panelAzimuth",
    "panelInclination",
    "installedOn"
})
@XmlSeeAlso({
    PhotovoltaicSystemType.class,
    SolarThermalSystemType.class
})
public abstract class _SolarEnergySystemType
    extends EnergyConversionSystemType
{

    @XmlElement(required = true)
    protected AreaType collectorSurface;
    @XmlElement(required = true)
    protected AngleType panelAzimuth;
    @XmlElement(required = true)
    protected AngleType panelInclination;
    protected List<ReferenceType> installedOn;

    /**
     * Gets the value of the collectorSurface property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getCollectorSurface() {
        return collectorSurface;
    }

    /**
     * Sets the value of the collectorSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setCollectorSurface(AreaType value) {
        this.collectorSurface = value;
    }

    public boolean isSetCollectorSurface() {
        return (this.collectorSurface!= null);
    }

    /**
     * Gets the value of the panelAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getPanelAzimuth() {
        return panelAzimuth;
    }

    /**
     * Sets the value of the panelAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setPanelAzimuth(AngleType value) {
        this.panelAzimuth = value;
    }

    public boolean isSetPanelAzimuth() {
        return (this.panelAzimuth!= null);
    }

    /**
     * Gets the value of the panelInclination property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getPanelInclination() {
        return panelInclination;
    }

    /**
     * Sets the value of the panelInclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setPanelInclination(AngleType value) {
        this.panelInclination = value;
    }

    public boolean isSetPanelInclination() {
        return (this.panelInclination!= null);
    }

    /**
     * Gets the value of the installedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getInstalledOn() {
        if (installedOn == null) {
            installedOn = new ArrayList<ReferenceType>();
        }
        return this.installedOn;
    }

    public boolean isSetInstalledOn() {
        return ((this.installedOn!= null)&&(!this.installedOn.isEmpty()));
    }

    public void unsetInstalledOn() {
        this.installedOn = null;
    }

}
