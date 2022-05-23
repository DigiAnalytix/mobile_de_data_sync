
package com.digianalytix.mobile_de.xml.common.leasing_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for leasing-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="leasing-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PRIVATE"/&gt;
 *     &lt;enumeration value="COMMERCIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "leasing-type")
@XmlEnum
public enum LeasingType {

    PRIVATE,
    COMMERCIAL;

    public String value() {
        return name();
    }

    public static LeasingType fromValue(String v) {
        return valueOf(v);
    }

}
