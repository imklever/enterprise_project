//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.02.07 at 01:15:50 ���� CST
//


package com.jumbo.wms.model.command.vmi.esprit.xml.receiving;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}receivingNo"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}goodsReceivedDate"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}orderNumber"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}invoice"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}buyerGLN"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}deliveryPartyGLN"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}warehouse"/>
 *         &lt;element ref="{http://www.esprit.com.cn/XMLSchema/eShopInterface/espRecv.xsd}items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"receivingNo", "goodsReceivedDate", "orderNumber", "poReference", "dutyPercentage", "miscFeePercentage","commissionPercentage", "invoice", "buyerGLN", "deliveryPartyGLN", "warehouse", "warehouseReference", "items"})
@XmlRootElement(name = "receiving")
public class Receiving implements Serializable {


    private static final long serialVersionUID = -312770570169929706L;
    @XmlElement(required = true)
    public String receivingNo;
    @XmlElement(required = true)
    public String goodsReceivedDate;
    @XmlElement(required = true)
    public String orderNumber;
    @XmlElement(required = true)
    public Invoice invoice;
    @XmlElement(required = true)
    public String buyerGLN;
    @XmlElement(required = true)
    public String deliveryPartyGLN;
    @XmlElement(required = true)
    public String warehouse;
    @XmlElement(required = true)
    public Items items;
    @XmlElement(required = true, defaultValue = "")
    public String poReference;
    @XmlElement(required = true, defaultValue = "0.0")
    public String dutyPercentage;
    @XmlElement(required = true, defaultValue = "")
    public String miscFeePercentage;
    @XmlElement(required = true, defaultValue = "")
    public String commissionPercentage;
    @XmlElement(required = true, defaultValue = "")
    public String warehouseReference;


    /**
     * Gets the value of the receivingNo property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReceivingNo() {
        return receivingNo;
    }

    /**
     * Sets the value of the receivingNo property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setReceivingNo(String value) {
        this.receivingNo = value;
    }

    /**
     * Gets the value of the goodsReceivedDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGoodsReceivedDate() {
        return goodsReceivedDate;
    }

    /**
     * Sets the value of the goodsReceivedDate property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setGoodsReceivedDate(String value) {
        this.goodsReceivedDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }


    public String getPoReference() {
        return poReference;
    }

    public void setPoReference(String poReference) {
        this.poReference = poReference;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return possible object is {@link Invoice }
     * 
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value allowed object is {@link Invoice }
     * 
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the buyerGLN property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBuyerGLN() {
        return buyerGLN;
    }

    /**
     * Sets the value of the buyerGLN property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBuyerGLN(String value) {
        this.buyerGLN = value;
    }

    /**
     * Gets the value of the deliveryPartyGLN property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeliveryPartyGLN() {
        return deliveryPartyGLN;
    }

    /**
     * Sets the value of the deliveryPartyGLN property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDeliveryPartyGLN(String value) {
        this.deliveryPartyGLN = value;
    }

    /**
     * Gets the value of the warehouse property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setWarehouse(String value) {
        this.warehouse = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return possible object is {@link Items }
     * 
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value allowed object is {@link Items }
     * 
     */
    public void setItems(Items value) {
        this.items = value;
    }

    public String getDutyPercentage() {
        return dutyPercentage;
    }

    public void setDutyPercentage(String dutyPercentage) {
        this.dutyPercentage = dutyPercentage;
    }

    public String getMiscFeePercentage() {
        return miscFeePercentage;
    }

    public void setMiscFeePercentage(String miscFeePercentage) {
        this.miscFeePercentage = miscFeePercentage;
    }
    
    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getWarehouseReference() {
        return warehouseReference;
    }

    public void setWarehouseReference(String warehouseReference) {
        this.warehouseReference = warehouseReference;
    }


}