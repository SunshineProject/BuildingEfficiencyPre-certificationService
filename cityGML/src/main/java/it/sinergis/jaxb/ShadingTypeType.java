
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for ShadingTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShadingTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumCoverRatio" type="{http://www.opengis.net/gml}ScaleType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TransmittancePropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShadingTypeType", propOrder = {
    "maximumCoverRatio",
    "name",
    "transmittance"
})
public class ShadingTypeType {

    @XmlElement(required = true)
    protected ScaleType maximumCoverRatio;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected TransmittancePropertyType transmittance;

    /**
     * Gets the value of the maximumCoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getMaximumCoverRatio() {
        return maximumCoverRatio;
    }

    /**
     * Sets the value of the maximumCoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setMaximumCoverRatio(ScaleType value) {
        this.maximumCoverRatio = value;
    }

    public boolean isSetMaximumCoverRatio() {
        return (this.maximumCoverRatio!= null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the transmittance property.
     * 
     * @return
     *     possible object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public TransmittancePropertyType getTransmittance() {
        return transmittance;
    }

    /**
     * Sets the value of the transmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmittancePropertyType }
     *     
     */
    public void setTransmittance(TransmittancePropertyType value) {
        this.transmittance = value;
    }

    public boolean isSetTransmittance() {
        return (this.transmittance!= null);
    }

}
