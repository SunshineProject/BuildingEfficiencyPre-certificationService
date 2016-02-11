
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for EnergyCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyCoverageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="coverageRatio" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType"/>
 *         &lt;element name="coveredBy" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}OperationModePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyCoverageType", propOrder = {
    "coverageRatio",
    "coveredBy"
})
public class EnergyCoverageType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected _TimeSeriesPropertyType coverageRatio;
    protected OperationModePropertyType coveredBy;

    /**
     * Gets the value of the coverageRatio property.
     * 
     * @return
     *     possible object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public _TimeSeriesPropertyType getCoverageRatio() {
        return coverageRatio;
    }

    /**
     * Sets the value of the coverageRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public void setCoverageRatio(_TimeSeriesPropertyType value) {
        this.coverageRatio = value;
    }

    public boolean isSetCoverageRatio() {
        return (this.coverageRatio!= null);
    }

    /**
     * Gets the value of the coveredBy property.
     * 
     * @return
     *     possible object is
     *     {@link OperationModePropertyType }
     *     
     */
    public OperationModePropertyType getCoveredBy() {
        return coveredBy;
    }

    /**
     * Sets the value of the coveredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationModePropertyType }
     *     
     */
    public void setCoveredBy(OperationModePropertyType value) {
        this.coveredBy = value;
    }

    public boolean isSetCoveredBy() {
        return (this.coveredBy!= null);
    }

}
