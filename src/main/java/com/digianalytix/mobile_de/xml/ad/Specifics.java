
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
 *         &lt;element ref="{http://services.mobile.de/schema/ad}exterior-color" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}mileage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}exhaust-inspection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}general-inspection" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}door-count" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}first-registration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}emission-class" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}emission-fuel-consumption" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}emission-sticker" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}fuel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}power" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}kba" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}schwacke-code" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}gearbox" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}climatisation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}licensed-weight" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}axles" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}load-capacity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}num-seats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}operating-hours" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}installation-height" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}lifting-capacity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}lifting-height" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}construction-year" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}construction-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}cubic-capacity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}driving-mode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}driving-cab" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}condition" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}usage-type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://services.mobile.de/schema/ad}delivery-date"/&gt;
 *           &lt;element ref="{http://services.mobile.de/schema/ad}delivery-period"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}wheel-formula" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}number-of-bunks" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}hydraulic-installation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}europallet-storage-spaces" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}dimension" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}shipping-volume" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}loading-space" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}identification-number" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}interior-color" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}interior-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}airbag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}number-of-previous-owners" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}countryVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}videoUrl" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}parking-assistants" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}used-car-seal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}speed-control" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}radio" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}daytime-running-lamps" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}sliding-door-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}headlight-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}bending-lights-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}breakdown-service" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}battery" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}trailer-coupling-type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}trim-line" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}model-range" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}first-models-production-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}battery-capacity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}wltp-values" minOccurs="0"/&gt;
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
    "exteriorColor",
    "mileage",
    "exhaustInspection",
    "generalInspection",
    "doorCount",
    "firstRegistration",
    "emissionClass",
    "emissionFuelConsumption",
    "emissionSticker",
    "fuel",
    "power",
    "kba",
    "schwackeCode",
    "gearbox",
    "climatisation",
    "licensedWeight",
    "axles",
    "loadCapacity",
    "numSeats",
    "operatingHours",
    "installationHeight",
    "liftingCapacity",
    "liftingHeight",
    "constructionYear",
    "constructionDate",
    "cubicCapacity",
    "drivingMode",
    "drivingCab",
    "condition",
    "usageType",
    "deliveryDate",
    "deliveryPeriod",
    "wheelFormula",
    "numberOfBunks",
    "hydraulicInstallation",
    "europalletStorageSpaces",
    "dimension",
    "shippingVolume",
    "loadingSpace",
    "identificationNumber",
    "interiorColor",
    "interiorType",
    "airbag",
    "numberOfPreviousOwners",
    "countryVersion",
    "videoUrl",
    "parkingAssistants",
    "usedCarSeal",
    "speedControl",
    "radio",
    "daytimeRunningLamps",
    "slidingDoorType",
    "headlightType",
    "bendingLightsType",
    "breakdownService",
    "battery",
    "trailerCouplingType",
    "trimLine",
    "modelRange",
    "firstModelsProductionDate",
    "batteryCapacity",
    "wltpValues"
})
@XmlRootElement(name = "specifics")
public class Specifics {

    @XmlElement(name = "exterior-color")
    protected ExteriorColor exteriorColor;
    protected Mileage mileage;
    @XmlElement(name = "exhaust-inspection")
    protected ExhaustInspection exhaustInspection;
    @XmlElement(name = "general-inspection")
    protected GeneralInspection generalInspection;
    @XmlElement(name = "door-count")
    protected ResourceDataType doorCount;
    @XmlElement(name = "first-registration")
    protected FirstRegistration firstRegistration;
    @XmlElement(name = "emission-class")
    protected ResourceDataType emissionClass;
    @XmlElement(name = "emission-fuel-consumption")
    protected EmissionFuelConsumption emissionFuelConsumption;
    @XmlElement(name = "emission-sticker")
    protected ResourceDataType emissionSticker;
    protected ResourceDataType fuel;
    protected Power power;
    protected Kba kba;
    @XmlElement(name = "schwacke-code")
    protected SchwackeCode schwackeCode;
    protected ResourceDataType gearbox;
    protected ResourceDataType climatisation;
    @XmlElement(name = "licensed-weight")
    protected LicensedWeight licensedWeight;
    protected Axles axles;
    @XmlElement(name = "load-capacity")
    protected LoadCapacity loadCapacity;
    @XmlElement(name = "num-seats")
    protected NumSeats numSeats;
    @XmlElement(name = "operating-hours")
    protected OperatingHours operatingHours;
    @XmlElement(name = "installation-height")
    protected InstallationHeight installationHeight;
    @XmlElement(name = "lifting-capacity")
    protected LiftingCapacity liftingCapacity;
    @XmlElement(name = "lifting-height")
    protected LiftingHeight liftingHeight;
    @XmlElement(name = "construction-year")
    protected ConstructionYear constructionYear;
    @XmlElement(name = "construction-date")
    protected ConstructionDate constructionDate;
    @XmlElement(name = "cubic-capacity")
    protected CubicCapacity cubicCapacity;
    @XmlElement(name = "driving-mode")
    protected ResourceDataType drivingMode;
    @XmlElement(name = "driving-cab")
    protected ResourceDataType drivingCab;
    protected ResourceDataType condition;
    @XmlElement(name = "usage-type")
    protected ResourceDataType usageType;
    @XmlElement(name = "delivery-date")
    protected DeliveryDate deliveryDate;
    @XmlElement(name = "delivery-period")
    protected DeliveryPeriod deliveryPeriod;
    @XmlElement(name = "wheel-formula")
    protected ResourceDataType wheelFormula;
    @XmlElement(name = "number-of-bunks")
    protected NumberOfBunks numberOfBunks;
    @XmlElement(name = "hydraulic-installation")
    protected ResourceDataType hydraulicInstallation;
    @XmlElement(name = "europallet-storage-spaces")
    protected EuropalletStorageSpaces europalletStorageSpaces;
    protected DimensionDataType dimension;
    @XmlElement(name = "shipping-volume")
    protected ShippingVolume shippingVolume;
    @XmlElement(name = "loading-space")
    protected DimensionDataType loadingSpace;
    @XmlElement(name = "identification-number")
    protected IdentificationNumber identificationNumber;
    @XmlElement(name = "interior-color")
    protected ResourceDataType interiorColor;
    @XmlElement(name = "interior-type")
    protected ResourceDataType interiorType;
    protected ResourceDataType airbag;
    @XmlElement(name = "number-of-previous-owners")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfPreviousOwners;
    protected ResourceDataType countryVersion;
    protected ResourceDataType videoUrl;
    @XmlElement(name = "parking-assistants")
    protected ParkingAssistants parkingAssistants;
    @XmlElement(name = "used-car-seal")
    protected ResourceDataType usedCarSeal;
    @XmlElement(name = "speed-control")
    protected ResourceDataType speedControl;
    protected Radio radio;
    @XmlElement(name = "daytime-running-lamps")
    protected ResourceDataType daytimeRunningLamps;
    @XmlElement(name = "sliding-door-type")
    protected ResourceDataType slidingDoorType;
    @XmlElement(name = "headlight-type")
    protected ResourceDataType headlightType;
    @XmlElement(name = "bending-lights-type")
    protected ResourceDataType bendingLightsType;
    @XmlElement(name = "breakdown-service")
    protected ResourceDataType breakdownService;
    protected ResourceDataType battery;
    @XmlElement(name = "trailer-coupling-type")
    protected ResourceDataType trailerCouplingType;
    @XmlElement(name = "trim-line")
    protected TrimLine trimLine;
    @XmlElement(name = "model-range")
    protected ModelRange modelRange;
    @XmlElement(name = "first-models-production-date")
    protected FirstModelsProductionDate firstModelsProductionDate;
    @XmlElement(name = "battery-capacity")
    protected BatteryCapacity batteryCapacity;
    @XmlElement(name = "wltp-values")
    protected WltpValues wltpValues;

    /**
     * Gets the value of the exteriorColor property.
     * 
     * @return
     *     possible object is
     *     {@link ExteriorColor }
     *     
     */
    public ExteriorColor getExteriorColor() {
        return exteriorColor;
    }

    /**
     * Sets the value of the exteriorColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExteriorColor }
     *     
     */
    public void setExteriorColor(ExteriorColor value) {
        this.exteriorColor = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link Mileage }
     *     
     */
    public Mileage getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mileage }
     *     
     */
    public void setMileage(Mileage value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the exhaustInspection property.
     * 
     * @return
     *     possible object is
     *     {@link ExhaustInspection }
     *     
     */
    public ExhaustInspection getExhaustInspection() {
        return exhaustInspection;
    }

    /**
     * Sets the value of the exhaustInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExhaustInspection }
     *     
     */
    public void setExhaustInspection(ExhaustInspection value) {
        this.exhaustInspection = value;
    }

    /**
     * Gets the value of the generalInspection property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInspection }
     *     
     */
    public GeneralInspection getGeneralInspection() {
        return generalInspection;
    }

    /**
     * Sets the value of the generalInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInspection }
     *     
     */
    public void setGeneralInspection(GeneralInspection value) {
        this.generalInspection = value;
    }

    /**
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setDoorCount(ResourceDataType value) {
        this.doorCount = value;
    }

    /**
     * Gets the value of the firstRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link FirstRegistration }
     *     
     */
    public FirstRegistration getFirstRegistration() {
        return firstRegistration;
    }

    /**
     * Sets the value of the firstRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstRegistration }
     *     
     */
    public void setFirstRegistration(FirstRegistration value) {
        this.firstRegistration = value;
    }

    /**
     * Gets the value of the emissionClass property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getEmissionClass() {
        return emissionClass;
    }

    /**
     * Sets the value of the emissionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setEmissionClass(ResourceDataType value) {
        this.emissionClass = value;
    }

    /**
     * Gets the value of the emissionFuelConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionFuelConsumption }
     *     
     */
    public EmissionFuelConsumption getEmissionFuelConsumption() {
        return emissionFuelConsumption;
    }

    /**
     * Sets the value of the emissionFuelConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionFuelConsumption }
     *     
     */
    public void setEmissionFuelConsumption(EmissionFuelConsumption value) {
        this.emissionFuelConsumption = value;
    }

    /**
     * Gets the value of the emissionSticker property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getEmissionSticker() {
        return emissionSticker;
    }

    /**
     * Sets the value of the emissionSticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setEmissionSticker(ResourceDataType value) {
        this.emissionSticker = value;
    }

    /**
     * Gets the value of the fuel property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setFuel(ResourceDataType value) {
        this.fuel = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Power }
     *     
     */
    public Power getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Power }
     *     
     */
    public void setPower(Power value) {
        this.power = value;
    }

    /**
     * Gets the value of the kba property.
     * 
     * @return
     *     possible object is
     *     {@link Kba }
     *     
     */
    public Kba getKba() {
        return kba;
    }

    /**
     * Sets the value of the kba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kba }
     *     
     */
    public void setKba(Kba value) {
        this.kba = value;
    }

    /**
     * Gets the value of the schwackeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SchwackeCode }
     *     
     */
    public SchwackeCode getSchwackeCode() {
        return schwackeCode;
    }

    /**
     * Sets the value of the schwackeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchwackeCode }
     *     
     */
    public void setSchwackeCode(SchwackeCode value) {
        this.schwackeCode = value;
    }

    /**
     * Gets the value of the gearbox property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getGearbox() {
        return gearbox;
    }

    /**
     * Sets the value of the gearbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setGearbox(ResourceDataType value) {
        this.gearbox = value;
    }

    /**
     * Gets the value of the climatisation property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getClimatisation() {
        return climatisation;
    }

    /**
     * Sets the value of the climatisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setClimatisation(ResourceDataType value) {
        this.climatisation = value;
    }

    /**
     * Gets the value of the licensedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link LicensedWeight }
     *     
     */
    public LicensedWeight getLicensedWeight() {
        return licensedWeight;
    }

    /**
     * Sets the value of the licensedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensedWeight }
     *     
     */
    public void setLicensedWeight(LicensedWeight value) {
        this.licensedWeight = value;
    }

    /**
     * Gets the value of the axles property.
     * 
     * @return
     *     possible object is
     *     {@link Axles }
     *     
     */
    public Axles getAxles() {
        return axles;
    }

    /**
     * Sets the value of the axles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Axles }
     *     
     */
    public void setAxles(Axles value) {
        this.axles = value;
    }

    /**
     * Gets the value of the loadCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link LoadCapacity }
     *     
     */
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets the value of the loadCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadCapacity }
     *     
     */
    public void setLoadCapacity(LoadCapacity value) {
        this.loadCapacity = value;
    }

    /**
     * Gets the value of the numSeats property.
     * 
     * @return
     *     possible object is
     *     {@link NumSeats }
     *     
     */
    public NumSeats getNumSeats() {
        return numSeats;
    }

    /**
     * Sets the value of the numSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumSeats }
     *     
     */
    public void setNumSeats(NumSeats value) {
        this.numSeats = value;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingHours }
     *     
     */
    public OperatingHours getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the value of the operatingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingHours }
     *     
     */
    public void setOperatingHours(OperatingHours value) {
        this.operatingHours = value;
    }

    /**
     * Gets the value of the installationHeight property.
     * 
     * @return
     *     possible object is
     *     {@link InstallationHeight }
     *     
     */
    public InstallationHeight getInstallationHeight() {
        return installationHeight;
    }

    /**
     * Sets the value of the installationHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallationHeight }
     *     
     */
    public void setInstallationHeight(InstallationHeight value) {
        this.installationHeight = value;
    }

    /**
     * Gets the value of the liftingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link LiftingCapacity }
     *     
     */
    public LiftingCapacity getLiftingCapacity() {
        return liftingCapacity;
    }

    /**
     * Sets the value of the liftingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiftingCapacity }
     *     
     */
    public void setLiftingCapacity(LiftingCapacity value) {
        this.liftingCapacity = value;
    }

    /**
     * Gets the value of the liftingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LiftingHeight }
     *     
     */
    public LiftingHeight getLiftingHeight() {
        return liftingHeight;
    }

    /**
     * Sets the value of the liftingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiftingHeight }
     *     
     */
    public void setLiftingHeight(LiftingHeight value) {
        this.liftingHeight = value;
    }

    /**
     * Gets the value of the constructionYear property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionYear }
     *     
     */
    public ConstructionYear getConstructionYear() {
        return constructionYear;
    }

    /**
     * Sets the value of the constructionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionYear }
     *     
     */
    public void setConstructionYear(ConstructionYear value) {
        this.constructionYear = value;
    }

    /**
     * Gets the value of the constructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionDate }
     *     
     */
    public ConstructionDate getConstructionDate() {
        return constructionDate;
    }

    /**
     * Sets the value of the constructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionDate }
     *     
     */
    public void setConstructionDate(ConstructionDate value) {
        this.constructionDate = value;
    }

    /**
     * Gets the value of the cubicCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link CubicCapacity }
     *     
     */
    public CubicCapacity getCubicCapacity() {
        return cubicCapacity;
    }

    /**
     * Sets the value of the cubicCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CubicCapacity }
     *     
     */
    public void setCubicCapacity(CubicCapacity value) {
        this.cubicCapacity = value;
    }

    /**
     * Gets the value of the drivingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getDrivingMode() {
        return drivingMode;
    }

    /**
     * Sets the value of the drivingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setDrivingMode(ResourceDataType value) {
        this.drivingMode = value;
    }

    /**
     * Gets the value of the drivingCab property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getDrivingCab() {
        return drivingCab;
    }

    /**
     * Sets the value of the drivingCab property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setDrivingCab(ResourceDataType value) {
        this.drivingCab = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setCondition(ResourceDataType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setUsageType(ResourceDataType value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDate }
     *     
     */
    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDate }
     *     
     */
    public void setDeliveryDate(DeliveryDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPeriod }
     *     
     */
    public DeliveryPeriod getDeliveryPeriod() {
        return deliveryPeriod;
    }

    /**
     * Sets the value of the deliveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPeriod }
     *     
     */
    public void setDeliveryPeriod(DeliveryPeriod value) {
        this.deliveryPeriod = value;
    }

    /**
     * Gets the value of the wheelFormula property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getWheelFormula() {
        return wheelFormula;
    }

    /**
     * Sets the value of the wheelFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setWheelFormula(ResourceDataType value) {
        this.wheelFormula = value;
    }

    /**
     * Gets the value of the numberOfBunks property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfBunks }
     *     
     */
    public NumberOfBunks getNumberOfBunks() {
        return numberOfBunks;
    }

    /**
     * Sets the value of the numberOfBunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfBunks }
     *     
     */
    public void setNumberOfBunks(NumberOfBunks value) {
        this.numberOfBunks = value;
    }

    /**
     * Gets the value of the hydraulicInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getHydraulicInstallation() {
        return hydraulicInstallation;
    }

    /**
     * Sets the value of the hydraulicInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setHydraulicInstallation(ResourceDataType value) {
        this.hydraulicInstallation = value;
    }

    /**
     * Gets the value of the europalletStorageSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link EuropalletStorageSpaces }
     *     
     */
    public EuropalletStorageSpaces getEuropalletStorageSpaces() {
        return europalletStorageSpaces;
    }

    /**
     * Sets the value of the europalletStorageSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropalletStorageSpaces }
     *     
     */
    public void setEuropalletStorageSpaces(EuropalletStorageSpaces value) {
        this.europalletStorageSpaces = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionDataType }
     *     
     */
    public DimensionDataType getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionDataType }
     *     
     */
    public void setDimension(DimensionDataType value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the shippingVolume property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingVolume }
     *     
     */
    public ShippingVolume getShippingVolume() {
        return shippingVolume;
    }

    /**
     * Sets the value of the shippingVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingVolume }
     *     
     */
    public void setShippingVolume(ShippingVolume value) {
        this.shippingVolume = value;
    }

    /**
     * Gets the value of the loadingSpace property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionDataType }
     *     
     */
    public DimensionDataType getLoadingSpace() {
        return loadingSpace;
    }

    /**
     * Sets the value of the loadingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionDataType }
     *     
     */
    public void setLoadingSpace(DimensionDataType value) {
        this.loadingSpace = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumber }
     *     
     */
    public IdentificationNumber getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumber }
     *     
     */
    public void setIdentificationNumber(IdentificationNumber value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the interiorColor property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getInteriorColor() {
        return interiorColor;
    }

    /**
     * Sets the value of the interiorColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setInteriorColor(ResourceDataType value) {
        this.interiorColor = value;
    }

    /**
     * Gets the value of the interiorType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getInteriorType() {
        return interiorType;
    }

    /**
     * Sets the value of the interiorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setInteriorType(ResourceDataType value) {
        this.interiorType = value;
    }

    /**
     * Gets the value of the airbag property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getAirbag() {
        return airbag;
    }

    /**
     * Sets the value of the airbag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setAirbag(ResourceDataType value) {
        this.airbag = value;
    }

    /**
     * Gets the value of the numberOfPreviousOwners property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPreviousOwners() {
        return numberOfPreviousOwners;
    }

    /**
     * Sets the value of the numberOfPreviousOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPreviousOwners(Long value) {
        this.numberOfPreviousOwners = value;
    }

    /**
     * Gets the value of the countryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getCountryVersion() {
        return countryVersion;
    }

    /**
     * Sets the value of the countryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setCountryVersion(ResourceDataType value) {
        this.countryVersion = value;
    }

    /**
     * Gets the value of the videoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getVideoUrl() {
        return videoUrl;
    }

    /**
     * Sets the value of the videoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setVideoUrl(ResourceDataType value) {
        this.videoUrl = value;
    }

    /**
     * Gets the value of the parkingAssistants property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAssistants }
     *     
     */
    public ParkingAssistants getParkingAssistants() {
        return parkingAssistants;
    }

    /**
     * Sets the value of the parkingAssistants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAssistants }
     *     
     */
    public void setParkingAssistants(ParkingAssistants value) {
        this.parkingAssistants = value;
    }

    /**
     * Gets the value of the usedCarSeal property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getUsedCarSeal() {
        return usedCarSeal;
    }

    /**
     * Sets the value of the usedCarSeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setUsedCarSeal(ResourceDataType value) {
        this.usedCarSeal = value;
    }

    /**
     * Gets the value of the speedControl property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getSpeedControl() {
        return speedControl;
    }

    /**
     * Sets the value of the speedControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setSpeedControl(ResourceDataType value) {
        this.speedControl = value;
    }

    /**
     * Gets the value of the radio property.
     * 
     * @return
     *     possible object is
     *     {@link Radio }
     *     
     */
    public Radio getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radio }
     *     
     */
    public void setRadio(Radio value) {
        this.radio = value;
    }

    /**
     * Gets the value of the daytimeRunningLamps property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getDaytimeRunningLamps() {
        return daytimeRunningLamps;
    }

    /**
     * Sets the value of the daytimeRunningLamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setDaytimeRunningLamps(ResourceDataType value) {
        this.daytimeRunningLamps = value;
    }

    /**
     * Gets the value of the slidingDoorType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getSlidingDoorType() {
        return slidingDoorType;
    }

    /**
     * Sets the value of the slidingDoorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setSlidingDoorType(ResourceDataType value) {
        this.slidingDoorType = value;
    }

    /**
     * Gets the value of the headlightType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getHeadlightType() {
        return headlightType;
    }

    /**
     * Sets the value of the headlightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setHeadlightType(ResourceDataType value) {
        this.headlightType = value;
    }

    /**
     * Gets the value of the bendingLightsType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getBendingLightsType() {
        return bendingLightsType;
    }

    /**
     * Sets the value of the bendingLightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setBendingLightsType(ResourceDataType value) {
        this.bendingLightsType = value;
    }

    /**
     * Gets the value of the breakdownService property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getBreakdownService() {
        return breakdownService;
    }

    /**
     * Sets the value of the breakdownService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setBreakdownService(ResourceDataType value) {
        this.breakdownService = value;
    }

    /**
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setBattery(ResourceDataType value) {
        this.battery = value;
    }

    /**
     * Gets the value of the trailerCouplingType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataType }
     *     
     */
    public ResourceDataType getTrailerCouplingType() {
        return trailerCouplingType;
    }

    /**
     * Sets the value of the trailerCouplingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataType }
     *     
     */
    public void setTrailerCouplingType(ResourceDataType value) {
        this.trailerCouplingType = value;
    }

    /**
     * Gets the value of the trimLine property.
     * 
     * @return
     *     possible object is
     *     {@link TrimLine }
     *     
     */
    public TrimLine getTrimLine() {
        return trimLine;
    }

    /**
     * Sets the value of the trimLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrimLine }
     *     
     */
    public void setTrimLine(TrimLine value) {
        this.trimLine = value;
    }

    /**
     * Gets the value of the modelRange property.
     * 
     * @return
     *     possible object is
     *     {@link ModelRange }
     *     
     */
    public ModelRange getModelRange() {
        return modelRange;
    }

    /**
     * Sets the value of the modelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelRange }
     *     
     */
    public void setModelRange(ModelRange value) {
        this.modelRange = value;
    }

    /**
     * Gets the value of the firstModelsProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link FirstModelsProductionDate }
     *     
     */
    public FirstModelsProductionDate getFirstModelsProductionDate() {
        return firstModelsProductionDate;
    }

    /**
     * Sets the value of the firstModelsProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstModelsProductionDate }
     *     
     */
    public void setFirstModelsProductionDate(FirstModelsProductionDate value) {
        this.firstModelsProductionDate = value;
    }

    /**
     * Gets the value of the batteryCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BatteryCapacity }
     *     
     */
    public BatteryCapacity getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Sets the value of the batteryCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCapacity }
     *     
     */
    public void setBatteryCapacity(BatteryCapacity value) {
        this.batteryCapacity = value;
    }

    /**
     * Gets the value of the wltpValues property.
     * 
     * @return
     *     possible object is
     *     {@link WltpValues }
     *     
     */
    public WltpValues getWltpValues() {
        return wltpValues;
    }

    /**
     * Sets the value of the wltpValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link WltpValues }
     *     
     */
    public void setWltpValues(WltpValues value) {
        this.wltpValues = value;
    }

}
