
package com.digianalytix.mobile_de.xml.common.leasing_1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mobile.services.schema.common.leasing_1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mobile.services.schema.common.leasing_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Leasing }
     * 
     */
    public Leasing createLeasing() {
        return new Leasing();
    }

    /**
     * Create an instance of {@link Leasing.Rates }
     * 
     */
    public Leasing.Rates createLeasingRates() {
        return new Leasing.Rates();
    }

    /**
     * Create an instance of {@link LeasingRate }
     * 
     */
    public LeasingRate createLeasingRate() {
        return new LeasingRate();
    }

}
