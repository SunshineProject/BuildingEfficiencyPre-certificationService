
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD3Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_ScheduleType">
 *       &lt;sequence>
 *         &lt;element name="timeDependingValues" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_TimeSeriesPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD3Type", propOrder = {
    "timeDependingValues"
})
public class ScheduleLoD3Type
    extends _ScheduleType
{

    @XmlElement(required = true)
    protected _TimeSeriesPropertyType timeDependingValues;

    /**
     * Gets the value of the timeDependingValues property.
     * 
     * @return
     *     possible object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public _TimeSeriesPropertyType getTimeDependingValues() {
        return timeDependingValues;
    }

    /**
     * Sets the value of the timeDependingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TimeSeriesPropertyType }
     *     
     */
    public void setTimeDependingValues(_TimeSeriesPropertyType value) {
        this.timeDependingValues = value;
    }

    public boolean isSetTimeDependingValues() {
        return (this.timeDependingValues!= null);
    }

}
