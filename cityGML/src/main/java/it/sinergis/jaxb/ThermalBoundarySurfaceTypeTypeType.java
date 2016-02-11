
package it.sinergis.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermalBoundarySurfaceTypeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThermalBoundarySurfaceTypeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OuterWall"/>
 *     &lt;enumeration value="SharedWall"/>
 *     &lt;enumeration value="FlatRoof"/>
 *     &lt;enumeration value="PitchedRoof"/>
 *     &lt;enumeration value="CellarCeiling"/>
 *     &lt;enumeration value="BasementFloor"/>
 *     &lt;enumeration value="TopCeiling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermalBoundarySurfaceTypeTypeType")
@XmlEnum
public enum ThermalBoundarySurfaceTypeTypeType {

    @XmlEnumValue("OuterWall")
    OUTER_WALL("OuterWall"),
    @XmlEnumValue("SharedWall")
    SHARED_WALL("SharedWall"),
    @XmlEnumValue("FlatRoof")
    FLAT_ROOF("FlatRoof"),
    @XmlEnumValue("PitchedRoof")
    PITCHED_ROOF("PitchedRoof"),
    @XmlEnumValue("CellarCeiling")
    CELLAR_CEILING("CellarCeiling"),
    @XmlEnumValue("BasementFloor")
    BASEMENT_FLOOR("BasementFloor"),

    /**
     * Ceiling of the highest storey of the zone.
     * 
     */
    @XmlEnumValue("TopCeiling")
    TOP_CEILING("TopCeiling");
    private final String value;

    ThermalBoundarySurfaceTypeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalBoundarySurfaceTypeTypeType fromValue(String v) {
        for (ThermalBoundarySurfaceTypeTypeType c: ThermalBoundarySurfaceTypeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
