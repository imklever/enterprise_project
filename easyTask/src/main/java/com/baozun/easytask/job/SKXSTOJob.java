package com.baozun.easytask.job;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.baozun.easytask.service.SkxService;
import com.baozun.easytask.util.BigExcelExport;
import com.baozun.easytask.util.DateUtil;
import com.baozun.easytask.util.ExportExcelUtils;
import com.baozun.easytask.util.MailUtils;
import com.baozun.easytask.util.SendExcelMailUtil;

/**
 * 
 * @author lsh11036+jinggong.li
 *
 */
@Component
public class SKXSTOJob {
	 private static final Logger logger = Logger.getLogger(SKXSTOJob.class);
	 private final static String  path = "/home/tomcat_lmis_pe/order/";//文件路径
	 private final static String email = "shengyu.qu@baozun.com,weiqiang.xu@baozun.com,yichao.xi@baozun.com,pandeng.cui@baozun.com,qiang.shen@baozun.com,yongtao.jin@baozun.com,minjie.zhang@baozun.com,mengran.li@baozun.com,xuedong.xie@baozun.com,junxin.fan@baozun.com,yongtao.li@baozun.com,wenchao.hu@baozun.com,tao.liu@baozun.com,qiang.yang@baozun.com,shaohai.li@baozun.com,zhili.wang@baozun.com,yu.chen@baozun.com,zihui.li@baozun.com,xuezhu.zhou@baozun.com,si.yang@baozun.com,jing.xu@baozun.com";//接收人邮箱
	 private final static String cc = "beili.chen@baozun.com,zheng.xie@baozun.com,ling.zhu1@baozun.com,saisai.huang@baozun.com,yue.wang@baozun.com,xing.wang@baozun.com";//抄送人邮件
	
	 @Resource(name = "skxServiceImpl")
	 private SkxService skxServiceImpl;
	
    
	//@Scheduled(cron = "0 0 10,12,14,16,18,20,22 1-20 6 ?")
	public void run() {
		  boolean flage = false;
			String fileUrl = null;
			List<String> filepath = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		    String filehead = sdf.format(new Date());
			List<List<List<Object>>> list = getExeculList();//获取到数据源数据
			try {
				fileUrl = ExportExcelUtils.exportExcel(list,path+"618-订单发货配送报表(斯凯奇)");
				filepath.add(fileUrl);
				flage = SendExcelMailUtil.sendMail(email,cc,"618-订单发货配送报表(斯凯奇)"+"--"+filehead,"", filepath);
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}
    
	  /**
		 * 获取到List数据源
		 * @return
		 */
		private List<List<List<Object>>> getExeculList(){
			List<List<List<Object>>> list = new LinkedList<List<List<Object>>>();
			List<List<Object>> data1 = mapChangList(skxServiceImpl.job7());
			List<List<Object>> data2 = mapChangList2(skxServiceImpl.job8());
			List<List<Object>> data3 = mapChangList3(skxServiceImpl.job9());
	        list.add(data1);
	        list.add(data2);
	        list.add(data3);
			return list;	
		}
		
		
		//转换map1中的数据
		private List<List<Object>> mapChangList(List<Map<String, Object>> data){
			List<List<Object>> data1 = new ArrayList<List<Object>>(); 
			for(Map map : data) {
				List rowData = new ArrayList();  
	            rowData.add(map.get("start_province") != null ? map.get("start_province"): "");  
	            rowData.add(map.get("warehouse_name") != null ? map.get("warehouse_name"): map.get("warehouse_code"));
	            rowData.add(map.get("store_name") != null ? map.get("store_name"): map.get("store_code"));
	            rowData.add(map.get("transport_code") != null ? map.get("transport_code"): "");
	            rowData.add(map.get("order_count") != null ? map.get("order_count"): "");
	            rowData.add(map.get("embrance_count") != null ? map.get("embrance_count"): "");
	            rowData.add(map.get("receive_count") != null ? map.get("receive_count"): "");
	            data1.add(rowData);
			}
			return data1;
		}
		
		//转换map2中的数据
		private  List<List<Object>> mapChangList2(List<Map<String, Object>> data){
			List<List<Object>> data2 = new ArrayList<List<Object>>(); 
			for(Map map : data) {
				List rowData = new ArrayList();  
	            rowData.add(map.get("start_province") != null ? map.get("start_province"): "");  
	            rowData.add(map.get("warehouse_name") != null ? map.get("warehouse_name"): map.get("warehouse_code"));
	            rowData.add(map.get("store_name") != null ? map.get("store_name"): map.get("store_code"));
	            rowData.add(map.get("transport_code") != null ? map.get("transport_code"): "");
	            String provinces = (String) (map.get("province") != null ? map.get("province"): "");
	            if(null != provinces) {
	                 String province = provinces.substring(0,2);
	                 if(province.equals("内蒙")) {
	                	 province = province + "古";
	                	 rowData.add(province);
	                 }else {
	                	 rowData.add(province); 
	                 }     
	            }else {
	            	rowData.add(provinces);
	            }
	            String city = (String) (map.get("city") != null ? map.get("city"): "");
	            if(null != city) {
	            	switch(city) {
	            	case "北京":
	                     city = city + "市";
	                    break;
	            	case "上海":
	            		city = city + "市";
	                    break;
	            	case "重庆":
	            		city = city + "市";
	                    break;
	            	case "天津":
	            		city = city + "市";
	                    break;
	            	}
	            	rowData.add(city);
	            }else {
	            	rowData.add(city);
	            }
	            rowData.add(map.get("order_count") != null ? map.get("order_count"): "");
	            rowData.add(map.get("embrance_count") != null ? map.get("embrance_count"): "");
	            rowData.add(map.get("receive_count") != null ? map.get("receive_count"): "");
	            data2.add(rowData);
			}
			return data2;
		}
		
		//转换map3中的数据
		private  synchronized List<List<Object>> mapChangList3(List<Map<String, Object>> data){
			List<List<Object>> data3 = new ArrayList<List<Object>>(); 
			for(Map map : data) {
				List rowData = new ArrayList();  
	            rowData.add(map.get("transport_time") != null ? map.get("transport_time"): "");  
	            rowData.add(map.get("transport_hour") != null ? map.get("transport_hour"): "");
	            rowData.add(map.get("start_province") != null ? map.get("start_province"): "");
	            rowData.add(map.get("warehouse_name") != null ? map.get("warehouse_name"): map.get("warehouse_code"));
	            rowData.add(map.get("store_name") != null ? map.get("store_name"): map.get("store_code"));
	            rowData.add(map.get("transport_code") != null ? map.get("transport_code"): "");
	            rowData.add(map.get("order_count") != null ? map.get("order_count"): "");
	            rowData.add(map.get("embrance_count") != null ? map.get("embrance_count"): "");
	            data3.add(rowData);
			}
			return data3;
		}

}
