//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.18 at 10:13:38 ���� CST 
//


package com.jumbo.webservice.sf.tw.inventory.command;

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
 *         &lt;element ref="{}InventoryChangeRequest"/>
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
    "inventoryChangeRequest"
})
@XmlRootElement(name = "Body")
public class InventoryReqBody {

    @XmlElement(name = "InventoryChangeRequest", required = true)
    protected InventoryChangeRequest inventoryChangeRequest;

    /**
     * Gets the value of the inventoryChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryChangeRequest }
     *     
     */
    public InventoryChangeRequest getInventoryChangeRequest() {
        return inventoryChangeRequest;
    }

    /**
     * Sets the value of the inventoryChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryChangeRequest }
     *     
     */
    public void setInventoryChangeRequest(InventoryChangeRequest value) {
        this.inventoryChangeRequest = value;
    }

}
