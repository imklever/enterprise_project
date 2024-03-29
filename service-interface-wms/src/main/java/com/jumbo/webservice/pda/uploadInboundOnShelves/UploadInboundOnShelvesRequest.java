package com.jumbo.webservice.pda.uploadInboundOnShelves;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.jumbo.webservice.base.AuthRequest;
import com.jumbo.webservice.base.AuthRequestHeader;


/**
 * <p>
 * uploadInboundOnShelvesRequest complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="uploadInboundOnShelvesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequestHeader" type="{http://webservice.jumbo.com/pda/}authRequestHeader"/>
 *         &lt;element name="uploadInboundOnShelvesRequestBody" type="{http://webservice.jumbo.com/pda/}uploadInboundOnShelvesRequestBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadInboundOnShelvesRequest", propOrder = {"authRequestHeader", "uploadInboundOnShelvesRequestBody"})
public class UploadInboundOnShelvesRequest implements AuthRequest, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -326827484248550864L;
    @XmlElement(required = true)
    protected AuthRequestHeader authRequestHeader;
    @XmlElement(required = true)
    protected UploadInboundOnShelvesRequestBody uploadInboundOnShelvesRequestBody;

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
     * 获取uploadInboundOnShelvesRequestBody属性的值。
     * 
     * @return possible object is {@link UploadInboundOnShelvesRequestBody }
     * 
     */
    public UploadInboundOnShelvesRequestBody getUploadInboundOnShelvesRequestBody() {
        return uploadInboundOnShelvesRequestBody;
    }

    /**
     * 设置uploadInboundOnShelvesRequestBody属性的值。
     * 
     * @param value allowed object is {@link UploadInboundOnShelvesRequestBody }
     * 
     */
    public void setUploadInboundOnShelvesRequestBody(UploadInboundOnShelvesRequestBody value) {
        this.uploadInboundOnShelvesRequestBody = value;
    }

}
