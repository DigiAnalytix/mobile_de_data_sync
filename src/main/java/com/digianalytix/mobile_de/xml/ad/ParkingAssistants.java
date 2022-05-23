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
 *     &lt;extension base="{http://services.mobile.de/schema/resource}resourceDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}parking-assistant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "parkingAssistant",
        "parkingAssistantValue"
})
@XmlRootElement(name = "parking-assistants")
public class ParkingAssistants
        extends ResourceDataType {

    @XmlElement(name = "parking-assistant")
    protected List<ResourceDataType> parkingAssistant;

    @XmlElement(name = "parking-assistant-val")
    protected String parkingAssistantValue;


    /**
     * Gets the value of the parkingAssistant property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAssistant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAssistant().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceDataType }
     */
    public List<ResourceDataType> getParkingAssistant() {
        if (parkingAssistant == null) {
            parkingAssistant = new ArrayList<ResourceDataType>();
        }
        return this.parkingAssistant;
    }

    public String getParkingAssistantValue() {
        return parkingAssistantValue;
    }

    public void setParkingAssistantValue(String parkingAssistantValue) {
        this.parkingAssistantValue = parkingAssistantValue;
    }
}
