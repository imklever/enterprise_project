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
 *         &lt;element ref="{}CompanyCode"/>
 *         &lt;element ref="{}SaleOrders"/>
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
    "companyCode",
    "saleOrders"
})
@XmlRootElement(name = "SaleOrderRequest")
public class OutboundSaleOrderRequest {

    @XmlElement(name = "CompanyCode", required = true)
    protected String companyCode;
    @XmlElement(name = "SaleOrders", required = true)
    protected OutboundReqSaleOrders saleOrders;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the saleOrders property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundReqSaleOrders }
     *     
     */
    public OutboundReqSaleOrders getSaleOrders() {
        return saleOrders;
    }

    /**
     * Sets the value of the saleOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundReqSaleOrders }
     *     
     */
    public void setSaleOrders(OutboundReqSaleOrders value) {
        this.saleOrders = value;
    }

}
