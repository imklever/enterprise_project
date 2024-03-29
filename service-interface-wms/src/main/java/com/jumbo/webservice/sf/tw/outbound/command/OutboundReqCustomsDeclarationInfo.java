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
 *         &lt;element ref="{}CustomsType"/>
 *         &lt;element ref="{}CustomsBatch"/>
 *         &lt;element ref="{}CustomsNo"/>
 *         &lt;element ref="{}TaxPaymentOfCharge"/>
 *         &lt;element ref="{}TaxAccount"/>
 *         &lt;element ref="{}UserDef1"/>
 *         &lt;element ref="{}UserDef2"/>
 *         &lt;element ref="{}UserDef3"/>
 *         &lt;element ref="{}UserDef4"/>
 *         &lt;element ref="{}UserDef5"/>
 *         &lt;element ref="{}UserDef6"/>
 *         &lt;element ref="{}UserDef7"/>
 *         &lt;element ref="{}UserDef8"/>
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
    "customsType",
    "customsBatch",
    "customsNo",
    "taxPaymentOfCharge",
    "taxAccount",
    "userDef1",
    "userDef2",
    "userDef3",
    "userDef4",
    "userDef5",
    "userDef6",
    "userDef7",
    "userDef8"
})
@XmlRootElement(name = "CustomsDeclarationInfo")
public class OutboundReqCustomsDeclarationInfo {

    @XmlElement(name = "CustomsType", required = true)
    protected String customsType;
    @XmlElement(name = "CustomsBatch", required = true)
    protected String customsBatch;
    @XmlElement(name = "CustomsNo", required = true)
    protected String customsNo;
    @XmlElement(name = "TaxPaymentOfCharge", required = true)
    protected String taxPaymentOfCharge;
    @XmlElement(name = "TaxAccount", required = true)
    protected String taxAccount;
    @XmlElement(name = "UserDef1", required = true)
    protected String userDef1;
    @XmlElement(name = "UserDef2", required = true)
    protected String userDef2;
    @XmlElement(name = "UserDef3", required = true)
    protected String userDef3;
    @XmlElement(name = "UserDef4", required = true)
    protected String userDef4;
    @XmlElement(name = "UserDef5", required = true)
    protected String userDef5;
    @XmlElement(name = "UserDef6", required = true)
    protected String userDef6;
    @XmlElement(name = "UserDef7", required = true)
    protected String userDef7;
    @XmlElement(name = "UserDef8", required = true)
    protected String userDef8;

    /**
     * Gets the value of the customsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsType() {
        return customsType;
    }

    /**
     * Sets the value of the customsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsType(String value) {
        this.customsType = value;
    }

    /**
     * Gets the value of the customsBatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsBatch() {
        return customsBatch;
    }

    /**
     * Sets the value of the customsBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsBatch(String value) {
        this.customsBatch = value;
    }

    /**
     * Gets the value of the customsNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsNo() {
        return customsNo;
    }

    /**
     * Sets the value of the customsNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsNo(String value) {
        this.customsNo = value;
    }

    /**
     * Gets the value of the taxPaymentOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPaymentOfCharge() {
        return taxPaymentOfCharge;
    }

    /**
     * Sets the value of the taxPaymentOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPaymentOfCharge(String value) {
        this.taxPaymentOfCharge = value;
    }

    /**
     * Gets the value of the taxAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAccount() {
        return taxAccount;
    }

    /**
     * Sets the value of the taxAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAccount(String value) {
        this.taxAccount = value;
    }

    /**
     * Gets the value of the userDef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef1() {
        return userDef1;
    }

    /**
     * Sets the value of the userDef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef1(String value) {
        this.userDef1 = value;
    }

    /**
     * Gets the value of the userDef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef2() {
        return userDef2;
    }

    /**
     * Sets the value of the userDef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef2(String value) {
        this.userDef2 = value;
    }

    /**
     * Gets the value of the userDef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef3() {
        return userDef3;
    }

    /**
     * Sets the value of the userDef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef3(String value) {
        this.userDef3 = value;
    }

    /**
     * Gets the value of the userDef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef4() {
        return userDef4;
    }

    /**
     * Sets the value of the userDef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef4(String value) {
        this.userDef4 = value;
    }

    /**
     * Gets the value of the userDef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef5() {
        return userDef5;
    }

    /**
     * Sets the value of the userDef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef5(String value) {
        this.userDef5 = value;
    }

    /**
     * Gets the value of the userDef6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef6() {
        return userDef6;
    }

    /**
     * Sets the value of the userDef6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef6(String value) {
        this.userDef6 = value;
    }

    /**
     * Gets the value of the userDef7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef7() {
        return userDef7;
    }

    /**
     * Sets the value of the userDef7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef7(String value) {
        this.userDef7 = value;
    }

    /**
     * Gets the value of the userDef8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef8() {
        return userDef8;
    }

    /**
     * Sets the value of the userDef8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef8(String value) {
        this.userDef8 = value;
    }

}
