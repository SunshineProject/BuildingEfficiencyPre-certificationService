
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for EnergyDistributionSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyDistributionSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="distributionPerimeter" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="storageSystem" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_StorageSystemPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="energySupply" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergySupplyPropertyType" minOccurs="0"/>
 *         &lt;element name="endUseUnit" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EndUseUnitPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDistributionSystemType", propOrder = {
    "distributionPerimeter",
    "storageSystem",
    "energySupply",
    "endUseUnit"
})
@XmlSeeAlso({
    ThermalDistributionSystemType.class,
    PowerDistributionSystemType.class
})
public class EnergyDistributionSystemType
    extends AbstractFeatureType
{

    protected CodeType distributionPerimeter;
    protected List<_StorageSystemPropertyType> storageSystem;
    protected EnergySupplyPropertyType energySupply;
    protected List<EndUseUnitPropertyType> endUseUnit;

    /**
     * Gets the value of the distributionPerimeter property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDistributionPerimeter() {
        return distributionPerimeter;
    }

    /**
     * Sets the value of the distributionPerimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDistributionPerimeter(CodeType value) {
        this.distributionPerimeter = value;
    }

    public boolean isSetDistributionPerimeter() {
        return (this.distributionPerimeter!= null);
    }

    /**
     * Gets the value of the storageSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _StorageSystemPropertyType }
     * 
     * 
     */
    public List<_StorageSystemPropertyType> getStorageSystem() {
        if (storageSystem == null) {
            storageSystem = new ArrayList<_StorageSystemPropertyType>();
        }
        return this.storageSystem;
    }

    public boolean isSetStorageSystem() {
        return ((this.storageSystem!= null)&&(!this.storageSystem.isEmpty()));
    }

    public void unsetStorageSystem() {
        this.storageSystem = null;
    }

    /**
     * Gets the value of the energySupply property.
     * 
     * @return
     *     possible object is
     *     {@link EnergySupplyPropertyType }
     *     
     */
    public EnergySupplyPropertyType getEnergySupply() {
        return energySupply;
    }

    /**
     * Sets the value of the energySupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySupplyPropertyType }
     *     
     */
    public void setEnergySupply(EnergySupplyPropertyType value) {
        this.energySupply = value;
    }

    public boolean isSetEnergySupply() {
        return (this.energySupply!= null);
    }

    /**
     * Gets the value of the endUseUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endUseUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndUseUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndUseUnitPropertyType }
     * 
     * 
     */
    public List<EndUseUnitPropertyType> getEndUseUnit() {
        if (endUseUnit == null) {
            endUseUnit = new ArrayList<EndUseUnitPropertyType>();
        }
        return this.endUseUnit;
    }

    public boolean isSetEndUseUnit() {
        return ((this.endUseUnit!= null)&&(!this.endUseUnit.isEmpty()));
    }

    public void unsetEndUseUnit() {
        this.endUseUnit = null;
    }

}
