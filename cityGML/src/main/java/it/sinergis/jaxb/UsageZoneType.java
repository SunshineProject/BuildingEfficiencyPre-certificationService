
package it.sinergis.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for UsageZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="coolingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *         &lt;element name="heatingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *         &lt;element name="usageZoneClass" type="{http://www.opengis.net/gml}CodeType"/>
 *         &lt;element name="usedArea" type="{http://www.opengis.net/gml}AreaType"/>
 *         &lt;element name="usedFloorNumbers" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ventilationSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *         &lt;element name="contains" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}BuildingUnitPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occupiedBy" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}OccupancyPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="has" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}FacilitiesPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageZoneType", propOrder = {
    "coolingSchedule",
    "heatingSchedule",
    "usageZoneClass",
    "usedArea",
    "usedFloorNumbers",
    "ventilationSchedule",
    "contains",
    "occupiedBy",
    "has"
})
public class UsageZoneType
    extends AbstractCityObjectType
{

    protected _SchedulePropertyType coolingSchedule;
    protected _SchedulePropertyType heatingSchedule;
    @XmlElement(required = true)
    protected CodeType usageZoneClass;
    @XmlElement(required = true)
    protected AreaType usedArea;
    protected List<BigInteger> usedFloorNumbers;
    protected _SchedulePropertyType ventilationSchedule;
    protected List<BuildingUnitPropertyType> contains;
    protected List<OccupancyPropertyType> occupiedBy;
    protected List<FacilitiesPropertyType> has;

    /**
     * Gets the value of the coolingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getCoolingSchedule() {
        return coolingSchedule;
    }

    /**
     * Sets the value of the coolingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setCoolingSchedule(_SchedulePropertyType value) {
        this.coolingSchedule = value;
    }

    public boolean isSetCoolingSchedule() {
        return (this.coolingSchedule!= null);
    }

    /**
     * Gets the value of the heatingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getHeatingSchedule() {
        return heatingSchedule;
    }

    /**
     * Sets the value of the heatingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setHeatingSchedule(_SchedulePropertyType value) {
        this.heatingSchedule = value;
    }

    public boolean isSetHeatingSchedule() {
        return (this.heatingSchedule!= null);
    }

    /**
     * Gets the value of the usageZoneClass property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUsageZoneClass() {
        return usageZoneClass;
    }

    /**
     * Sets the value of the usageZoneClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUsageZoneClass(CodeType value) {
        this.usageZoneClass = value;
    }

    public boolean isSetUsageZoneClass() {
        return (this.usageZoneClass!= null);
    }

    /**
     * Gets the value of the usedArea property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getUsedArea() {
        return usedArea;
    }

    /**
     * Sets the value of the usedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setUsedArea(AreaType value) {
        this.usedArea = value;
    }

    public boolean isSetUsedArea() {
        return (this.usedArea!= null);
    }

    /**
     * Gets the value of the usedFloorNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedFloorNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedFloorNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getUsedFloorNumbers() {
        if (usedFloorNumbers == null) {
            usedFloorNumbers = new ArrayList<BigInteger>();
        }
        return this.usedFloorNumbers;
    }

    public boolean isSetUsedFloorNumbers() {
        return ((this.usedFloorNumbers!= null)&&(!this.usedFloorNumbers.isEmpty()));
    }

    public void unsetUsedFloorNumbers() {
        this.usedFloorNumbers = null;
    }

    /**
     * Gets the value of the ventilationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getVentilationSchedule() {
        return ventilationSchedule;
    }

    /**
     * Sets the value of the ventilationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setVentilationSchedule(_SchedulePropertyType value) {
        this.ventilationSchedule = value;
    }

    public boolean isSetVentilationSchedule() {
        return (this.ventilationSchedule!= null);
    }

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildingUnitPropertyType }
     * 
     * 
     */
    public List<BuildingUnitPropertyType> getContains() {
        if (contains == null) {
            contains = new ArrayList<BuildingUnitPropertyType>();
        }
        return this.contains;
    }

    public boolean isSetContains() {
        return ((this.contains!= null)&&(!this.contains.isEmpty()));
    }

    public void unsetContains() {
        this.contains = null;
    }

    /**
     * Gets the value of the occupiedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupiedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupiedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupancyPropertyType }
     * 
     * 
     */
    public List<OccupancyPropertyType> getOccupiedBy() {
        if (occupiedBy == null) {
            occupiedBy = new ArrayList<OccupancyPropertyType>();
        }
        return this.occupiedBy;
    }

    public boolean isSetOccupiedBy() {
        return ((this.occupiedBy!= null)&&(!this.occupiedBy.isEmpty()));
    }

    public void unsetOccupiedBy() {
        this.occupiedBy = null;
    }

    /**
     * Gets the value of the has property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the has property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilitiesPropertyType }
     * 
     * 
     */
    public List<FacilitiesPropertyType> getHas() {
        if (has == null) {
            has = new ArrayList<FacilitiesPropertyType>();
        }
        return this.has;
    }

    public boolean isSetHas() {
        return ((this.has!= null)&&(!this.has.isEmpty()));
    }

    public void unsetHas() {
        this.has = null;
    }

}
