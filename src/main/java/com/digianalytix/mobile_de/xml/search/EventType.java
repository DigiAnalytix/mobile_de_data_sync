
package com.digianalytix.mobile_de.xml.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for event-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="event-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_CREATE_OR_UPDATE"/&gt;
 *     &lt;enumeration value="AD_DELETE"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "event-type")
@XmlEnum
public enum EventType {

    AD_CREATE_OR_UPDATE,
    AD_DELETE,
    ERROR;

    public String value() {
        return name();
    }

    public static EventType fromValue(String v) {
        return valueOf(v);
    }

}
