
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
 * <p>Java class for EnergySupplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergySupplyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="endUse" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType" minOccurs="0"/>
 *         &lt;element name="medium" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="producedBy" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}OperationModePropertyType" maxOccurs="unbounded"/>
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
@XmlType(name = "EnergySupplyType", propOrder = {
    "endUse",
    "energyAmount",
    "medium",
    "producedBy",
    "coverage"
})
public class EnergySupplyType
    extends AbstractFeatureType
{

    protected CodeType endUse;
    protected _TimeSeriesPropertyType energyAmount;
    protected CodeType medium;
    @XmlElement(required = true)
    protected List<OperationModePropertyType> producedBy;
    protected List<EnergyCoveragePropertyType> coverage;

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
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMedium(CodeType value) {
        this.medium = value;
    }

    public boolean isSetMedium() {
        return (this.medium!= null);
    }

    /**
     * Gets the value of the producedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationModePropertyType }
     * 
     * 
     */
    public List<OperationModePropertyType> getProducedBy() {
        if (producedBy == null) {
            producedBy = new ArrayList<OperationModePropertyType>();
        }
        return this.producedBy;
    }

    public boolean isSetProducedBy() {
        return ((this.producedBy!= null)&&(!this.producedBy.isEmpty()));
    }

    public void unsetProducedBy() {
        this.producedBy = null;
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
