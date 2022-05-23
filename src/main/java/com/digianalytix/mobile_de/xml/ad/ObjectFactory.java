
package com.digianalytix.mobile_de.xml.ad;

import com.digianalytix.mobile_de.xml.resource.ResourceDataType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mobile.services.schema.ad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Class_QNAME = new QName("http://services.mobile.de/schema/ad", "class");
    private final static QName _Category_QNAME = new QName("http://services.mobile.de/schema/ad", "category");
    private final static QName _Make_QNAME = new QName("http://services.mobile.de/schema/ad", "make");
    private final static QName _Model_QNAME = new QName("http://services.mobile.de/schema/ad", "model");
    private final static QName _Feature_QNAME = new QName("http://services.mobile.de/schema/ad", "feature");
    private final static QName _DoorCount_QNAME = new QName("http://services.mobile.de/schema/ad", "door-count");
    private final static QName _EmissionClass_QNAME = new QName("http://services.mobile.de/schema/ad", "emission-class");
    private final static QName _EmissionSticker_QNAME = new QName("http://services.mobile.de/schema/ad", "emission-sticker");
    private final static QName _Fuel_QNAME = new QName("http://services.mobile.de/schema/ad", "fuel");
    private final static QName _Gearbox_QNAME = new QName("http://services.mobile.de/schema/ad", "gearbox");
    private final static QName _Climatisation_QNAME = new QName("http://services.mobile.de/schema/ad", "climatisation");
    private final static QName _DrivingMode_QNAME = new QName("http://services.mobile.de/schema/ad", "driving-mode");
    private final static QName _DrivingCab_QNAME = new QName("http://services.mobile.de/schema/ad", "driving-cab");
    private final static QName _Condition_QNAME = new QName("http://services.mobile.de/schema/ad", "condition");
    private final static QName _UsageType_QNAME = new QName("http://services.mobile.de/schema/ad", "usage-type");
    private final static QName _WheelFormula_QNAME = new QName("http://services.mobile.de/schema/ad", "wheel-formula");
    private final static QName _HydraulicInstallation_QNAME = new QName("http://services.mobile.de/schema/ad", "hydraulic-installation");
    private final static QName _Dimension_QNAME = new QName("http://services.mobile.de/schema/ad", "dimension");
    private final static QName _LoadingSpace_QNAME = new QName("http://services.mobile.de/schema/ad", "loading-space");
    private final static QName _InteriorColor_QNAME = new QName("http://services.mobile.de/schema/ad", "interior-color");
    private final static QName _InteriorType_QNAME = new QName("http://services.mobile.de/schema/ad", "interior-type");
    private final static QName _Airbag_QNAME = new QName("http://services.mobile.de/schema/ad", "airbag");
    private final static QName _NumberOfPreviousOwners_QNAME = new QName("http://services.mobile.de/schema/ad", "number-of-previous-owners");
    private final static QName _CountryVersion_QNAME = new QName("http://services.mobile.de/schema/ad", "countryVersion");
    private final static QName _VideoUrl_QNAME = new QName("http://services.mobile.de/schema/ad", "videoUrl");
    private final static QName _ParkingAssistant_QNAME = new QName("http://services.mobile.de/schema/ad", "parking-assistant");
    private final static QName _UsedCarSeal_QNAME = new QName("http://services.mobile.de/schema/ad", "used-car-seal");
    private final static QName _SpeedControl_QNAME = new QName("http://services.mobile.de/schema/ad", "speed-control");
    private final static QName _RadioType_QNAME = new QName("http://services.mobile.de/schema/ad", "radio-type");
    private final static QName _DaytimeRunningLamps_QNAME = new QName("http://services.mobile.de/schema/ad", "daytime-running-lamps");
    private final static QName _SlidingDoorType_QNAME = new QName("http://services.mobile.de/schema/ad", "sliding-door-type");
    private final static QName _HeadlightType_QNAME = new QName("http://services.mobile.de/schema/ad", "headlight-type");
    private final static QName _BendingLightsType_QNAME = new QName("http://services.mobile.de/schema/ad", "bending-lights-type");
    private final static QName _BreakdownService_QNAME = new QName("http://services.mobile.de/schema/ad", "breakdown-service");
    private final static QName _Battery_QNAME = new QName("http://services.mobile.de/schema/ad", "battery");
    private final static QName _TrailerCouplingType_QNAME = new QName("http://services.mobile.de/schema/ad", "trailer-coupling-type");
    private final static QName _Description_QNAME = new QName("http://services.mobile.de/schema/ad", "description");
    private final static QName _EnrichedDescription_QNAME = new QName("http://services.mobile.de/schema/ad", "enrichedDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mobile.services.schema.ad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ad }
     * 
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link CreationDate }
     * 
     */
    public CreationDate createCreationDate() {
        return new CreationDate();
    }

    /**
     * Create an instance of {@link ModificationDate }
     * 
     */
    public ModificationDate createModificationDate() {
        return new ModificationDate();
    }

    /**
     * Create an instance of {@link DetailPage }
     * 
     */
    public DetailPage createDetailPage() {
        return new DetailPage();
    }

    /**
     * Create an instance of {@link SellerInventoryKey }
     * 
     */
    public SellerInventoryKey createSellerInventoryKey() {
        return new SellerInventoryKey();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link ModelDescription }
     * 
     */
    public ModelDescription createModelDescription() {
        return new ModelDescription();
    }

    /**
     * Create an instance of {@link DamageAndUnrepaired }
     * 
     */
    public DamageAndUnrepaired createDamageAndUnrepaired() {
        return new DamageAndUnrepaired();
    }

    /**
     * Create an instance of {@link AccidentDamaged }
     * 
     */
    public AccidentDamaged createAccidentDamaged() {
        return new AccidentDamaged();
    }

    /**
     * Create an instance of {@link Roadworthy }
     * 
     */
    public Roadworthy createRoadworthy() {
        return new Roadworthy();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link Specifics }
     * 
     */
    public Specifics createSpecifics() {
        return new Specifics();
    }

    /**
     * Create an instance of {@link ExteriorColor }
     * 
     */
    public ExteriorColor createExteriorColor() {
        return new ExteriorColor();
    }

    /**
     * Create an instance of {@link Metalic }
     * 
     */
    public Metalic createMetalic() {
        return new Metalic();
    }

    /**
     * Create an instance of {@link ManufacturerColorName }
     * 
     */
    public ManufacturerColorName createManufacturerColorName() {
        return new ManufacturerColorName();
    }

    /**
     * Create an instance of {@link Mileage }
     * 
     */
    public Mileage createMileage() {
        return new Mileage();
    }

    /**
     * Create an instance of {@link ExhaustInspection }
     * 
     */
    public ExhaustInspection createExhaustInspection() {
        return new ExhaustInspection();
    }

    /**
     * Create an instance of {@link GeneralInspection }
     * 
     */
    public GeneralInspection createGeneralInspection() {
        return new GeneralInspection();
    }

    /**
     * Create an instance of {@link FirstRegistration }
     * 
     */
    public FirstRegistration createFirstRegistration() {
        return new FirstRegistration();
    }

    /**
     * Create an instance of {@link EmissionFuelConsumption }
     * 
     */
    public EmissionFuelConsumption createEmissionFuelConsumption() {
        return new EmissionFuelConsumption();
    }

    /**
     * Create an instance of {@link Power }
     * 
     */
    public Power createPower() {
        return new Power();
    }

    /**
     * Create an instance of {@link Kba }
     * 
     */
    public Kba createKba() {
        return new Kba();
    }

    /**
     * Create an instance of {@link SchwackeCode }
     * 
     */
    public SchwackeCode createSchwackeCode() {
        return new SchwackeCode();
    }

    /**
     * Create an instance of {@link LicensedWeight }
     * 
     */
    public LicensedWeight createLicensedWeight() {
        return new LicensedWeight();
    }

    /**
     * Create an instance of {@link Axles }
     * 
     */
    public Axles createAxles() {
        return new Axles();
    }

    /**
     * Create an instance of {@link LoadCapacity }
     * 
     */
    public LoadCapacity createLoadCapacity() {
        return new LoadCapacity();
    }

    /**
     * Create an instance of {@link NumSeats }
     * 
     */
    public NumSeats createNumSeats() {
        return new NumSeats();
    }

    /**
     * Create an instance of {@link OperatingHours }
     * 
     */
    public OperatingHours createOperatingHours() {
        return new OperatingHours();
    }

    /**
     * Create an instance of {@link InstallationHeight }
     * 
     */
    public InstallationHeight createInstallationHeight() {
        return new InstallationHeight();
    }

    /**
     * Create an instance of {@link LiftingCapacity }
     * 
     */
    public LiftingCapacity createLiftingCapacity() {
        return new LiftingCapacity();
    }

    /**
     * Create an instance of {@link LiftingHeight }
     * 
     */
    public LiftingHeight createLiftingHeight() {
        return new LiftingHeight();
    }

    /**
     * Create an instance of {@link ConstructionYear }
     * 
     */
    public ConstructionYear createConstructionYear() {
        return new ConstructionYear();
    }

    /**
     * Create an instance of {@link ConstructionDate }
     * 
     */
    public ConstructionDate createConstructionDate() {
        return new ConstructionDate();
    }

    /**
     * Create an instance of {@link CubicCapacity }
     * 
     */
    public CubicCapacity createCubicCapacity() {
        return new CubicCapacity();
    }

    /**
     * Create an instance of {@link DeliveryDate }
     * 
     */
    public DeliveryDate createDeliveryDate() {
        return new DeliveryDate();
    }

    /**
     * Create an instance of {@link DeliveryPeriod }
     * 
     */
    public DeliveryPeriod createDeliveryPeriod() {
        return new DeliveryPeriod();
    }

    /**
     * Create an instance of {@link NumberOfBunks }
     * 
     */
    public NumberOfBunks createNumberOfBunks() {
        return new NumberOfBunks();
    }

    /**
     * Create an instance of {@link EuropalletStorageSpaces }
     * 
     */
    public EuropalletStorageSpaces createEuropalletStorageSpaces() {
        return new EuropalletStorageSpaces();
    }

    /**
     * Create an instance of {@link DimensionDataType }
     * 
     */
    public DimensionDataType createDimensionDataType() {
        return new DimensionDataType();
    }

    /**
     * Create an instance of {@link ShippingVolume }
     * 
     */
    public ShippingVolume createShippingVolume() {
        return new ShippingVolume();
    }

    /**
     * Create an instance of {@link IdentificationNumber }
     * 
     */
    public IdentificationNumber createIdentificationNumber() {
        return new IdentificationNumber();
    }

    /**
     * Create an instance of {@link ParkingAssistants }
     * 
     */
    public ParkingAssistants createParkingAssistants() {
        return new ParkingAssistants();
    }

    /**
     * Create an instance of {@link Radio }
     * 
     */
    public Radio createRadio() {
        return new Radio();
    }

    /**
     * Create an instance of {@link TrimLine }
     * 
     */
    public TrimLine createTrimLine() {
        return new TrimLine();
    }

    /**
     * Create an instance of {@link ModelRange }
     * 
     */
    public ModelRange createModelRange() {
        return new ModelRange();
    }

    /**
     * Create an instance of {@link FirstModelsProductionDate }
     * 
     */
    public FirstModelsProductionDate createFirstModelsProductionDate() {
        return new FirstModelsProductionDate();
    }

    /**
     * Create an instance of {@link BatteryCapacity }
     * 
     */
    public BatteryCapacity createBatteryCapacity() {
        return new BatteryCapacity();
    }

    /**
     * Create an instance of {@link WltpValues }
     * 
     */
    public WltpValues createWltpValues() {
        return new WltpValues();
    }

    /**
     * Create an instance of {@link Highlights }
     * 
     */
    public Highlights createHighlights() {
        return new Highlights();
    }

    /**
     * Create an instance of {@link Images }
     * 
     */
    public Images createImages() {
        return new Images();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Representation }
     * 
     */
    public Representation createRepresentation() {
        return new Representation();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link DealerPriceAmount }
     * 
     */
    public DealerPriceAmount createDealerPriceAmount() {
        return new DealerPriceAmount();
    }

    /**
     * Create an instance of {@link ConsumerPriceAmount }
     * 
     */
    public ConsumerPriceAmount createConsumerPriceAmount() {
        return new ConsumerPriceAmount();
    }

    /**
     * Create an instance of {@link Net }
     * 
     */
    public Net createNet() {
        return new Net();
    }

    /**
     * Create an instance of {@link Vatable }
     * 
     */
    public Vatable createVatable() {
        return new Vatable();
    }

    /**
     * Create an instance of {@link VatRate }
     * 
     */
    public VatRate createVatRate() {
        return new VatRate();
    }

    /**
     * Create an instance of {@link IncludedDeliveryCosts }
     * 
     */
    public IncludedDeliveryCosts createIncludedDeliveryCosts() {
        return new IncludedDeliveryCosts();
    }

    /**
     * Create an instance of {@link PriceRating }
     * 
     */
    public PriceRating createPriceRating() {
        return new PriceRating();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link LabelRanges }
     * 
     */
    public LabelRanges createLabelRanges() {
        return new LabelRanges();
    }

    /**
     * Create an instance of {@link LabelRange }
     * 
     */
    public LabelRange createLabelRange() {
        return new LabelRange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "class")
    public JAXBElement<ResourceDataType> createClass(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Class_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "category")
    public JAXBElement<ResourceDataType> createCategory(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Category_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "make")
    public JAXBElement<ResourceDataType> createMake(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Make_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "model")
    public JAXBElement<ResourceDataType> createModel(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Model_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "feature")
    public JAXBElement<ResourceDataType> createFeature(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Feature_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "door-count")
    public JAXBElement<ResourceDataType> createDoorCount(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_DoorCount_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "emission-class")
    public JAXBElement<ResourceDataType> createEmissionClass(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_EmissionClass_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "emission-sticker")
    public JAXBElement<ResourceDataType> createEmissionSticker(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_EmissionSticker_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "fuel")
    public JAXBElement<ResourceDataType> createFuel(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Fuel_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "gearbox")
    public JAXBElement<ResourceDataType> createGearbox(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Gearbox_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "climatisation")
    public JAXBElement<ResourceDataType> createClimatisation(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Climatisation_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "driving-mode")
    public JAXBElement<ResourceDataType> createDrivingMode(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_DrivingMode_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "driving-cab")
    public JAXBElement<ResourceDataType> createDrivingCab(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_DrivingCab_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "condition")
    public JAXBElement<ResourceDataType> createCondition(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Condition_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "usage-type")
    public JAXBElement<ResourceDataType> createUsageType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_UsageType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "wheel-formula")
    public JAXBElement<ResourceDataType> createWheelFormula(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_WheelFormula_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "hydraulic-installation")
    public JAXBElement<ResourceDataType> createHydraulicInstallation(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_HydraulicInstallation_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DimensionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "dimension")
    public JAXBElement<DimensionDataType> createDimension(DimensionDataType value) {
        return new JAXBElement<DimensionDataType>(_Dimension_QNAME, DimensionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DimensionDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "loading-space")
    public JAXBElement<DimensionDataType> createLoadingSpace(DimensionDataType value) {
        return new JAXBElement<DimensionDataType>(_LoadingSpace_QNAME, DimensionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "interior-color")
    public JAXBElement<ResourceDataType> createInteriorColor(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_InteriorColor_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "interior-type")
    public JAXBElement<ResourceDataType> createInteriorType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_InteriorType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "airbag")
    public JAXBElement<ResourceDataType> createAirbag(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Airbag_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "number-of-previous-owners")
    public JAXBElement<Long> createNumberOfPreviousOwners(Long value) {
        return new JAXBElement<Long>(_NumberOfPreviousOwners_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "countryVersion")
    public JAXBElement<ResourceDataType> createCountryVersion(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_CountryVersion_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "videoUrl")
    public JAXBElement<ResourceDataType> createVideoUrl(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_VideoUrl_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "parking-assistant")
    public JAXBElement<ResourceDataType> createParkingAssistant(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_ParkingAssistant_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "used-car-seal")
    public JAXBElement<ResourceDataType> createUsedCarSeal(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_UsedCarSeal_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "speed-control")
    public JAXBElement<ResourceDataType> createSpeedControl(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_SpeedControl_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "radio-type")
    public JAXBElement<ResourceDataType> createRadioType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_RadioType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "daytime-running-lamps")
    public JAXBElement<ResourceDataType> createDaytimeRunningLamps(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_DaytimeRunningLamps_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "sliding-door-type")
    public JAXBElement<ResourceDataType> createSlidingDoorType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_SlidingDoorType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "headlight-type")
    public JAXBElement<ResourceDataType> createHeadlightType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_HeadlightType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "bending-lights-type")
    public JAXBElement<ResourceDataType> createBendingLightsType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_BendingLightsType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "breakdown-service")
    public JAXBElement<ResourceDataType> createBreakdownService(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_BreakdownService_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "battery")
    public JAXBElement<ResourceDataType> createBattery(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_Battery_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "trailer-coupling-type")
    public JAXBElement<ResourceDataType> createTrailerCouplingType(ResourceDataType value) {
        return new JAXBElement<ResourceDataType>(_TrailerCouplingType_QNAME, ResourceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.mobile.de/schema/ad", name = "enrichedDescription")
    public JAXBElement<String> createEnrichedDescription(String value) {
        return new JAXBElement<String>(_EnrichedDescription_QNAME, String.class, null, value);
    }

}
