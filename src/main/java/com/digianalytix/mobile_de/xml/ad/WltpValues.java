
package com.digianalytix.mobile_de.xml.ad;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="consumption-fuel-combined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="co2-emission-combined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="consumption-power-combined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="electric-range" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="consumption-fuel-combined-weighted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="consumption-power-combined-weighted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="co2-emission-combined-weighted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlRootElement(name = "wltp-values")
public class WltpValues {

    @XmlElement(name = "consumption-fuel-combined")
    protected BigDecimal consumptionFuelCombined;
    @XmlElement(name = "co2-emission-combined")
    protected BigDecimal co2EmissionCombined;
    @XmlElement(name = "consumption-power-combined")
    protected BigDecimal consumptionPowerCombined;
    @XmlElement(name = "electric-range")
    @XmlSchemaType(name = "unsignedInt")
    protected Long electricRange;
    @XmlElement(name = "consumption-fuel-combined-weighted")
    protected BigDecimal consumptionFuelCombinedWeighted;
    @XmlElement(name = "consumption-power-combined-weighted")
    protected BigDecimal consumptionPowerCombinedWeighted;
    @XmlElement(name = "co2-emission-combined-weighted")
    protected BigDecimal co2EmissionCombinedWeighted;

    /**
     * Gets the value of the consumptionFuelCombined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionFuelCombined() {
        return consumptionFuelCombined;
    }

    /**
     * Sets the value of the consumptionFuelCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionFuelCombined(BigDecimal value) {
        this.consumptionFuelCombined = value;
    }

    /**
     * Gets the value of the co2EmissionCombined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCo2EmissionCombined() {
        return co2EmissionCombined;
    }

    /**
     * Sets the value of the co2EmissionCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCo2EmissionCombined(BigDecimal value) {
        this.co2EmissionCombined = value;
    }

    /**
     * Gets the value of the consumptionPowerCombined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionPowerCombined() {
        return consumptionPowerCombined;
    }

    /**
     * Sets the value of the consumptionPowerCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionPowerCombined(BigDecimal value) {
        this.consumptionPowerCombined = value;
    }

    /**
     * Gets the value of the electricRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElectricRange() {
        return electricRange;
    }

    /**
     * Sets the value of the electricRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectricRange(Long value) {
        this.electricRange = value;
    }

    /**
     * Gets the value of the consumptionFuelCombinedWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionFuelCombinedWeighted() {
        return consumptionFuelCombinedWeighted;
    }

    /**
     * Sets the value of the consumptionFuelCombinedWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionFuelCombinedWeighted(BigDecimal value) {
        this.consumptionFuelCombinedWeighted = value;
    }

    /**
     * Gets the value of the consumptionPowerCombinedWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionPowerCombinedWeighted() {
        return consumptionPowerCombinedWeighted;
    }

    /**
     * Sets the value of the consumptionPowerCombinedWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionPowerCombinedWeighted(BigDecimal value) {
        this.consumptionPowerCombinedWeighted = value;
    }

    /**
     * Gets the value of the co2EmissionCombinedWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCo2EmissionCombinedWeighted() {
        return co2EmissionCombinedWeighted;
    }

    /**
     * Sets the value of the co2EmissionCombinedWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCo2EmissionCombinedWeighted(BigDecimal value) {
        this.co2EmissionCombinedWeighted = value;
    }

}
