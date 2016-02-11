
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for EnergySourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergySourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType" minOccurs="0"/>
 *         &lt;element name="energyCarrier" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyCarrierPropertyType"/>
 *         &lt;element name="coverage" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyCoveragePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySourceType", propOrder = {
    "energyAmount",
    "energyCarrier",
    "coverage"
})
public class EnergySourceType
    extends AbstractFeatureType
{

    protected _TimeSeriesPropertyType energyAmount;
    @XmlElement(required = true)
    protected EnergyCarrierPropertyType energyCarrier;
    protected List<EnergyCoveragePropertyType> coverage;

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
     * Gets the value of the energyCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCarrierPropertyType }
     *     
     */
    public EnergyCarrierPropertyType getEnergyCarrier() {
        return energyCarrier;
    }

    /**
     * Sets the value of the energyCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCarrierPropertyType }
     *     
     */
    public void setEnergyCarrier(EnergyCarrierPropertyType value) {
        this.energyCarrier = value;
    }

    public boolean isSetEnergyCarrier() {
        return (this.energyCarrier!= null);
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyCoveragePropertyType }
     * 
     * 
     */
    public List<EnergyCoveragePropertyType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<EnergyCoveragePropertyType>();
        }
        return this.coverage;
    }

    public boolean isSetCoverage() {
        return ((this.coverage!= null)&&(!this.coverage.isEmpty()));
    }

    public void unsetCoverage() {
        this.coverage = null;
    }

}
