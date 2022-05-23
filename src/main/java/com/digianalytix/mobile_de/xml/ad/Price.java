
package com.digianalytix.mobile_de.xml.ad;

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
 *         &lt;element ref="{http://services.mobile.de/schema/ad}dealer-price-amount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}consumer-price-amount"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}net" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}vatable"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}vat-rate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}included-delivery-costs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="currency" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="FIXED"/&gt;
 *             &lt;enumeration value="NEGOTIABLE"/&gt;
 *             &lt;enumeration value="ON_REQUEST"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dealerPriceAmount",
    "consumerPriceAmount",
    "net",
    "vatable",
    "vatRate",
    "includedDeliveryCosts"
})
@XmlRootElement(name = "price")
public class Price {

    @XmlElement(name = "dealer-price-amount")
    protected DealerPriceAmount dealerPriceAmount;
    @XmlElement(name = "consumer-price-amount", required = true)
    protected ConsumerPriceAmount consumerPriceAmount;
    protected Net net;
    @XmlElement(required = true)
    protected Vatable vatable;
    @XmlElement(name = "vat-rate")
    protected VatRate vatRate;
    @XmlElement(name = "included-delivery-costs")
    protected IncludedDeliveryCosts includedDeliveryCosts;
    @XmlAttribute(name = "currency", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String currency;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the dealerPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DealerPriceAmount }
     *     
     */
    public DealerPriceAmount getDealerPriceAmount() {
        return dealerPriceAmount;
    }

    /**
     * Sets the value of the dealerPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerPriceAmount }
     *     
     */
    public void setDealerPriceAmount(DealerPriceAmount value) {
        this.dealerPriceAmount = value;
    }

    /**
     * Gets the value of the consumerPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerPriceAmount }
     *     
     */
    public ConsumerPriceAmount getConsumerPriceAmount() {
        return consumerPriceAmount;
    }

    /**
     * Sets the value of the consumerPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerPriceAmount }
     *     
     */
    public void setConsumerPriceAmount(ConsumerPriceAmount value) {
        this.consumerPriceAmount = value;
    }

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link Net }
     *     
     */
    public Net getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link Net }
     *     
     */
    public void setNet(Net value) {
        this.net = value;
    }

    /**
     * Gets the value of the vatable property.
     * 
     * @return
     *     possible object is
     *     {@link Vatable }
     *     
     */
    public Vatable getVatable() {
        return vatable;
    }

    /**
     * Sets the value of the vatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vatable }
     *     
     */
    public void setVatable(Vatable value) {
        this.vatable = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link VatRate }
     *     
     */
    public VatRate getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRate }
     *     
     */
    public void setVatRate(VatRate value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the includedDeliveryCosts property.
     * 
     * @return
     *     possible object is
     *     {@link IncludedDeliveryCosts }
     *     
     */
    public IncludedDeliveryCosts getIncludedDeliveryCosts() {
        return includedDeliveryCosts;
    }

    /**
     * Sets the value of the includedDeliveryCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedDeliveryCosts }
     *     
     */
    public void setIncludedDeliveryCosts(IncludedDeliveryCosts value) {
        this.includedDeliveryCosts = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
