//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 04:21:57 ���� CST 
//


package com.jumbo.webservice.sf.tw.outbound.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ServiceCode"/>
 *         &lt;element ref="{}Attr01"/>
 *         &lt;element ref="{}Attr02"/>
 *         &lt;element ref="{}Attr03"/>
 *         &lt;element ref="{}Attr04"/>
 *         &lt;element ref="{}Attr05"/>
 *         &lt;element ref="{}Attr06"/>
 *         &lt;element ref="{}Attr07"/>
 *         &lt;element ref="{}Attr08"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceCode",
    "attr01",
    "attr02",
    "attr03",
    "attr04",
    "attr05",
    "attr06",
    "attr07",
    "attr08"
})
@XmlRootElement(name = "OrderAddedService")
public class OutboundReqOrderAddedService {

    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "Attr01", required = true)
    protected String attr01;
    @XmlElement(name = "Attr02", required = true)
    protected String attr02;
    @XmlElement(name = "Attr03", required = true)
    protected String attr03;
    @XmlElement(name = "Attr04", required = true)
    protected String attr04;
    @XmlElement(name = "Attr05", required = true)
    protected String attr05;
    @XmlElement(name = "Attr06", required = true)
    protected String attr06;
    @XmlElement(name = "Attr07", required = true)
    protected String attr07;
    @XmlElement(name = "Attr08", required = true)
    protected String attr08;

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the attr01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr01() {
        return attr01;
    }

    /**
     * Sets the value of the attr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr01(String value) {
        this.attr01 = value;
    }

    /**
     * Gets the value of the attr02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr02() {
        return attr02;
    }

    /**
     * Sets the value of the attr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr02(String value) {
        this.attr02 = value;
    }

    /**
     * Gets the value of the attr03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr03() {
        return attr03;
    }

    /**
     * Sets the value of the attr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr03(String value) {
        this.attr03 = value;
    }

    /**
     * Gets the value of the attr04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr04() {
        return attr04;
    }

    /**
     * Sets the value of the attr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr04(String value) {
        this.attr04 = value;
    }

    /**
     * Gets the value of the attr05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr05() {
        return attr05;
    }

    /**
     * Sets the value of the attr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr05(String value) {
        this.attr05 = value;
    }

    /**
     * Gets the value of the attr06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr06() {
        return attr06;
    }

    /**
     * Sets the value of the attr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr06(String value) {
        this.attr06 = value;
    }

    /**
     * Gets the value of the attr07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr07() {
        return attr07;
    }

    /**
     * Sets the value of the attr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr07(String value) {
        this.attr07 = value;
    }

    /**
     * Gets the value of the attr08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttr08() {
        return attr08;
    }

    /**
     * Sets the value of the attr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttr08(String value) {
        this.attr08 = value;
    }

}