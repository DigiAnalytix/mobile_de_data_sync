
package com.digianalytix.mobile_de.xml.ad;

import com.digianalytix.mobile_de.xml.common.financing_1.Financing;
import com.digianalytix.mobile_de.xml.common.leasing_1.Leasing;
import com.digianalytix.mobile_de.xml.resource.ResourceDataType;
import com.digianalytix.mobile_de.xml.seller.Seller;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://services.mobile.de/schema/ad}creation-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}modification-date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}detail-page" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}seller-inventory-key" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}vehicle"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}highlights" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}enrichedDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}images" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}price"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/ad}price-rating" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/common/financing-1.0}financing" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/common/leasing-1.0}leasing" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}seller"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creationDate",
    "modificationDate",
    "detailPage",
    "sellerInventoryKey",
    "vehicle",
    "highlights",
    "description",
    "enrichedDescription",
    "images",
    "price",
    "priceRating",
    "financing",
    "leasing",
    "seller"
})
@XmlRootElement(name = "ad")
public class Ad
    extends ResourceDataType
{

    @XmlElement(name = "creation-date")
    protected CreationDate creationDate;
    @XmlElement(name = "modification-date")
    protected ModificationDate modificationDate;
    @XmlElement(name = "detail-page")
    protected DetailPage detailPage;
    @XmlElement(name = "seller-inventory-key")
    protected SellerInventoryKey sellerInventoryKey;
    @XmlElement(required = true)
    protected Vehicle vehicle;
    protected Highlights highlights;
    protected String description;
    protected String enrichedDescription;
    protected Images images;
    @XmlElement(required = true)
    protected Price price;
    @XmlElement(name = "price-rating")
    protected PriceRating priceRating;
    @XmlElement(namespace = "http://services.mobile.de/schema/common/financing-1.0")
    protected Financing financing;
    @XmlElement(namespace = "http://services.mobile.de/schema/common/leasing-1.0")
    protected Leasing leasing;
    @XmlElement(namespace = "http://services.mobile.de/schema/seller", required = true)
    protected Seller seller;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CreationDate }
     *     
     */
    public CreationDate getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationDate }
     *     
     */
    public void setCreationDate(CreationDate value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationDate }
     *     
     */
    public ModificationDate getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationDate }
     *     
     */
    public void setModificationDate(ModificationDate value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the detailPage property.
     * 
     * @return
     *     possible object is
     *     {@link DetailPage }
     *     
     */
    public DetailPage getDetailPage() {
        return detailPage;
    }

    /**
     * Sets the value of the detailPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailPage }
     *     
     */
    public void setDetailPage(DetailPage value) {
        this.detailPage = value;
    }

    /**
     * Gets the value of the sellerInventoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link SellerInventoryKey }
     *     
     */
    public SellerInventoryKey getSellerInventoryKey() {
        return sellerInventoryKey;
    }

    /**
     * Sets the value of the sellerInventoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerInventoryKey }
     *     
     */
    public void setSellerInventoryKey(SellerInventoryKey value) {
        this.sellerInventoryKey = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the highlights property.
     * 
     * @return
     *     possible object is
     *     {@link Highlights }
     *     
     */
    public Highlights getHighlights() {
        return highlights;
    }

    /**
     * Sets the value of the highlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Highlights }
     *     
     */
    public void setHighlights(Highlights value) {
        this.highlights = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enrichedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrichedDescription() {
        return enrichedDescription;
    }

    /**
     * Sets the value of the enrichedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrichedDescription(String value) {
        this.enrichedDescription = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    public Images getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    public void setImages(Images value) {
        this.images = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceRating property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRating }
     *     
     */
    public PriceRating getPriceRating() {
        return priceRating;
    }

    /**
     * Sets the value of the priceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRating }
     *     
     */
    public void setPriceRating(PriceRating value) {
        this.priceRating = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link Financing }
     *     
     */
    public Financing getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financing }
     *     
     */
    public void setFinancing(Financing value) {
        this.financing = value;
    }

    /**
     * Gets the value of the leasing property.
     * 
     * @return
     *     possible object is
     *     {@link Leasing }
     *     
     */
    public Leasing getLeasing() {
        return leasing;
    }

    /**
     * Sets the value of the leasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Leasing }
     *     
     */
    public void setLeasing(Leasing value) {
        this.leasing = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link Seller }
     *     
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seller }
     *     
     */
    public void setSeller(Seller value) {
        this.seller = value;
    }

}
