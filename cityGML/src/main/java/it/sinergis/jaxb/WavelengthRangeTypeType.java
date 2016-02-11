
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WavelengthRangeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WavelengthRangeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Solar"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="Visible"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WavelengthRangeTypeType")
@XmlEnum
public enum WavelengthRangeTypeType {

    @XmlEnumValue("Solar")
    SOLAR("Solar"),
    IR("IR"),
    @XmlEnumValue("Visible")
    VISIBLE("Visible"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    WavelengthRangeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WavelengthRangeTypeType fromValue(String v) {
        for (WavelengthRangeTypeType c: WavelengthRangeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
