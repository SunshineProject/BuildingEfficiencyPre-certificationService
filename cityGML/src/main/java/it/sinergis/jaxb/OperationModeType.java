
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for OperationModeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationModeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="controls" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ControlTypePropertyType" minOccurs="0"/>
 *         &lt;element name="endUse" type="{http://www.opengis.net/gml}CodeType"/>
 *         &lt;element name="operationTime" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *         &lt;element name="yearlyGlobalEfficiency" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="belongs" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemPropertyType" minOccurs="0"/>
 *         &lt;element name="produced" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergySupplyPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationModeType", propOrder = {
    "controls",
    "endUse",
    "operationTime",
    "yearlyGlobalEfficiency",
    "belongs",
    "produced"
})
public class OperationModeType
    extends AbstractFeatureType
{

    protected ControlTypePropertyType controls;
    @XmlElement(required = true)
    protected CodeType endUse;
    protected _SchedulePropertyType operationTime;
    protected MeasureType yearlyGlobalEfficiency;
    protected EnergyConversionSystemPropertyType belongs;
    @XmlElement(required = true)
    protected List<EnergySupplyPropertyType> produced;

    /**
     * Gets the value of the controls property.
     * 
     * @return
     *     possible object is
     *     {@link ControlTypePropertyType }
     *     
     */
    public ControlTypePropertyType getControls() {
        return controls;
    }

    /**
     * Sets the value of the controls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlTypePropertyType }
     *     
     */
    public void setControls(ControlTypePropertyType value) {
        this.controls = value;
    }

    public boolean isSetControls() {
        return (this.controls!= null);
    }

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
     * Gets the value of the operationTime property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getOperationTime() {
        return operationTime;
    }

    /**
     * Sets the value of the operationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setOperationTime(_SchedulePropertyType value) {
        this.operationTime = value;
    }

    public boolean isSetOperationTime() {
        return (this.operationTime!= null);
    }

    /**
     * Gets the value of the yearlyGlobalEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getYearlyGlobalEfficiency() {
        return yearlyGlobalEfficiency;
    }

    /**
     * Sets the value of the yearlyGlobalEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setYearlyGlobalEfficiency(MeasureType value) {
        this.yearlyGlobalEfficiency = value;
    }

    public boolean isSetYearlyGlobalEfficiency() {
        return (this.yearlyGlobalEfficiency!= null);
    }

    /**
     * Gets the value of the belongs property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConversionSystemPropertyType }
     *     
     */
    public EnergyConversionSystemPropertyType getBelongs() {
        return belongs;
    }

    /**
     * Sets the value of the belongs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConversionSystemPropertyType }
     *     
     */
    public void setBelongs(EnergyConversionSystemPropertyType value) {
        this.belongs = value;
    }

    public boolean isSetBelongs() {
        return (this.belongs!= null);
    }

    /**
     * Gets the value of the produced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySupplyPropertyType }
     * 
     * 
     */
    public List<EnergySupplyPropertyType> getProduced() {
        if (produced == null) {
            produced = new ArrayList<EnergySupplyPropertyType>();
        }
        return this.produced;
    }

    public boolean isSetProduced() {
        return ((this.produced!= null)&&(!this.produced.isEmpty()));
    }

    public void unsetProduced() {
        this.produced = null;
    }

}
