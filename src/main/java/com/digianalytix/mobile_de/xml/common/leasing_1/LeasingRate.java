
package com.digianalytix.mobile_de.xml.common.leasing_1;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Leasing rate.
 * 
 * <p>Java class for leasing-rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leasing-rate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="type" type="{http://services.mobile.de/schema/common/leasing-1.0}leasing-type"/&gt;
 *         &lt;element name="down-payment" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="term-of-contract" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="annual-mileage" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="total-amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="gross-rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="net-rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="net-loan-amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="annual-percentage-rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nominal-interest-rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="destination-charges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="registration-fees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extra-mileage-costs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="low-mileage-compensation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leasing-rate", propOrder = {

})
public class LeasingRate {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected LeasingType type;
    @XmlElement(name = "down-payment", required = true)
    protected BigInteger downPayment;
    @XmlElement(name = "term-of-contract", required = true)
    protected BigInteger termOfContract;
    @XmlElement(name = "annual-mileage", required = true)
    protected BigInteger annualMileage;
    @XmlElement(name = "total-amount", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "gross-rate")
    protected BigDecimal grossRate;
    @XmlElement(name = "net-rate")
    protected BigDecimal netRate;
    @XmlElement(name = "net-loan-amount")
    protected BigDecimal netLoanAmount;
    @XmlElement(name = "annual-percentage-rate")
    protected BigDecimal annualPercentageRate;
    @XmlElement(name = "nominal-interest-rate")
    protected BigDecimal nominalInterestRate;
    @XmlElement(name = "destination-charges")
    protected BigDecimal destinationCharges;
    @XmlElement(name = "registration-fees")
    protected BigDecimal registrationFees;
    @XmlElement(name = "extra-mileage-costs")
    protected BigDecimal extraMileageCosts;
    @XmlElement(name = "low-mileage-compensation")
    protected BigDecimal lowMileageCompensation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LeasingType }
     *     
     */
    public LeasingType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeasingType }
     *     
     */
    public void setType(LeasingType value) {
        this.type = value;
    }

    /**
     * Gets the value of the downPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDownPayment(BigInteger value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the termOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTermOfContract() {
        return termOfContract;
    }

    /**
     * Sets the value of the termOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTermOfContract(BigInteger value) {
        this.termOfContract = value;
    }

    /**
     * Gets the value of the annualMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnualMileage() {
        return annualMileage;
    }

    /**
     * Sets the value of the annualMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnualMileage(BigInteger value) {
        this.annualMileage = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the grossRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossRate() {
        return grossRate;
    }

    /**
     * Sets the value of the grossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossRate(BigDecimal value) {
        this.grossRate = value;
    }

    /**
     * Gets the value of the netRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetRate() {
        return netRate;
    }

    /**
     * Sets the value of the netRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetRate(BigDecimal value) {
        this.netRate = value;
    }

    /**
     * Gets the value of the netLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetLoanAmount() {
        return netLoanAmount;
    }

    /**
     * Sets the value of the netLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetLoanAmount(BigDecimal value) {
        this.netLoanAmount = value;
    }

    /**
     * Gets the value of the annualPercentageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    /**
     * Sets the value of the annualPercentageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualPercentageRate(BigDecimal value) {
        this.annualPercentageRate = value;
    }

    /**
     * Gets the value of the nominalInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNominalInterestRate() {
        return nominalInterestRate;
    }

    /**
     * Sets the value of the nominalInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNominalInterestRate(BigDecimal value) {
        this.nominalInterestRate = value;
    }

    /**
     * Gets the value of the destinationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestinationCharges() {
        return destinationCharges;
    }

    /**
     * Sets the value of the destinationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestinationCharges(BigDecimal value) {
        this.destinationCharges = value;
    }

    /**
     * Gets the value of the registrationFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegistrationFees() {
        return registrationFees;
    }

    /**
     * Sets the value of the registrationFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegistrationFees(BigDecimal value) {
        this.registrationFees = value;
    }

    /**
     * Gets the value of the extraMileageCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraMileageCosts() {
        return extraMileageCosts;
    }

    /**
     * Sets the value of the extraMileageCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraMileageCosts(BigDecimal value) {
        this.extraMileageCosts = value;
    }

    /**
     * Gets the value of the lowMileageCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowMileageCompensation() {
        return lowMileageCompensation;
    }

    /**
     * Sets the value of the lowMileageCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowMileageCompensation(BigDecimal value) {
        this.lowMileageCompensation = value;
    }

}
