package com.bt.lmis.thread;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.transaction.annotation.Transactional;

import com.bt.lmis.base.spring.SpringUtils;
import com.bt.lmis.dao.BalanceErrorLogMapper;
import com.bt.lmis.dao.ExpressBalancedDataMapper;
import com.bt.lmis.dao.ExpressRawDataMapper;
import com.bt.lmis.model.BalanceErrorLog;
import com.bt.lmis.model.ExpressBalancedData;
import com.bt.lmis.model.ExpressContractConfig;
import com.bt.lmis.model.ExpressRawData;
import com.bt.lmis.model.InsuranceEC;
import com.bt.lmis.model.JibanpaoConditionEx;
import com.bt.lmis.model.NextPriceInternal;
import com.bt.lmis.model.OriginationDestinationParam;
import com.bt.lmis.model.PricingFormula;
import com.bt.lmis.service.ExpressContractService;
import com.bt.lmis.utils.ExpressBalanceUtils;
import com.bt.utils.CommonUtils;
import com.bt.utils.Constant;
import com.bt.utils.IntervalValidationUtil;

/**
 * @Title:ExpressBalanceRunnable
 * @Description: TODO  
 * @author Ian.Huang 
 * @date 2016年11月27日下午1:12:01
 */
@Transactional
public class ExpressBalanceRunnable implements Runnable {

	// 定义日志
	private static final Logger logger= Logger.getLogger(ExpressBalanceRunnable.class);
	
	// dao
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private ExpressBalancedDataMapper<T> expressBalancedDataMapper= (ExpressBalancedDataMapper<T>)SpringUtils.getBean(ExpressBalancedDataMapper.class);
	
	@SuppressWarnings("unchecked")
	private ExpressContractService<T> expressContractService= (ExpressContractService<T>)SpringUtils.getBean("expressContractServiceImpl");
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private ExpressRawDataMapper<T> expressRawDataMapper= (ExpressRawDataMapper<T>)SpringUtils.getBean(ExpressRawDataMapper.class);
	
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private BalanceErrorLogMapper<T> balanceErrorLogMapper= (BalanceErrorLogMapper<T>)SpringUtils.getBean(BalanceErrorLogMapper.class);
	
	// 起始节点
	private int startPoint;
	// 结束节点
	private int endPoint;
	// 原始数据
	private List<ExpressRawData> eRDs;
	// 快递合同
	private Map<String, Object> eC;
	// 合同配置
	private ExpressContractConfig eCC;
	
	// 无参构造
	public ExpressBalanceRunnable(){
		
	}
	// 有参构造
	public ExpressBalanceRunnable(int startPoint, int endPoint, List<ExpressRawData> eRDs, Map<String, Object> eC, ExpressContractConfig eCC) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.eRDs = eRDs;
		this.eC = eC;
		this.eCC = eCC;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// 合同ID
		int con_id= Integer.parseInt(eC.get("id").toString());
		// 快递编码
		String transport_code= eC.get("contract_owner").toString();
		// 快递名称
		String transport_name= eC.get("transport_name").toString();
		// 开始结算
		try {
			// 批量插入结算数据
			// 结算数据集合
			List<ExpressBalancedData> eBDs= new ArrayList<ExpressBalancedData>();
			// 批量更新原始数据结算标记
			// 原始数据ID集合
			List<Integer> ids= new ArrayList<Integer>();
			StringBuffer originationDestinationParamKey = new StringBuffer();//报价费规则key
			StringBuffer originationParamKey = new StringBuffer();//报价费规则前缀key
			StringBuffer destinationParamKey = new StringBuffer();//报价费规则后缀key
			// 存在
			for(int i=startPoint; i<endPoint; i++){
				// 定义变量
				// 始发地目的地参数
				OriginationDestinationParam oDP= null;
				// 计费重量
				BigDecimal pricingWeight= null;
				// 首重
				BigDecimal firstWeight= null;
				// 续重
				BigDecimal addedWeight= new BigDecimal(0);
				// 续重价格
				BigDecimal addedWeightPrice= null;
				// 标准运费和折后运费
				Map<String, Object> freight= null;
				// 保价费
				BigDecimal insurance= null;
				// 参数对象
				Map<String, Object> param= null;
				// 结算材料1：原始数据
				ExpressRawData eRD=eRDs.get(i);
				if(!CommonUtils.checkExistOrNot(eRD.getProvince())){
					// 目的地省不存在
					dealBalanceErrorLog(eRD, con_id, "此运单中目的地省不存在！");
					continue;
					
				}
				// 结算材料2：始发地目的地参数
				// key: mysql-key/redis-key
				String key= con_id + transport_name;
				if(CommonUtils.checkExistOrNot(eRD.getItemtype_name())){
					key+= eRD.getItemtype_name();
				}
				//逻辑抽象9次匹配分别为:始发地省市区目的地省市区、始发地省市区目的地省市、始发地省市区目的地省
				//始发地省市目的地省市区、始发地省市目的地省市、始发地省市目的地省
				//始发地省目的地省市区、始发地省目的地省市、始发地省目的地省
				boolean isContinue = true;
				for (int originStateCount = 0; originStateCount < 3 && isContinue; originStateCount++) {
					// 报价必到省
					//重置，重新匹配报价
					originationParamKey.setLength(0);
					originationParamKey.append(key);
					originationParamKey.append(eRD.getProvince_origin());
					if((originStateCount < 2) && CommonUtils.checkExistOrNot(eRD.getCity_origin())){
						// 没有区则省市
						originationParamKey.append(eRD.getCity_origin());
						if((originStateCount == 0) && CommonUtils.checkExistOrNot(eRD.getState_origin())){
							// 先查省市区
							originationParamKey.append(eRD.getState_origin());
						}
					}
					originationParamKey.append("中国");

					for(int destinationStateCount = 0; destinationStateCount < 3; destinationStateCount++){
						// 报价必到省
						destinationParamKey.setLength(0);
						destinationParamKey.append(eRD.getProvince());
						if((destinationStateCount < 2) && CommonUtils.checkExistOrNot(eRD.getCity())){
							// 没有区则省市
							destinationParamKey.append(eRD.getCity());
							if((destinationStateCount == 0) && CommonUtils.checkExistOrNot(eRD.getState())){
								// 先查省市区
								destinationParamKey.append(eRD.getState());
							}
						}
						originationDestinationParamKey.setLength(0);
						originationDestinationParamKey.append(originationParamKey);
						originationDestinationParamKey.append(destinationParamKey);
						oDP= (OriginationDestinationParam)ExpressBalanceUtils.getDataRecourse(
								originationDestinationParamKey.toString(), 
								OriginationDestinationParam.class, 
								Constant.PERFIX_MAPPER_ODP);
						if(CommonUtils.checkExistOrNot(oDP)){
							isContinue = false;
							break;
						} else {
							// 无记录
							continue;
						}
					}
				}
				// 始发地目的地参数存在
				if(!CommonUtils.checkExistOrNot(oDP)) {
					// 始发地目的地参数不存在
					dealBalanceErrorLog(eRD, con_id, "原始运单记录对应始发地目的地参数不存在！");
					continue;
					
				}
				if(oDP.getSzxz_switch() == 0) {
					// 首重续重开关为关闭状态，参数未维护
					dealBalanceErrorLog(eRD, con_id, "首重续重开关为关闭状态！");
					continue;
					
				}
				if((eCC.getWeight_method() != 1) && !CommonUtils.checkExistOrNot(oDP.getSzxz_jpnum())) {
					// 计重方式不为实际重量且计抛基数不存在
					dealBalanceErrorLog(eRD, con_id, "需计算抛重，计抛基数不存在！");
					continue;
					
				}
				// 获取计费公式
				PricingFormula pF= (PricingFormula)ExpressBalanceUtils.getDataRecourse("PF" + con_id + transport_code + oDP.getFormula(), PricingFormula.class, Constant.PERFIX_MAPPER_PF);
				if(!CommonUtils.checkExistOrNot(pF)) {
					// 未维护对应公式
					dealBalanceErrorLog(eRD, con_id, "始发地目的地参数中使用的公式未在合同中维护！");
					continue;
					
				}
				
				//求子母运单的重量和 并更新原始数据
//				if(CommonUtils.checkExistOrNot(eRD.getWarehouse_code())&&CommonUtils.checkExistOrNot(eRD.getEpistatic_order())
//						&&CommonUtils.checkExistOrNot(eRD.getTransport_code())){
//					Map<String,String> map = new HashMap<>();
//					map.put("warehouse_code", eRD.getWarehouse_code());
//					map.put("transport_code", eRD.getTransport_code());
//					map.put("epistatic_order", eRD.getEpistatic_order());
//					BigDecimal sumWeight = expressRawDataMapper.getSumWeight(map);
//					eRD.setWeight(sumWeight);
//				}else{
//					// 用来查询子运单的信息不存在
//					dealBalanceErrorLog(eRD, con_id, "此运单中仓库（warehouse_code）或者快递（transport_code）或者前置单据号（epistatic_order）不存在！");
//					continue;
//				}
				
				// 参数
				param= new HashMap<String, Object>();
				param.put("eRD", eRD);
				param.put("oDP", oDP);
				param.put("eCC", eCC);
				if(eCC.getWeight_method() == 2){
					param.put("jqpcList",expressContractService.selectAll(con_id,transport_code));
				}
				if(eCC.getWeight_method() == 3){
					param.put("jCExs", ExpressBalanceUtils.getDataRecourse("JBPC" + con_id + transport_code, JibanpaoConditionEx.class, Constant.PERFIX_MAPPER_JBPC));
				}
				
				// 获取所有所需重量
				Map<String, Object> allWeight= ExpressBalanceUtils.getAllWeight(param);
				// 计费重量
				pricingWeight= new BigDecimal(allWeight.get("charged_weight").toString());
				// 运费结算
				// 运费结算入参
				param= new HashMap<String, Object>();
				// 始发地目的地使用公式
				param.put("formula", oDP.getFormula());
				// 已维护对应公式
				if(CommonUtils.checkExistOrNot(pF.getAccurate_decimal_place())){
					// 使用公式参数
					param.put("accurate_decimal_place", pF.getAccurate_decimal_place());
					
				}
				// 首重
				firstWeight= oDP.getSzxz_sz();
				// 首重
				param.put("firstWeight", firstWeight);
				// 首重价格
				param.put("firstWeightPrice", oDP.getSzxz_price());
				// 计费重量
				param.put("pricingWeight", pricingWeight);
				// 续重区间价格集合
				List<NextPriceInternal> nextWeightInternals= (List<NextPriceInternal>)ExpressBalanceUtils.getDataRecourse("NPI" + oDP.getSzxz_id(), NextPriceInternal.class, Constant.PERFIX_MAPPER_NPI);
				// 取续重报价，由于暂时业务中只存在一条续重报价情况，故直接初始化为第一条记录
				addedWeightPrice= nextWeightInternals.get(0).getPrice();
				// 控制标志位
				boolean flag= false;
				if(pricingWeight.compareTo(firstWeight) == 1) {
					// 续重 = 计费重量 - 首重
					addedWeight= pricingWeight.subtract(firstWeight);
					for(int m= 0; m< nextWeightInternals.size(); m++){
						if(IntervalValidationUtil.isExist(Float.parseFloat(addedWeight + ""), nextWeightInternals.get(m).getInternal())){
							// 找到续重存在区间
							if(m != 0){
								// 第一条数据已赋值，故除第一条记录外继续赋值
								addedWeightPrice= nextWeightInternals.get(m).getPrice();
								
							}
							// 获取续重报价，打标记
							flag= true;
							break;
							
						}
						
					}
					if(flag){
						param.put("addedWeightPrice", addedWeightPrice);
						// 重置标志位
						flag= false;
						
					} else {
						// 未找到相应区间内的续重价格
						dealBalanceErrorLog(eRD, con_id, "该运单及其对应合同规则所得续重不在任何维护的续重区间中！");
						continue;
						
					}
					
				}
				// 单运费折扣
				param.put("discount", oDP.getSzxz_discount());
				// 得出标准运费/折后运费
				freight= ExpressBalanceUtils.formula(param);
				// 店铺使用保价费且保价费配置开关打开
				if(eRD.getInsurance_flag() && eCC.getInsurance()) {
					// 保价费结算
					key= "IEC" + con_id + transport_code;
					List<InsuranceEC> insurances= null;
					if(CommonUtils.checkExistOrNot(eRD.getItemtype_code())){
						insurances= (List<InsuranceEC>)ExpressBalanceUtils.getDataRecourse(key + eRD.getItemtype_code(), InsuranceEC.class, Constant.PERFIX_MAPPER_IEC);
						if(!CommonUtils.checkExistOrNot(insurances)){
							insurances= (List<InsuranceEC>)ExpressBalanceUtils.getDataRecourse(key + "ALL", InsuranceEC.class, Constant.PERFIX_MAPPER_IEC);
							
						}
						
					} else {
						insurances= (List<InsuranceEC>)ExpressBalanceUtils.getDataRecourse(key, InsuranceEC.class, Constant.PERFIX_MAPPER_IEC);
						
					}
					insurance= ExpressBalanceUtils.getInsurance(insurances, eRD.getOrder_amount(), 1);
					// 当保价费无法得到
					if(!CommonUtils.checkExistOrNot(insurance)){
						// 不符合合同规则未计算出保价费，保价费为0
						insurance= new BigDecimal(0);
						
					}
					
				} else {
					// 不保价或合同保价开关未开，保价费为0
					insurance= new BigDecimal(0);
					
				}
				// 结算封装
				ExpressBalancedData eBD= new ExpressBalancedData();
				eBD.setId(UUID.randomUUID().toString());
				eBD.setCost_center(eRD.getCost_center());
				eBD.setStore_code(eRD.getStore_code());
				eBD.setStore_name(eRD.getStore_name());
				eBD.setWarehouse(eRD.getWarehouse());
				eBD.setTransport_direction(eRD.getTransport_direction());
				eBD.setTransport_code(transport_code);
				eBD.setTransport_name(eRD.getTransport_name());
				eBD.setItemtype_code(eRD.getItemtype_code());
				eBD.setItemtype_name(eRD.getItemtype_name());
				eBD.setDelivery_order(eRD.getDelivery_order());
				eBD.setEpistatic_order(eRD.getEpistatic_order());
				eBD.setOrder_type(eRD.getOrder_type());
				eBD.setExpress_number(eRD.getExpress_number());
				eBD.setTransport_time(eRD.getTransport_time());
				eBD.setPlatform_order_time(eRD.getPlatform_order_time());
				eBD.setPlatform_pay_time(eRD.getPlatform_pay_time());
				eBD.setCollection_on_delivery(eRD.getCollection_on_delivery());
				eBD.setOrder_amount(eRD.getOrder_amount());
				eBD.setSku_number(eRD.getSku_number());
				eBD.setWeight(eRD.getWeight());
				eBD.setAccount_weight(new BigDecimal(allWeight.get("account_weight").toString()));
				eBD.setLength(eRD.getLength());
				eBD.setWidth(eRD.getWidth());
				eBD.setHigth(eRD.getHigth());
				eBD.setVolumn(eRD.getLength().multiply(eRD.getWidth()).multiply(eRD.getHigth()));
				eBD.setDelivery_address(eRD.getDelivery_address());
				eBD.setProvince(eRD.getProvince());
				eBD.setCity(eRD.getCity());
				eBD.setState(eRD.getState());
				eBD.setStreet(eRD.getStreet());
				eBD.setInsurance_flag(eRD.getInsurance_flag());
				eBD.setCod_flag(eRD.getCod_flag());
				eBD.setBalance_subject(eRD.getBalance_subject());
				eBD.setJp_num(oDP.getSzxz_jpnum());
				eBD.setVolumn_weight(new BigDecimal(allWeight.get("volumn_weight").toString()));
				eBD.setVolumn_account_weight(new BigDecimal(allWeight.get("volumn_account_weight").toString()));
				eBD.setJf_weight(oDP.getJf_weight());
				eBD.setCharged_weight(pricingWeight);
				eBD.setFirst_weight(firstWeight);
				eBD.setFirst_weight_price(oDP.getSzxz_price());
				eBD.setAdded_weight(addedWeight);
				eBD.setAdded_weight_price(addedWeightPrice);
				eBD.setStandard_freight(new BigDecimal(freight.get("standard_freight").toString()));
				if(!transport_code.equals("SF")){
					eBD.setDiscount(oDP.getSzxz_discount());
					eBD.setAfterdiscount_freight(new BigDecimal(freight.get("balanced_freight").toString()));
					
				} else {
					eBD.setDiscount(new BigDecimal(0));
					eBD.setAfterdiscount_freight(new BigDecimal(freight.get("standard_freight").toString()));
					
				}
				eBD.setInsurance_fee(insurance);
				if(transport_code.equals("SF")){
					eBD.setTotal_fee(new BigDecimal(freight.get("standard_freight").toString()).add(insurance));
					
				} else {
					eBD.setTotal_fee(new BigDecimal(freight.get("balanced_freight").toString()).add(insurance));
					
				}
				eBD.setData_id(eRD.getId());
				eBD.setContract_id(con_id);
				eBD.setPark_code(eRD.getPark_code());
				eBD.setPark_name(eRD.getPark_name());
				eBD.setPark_cost_center(eRD.getPark_cost_center());
				eBD.setProvince_origin(eRD.getProvince_origin());
				eBD.setCity_origin(eRD.getCity_origin());
				eBD.setState_origin(eRD.getState_origin());
				
				eBDs.add(eBD);
				ids.add(eRD.getId());
				
			}
			// 拆解批量插入数据
			// 批量为100一组，最优（1W，500,250测试，效率从左到右依次递增）
			int batch= 100;
			int size= eBDs.size();
			int cycle= size / batch;
			if(size% batch != 0){
				cycle++;
				
			}
			int fromIndex= 0;
			int toIndex= 0;
			for(int i= 0; i< cycle; i++){
				fromIndex= i* batch;
				toIndex= fromIndex+ batch;
				if(toIndex> size){
					toIndex= size;
					
				}
				// 批量插入结算明细数据 支出
				expressBalancedDataMapper.insertBatch(eBDs.subList(fromIndex, toIndex));
				// 批量更新原始数据结算标志为成功
				expressRawDataMapper.updateStatus(1, null, null, null, ids.subList(fromIndex, toIndex));
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			
		}
		
	}
	
	/**
	* @Title: dealBalanceErrorLog
	* @Description: TODO(处理结算异常)
	* @param eRD
	* @param con_id
	* @param errorInfo
	* @return void 返回类型
	* @throws Exception
	*/ 
	private void dealBalanceErrorLog(ExpressRawData eRD, Integer con_id, String errorInfo) throws Exception {
		// 结算错误日志
		BalanceErrorLog bEL = new BalanceErrorLog();
		bEL.setSubject_code(eRD.getExpress_number());
		bEL.setContract_id(con_id);
		bEL.setPro_result_flag("FAILURE");
		bEL.setPro_result_info(errorInfo);
		bEL.setError_type("1");
		// 新增错误日志
		balanceErrorLogMapper.addBalanceErrorLog(bEL);
		// 更新原始数据结算标志为异常
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(eRD.getId());
		expressRawDataMapper.updateStatus(2, null, null, null, ids);
		
	}
	
}