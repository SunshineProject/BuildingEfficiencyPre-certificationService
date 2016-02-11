
package it.sinergis.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlazingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlazingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}AbstractMaterialType">
 *       &lt;sequence>
 *         &lt;element name="hemisphericalEmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EmittancePropertyType" minOccurs="0"/>
 *         &lt;element name="hemisphericalReflectance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ReflectancePropertyType" minOccurs="0"/>
 *         &lt;element name="hemisphericalTransmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TransmittancePropertyType" minOccurs="0"/>
 *         &lt;element name="normalIncidenceEmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EmittancePropertyType" minOccurs="0"/>
 *         &lt;element name="normalIncidenceReflectance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ReflectancePropertyType" minOccurs="0"/>
 *         &lt;element name="normalIncidenceTransmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TransmittancePropertyType" minOccurs="0"/>
 *         &lt;element name="numberOfPanes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlazingType", propOrder = {
    "hemisphericalEmittance",
    "hemisphericalReflectance",
    "hemisphericalTransmittance",
    "normalIncidenceEmittance",
    "normalIncidenceReflectance",
    "normalIncidenceTransmittance",
    "numberOfPanes"
})
public class GlazingType
    extends AbstractMaterialType
{

    protected EmittancePropertyType hemisphericalEmittance;
    protected ReflectancePropertyType hemisphericalReflectance;
    protected TransmittancePropertyType hemisphericalTransmittance;
    protected EmittancePropertyType normalIncidenceEmittance;
    protected ReflectancePropertyType normalIncidenceReflectance;
    protected TransmittancePropertyType normalIncidenceTransmittance;
    protected BigInteger numberOfPanes;

    /**
     * Gets the value of the hemisphericalEmittance property.
     * 
     * @return
     *     possible object is
     *     {@link EmittancePropertyType }
     *     
     */
    public EmittancePropertyType getHemisphericalEmittance() {
        return hemisphericalEmittance;
    }

    /**
     * Sets the value of the hemisphericalEmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmittancePropertyType }
     *     
     */
    public void setHemisphericalEmittance(EmittancePropertyType value) {
        this.hemisphericalEmittance = value;
    }

    public boolean isSetHemisphericalEmittance() {
        return (this.hemisphericalEmittance!= null);
    }

    /**
     * Gets the value of the hemisphericalReflectance property.
     * 
     * @return
     *     possible object is
     *     {@link ReflectancePropertyType }
     *     
     */
    public ReflectancePropertyType getHemisphericalReflectance() {
        return hemisphericalReflectance;
    }

    /**
     * Sets the value of the hemisphericalReflectance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectancePropertyType }
     *     
     */
    public void setHemisphericalReflectance(ReflectancePropertyType value) {
        this.hemisphericalReflectance = value;
    }

    public boolean isSetHemisphericalReflectance() {
        return (this.hemisphericalReflectance!= null);
    }

    /**
     * Gets the value of the hemisphericalTransmittance property.
     * 
     * @return
     *     possible object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public TransmittancePropertyType getHemisphericalTransmittance() {
        return hemisphericalTransmittance;
    }

    /**
     * Sets the value of the hemisphericalTransmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public void setHemisphericalTransmittance(TransmittancePropertyType value) {
        this.hemisphericalTransmittance = value;
    }

    public boolean isSetHemisphericalTransmittance() {
        return (this.hemisphericalTransmittance!= null);
    }

    /**
     * Gets the value of the normalIncidenceEmittance property.
     * 
     * @return
     *     possible object is
     *     {@link EmittancePropertyType }
     *     
     */
    public EmittancePropertyType getNormalIncidenceEmittance() {
        return normalIncidenceEmittance;
    }

    /**
     * Sets the value of the normalIncidenceEmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmittancePropertyType }
     *     
     */
    public void setNormalIncidenceEmittance(EmittancePropertyType value) {
        this.normalIncidenceEmittance = value;
    }

    public boolean isSetNormalIncidenceEmittance() {
        return (this.normalIncidenceEmittance!= null);
    }

    /**
     * Gets the value of the normalIncidenceReflectance property.
     * 
     * @return
     *     possible object is
     *     {@link ReflectancePropertyType }
     *     
     */
    public ReflectancePropertyType getNormalIncidenceReflectance() {
        return normalIncidenceReflectance;
    }

    /**
     * Sets the value of the normalIncidenceReflectance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectancePropertyType }
     *     
     */
    public void setNormalIncidenceReflectance(ReflectancePropertyType value) {
        this.normalIncidenceReflectance = value;
    }

    public boolean isSetNormalIncidenceReflectance() {
        return (this.normalIncidenceReflectance!= null);
    }

    /**
     * Gets the value of the normalIncidenceTransmittance property.
     * 
     * @return
     *     possible object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public TransmittancePropertyType getNormalIncidenceTransmittance() {
        return normalIncidenceTransmittance;
    }

    /**
     * Sets the value of the normalIncidenceTransmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public void setNormalIncidenceTransmittance(TransmittancePropertyType value) {
        this.normalIncidenceTransmittance = value;
    }

    public boolean isSetNormalIncidenceTransmittance() {
        return (this.normalIncidenceTransmittance!= null);
    }

    /**
     * Gets the value of the numberOfPanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPanes() {
        return numberOfPanes;
    }

    /**
     * Sets the value of the numberOfPanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPanes(BigInteger value) {
        this.numberOfPanes = value;
    }

    public boolean isSetNumberOfPanes() {
        return (this.numberOfPanes!= null);
    }

}
