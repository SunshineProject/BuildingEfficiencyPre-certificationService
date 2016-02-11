
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for GasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}AbstractMaterialType">
 *       &lt;sequence>
 *         &lt;element name="isVentilated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="thickness" type="{http://www.opengis.net/gml}LengthType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasType", propOrder = {
    "isVentilated",
    "rValue",
    "thickness"
})
public class GasType
    extends AbstractMaterialType
{

    @XmlElement(defaultValue = "false")
    protected Boolean isVentilated;
    protected MeasureType rValue;
    @XmlElement(required = true)
    protected LengthType thickness;

    /**
     * Gets the value of the isVentilated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVentilated() {
        return isVentilated;
    }

    /**
     * Sets the value of the isVentilated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVentilated(Boolean value) {
        this.isVentilated = value;
    }

    public boolean isSetIsVentilated() {
        return (this.isVentilated!= null);
    }

    /**
     * Gets the value of the rValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getRValue() {
        return rValue;
    }

    /**
     * Sets the value of the rValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setRValue(MeasureType value) {
        this.rValue = value;
    }

    public boolean isSetRValue() {
        return (this.rValue!= null);
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setThickness(LengthType value) {
        this.thickness = value;
    }

    public boolean isSetThickness() {
        return (this.thickness!= null);
    }

}
