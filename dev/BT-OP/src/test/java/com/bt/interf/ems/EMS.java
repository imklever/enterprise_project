package com.bt.interf.ems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bt.orderPlatform.ftpupload.FTPFileUpload;
import com.bt.orderPlatform.model.WaybilDetail;
import com.bt.orderPlatform.model.WaybillMaster;



/** 
	* @Description: 
	* @author  Hanery:
 	* @date 2017年7月17日 上午11:28:38  
*/
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class EMS {

	@Autowired
	private EMSInterface emsInterface;
	@Autowired
	private FTPFileUpload fTPFileUpload;
	
	
	
	@Test
    @Transactional   //标明此方法需使用事务  
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
	public void ftpcreate() throws Exception{
		fTPFileUpload.FTPFile();
	}
	
	
	
	
	
	
	
	@Test
    @Transactional   //标明此方法需使用事务  
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
	public void create() throws Exception{
		WaybillMaster master = new WaybillMaster();

		master.setId("120010");
		master.setIsAutoBill("1");
		master.setExpressCode("YUNDA");
		master.setPayment("3");
		master.setOrder_id("27050191170");
		master.setFrom_orgnization("快递");
		master.setTo_orgnization("快递");
		master.setProducttype_code("4");
		master.setProducttype_name("标准快递");
		master.setTo_phone("12345161678");
		master.setTo_contacts("收货1人A");
		master.setTo_address("XXX1路123号");
		master.setTo_province("上海");
		master.setTo_city("上海");
		master.setTo_state("静安区");
		master.setFrom_contacts("发货人1A");
		master.setFrom_phone("12345116678");
		master.setFrom_address("XXX路789号");
		master.setFrom_province("上海");
		master.setFrom_province_code("110000");
		master.setFrom_city_code("310100");
		master.setFrom_state_code("110113");
		master.setTo_province_code("310000");
		master.setTo_city_code("310100");
		master.setTo_state_code("310101");
		master.setFrom_city("上海");
		master.setFrom_state("静安区");
		master.setFrom_street("");
		master.setTotal_qty(20);
		master.setTotal_weight(new BigDecimal(500.23));
		master.setTotal_volumn(new BigDecimal(1234.93));
		master.setTotal_amount(new BigDecimal(303));
		master.setCreate_user("test1");
		master.setUpdate_time(new Date());
		master.setUpdate_user("test1");
		master.setStatus("0");
		master.setWaybill("");
		
		WaybilDetail wd = new WaybilDetail();
		wd.setId("2000");
		wd.setSku_code("1");
		wd.setSku_name("电视");
		wd.setQty(20);
		
		WaybilDetail wd2 = new WaybilDetail();
		wd2.setId("2001");
		wd2.setSku_code("2");
		wd2.setSku_name("电饭煲");
		wd2.setQty(20);
		
		List<WaybilDetail> list = new ArrayList<>();
		list.add(wd);
		list.add(wd2);
		emsInterface.createOrder(master,list);
	}
	
	
	
	@Test
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
	public void CancelOrder() throws Exception{
		WaybillMaster master = new WaybillMaster();
		
		master.setId("120010");
		master.setIsAutoBill("1");
		master.setExpressCode("YUNDA");
		master.setPayment("3");
		master.setOrder_id("27050191170");
		master.setFrom_orgnization("快递");
		master.setTo_orgnization("快递");
		master.setProducttype_code("4");
		master.setProducttype_name("标准快递");
		master.setTo_phone("12345161678");
		master.setTo_contacts("收货1人A");
		master.setTo_address("XXX1路123号");
		master.setTo_province("上海");
		master.setTo_city("上海");
		master.setTo_state("静安区");
		master.setFrom_contacts("发货人1A");
		master.setFrom_phone("12345116678");
		master.setFrom_address("XXX路789号");
		master.setFrom_province("上海");
		master.setFrom_province_code("110000");
		master.setFrom_city_code("310100");
		master.setFrom_state_code("110113");
		master.setTo_province_code("310000");
		master.setTo_city_code("310100");
		master.setTo_state_code("310101");
		master.setFrom_city("上海");
		master.setFrom_state("静安区");
		master.setFrom_street("");
		master.setTotal_qty(20);
		master.setTotal_weight(new BigDecimal(500.23));
		master.setTotal_volumn(new BigDecimal(1234.93));
		master.setTotal_amount(new BigDecimal(303));
		master.setCreate_user("test1");
		master.setUpdate_time(new Date());
		master.setUpdate_user("test1");
		master.setStatus("0");
		master.setWaybill("");
		
		WaybilDetail wd = new WaybilDetail();
		wd.setId("2000");
		wd.setSku_code("1");
		wd.setSku_name("电视");
		wd.setQty(20);
		
		WaybilDetail wd2 = new WaybilDetail();
		wd2.setId("2001");
		wd2.setSku_code("2");
		wd2.setSku_name("电饭煲");
		wd2.setQty(20);
		
		List<WaybilDetail> list = new ArrayList<>();
		list.add(wd);
		list.add(wd2);
		emsInterface.CancelOrder(master,list);
	}
	
  
}
