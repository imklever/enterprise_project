/*
 * 
 */

package com.jumbo.webservice.oms.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jumbo.webservice.biaogan.client.base.PushExpressInfo;


/**
 * This class was generated by Apache CXF 2.2.9 Fri Apr 20 15:02:47 CST 2012 Generated source
 * version: 2.2.9
 * 
 */


@WebServiceClient(name = "ScmWebService", wsdlLocation = "http://www.jumbomart.cn:8080/jumbomart/services/ScmWebService?wsdl", targetNamespace = "http://scm.webservice.service.erry.com")
public class ScmWebService extends Service {
    protected static final Logger log = LoggerFactory.getLogger(ScmWebService.class);
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://scm.webservice.service.erry.com", "ScmWebService");
    public final static QName ScmWebServiceHttpEndpoint = new QName("http://scm.webservice.service.erry.com", "ScmWebServiceHttpEndpoint");
    public final static QName ScmWebServiceHttpSoap11Endpoint = new QName("http://scm.webservice.service.erry.com", "ScmWebServiceHttpSoap11Endpoint");
    public final static QName ScmWebServiceHttpSoap12Endpoint = new QName("http://scm.webservice.service.erry.com", "ScmWebServiceHttpSoap12Endpoint");

	static {
		URL url = PushExpressInfo.class.getResource("/wsdl/oms.wsdl");
		WSDL_LOCATION = url;
	}
    
    public ScmWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScmWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScmWebService() {
        super(WSDL_LOCATION, SERVICE);
    }


    /**
     * 
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpEndpoint")
    public ScmWebServicePortType getScmWebServiceHttpEndpoint() {
        return super.getPort(ScmWebServiceHttpEndpoint, ScmWebServicePortType.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *        Supported features not in the <code>features</code> parameter will have their default
     *        values.
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpEndpoint")
    public ScmWebServicePortType getScmWebServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(ScmWebServiceHttpEndpoint, ScmWebServicePortType.class, features);
    }

    /**
     * 
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpSoap11Endpoint")
    public ScmWebServicePortType getScmWebServiceHttpSoap11Endpoint() {
        return super.getPort(ScmWebServiceHttpSoap11Endpoint, ScmWebServicePortType.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *        Supported features not in the <code>features</code> parameter will have their default
     *        values.
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpSoap11Endpoint")
    public ScmWebServicePortType getScmWebServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(ScmWebServiceHttpSoap11Endpoint, ScmWebServicePortType.class, features);
    }

    /**
     * 
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpSoap12Endpoint")
    public ScmWebServicePortType getScmWebServiceHttpSoap12Endpoint() {
        return super.getPort(ScmWebServiceHttpSoap12Endpoint, ScmWebServicePortType.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *        Supported features not in the <code>features</code> parameter will have their default
     *        values.
     * @return returns ScmWebServicePortType
     */
    @WebEndpoint(name = "ScmWebServiceHttpSoap12Endpoint")
    public ScmWebServicePortType getScmWebServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(ScmWebServiceHttpSoap12Endpoint, ScmWebServicePortType.class, features);
    }

}
