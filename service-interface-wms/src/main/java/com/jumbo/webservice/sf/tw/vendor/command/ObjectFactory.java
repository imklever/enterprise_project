//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 10:45:22 ���� CST 
//


package com.jumbo.webservice.sf.tw.vendor.command;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jumbo.webservice.sf.tw.vendor.command package. 
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

    private final static QName _Result_QNAME = new QName("", "Result");
    private final static QName _Head_QNAME = new QName("", "Head");
    private final static QName _VendorCode_QNAME = new QName("", "VendorCode");
    private final static QName _Note_QNAME = new QName("", "Note");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jumbo.webservice.sf.tw.vendor.command
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespVendors }
     * 
     */
    public RespVendors createVendors() {
        return new RespVendors();
    }

    /**
     * Create an instance of {@link VendorsRespBody }
     * 
     */
    public VendorsRespBody createBody() {
        return new VendorsRespBody();
    }

    /**
     * Create an instance of {@link VendorResponse }
     * 
     */
    public VendorResponse createVendorResponse() {
        return new VendorResponse();
    }

    /**
     * Create an instance of {@link RespVendor }
     * 
     */
    public RespVendor createVendor() {
        return new RespVendor();
    }

    /**
     * Create an instance of {@link VendorsResponse }
     * 
     */
    public VendorsResponse createResponse() {
        return new VendorsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result")
    public JAXBElement<String> createResult(String value) {
        return new JAXBElement<String>(_Result_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Head")
    public JAXBElement<String> createHead(String value) {
        return new JAXBElement<String>(_Head_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VendorCode")
    public JAXBElement<String> createVendorCode(String value) {
        return new JAXBElement<String>(_VendorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Note")
    public JAXBElement<String> createNote(String value) {
        return new JAXBElement<String>(_Note_QNAME, String.class, null, value);
    }

}
