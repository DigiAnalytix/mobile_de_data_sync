
package com.digianalytix.mobile_de.xml.search;

import com.digianalytix.mobile_de.xml.ad.Ad;

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
 *         &lt;element ref="{http://services.mobile.de/schema/ad}ad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="page-size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="current-page" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="max-pages" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
@XmlRootElement(name = "result")
public class Result {

    @XmlElement(namespace = "http://services.mobile.de/schema/ad")
    protected List<Ad> ad;
    @XmlAttribute(name = "total", required = true)
    protected int total;
    @XmlAttribute(name = "page-size", required = true)
    protected int pageSize;
    @XmlAttribute(name = "current-page", required = true)
    protected int currentPage;
    @XmlAttribute(name = "max-pages", required = true)
    protected int maxPages;

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

}
