
package com.digianalytix.mobile_de.xml.common.financing_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type-of-nominal-interest-rate-enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="type-of-nominal-interest-rate-enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FIXED"/&gt;
 *     &lt;enumeration value="VARIABLE"/&gt;
 *     &lt;enumeration value="COMBINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "type-of-nominal-interest-rate-enum")
@XmlEnum
public enum TypeOfNominalInterestRateEnum {

    FIXED,
    VARIABLE,
    COMBINED;

    public String value() {
        return name();
    }

    public static TypeOfNominalInterestRateEnum fromValue(String v) {
        return valueOf(v);
    }

}
