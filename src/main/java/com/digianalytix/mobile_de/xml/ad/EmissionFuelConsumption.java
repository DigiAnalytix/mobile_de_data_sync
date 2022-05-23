
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
 *       &lt;attribute name="envkv-compliant" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="energy-efficiency-class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="co2-emission" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="inner" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="outer" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="combined" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="unit"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="LITER_PER_100_KM"/&gt;
 *             &lt;enumeration value="CUBIC_METER_PER_100_KM"/&gt;
 *             &lt;enumeration value="KILOGRAMM_PER_100_KM"/&gt;
 *             &lt;enumeration value="KILOWATT_HOUR_PER_100_KM"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="petrol-type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="NORMAL"/&gt;
 *             &lt;enumeration value="SUPER"/&gt;
 *             &lt;enumeration value="SUPER_PLUS"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="combined-power-consumption" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "emission-fuel-consumption")
public class EmissionFuelConsumption {

    @XmlAttribute(name = "envkv-compliant")
    protected Boolean envkvCompliant;
    @XmlAttribute(name = "energy-efficiency-class")
    protected String energyEfficiencyClass;
    @XmlAttribute(name = "co2-emission")
    protected BigDecimal co2Emission;
    @XmlAttribute(name = "inner")
    protected BigDecimal inner;
    @XmlAttribute(name = "outer")
    protected BigDecimal outer;
    @XmlAttribute(name = "combined")
    protected BigDecimal combined;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "petrol-type")
    protected String petrolType;
    @XmlAttribute(name = "combined-power-consumption")
    protected BigDecimal combinedPowerConsumption;

    /**
     * Gets the value of the envkvCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnvkvCompliant() {
        return envkvCompliant;
    }

    /**
     * Sets the value of the envkvCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnvkvCompliant(Boolean value) {
        this.envkvCompliant = value;
    }

    /**
     * Gets the value of the energyEfficiencyClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    /**
     * Sets the value of the energyEfficiencyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyEfficiencyClass(String value) {
        this.energyEfficiencyClass = value;
    }

    /**
     * Gets the value of the co2Emission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCo2Emission() {
        return co2Emission;
    }

    /**
     * Sets the value of the co2Emission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCo2Emission(BigDecimal value) {
        this.co2Emission = value;
    }

    /**
     * Gets the value of the inner property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInner() {
        return inner;
    }

    /**
     * Sets the value of the inner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInner(BigDecimal value) {
        this.inner = value;
    }

    /**
     * Gets the value of the outer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOuter() {
        return outer;
    }

    /**
     * Sets the value of the outer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOuter(BigDecimal value) {
        this.outer = value;
    }

    /**
     * Gets the value of the combined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCombined() {
        return combined;
    }

    /**
     * Sets the value of the combined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCombined(BigDecimal value) {
        this.combined = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the petrolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetrolType() {
        return petrolType;
    }

    /**
     * Sets the value of the petrolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetrolType(String value) {
        this.petrolType = value;
    }

    /**
     * Gets the value of the combinedPowerConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCombinedPowerConsumption() {
        return combinedPowerConsumption;
    }

    /**
     * Sets the value of the combinedPowerConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCombinedPowerConsumption(BigDecimal value) {
        this.combinedPowerConsumption = value;
    }

}
