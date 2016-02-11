
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for EnergyDemandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyDemandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="endUse" type="{http://www.opengis.net/gml}CodeType"/>
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType" minOccurs="0"/>
 *         &lt;element name="energyDistribution" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyDistributionSystemPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDemandType", propOrder = {
    "endUse",
    "energyAmount",
    "energyDistribution"
})
public class EnergyDemandType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected CodeType endUse;
    protected _TimeSeriesPropertyType energyAmount;
    protected List<EnergyDistributionSystemPropertyType> energyDistribution;

    /**
     * Gets the value of the endUse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEndUse() {
        return endUse;
    }

    /**
     * Sets the value of the endUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEndUse(CodeType value) {
        this.endUse = value;
    }

    public boolean isSetEndUse() {
        return (this.endUse!= null);
    }

    /**
     * Gets the value of the energyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public _TimeSeriesPropertyType getEnergyAmount() {
        return energyAmount;
    }

    /**
     * Sets the value of the energyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public void setEnergyAmount(_TimeSeriesPropertyType value) {
        this.energyAmount = value;
    }

    public boolean isSetEnergyAmount() {
        return (this.energyAmount!= null);
    }

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
