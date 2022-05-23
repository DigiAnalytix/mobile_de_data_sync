
package com.digianalytix.mobile_de.xml.ad;

import javax.xml.bind.annotation.*;


/**
 * Represent a cubical dimension.
 * 
 * <p>Java class for dimensionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimensionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensionDataType")
public class DimensionDataType {

    @XmlAttribute(name = "length", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long length;
    @XmlAttribute(name = "width", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long width;
    @XmlAttribute(name = "height", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long height;

    /**
     * Gets the value of the length property.
     * 
     */
    public long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(long value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public long getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(long value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public long getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(long value) {
        this.height = value;
    }

}
