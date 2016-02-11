
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurfaceSideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceSideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inside"/>
 *     &lt;enumeration value="Outside"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurfaceSideType")
@XmlEnum
public enum SurfaceSideType {

    @XmlEnumValue("Inside")
    INSIDE("Inside"),
    @XmlEnumValue("Outside")
    OUTSIDE("Outside");
    private final String value;

    SurfaceSideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceSideType fromValue(String v) {
        for (SurfaceSideType c: SurfaceSideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
