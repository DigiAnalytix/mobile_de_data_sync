
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}class"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}category"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}make"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}model" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}model-description"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}damage-and-unrepaired" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}accident-damaged" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}roadworthy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}features" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}specifics"/&gt;
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
    "clazz",
    "category",
    "make",
    "model",
    "modelDescription",
    "damageAndUnrepaired",
    "accidentDamaged",
    "roadworthy",
    "features",
    "specifics"
})
@XmlRootElement(name = "vehicle")
public class Vehicle {

    @XmlElement(name = "class", required = true)
    protected ResourceDataType clazz;
    @XmlElement(required = true)
    protected ResourceDataType category;
    @XmlElement(required = true)
    protected ResourceDataType make;
    protected ResourceDataType model;
    @XmlElement(name = "model-description", required = true)
    protected ModelDescription modelDescription;
    @XmlElement(name = "damage-and-unrepaired")
    protected DamageAndUnrepaired damageAndUnrepaired;
    @XmlElement(name = "accident-damaged")
    protected AccidentDamaged accidentDamaged;
    protected Roadworthy roadworthy;
    protected Features features;
    @XmlElement(required = true)
    protected Specifics specifics;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setClazz(ResourceDataType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setCategory(ResourceDataType value) {
        this.category = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setMake(ResourceDataType value) {
        this.make = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setModel(ResourceDataType value) {
        this.model = value;
    }

    /**
     * Gets the value of the modelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ModelDescription }
     *     
     */
    public ModelDescription getModelDescription() {
        return modelDescription;
    }

    /**
     * Sets the value of the modelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelDescription }
     *     
     */
    public void setModelDescription(ModelDescription value) {
        this.modelDescription = value;
    }

    /**
     * See http://services.mobile.de/manual/damage.html.
     * 
     * @return
     *     possible object is
     *     {@link DamageAndUnrepaired }
     *     
     */
    public DamageAndUnrepaired getDamageAndUnrepaired() {
        return damageAndUnrepaired;
    }

    /**
     * Sets the value of the damageAndUnrepaired property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageAndUnrepaired }
     *     
     */
    public void setDamageAndUnrepaired(DamageAndUnrepaired value) {
        this.damageAndUnrepaired = value;
    }

    /**
     * See http://services.mobile.de/manual/damage.html.
     * 
     * @return
     *     possible object is
     *     {@link AccidentDamaged }
     *     
     */
    public AccidentDamaged getAccidentDamaged() {
        return accidentDamaged;
    }

    /**
     * Sets the value of the accidentDamaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentDamaged }
     *     
     */
    public void setAccidentDamaged(AccidentDamaged value) {
        this.accidentDamaged = value;
    }

    /**
     * See http://services.mobile.de/manual/damage.html.
     * 
     * @return
     *     possible object is
     *     {@link Roadworthy }
     *     
     */
    public Roadworthy getRoadworthy() {
        return roadworthy;
    }

    /**
     * Sets the value of the roadworthy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roadworthy }
     *     
     */
    public void setRoadworthy(Roadworthy value) {
        this.roadworthy = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the specifics property.
     * 
     * @return
     *     possible object is
     *     {@link Specifics }
     *     
     */
    public Specifics getSpecifics() {
        return specifics;
    }

    /**
     * Sets the value of the specifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specifics }
     *     
     */
    public void setSpecifics(Specifics value) {
        this.specifics = value;
    }

}
