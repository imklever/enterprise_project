package com.baozun.easytask.job;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.baozun.easytask.service.SkxService;
import com.baozun.easytask.util.BigExcelExport;
import com.baozun.easytask.util.MailUtils;


/**
 * 
 * @author Yuriy.Jiang
 *
 */
@Component
public class SKXYTO20Job {

//	@Resource(name = "skxServiceImpl")
//	private SkxService skxServiceImpl;
//
//	public SKXYTO20Job() {
//		System.out.println("斯凯奇圆通20点的Job创建成功!");
//	}
//
//	@Scheduled(cron = "0 30 20 * * ? ")
//	public void run() {
//		LinkedHashMap<String, String> cMap = new LinkedHashMap<String, String> ();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String filehead = sdf.format(new Date());
//		String a = sdf.format(new Date())+" 15:00:00";
//		String b =sdf.format(new Date())+" 20:00:00";
//		List<Map<String, Object>> list = skxServiceImpl.job1(a, b);
//		cMap.put("warehouse_code", "仓库编码");
//		cMap.put("warehouse_name", "仓库名称");
//		cMap.put("order_source", "订单来源");
//		cMap.put("transport_code", "承运商编码");
//		cMap.put("express_number", "运单号");
//		cMap.put("weight", "重量");
//		cMap.put("shiptoname", "收件人");
//		cMap.put("province", "省");
//		cMap.put("city", "市");
//		cMap.put("state", "区");
//		cMap.put("address", "详细地址");
//		cMap.put("store_code", "店铺编码");
//		cMap.put("store_name", "店铺名称");
//		cMap.put("logistics_createTime", "快递服务创建时间");
//		cMap.put("create_time", "LMIS创建时间");
//		try {
//			BigExcelExport.excelDownLoadDatab(list, cMap, filehead+"斯凯奇圆通20点");
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		List<String> filepath = new ArrayList<>();
//		filepath.add(MailUtils.path+filehead+"斯凯奇圆通20点.xlsx");
//		try {
//			MailUtils.sendMail(MailUtils.emailStr + ",346780361@qq.com", filehead+"斯凯奇圆通20点" + "", "", filepath);
//		} catch (UnsupportedEncodingException | MessagingException e) {
//			e.printStackTrace();
//		}
//	}

}
