
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.UnitOfMeasureType;


/**
 * <p>Java class for TimeValuesPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeValuesPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acquisitionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interpolationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="qualityDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uom" type="{http://www.opengis.net/gml}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="variableLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeValuesPropertiesType", propOrder = {
    "acquisitionMethod",
    "interpolationType",
    "qualityDescription",
    "source",
    "uom",
    "variableLabel"
})
public class TimeValuesPropertiesType {

    protected String acquisitionMethod;
    protected CodeType interpolationType;
    @XmlElement(required = true)
    protected String qualityDescription;
    @XmlElement(required = true)
    protected String source;
    protected UnitOfMeasureType uom;
    protected String variableLabel;

    /**
     * Gets the value of the acquisitionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitionMethod() {
        return acquisitionMethod;
    }

    /**
     * Sets the value of the acquisitionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitionMethod(String value) {
        this.acquisitionMethod = value;
    }

    public boolean isSetAcquisitionMethod() {
        return (this.acquisitionMethod!= null);
    }

    /**
     * Gets the value of the interpolationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInterpolationType() {
        return interpolationType;
    }

    /**
     * Sets the value of the interpolationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInterpolationType(CodeType value) {
        this.interpolationType = value;
    }

    public boolean isSetInterpolationType() {
        return (this.interpolationType!= null);
    }

    /**
     * Gets the value of the qualityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityDescription() {
        return qualityDescription;
    }

    /**
     * Sets the value of the qualityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityDescription(String value) {
        this.qualityDescription = value;
    }

    public boolean isSetQualityDescription() {
        return (this.qualityDescription!= null);
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUom(UnitOfMeasureType value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
    }

    /**
     * Gets the value of the variableLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableLabel() {
        return variableLabel;
    }

    /**
     * Sets the value of the variableLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableLabel(String value) {
        this.variableLabel = value;
    }

    public boolean isSetVariableLabel() {
        return (this.variableLabel!= null);
    }

}
