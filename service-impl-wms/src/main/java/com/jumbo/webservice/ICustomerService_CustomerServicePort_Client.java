//package com.jumbo.webservice;
//
///**
// * Please modify this class to meet your needs This class is not complete
// */
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import javax.xml.namespace.QName;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.jumbo.webservice.sf.CustomerServiceService;
//import com.jumbo.webservice.sf.ICustomerService;
//
///**
// * This class was generated by Apache CXF 2.2.9 Fri Nov 30 11:31:16 CST 2012 Generated source
// * version: 2.2.9
// * 
// */
//
//public final class ICustomerService_CustomerServicePort_Client {
//    protected static final Logger log = LoggerFactory.getLogger(ICustomerService_CustomerServicePort_Client.class);
//    private static final QName SERVICE_NAME = new QName("http://service.serviceprovide.module.sf.com/", "CustomerServiceService");
//
//    private ICustomerService_CustomerServicePort_Client() {}
//
//    public static void main(String args[]) throws Exception {
//        URL wsdlURL = CustomerServiceService.WSDL_LOCATION;
//        if (args.length > 0) {
//            File wsdlFile = new File(args[0]);
//            try {
//                if (wsdlFile.exists()) {
//                    wsdlURL = wsdlFile.toURI().toURL();
//                } else {
//                    wsdlURL = new URL(args[0]);
//                }
//            } catch (MalformedURLException e) {
//                log.error("",e);
//            }
//        }
//
//        CustomerServiceService ss = new CustomerServiceService(wsdlURL, SERVICE_NAME);
//        ICustomerService port = ss.getCustomerServicePort();
//
//        System.out.println("Invoking orderService...");
//        StringBuffer b = new StringBuffer();
//        File f = new File("D:\\cancelOrder.xml");
//        FileReader r = new FileReader(f);
//        BufferedReader rd = new BufferedReader(r);
//        while (true) {
//            String tmp = rd.readLine();
//            if (tmp != null) {
//                b.append(tmp);
//            } else {
//                break;
//            }
//        }
//        System.out.println(b.toString());
//        System.out.println("===============");
//        // java.lang.String _orderService__return = port.orderService(b.toString());
//        // System.out.println("orderService.result=" + _orderService__return);
//        //
//        // SfOrderResponse rs = (SfOrderResponse) MarshallerUtil.buildJaxb(SfOrderResponse.class,
//        // _orderService__return);
//        // System.out.println(rs);
//
//        System.out.println("Invoking cancelOrderService...");
//        java.lang.String _cancelOrderService_arg0 = b.toString();
//        java.lang.String _cancelOrderService__return = port.cancelOrderService(_cancelOrderService_arg0);
//        System.out.println("cancelOrderService.result=" + _cancelOrderService__return);
//
//
//
//        // {
//        // System.out.println("Invoking routeTrackingService...");
//        // java.lang.String _routeTrackingService_arg0 = "";
//        // java.lang.String _routeTrackingService__return =
//        // port.routeTrackingService(_routeTrackingService_arg0);
//        // System.out.println("routeTrackingService.result=" + _routeTrackingService__return);
//        //
//        // }
//        // {
//        // System.out.println("Invoking queryMailnoDetailService...");
//        // java.lang.String _queryMailnoDetailService_arg0 = "";
//        // java.lang.String _queryMailnoDetailService__return =
//        // port.queryMailnoDetailService(_queryMailnoDetailService_arg0);
//        // System.out.println("queryMailnoDetailService.result=" +
//        // _queryMailnoDetailService__return);
//        //
//        // }
//        // {
//        // System.out.println("Invoking logisticQueryStandard...");
//        // java.lang.String _logisticQueryStandard_arg0 = "";
//        // java.lang.String _logisticQueryStandard__return =
//        // port.logisticQueryStandard(_logisticQueryStandard_arg0);
//        // System.out.println("logisticQueryStandard.result=" + _logisticQueryStandard__return);
//        //
//        // }
//        // {
//        // System.out.println("Invoking orderService...");
//        // java.lang.String _orderService_arg0 = "";
//        // java.lang.String _orderService__return = port.orderService(_orderService_arg0);
//        // System.out.println("orderService.result=" + _orderService__return);
//        //
//        // }
//        // {
//        // System.out.println("Invoking orderMailBindingService...");
//        // java.lang.String _orderMailBindingService_arg0 = "";
//        // java.lang.String _orderMailBindingService__return =
//        // port.orderMailBindingService(_orderMailBindingService_arg0);
//        // System.out.println("orderMailBindingService.result=" + _orderMailBindingService__return);
//        //
//        // }
//        // {
//        // System.out.println("Invoking cancelOrderService...");
//        // java.lang.String _cancelOrderService_arg0 = "";
//        // java.lang.String _cancelOrderService__return =
//        // port.cancelOrderService(_cancelOrderService_arg0);
//        // System.out.println("cancelOrderService.result=" + _cancelOrderService__return);
//        //
//        // }
//
//        System.exit(0);
//    }
//
//}