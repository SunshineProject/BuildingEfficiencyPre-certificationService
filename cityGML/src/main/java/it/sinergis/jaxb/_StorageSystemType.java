
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for _StorageSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_StorageSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="energyDistribution" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyDistributionSystemPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_StorageSystemType", propOrder = {
    "energyDistribution"
})
@XmlSeeAlso({
    PowerStorageSystemType.class,
    ThermalStorageSystemType.class
})
public abstract class _StorageSystemType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<EnergyDistributionSystemPropertyType> energyDistribution;

    /**
     * Gets the value of the energyDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyDistributionSystemPropertyType }
     * 
     * 
     */
    public List<EnergyDistributionSystemPropertyType> getEnergyDistribution() {
        if (energyDistribution == null) {
            energyDistribution = new ArrayList<EnergyDistributionSystemPropertyType>();
        }
        return this.energyDistribution;
    }

    public boolean isSetEnergyDistribution() {
        return ((this.energyDistribution!= null)&&(!this.energyDistribution.isEmpty()));
    }

    public void unsetEnergyDistribution() {
        this.energyDistribution = null;
    }

}
