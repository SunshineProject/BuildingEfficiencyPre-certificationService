
package it.sinergis.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _SchedulePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_SchedulePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_Schedule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_SchedulePropertyType", propOrder = {
    "_Schedule"
})
public class _SchedulePropertyType {

    @XmlElementRef(name = "_Schedule", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class)
    protected JAXBElement<? extends _ScheduleType> _Schedule;

    /**
     * Gets the value of the _Schedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD3Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD0Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link _ScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD2Type }{@code >}
     *     
     */
    public JAXBElement<? extends _ScheduleType> get_Schedule() {
        return _Schedule;
    }

    /**
     * Sets the value of the _Schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD3Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD0Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link _ScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduleLoD2Type }{@code >}
     *     
     */
    public void set_Schedule(JAXBElement<? extends _ScheduleType> value) {
        this._Schedule = value;
    }

    public boolean isSet_Schedule() {
        return (this._Schedule!= null);
    }

}
