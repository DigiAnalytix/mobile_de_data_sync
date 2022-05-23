
package com.digianalytix.mobile_de.xml.seller;

import com.digianalytix.mobile_de.xml.resource.ResourceDataType;

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
 *     &lt;extension base="{http://services.mobile.de/schema/resource}resourceDataType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}last-name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}first-name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}company-name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}address"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}email" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}homepage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}mobile-seller-since" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}coordinates" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}logo-image" minOccurs="0"/&gt;
 *         &lt;element ref="{http://services.mobile.de/schema/seller}contact-languages" minOccurs="0"/&gt;
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
    "type",
    "lastName",
    "firstName",
    "companyName",
    "address",
    "phone",
    "email",
    "homepage",
    "mobileSellerSince",
    "coordinates",
    "logoImage",
    "contactLanguages"
})
@XmlRootElement(name = "seller")
public class Seller
    extends ResourceDataType
{

    protected Type type;
    @XmlElement(name = "last-name")
    protected LastName lastName;
    @XmlElement(name = "first-name")
    protected FirstName firstName;
    @XmlElement(name = "company-name")
    protected CompanyName companyName;
    protected Address address;
    protected List<Phone> phone;
    protected Email email;
    protected Homepage homepage;
    @XmlElement(name = "mobile-seller-since")
    protected MobileSellerSince mobileSellerSince;
    protected Coordinates coordinates;
    @XmlElement(name = "logo-image")
    protected LogoImage logoImage;
    @XmlElement(name = "contact-languages")
    protected ContactLanguages contactLanguages;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastName }
     *     
     */
    public LastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastName }
     *     
     */
    public void setLastName(LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstName }
     *     
     */
    public FirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstName }
     *     
     */
    public void setFirstName(FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyName }
     *     
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyName }
     *     
     */
    public void setCompanyName(CompanyName value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Phone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the homepage property.
     * 
     * @return
     *     possible object is
     *     {@link Homepage }
     *     
     */
    public Homepage getHomepage() {
        return homepage;
    }

    /**
     * Sets the value of the homepage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Homepage }
     *     
     */
    public void setHomepage(Homepage value) {
        this.homepage = value;
    }

    /**
     * Gets the value of the mobileSellerSince property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSellerSince }
     *     
     */
    public MobileSellerSince getMobileSellerSince() {
        return mobileSellerSince;
    }

    /**
     * Sets the value of the mobileSellerSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSellerSince }
     *     
     */
    public void setMobileSellerSince(MobileSellerSince value) {
        this.mobileSellerSince = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinates }
     *     
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinates }
     *     
     */
    public void setCoordinates(Coordinates value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the logoImage property.
     * 
     * @return
     *     possible object is
     *     {@link LogoImage }
     *     
     */
    public LogoImage getLogoImage() {
        return logoImage;
    }

    /**
     * Sets the value of the logoImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoImage }
     *     
     */
    public void setLogoImage(LogoImage value) {
        this.logoImage = value;
    }

    /**
     * Gets the value of the contactLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ContactLanguages }
     *     
     */
    public ContactLanguages getContactLanguages() {
        return contactLanguages;
    }

    /**
     * Sets the value of the contactLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactLanguages }
     *     
     */
    public void setContactLanguages(ContactLanguages value) {
        this.contactLanguages = value;
    }

}
