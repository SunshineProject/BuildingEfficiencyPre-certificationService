
package it.sinergis.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ConstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType">
 *       &lt;sequence>
 *         &lt;element name="absorptance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}AbsorptancePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reflectance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}ReflectancePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transmittance" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}TransmittancePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="layer" type="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}LayerPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionType", propOrder = {
    "absorptance",
    "reflectance",
    "transmittance",
    "uValue",
    "layer"
})
public class ConstructionType
    extends AbstractCityObjectType
{

    protected List<AbsorptancePropertyType> absorptance;
    protected List<ReflectancePropertyType> reflectance;
    protected List<TransmittancePropertyType> transmittance;
    protected MeasureType uValue;
    protected List<LayerPropertyType> layer;

    /**
     * Gets the value of the absorptance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absorptance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsorptance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsorptancePropertyType }
     * 
     * 
     */
    public List<AbsorptancePropertyType> getAbsorptance() {
        if (absorptance == null) {
            absorptance = new ArrayList<AbsorptancePropertyType>();
        }
        return this.absorptance;
    }

    public boolean isSetAbsorptance() {
        return ((this.absorptance!= null)&&(!this.absorptance.isEmpty()));
    }

    public void unsetAbsorptance() {
        this.absorptance = null;
    }

    /**
     * Gets the value of the reflectance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflectance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflectance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectancePropertyType }
     * 
     * 
     */
    public List<ReflectancePropertyType> getReflectance() {
        if (reflectance == null) {
            reflectance = new ArrayList<ReflectancePropertyType>();
        }
        return this.reflectance;
    }

    public boolean isSetReflectance() {
        return ((this.reflectance!= null)&&(!this.reflectance.isEmpty()));
    }

    public void unsetReflectance() {
        this.reflectance = null;
    }

    /**
     * Gets the value of the transmittance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmittance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmittance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransmittancePropertyType }
     * 
     * 
     */
    public List<TransmittancePropertyType> getTransmittance() {
        if (transmittance == null) {
            transmittance = new ArrayList<TransmittancePropertyType>();
        }
        return this.transmittance;
    }

    public boolean isSetTransmittance() {
        return ((this.transmittance!= null)&&(!this.transmittance.isEmpty()));
    }

    public void unsetTransmittance() {
        this.transmittance = null;
    }

    /**
     * Gets the value of the uValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUValue() {
        return uValue;
    }

    /**
     * Sets the value of the uValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUValue(MeasureType value) {
        this.uValue = value;
    }

    public boolean isSetUValue() {
        return (this.uValue!= null);
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerPropertyType }
     * 
     * 
     */
    public List<LayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<LayerPropertyType>();
        }
        return this.layer;
    }

    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
    }

}
