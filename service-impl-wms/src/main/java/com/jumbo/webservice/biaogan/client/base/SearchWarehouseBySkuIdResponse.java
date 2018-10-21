package com.jumbo.webservice.biaogan.client.base;

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
 *         &lt;element name="out" type="{http://orderstatusclient.warehouse.webservices.chamayi.chamago.com}ArrayOfWmsSPRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"out"})
@XmlRootElement(name = "searchWarehouseBySkuIdResponse")
public class SearchWarehouseBySkuIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWmsSPRecord out;

    /**
     * Gets the value of the out property.
     * 
     * @return possible object is {@link ArrayOfWmsSPRecord }
     * 
     */
    public ArrayOfWmsSPRecord getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value allowed object is {@link ArrayOfWmsSPRecord }
     * 
     */
    public void setOut(ArrayOfWmsSPRecord value) {
        this.out = value;
    }

}