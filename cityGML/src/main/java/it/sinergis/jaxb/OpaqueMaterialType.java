
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for OpaqueMaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpaqueMaterialType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}AbstractMaterialType">
 *       &lt;sequence>
 *         &lt;element name="conductivity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="density" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="permeance" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="porosity" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="specificHeat" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpaqueMaterialType", propOrder = {
    "conductivity",
    "density",
    "permeance",
    "porosity",
    "specificHeat"
})
public class OpaqueMaterialType
    extends AbstractMaterialType
{

    protected MeasureType conductivity;
    protected MeasureType density;
    protected MeasureType permeance;
    protected ScaleType porosity;
    protected MeasureType specificHeat;

    /**
     * Gets the value of the conductivity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getConductivity() {
        return conductivity;
    }

    /**
     * Sets the value of the conductivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setConductivity(MeasureType value) {
        this.conductivity = value;
    }

    public boolean isSetConductivity() {
        return (this.conductivity!= null);
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDensity(MeasureType value) {
        this.density = value;
    }

    public boolean isSetDensity() {
        return (this.density!= null);
    }

    /**
     * Gets the value of the permeance property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPermeance() {
        return permeance;
    }

    /**
     * Sets the value of the permeance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPermeance(MeasureType value) {
        this.permeance = value;
    }

    public boolean isSetPermeance() {
        return (this.permeance!= null);
    }

    /**
     * Gets the value of the porosity property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getPorosity() {
        return porosity;
    }

    /**
     * Sets the value of the porosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setPorosity(ScaleType value) {
        this.porosity = value;
    }

    public boolean isSetPorosity() {
        return (this.porosity!= null);
    }

    /**
     * Gets the value of the specificHeat property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpecificHeat() {
        return specificHeat;
    }

    /**
     * Sets the value of the specificHeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpecificHeat(MeasureType value) {
        this.specificHeat = value;
    }

    public boolean isSetSpecificHeat() {
        return (this.specificHeat!= null);
    }

}
