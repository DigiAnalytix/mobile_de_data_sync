
package com.digianalytix.mobile_de.xml.search;

import com.digianalytix.mobile_de.xml.ad.Ad;
import com.digianalytix.mobile_de.xml.common.error_1.Errors;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event-type" type="{http://services.mobile.de/schema/search}event-type" minOccurs="0"/&gt;
 *         &lt;element name="ad-key" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}ad" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/common/error-1.0}errors" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventType",
    "adKey",
    "ad",
    "errors"
})
@XmlRootElement(name = "event")
public class Event {

    @XmlElement(name = "event-type")
    @XmlSchemaType(name = "string")
    protected EventType eventType;
    @XmlElement(name = "ad-key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String adKey;
    @XmlElement(namespace = "http://services.mobile.de/schema/ad")
    protected Ad ad;
    @XmlElement(namespace = "http://services.mobile.de/schema/common/error-1.0")
    protected Errors errors;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the adKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdKey() {
        return adKey;
    }

    /**
     * Sets the value of the adKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdKey(String value) {
        this.adKey = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link Ad }
     *     
     */
    public Ad getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ad }
     *     
     */
    public void setAd(Ad value) {
        this.ad = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
