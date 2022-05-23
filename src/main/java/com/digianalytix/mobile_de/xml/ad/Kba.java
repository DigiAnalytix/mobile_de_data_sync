
package com.digianalytix.mobile_de.xml.ad;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="hsn" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="tsn" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "kba")
public class Kba {

    @XmlAttribute(name = "hsn", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String hsn;
    @XmlAttribute(name = "tsn", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String tsn;

    /**
     * Gets the value of the hsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsn() {
        return hsn;
    }

    /**
     * Sets the value of the hsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsn(String value) {
        this.hsn = value;
    }

    /**
     * Gets the value of the tsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsn() {
        return tsn;
    }

    /**
     * Sets the value of the tsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsn(String value) {
        this.tsn = value;
    }

}
