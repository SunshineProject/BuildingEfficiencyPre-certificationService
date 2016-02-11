
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for FacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="operationSchedules" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SchedulePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilitiesType", propOrder = {
    "operationSchedules"
})
@XmlSeeAlso({
    ElectricalAppliancesType.class,
    DHWFacilitiesType.class
})
public class FacilitiesType
    extends AbstractFeatureType
{

    protected _SchedulePropertyType operationSchedules;

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public _SchedulePropertyType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SchedulePropertyType }
     *     
     */
    public void setOperationSchedules(_SchedulePropertyType value) {
        this.operationSchedules = value;
    }

    public boolean isSetOperationSchedules() {
        return (this.operationSchedules!= null);
    }

}
