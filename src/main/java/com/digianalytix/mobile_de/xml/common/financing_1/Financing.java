
package com.digianalytix.mobile_de.xml.common.financing_1;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element name="annual-percentage-rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="nominal-interest-rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="type-of-nominal-interest-rate" type="{http://services.mobile.de/schema/common/financing-1.0}type-of-nominal-interest-rate-enum"/&gt;
 *         &lt;element name="first-installment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="monthly-installment" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="final-installment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="payback-period" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="net-loan-amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="gross-loan-amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="closing-costs" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="payment-protection-insurance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="bank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "financing")
public class Financing {

    @XmlElement(name = "annual-percentage-rate", required = true)
    protected BigDecimal annualPercentageRate;
    @XmlElement(name = "nominal-interest-rate", required = true)
    protected BigDecimal nominalInterestRate;
    @XmlElement(name = "type-of-nominal-interest-rate", required = true)
    @XmlSchemaType(name = "token")
    protected TypeOfNominalInterestRateEnum typeOfNominalInterestRate;
    @XmlElement(name = "first-installment")
    protected BigInteger firstInstallment;
    @XmlElement(name = "monthly-installment", required = true)
    protected BigInteger monthlyInstallment;
    @XmlElement(name = "final-installment")
    protected BigInteger finalInstallment;
    @XmlElement(name = "payback-period", required = true)
    protected BigInteger paybackPeriod;
    @XmlElement(name = "net-loan-amount", required = true)
    protected BigDecimal netLoanAmount;
    @XmlElement(name = "gross-loan-amount", required = true)
    protected BigDecimal grossLoanAmount;
    @XmlElement(name = "closing-costs", required = true)
    protected BigDecimal closingCosts;
    @XmlElement(name = "payment-protection-insurance", required = true)
    protected BigDecimal paymentProtectionInsurance;
    @XmlElement(required = true)
    protected String bank;
    protected String conditions;

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
     * Gets the value of the typeOfNominalInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNominalInterestRateEnum }
     *     
     */
    public TypeOfNominalInterestRateEnum getTypeOfNominalInterestRate() {
        return typeOfNominalInterestRate;
    }

    /**
     * Sets the value of the typeOfNominalInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNominalInterestRateEnum }
     *     
     */
    public void setTypeOfNominalInterestRate(TypeOfNominalInterestRateEnum value) {
        this.typeOfNominalInterestRate = value;
    }

    /**
     * Gets the value of the firstInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstInstallment() {
        return firstInstallment;
    }

    /**
     * Sets the value of the firstInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstInstallment(BigInteger value) {
        this.firstInstallment = value;
    }

    /**
     * Gets the value of the monthlyInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthlyInstallment() {
        return monthlyInstallment;
    }

    /**
     * Sets the value of the monthlyInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthlyInstallment(BigInteger value) {
        this.monthlyInstallment = value;
    }

    /**
     * Gets the value of the finalInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinalInstallment() {
        return finalInstallment;
    }

    /**
     * Sets the value of the finalInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinalInstallment(BigInteger value) {
        this.finalInstallment = value;
    }

    /**
     * Gets the value of the paybackPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaybackPeriod() {
        return paybackPeriod;
    }

    /**
     * Sets the value of the paybackPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaybackPeriod(BigInteger value) {
        this.paybackPeriod = value;
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
     * Gets the value of the grossLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossLoanAmount() {
        return grossLoanAmount;
    }

    /**
     * Sets the value of the grossLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossLoanAmount(BigDecimal value) {
        this.grossLoanAmount = value;
    }

    /**
     * Gets the value of the closingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClosingCosts() {
        return closingCosts;
    }

    /**
     * Sets the value of the closingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClosingCosts(BigDecimal value) {
        this.closingCosts = value;
    }

    /**
     * Gets the value of the paymentProtectionInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentProtectionInsurance() {
        return paymentProtectionInsurance;
    }

    /**
     * Sets the value of the paymentProtectionInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentProtectionInsurance(BigDecimal value) {
        this.paymentProtectionInsurance = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

}
