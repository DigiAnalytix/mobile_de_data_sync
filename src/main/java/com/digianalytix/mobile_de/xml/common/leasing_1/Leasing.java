
package com.digianalytix.mobile_de.xml.common.leasing_1;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 *       &lt;all&gt;
 *         &lt;element name="gross-list-price" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="vat-rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="lender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="leasing-rate" type="{http://services.mobile.de/schema/common/leasing-1.0}leasing-rate" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "leasing")
public class Leasing {

    @XmlElement(name = "gross-list-price")
    protected BigInteger grossListPrice;
    @XmlElement(name = "vat-rate", required = true)
    protected BigDecimal vatRate;
    @XmlElement(required = true)
    protected String lender;
    @XmlElement(required = true)
    protected Rates rates;
    protected String comment;

    /**
     * Gets the value of the grossListPrice property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getGrossListPrice() {
        return grossListPrice;
    }

    /**
     * Sets the value of the grossListPrice property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setGrossListPrice(BigInteger value) {
        this.grossListPrice = value;
    }

    /**
     * Gets the value of the vatRate property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVatRate(BigDecimal value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the lender property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLender() {
        return lender;
    }

    /**
     * Sets the value of the lender property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLender(String value) {
        this.lender = value;
    }

    /**
     * Gets the value of the rates property.
     *
     * @return
     *     possible object is
     *     {@link Rates }
     *
     */
    public Rates getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     *
     * @param value
     *     allowed object is
     *     {@link Rates }
     *
     */
    public void setRates(Rates value) {
        this.rates = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }


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
     *         &lt;element name="leasing-rate" type="{http://services.mobile.de/schema/common/leasing-1.0}leasing-rate" maxOccurs="unbounded"/&gt;
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
        "leasingRate"
    })
    public static class Rates {

        @XmlElement(name = "leasing-rate", required = true)
        protected List<LeasingRate> leasingRate;

        /**
         * Gets the value of the leasingRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leasingRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeasingRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LeasingRate }
         * 
         * 
         */
        public List<LeasingRate> getLeasingRate() {
            if (leasingRate == null) {
                leasingRate = new ArrayList<LeasingRate>();
            }
            return this.leasingRate;
        }

    }

}
