
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for HeatPumpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeatPumpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemType">
 *       &lt;sequence>
 *         &lt;element name="carnotEfficiency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="heatSource" type="{http://www.opengis.net/gml}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatPumpType", propOrder = {
    "carnotEfficiency",
    "heatSource"
})
public class HeatPumpType
    extends EnergyConversionSystemType
{

    protected Double carnotEfficiency;
    @XmlElement(required = true)
    protected CodeType heatSource;

    /**
     * Gets the value of the carnotEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCarnotEfficiency() {
        return carnotEfficiency;
    }

    /**
     * Sets the value of the carnotEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCarnotEfficiency(Double value) {
        this.carnotEfficiency = value;
    }

    public boolean isSetCarnotEfficiency() {
        return (this.carnotEfficiency!= null);
    }

    /**
     * Gets the value of the heatSource property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getHeatSource() {
        return heatSource;
    }

    /**
     * Sets the value of the heatSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setHeatSource(CodeType value) {
        this.heatSource = value;
    }

    public boolean isSetHeatSource() {
        return (this.heatSource!= null);
    }

}
