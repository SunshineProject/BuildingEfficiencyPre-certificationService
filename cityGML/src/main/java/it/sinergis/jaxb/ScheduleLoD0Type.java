
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ScheduleLoD0Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD0Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_ScheduleType">
 *       &lt;sequence>
 *         &lt;element name="averageValue" type="{http://www.opengis.net/gml}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD0Type", propOrder = {
    "averageValue"
})
public class ScheduleLoD0Type
    extends _ScheduleType
{

    @XmlElement(required = true)
    protected MeasureType averageValue;

    /**
     * Gets the value of the averageValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAverageValue() {
        return averageValue;
    }

    /**
     * Sets the value of the averageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAverageValue(MeasureType value) {
        this.averageValue = value;
    }

    public boolean isSetAverageValue() {
        return (this.averageValue!= null);
    }

}
