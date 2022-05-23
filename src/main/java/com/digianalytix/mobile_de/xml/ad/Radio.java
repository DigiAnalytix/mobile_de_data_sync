
package com.digianalytix.mobile_de.xml.ad;

import com.digianalytix.mobile_de.xml.resource.ResourceDataType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://services.mobile.de/schema/ad}radio-type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "radioType"
})
@XmlRootElement(name = "radio")
public class Radio {

    @XmlElement(name = "radio-type")
    protected List<ResourceDataType> radioType;

    /**
     * Gets the value of the radioType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceDataType }
     * 
     * 
     */
    public List<ResourceDataType> getRadioType() {
        if (radioType == null) {
            radioType = new ArrayList<ResourceDataType>();
        }
        return this.radioType;
    }

}
