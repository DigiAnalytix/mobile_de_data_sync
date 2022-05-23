
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}label"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}label-ranges"/&gt;
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
    "label",
    "labelRanges"
})
@XmlRootElement(name = "price-rating")
public class PriceRating {

    @XmlElement(required = true)
    protected Label label;
    @XmlElement(name = "label-ranges", required = true)
    protected LabelRanges labelRanges;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the labelRanges property.
     * 
     * @return
     *     possible object is
     *     {@link LabelRanges }
     *     
     */
    public LabelRanges getLabelRanges() {
        return labelRanges;
    }

    /**
     * Sets the value of the labelRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRanges }
     *     
     */
    public void setLabelRanges(LabelRanges value) {
        this.labelRanges = value;
    }

}
