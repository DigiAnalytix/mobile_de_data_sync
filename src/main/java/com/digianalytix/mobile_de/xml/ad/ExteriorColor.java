package com.digianalytix.mobile_de.xml.ad;

import com.digianalytix.mobile_de.xml.resource.ResourceDataType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.mobile.de/schema/resource}resourceDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}metalic" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}manufacturer-color-name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "metalic",
        "manufacturerColorName",
        "valueStr"
})
@XmlRootElement(name = "exterior-color")
public class ExteriorColor
        extends ResourceDataType {

    @XmlElement(name = "metalic")
    protected Metalic metalic;

    @XmlElement(name = "manufacturer-color-name")
    protected ManufacturerColorName manufacturerColorName;

    @XmlElement(name = "value-str")
    protected String valueStr;

    /**
     * Gets the value of the metalic property.
     *
     * @return possible object is
     * {@link Metalic }
     */
    public Metalic getMetalic() {
        return metalic;
    }

    /**
     * Sets the value of the metalic property.
     *
     * @param value allowed object is
     *              {@link Metalic }
     */
    public void setMetalic(Metalic value) {
        this.metalic = value;
    }

    /**
     * Gets the value of the manufacturerColorName property.
     *
     * @return possible object is
     * {@link ManufacturerColorName }
     */
    public ManufacturerColorName getManufacturerColorName() {
        return manufacturerColorName;
    }

    /**
     * Sets the value of the manufacturerColorName property.
     *
     * @param value allowed object is
     *              {@link ManufacturerColorName }
     */
    public void setManufacturerColorName(ManufacturerColorName value) {
        this.manufacturerColorName = value;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }
}
