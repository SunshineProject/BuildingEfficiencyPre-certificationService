
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java class for ThermalZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermalZoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="additionalThermalBridgeUValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="cooledFloorArea" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/>
 *         &lt;element name="effectiveThermalCapacity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="heatedFloorArea" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/>
 *         &lt;element name="indirectlyHeatedAreaRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/>
 *         &lt;element name="infiltrationRate" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="boundedBy" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ThermalBoundarySurfacePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="relates" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}UsageZonePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalZoneType", propOrder = {
    "rest"
})
public class ThermalZoneType
    extends AbstractCityObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "relates", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "additionalThermalBridgeUValue", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cooledFloorArea", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "boundedBy", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "effectiveThermalCapacity", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indirectlyHeatedAreaRatio", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "heatedFloorArea", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infiltrationRate", namespace = "http://www.sig3d.org/citygml/2.0/energy/0.5.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BoundedBy" is used by two different parts of a schema. See: 
     * line 1259 of file:/home/sinergis/Desktop/ade-xjc-master/ade-xjc-2.2/xsd/energy.xsd
     * line 28 of file:/home/sinergis/Desktop/ade-xjc-master/ade-xjc-2.2/schemas/GML/3.1.1/base/feature.xsd
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
     * {@link JAXBElement }{@code <}{@link UsageZonePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ThermalBoundarySurfacePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     * {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AreaType }{@code >}
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
