
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;


/**
 * <p>Java class for LayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="layerComponent" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}LayerComponentPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerType", propOrder = {
    "layerComponent"
})
public class LayerType
    extends AbstractCityObjectType
{

    @XmlElement(required = true)
    protected List<LayerComponentPropertyType> layerComponent;

    /**
     * Gets the value of the layerComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerComponentPropertyType }
     * 
     * 
     */
    public List<LayerComponentPropertyType> getLayerComponent() {
        if (layerComponent == null) {
            layerComponent = new ArrayList<LayerComponentPropertyType>();
        }
        return this.layerComponent;
    }

    public boolean isSetLayerComponent() {
        return ((this.layerComponent!= null)&&(!this.layerComponent.isEmpty()));
    }

    public void unsetLayerComponent() {
        this.layerComponent = null;
    }

}
