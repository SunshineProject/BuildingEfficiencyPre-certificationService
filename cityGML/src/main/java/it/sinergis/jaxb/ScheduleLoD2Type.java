
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleLoD2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLoD2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_ScheduleType">
 *       &lt;sequence>
 *         &lt;element name="dailySchedule" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}DailySchedulePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLoD2Type", propOrder = {
    "dailySchedule"
})
public class ScheduleLoD2Type
    extends _ScheduleType
{

    @XmlElement(required = true)
    protected List<DailySchedulePropertyType> dailySchedule;

    /**
     * Gets the value of the dailySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailySchedulePropertyType }
     * 
     * 
     */
    public List<DailySchedulePropertyType> getDailySchedule() {
        if (dailySchedule == null) {
            dailySchedule = new ArrayList<DailySchedulePropertyType>();
        }
        return this.dailySchedule;
    }

    public boolean isSetDailySchedule() {
        return ((this.dailySchedule!= null)&&(!this.dailySchedule.isEmpty()));
    }

    public void unsetDailySchedule() {
        this.dailySchedule = null;
    }

}
