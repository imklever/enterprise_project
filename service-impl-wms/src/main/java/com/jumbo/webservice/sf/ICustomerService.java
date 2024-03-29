package com.jumbo.webservice.sf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9 Fri Dec 21 10:50:40 CST 2012 Generated source
 * version: 2.2.9
 * 
 */

@WebService(targetNamespace = "http://service.serviceprovide.module.sf.com/", name = "ICustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface ICustomerService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "routeTrackingService", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.RouteTrackingService")
    @WebMethod
    @ResponseWrapper(localName = "routeTrackingServiceResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.RouteTrackingServiceResponse")
    public java.lang.String routeTrackingService(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "queryMailnoDetailService", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.QueryMailnoDetailService")
    @WebMethod
    @ResponseWrapper(localName = "queryMailnoDetailServiceResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.QueryMailnoDetailServiceResponse")
    public java.lang.String queryMailnoDetailService(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "logisticQueryStandard", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.LogisticQueryStandard")
    @WebMethod
    @ResponseWrapper(localName = "logisticQueryStandardResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.LogisticQueryStandardResponse")
    public java.lang.String logisticQueryStandard(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "orderService", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.OrderService")
    @WebMethod
    @ResponseWrapper(localName = "orderServiceResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.OrderServiceResponse")
    public java.lang.String orderService(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "orderMailBindingService", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.OrderMailBindingService")
    @WebMethod
    @ResponseWrapper(localName = "orderMailBindingServiceResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.OrderMailBindingServiceResponse")
    public java.lang.String orderMailBindingService(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "cancelOrderService", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.CancelOrderService")
    @WebMethod
    @ResponseWrapper(localName = "cancelOrderServiceResponse", targetNamespace = "http://service.serviceprovide.module.sf.com/", className = "com.jumbo.webservice.sf.CancelOrderServiceResponse")
    public java.lang.String cancelOrderService(@WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0);
}
