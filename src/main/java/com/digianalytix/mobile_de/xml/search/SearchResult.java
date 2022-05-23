
package com.digianalytix.mobile_de.xml.search;

import com.digianalytix.mobile_de.xml.ad.Ad;
import com.digianalytix.mobile_de.xml.common.error_1.Errors;

import javax.xml.bind.annotation.*;
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
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="page-size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="current-page" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="max-pages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/common/error-1.0}errors" minOccurs="0"/&gt;
 *         &lt;element name="ads"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://services.mobile.de/schema/ad}ad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "total",
    "pageSize",
    "currentPage",
    "maxPages",
    "errors",
    "ads"
})
@XmlRootElement(name = "search-result")
public class SearchResult {

    protected int total;
    @XmlElement(name = "page-size")
    protected int pageSize;
    @XmlElement(name = "current-page")
    protected int currentPage;
    @XmlElement(name = "max-pages")
    protected int maxPages;
    @XmlElement(namespace = "http://services.mobile.de/schema/common/error-1.0")
    protected Errors errors;
    @XmlElement(required = true)
    protected Ads ads;

    /**
     * Gets the value of the total property.
     *
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the pageSize property.
     *
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     *
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the currentPage property.
     *
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     *
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the maxPages property.
     *
     */
    public int getMaxPages() {
        return maxPages;
    }

    /**
     * Sets the value of the maxPages property.
     *
     */
    public void setMaxPages(int value) {
        this.maxPages = value;
    }

    /**
     * A list of non fatal errors related to this search request e.g. invalid or
     *                             deprecated search parameters. If this list is present then the search result might not be as
     *                             intended by the client, so always check that this not present.
     *
     *
     * @return
     *     possible object is
     *     {@link Errors }
     *
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     *
     * @param value
     *     allowed object is
     *     {@link Errors }
     *
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the ads property.
     *
     * @return
     *     possible object is
     *     {@link Ads }
     *
     */
    public Ads getAds() {
        return ads;
    }

    /**
     * Sets the value of the ads property.
     *
     * @param value
     *     allowed object is
     *     {@link Ads }
     *
     */
    public void setAds(Ads value) {
        this.ads = value;
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
     *         &lt;element ref="{http://services.mobile.de/schema/ad}ad" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ad"
    })
    public static class Ads {

        @XmlElement(namespace = "http://services.mobile.de/schema/ad")
        protected List<Ad> ad;

        /**
         * Gets the value of the ad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ad }
         * 
         * 
         */
        public List<Ad> getAd() {
            if (ad == null) {
                ad = new ArrayList<Ad>();
            }
            return this.ad;
        }

    }

}
