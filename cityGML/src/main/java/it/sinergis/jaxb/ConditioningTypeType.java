
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditioningTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditioningTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Conditioned"/>
 *     &lt;enumeration value="Unconditioned"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditioningTypeType")
@XmlEnum
public enum ConditioningTypeType {

    @XmlEnumValue("Conditioned")
    CONDITIONED("Conditioned"),
    @XmlEnumValue("Unconditioned")
    UNCONDITIONED("Unconditioned"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    ConditioningTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditioningTypeType fromValue(String v) {
        for (ConditioningTypeType c: ConditioningTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
