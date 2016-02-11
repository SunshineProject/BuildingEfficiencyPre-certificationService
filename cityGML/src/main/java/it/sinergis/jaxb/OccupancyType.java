
package it.sinergis.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for OccupancyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccupancyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="internGains" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}HeatExchangeTypePropertyType" minOccurs="0"/>
 *         &lt;element name="numberOfOccupants" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="occupancyRate" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *         &lt;element name="occupantType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="consiststOf" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}HouseholdPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupancyType", propOrder = {
    "internGains",
    "numberOfOccupants",
    "occupancyRate",
    "occupantType",
    "consiststOf"
})
public class OccupancyType
    extends AbstractFeatureType
{

    protected HeatExchangeTypePropertyType internGains;
    protected BigInteger numberOfOccupants;
    protected _SchedulePropertyType occupancyRate;
    protected CodeType occupantType;
    protected List<HouseholdPropertyType> consiststOf;

    /**
     * Gets the value of the internGains property.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public HeatExchangeTypePropertyType getInternGains() {
        return internGains;
    }

    /**
     * Sets the value of the internGains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public void setInternGains(HeatExchangeTypePropertyType value) {
        this.internGains = value;
    }

    public boolean isSetInternGains() {
        return (this.internGains!= null);
    }

    /**
     * Gets the value of the numberOfOccupants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOccupants() {
        return numberOfOccupants;
    }

    /**
     * Sets the value of the numberOfOccupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOccupants(BigInteger value) {
        this.numberOfOccupants = value;
    }

    public boolean isSetNumberOfOccupants() {
        return (this.numberOfOccupants!= null);
    }

    /**
     * Gets the value of the occupancyRate property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getOccupancyRate() {
        return occupancyRate;
    }

    /**
     * Sets the value of the occupancyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setOccupancyRate(_SchedulePropertyType value) {
        this.occupancyRate = value;
    }

    public boolean isSetOccupancyRate() {
        return (this.occupancyRate!= null);
    }

    /**
     * Gets the value of the occupantType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupantType() {
        return occupantType;
    }

    /**
     * Sets the value of the occupantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupantType(CodeType value) {
        this.occupantType = value;
    }

    public boolean isSetOccupantType() {
        return (this.occupantType!= null);
    }

    /**
     * Gets the value of the consiststOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consiststOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsiststOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdPropertyType }
     * 
     * 
     */
    public List<HouseholdPropertyType> getConsiststOf() {
        if (consiststOf == null) {
            consiststOf = new ArrayList<HouseholdPropertyType>();
        }
        return this.consiststOf;
    }

    public boolean isSetConsiststOf() {
        return ((this.consiststOf!= null)&&(!this.consiststOf.isEmpty()));
    }

    public void unsetConsiststOf() {
        this.consiststOf = null;
    }

}
