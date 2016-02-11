
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistrictNetworkSubstationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictNetworkSubstationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}EnergyConversionSystemType">
 *       &lt;sequence>
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictNetworkSubstationType", propOrder = {
    "networkId",
    "networkNodeId"
})
public class DistrictNetworkSubstationType
    extends EnergyConversionSystemType
{

    @XmlElement(required = true)
    protected String networkId;
    @XmlElement(required = true)
    protected String networkNodeId;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    public boolean isSetNetworkId() {
        return (this.networkId!= null);
    }

    /**
     * Gets the value of the networkNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkNodeId() {
        return networkNodeId;
    }

    /**
     * Sets the value of the networkNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkNodeId(String value) {
        this.networkNodeId = value;
    }

    public boolean isSetNetworkNodeId() {
        return (this.networkNodeId!= null);
    }

}
