package com.jumbo.webservice.pda.executeOrder;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.jumbo.webservice.base.AuthRequest;
import com.jumbo.webservice.base.AuthRequestHeader;


/**
 * <p>
 * executeOrderRequest complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="executeOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequestHeader" type="{http://webservice.jumbo.com/pda/}authRequestHeader"/>
 *         &lt;element name="executeOrderRequestBody" type="{http://webservice.jumbo.com/pda/}executeOrderRequestBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeOrderRequest", propOrder = {"authRequestHeader", "executeOrderRequestBody"})
public class ExecuteOrderRequest implements AuthRequest, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1895484009416863499L;
    @XmlElement(required = true)
    protected AuthRequestHeader authRequestHeader;
    @XmlElement(required = true)
    protected ExecuteOrderRequestBody executeOrderRequestBody;

    /**
     * 获取authRequestHeader属性的值。
     * 
     * @return possible object is {@link AuthRequestHeader }
     * 
     */
    @Override
    public AuthRequestHeader getAuthRequestHeader() {
        return authRequestHeader;
    }

    /**
     * 设置authRequestHeader属性的值。
     * 
     * @param value allowed object is {@link AuthRequestHeader }
     * 
     */
    public void setAuthRequestHeader(AuthRequestHeader value) {
        this.authRequestHeader = value;
    }

    /**
     * 获取executeOrderRequestBody属性的值。
     * 
     * @return possible object is {@link ExecuteOrderRequestBody }
     * 
     */
    public ExecuteOrderRequestBody getExecuteOrderRequestBody() {
        return executeOrderRequestBody;
    }

    /**
     * 设置executeOrderRequestBody属性的值。
     * 
     * @param value allowed object is {@link ExecuteOrderRequestBody }
     * 
     */
    public void setExecuteOrderRequestBody(ExecuteOrderRequestBody value) {
        this.executeOrderRequestBody = value;
    }

}
