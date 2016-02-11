package it.sinergis.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.CodeType;

/**
 * <p>
 * Java class for BuildingUnitType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownershipType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="usedArea" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/>
 *         &lt;element name="occupiedBy" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}OccupancyPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="has" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}FacilitiesPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingUnitType", propOrder = { "numberOfRooms", "ownerName", "ownershipType", "usedArea",
		"occupiedBy", "has" })
public class BuildingUnitType extends AbstractCityObjectType {
	
	protected BigInteger numberOfRooms;
	protected String ownerName;
	protected CodeType ownershipType;
	protected AreaType usedArea;
	protected List<OccupancyPropertyType> occupiedBy;
	protected List<FacilitiesPropertyType> has;
	
	/**
	 * Gets the value of the numberOfRooms property.
	 * 
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumberOfRooms() {
		return numberOfRooms;
	}
	
	/**
	 * Sets the value of the numberOfRooms property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 */
	public void setNumberOfRooms(BigInteger value) {
		this.numberOfRooms = value;
	}
	
	public boolean isSetNumberOfRooms() {
		return (this.numberOfRooms != null);
	}
	
	/**
	 * Gets the value of the ownerName property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * Sets the value of the ownerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setOwnerName(String value) {
		this.ownerName = value;
	}
	
	public boolean isSetOwnerName() {
		return (this.ownerName != null);
	}
	
	/**
	 * Gets the value of the ownershipType property.
	 * 
	 * @return possible object is {@link CodeType }
	 */
	public CodeType getOwnershipType() {
		return ownershipType;
	}
	
	/**
	 * Sets the value of the ownershipType property.
	 * 
	 * @param value
	 *            allowed object is {@link CodeType }
	 */
	public void setOwnershipType(CodeType value) {
		this.ownershipType = value;
	}
	
	public boolean isSetOwnershipType() {
		return (this.ownershipType != null);
	}
	
	/**
	 * Gets the value of the usedArea property.
	 * 
	 * @return possible object is {@link AreaType }
	 */
	public AreaType getUsedArea() {
		return usedArea;
	}
	
	/**
	 * Sets the value of the usedArea property.
	 * 
	 * @param value
	 *            allowed object is {@link AreaType }
	 */
	public void setUsedArea(AreaType value) {
		this.usedArea = value;
	}
	
	public boolean isSetUsedArea() {
		return (this.usedArea != null);
	}
	
	/**
	 * Gets the value of the occupiedBy property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the occupiedBy property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOccupiedBy().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link OccupancyPropertyType }
	 */
	public List<OccupancyPropertyType> getOccupiedBy() {
		if (occupiedBy == null) {
			occupiedBy = new ArrayList<OccupancyPropertyType>();
		}
		return this.occupiedBy;
	}
	
	public boolean isSetOccupiedBy() {
		return ((this.occupiedBy != null) && (!this.occupiedBy.isEmpty()));
	}
	
	public void unsetOccupiedBy() {
		this.occupiedBy = null;
	}
	
	/**
	 * Gets the value of the has property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the has property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHas().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link FacilitiesPropertyType }
	 */
	public List<FacilitiesPropertyType> getHas() {
		if (has == null) {
			has = new ArrayList<FacilitiesPropertyType>();
		}
		return this.has;
	}
	
	public boolean isSetHas() {
		return ((this.has != null) && (!this.has.isEmpty()));
	}
	
	public void unsetHas() {
		this.has = null;
	}
	
}
