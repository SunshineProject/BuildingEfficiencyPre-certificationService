
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ElectricalAppliancesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalAppliancesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}FacilitiesType">
 *       &lt;sequence>
 *         &lt;element name="electricalPower" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="heatLosses" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}HeatExchangeTypePropertyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalAppliancesType", propOrder = {
    "rest"
})
public class ElectricalAppliancesType
    extends FacilitiesType
{

    @XmlElementRefs({
        @XmlElementRef(name = "electricalPower", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "heatLosses", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Name" is used by two different parts of a schema. See: 
     * line 276 of file:/home/sinergis/Desktop/ade-xjc-master/ade-xjc-2.2/xsd/energy.xsd
     * line 67 of file:/home/sinergis/Desktop/ade-xjc-master/ade-xjc-2.2/schemas/GML/3.1.1/base/gmlBase.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link HeatExchangeTypePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
