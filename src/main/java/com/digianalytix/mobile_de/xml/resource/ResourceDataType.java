
package com.digianalytix.mobile_de.xml.resource;

import com.digianalytix.mobile_de.xml.ad.Ad;
import com.digianalytix.mobile_de.xml.ad.ExteriorColor;
import com.digianalytix.mobile_de.xml.ad.Features;
import com.digianalytix.mobile_de.xml.ad.ParkingAssistants;
import com.digianalytix.mobile_de.xml.seller.Seller;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *               Represent a resource. A resource can be reference data or business entities.
 *           
 * 
 * <p>Java class for resourceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="local-description" type="{http://services.mobile.de/schema/resource}LocalizedDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceDataType", propOrder = {
    "localDescription"
})
@XmlSeeAlso({
    Seller.class,
    ParkingAssistants.class,
    ExteriorColor.class,
    Features.class,
    Ad.class
})
public class ResourceDataType {

    @XmlElement(name = "local-description")
    protected LocalizedDescription localDescription;
    @XmlAttribute(name = "key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String key;
    @XmlAttribute(name = "url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "deprecated")
    protected Boolean deprecated;

    /**
     * Gets the value of the localDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedDescription }
     *     
     */
    public LocalizedDescription getLocalDescription() {
        return localDescription;
    }

    /**
     * Sets the value of the localDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedDescription }
     *     
     */
    public void setLocalDescription(LocalizedDescription value) {
        this.localDescription = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

}
