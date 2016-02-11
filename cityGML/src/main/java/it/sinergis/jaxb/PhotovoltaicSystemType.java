
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhotovoltaicSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhotovoltaicSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/0.5.0}_SolarEnergySystemType">
 *       &lt;sequence>
 *         &lt;element name="cellMaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotovoltaicSystemType", propOrder = {
    "cellMaterialType"
})
public class PhotovoltaicSystemType
    extends _SolarEnergySystemType
{

    protected String cellMaterialType;

    /**
     * Gets the value of the cellMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellMaterialType() {
        return cellMaterialType;
    }

    /**
     * Sets the value of the cellMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellMaterialType(String value) {
        this.cellMaterialType = value;
    }

    public boolean isSetCellMaterialType() {
        return (this.cellMaterialType!= null);
    }

}
