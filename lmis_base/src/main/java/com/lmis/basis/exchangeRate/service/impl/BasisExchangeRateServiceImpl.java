package com.lmis.basis.exchangeRate.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.lmis.basis.currency.dao.BasisCurrencyMapper;
import com.lmis.basis.currency.model.BasisCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmis.common.dataFormat.ObjectUtils;
import com.lmis.common.dynamicSql.model.DynamicSqlParam;
import com.lmis.common.dynamicSql.service.DynamicSqlServiceInterface;
import com.lmis.constant.LBASEConstant;
import com.lmis.framework.baseInfo.LmisConstant;
import com.lmis.framework.baseInfo.LmisPageObject;
import com.lmis.framework.baseInfo.LmisResult;
import com.lmis.basis.exchangeRate.dao.BasisExchangeRateMapper;
import com.lmis.basis.exchangeRate.model.BasisExchangeRate;
import com.lmis.basis.exchangeRate.service.BasisExchangeRateServiceInterface;

/** 
 * @ClassName: BasisExchangeRateServiceImpl
 * @Description: TODO(汇率业务层实现类)
 * @author codeGenerator
 * @date 2018-01-18 15:00:45
 * 
 * @param <T>
 */
@Transactional(rollbackFor=Exception.class)
@Service
public class BasisExchangeRateServiceImpl<T extends BasisExchangeRate> implements BasisExchangeRateServiceInterface<T> {
	
	@Resource(name="dynamicSqlServiceImpl")
	DynamicSqlServiceInterface<BasisExchangeRate> dynamicSqlService;
	@Autowired
	private BasisExchangeRateMapper<T> basisExchangeRateMapper;

	@Autowired
	private BasisCurrencyMapper<BasisCurrency> basisCurrencyMapper;


	@Autowired
	private HttpSession session;
	
	@Override
	public LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam, LmisPageObject pageObject) throws Exception {
		return dynamicSqlService.executeSelect(dynamicSqlParam, pageObject);
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
		LmisResult<?> _lmisResult = dynamicSqlService.executeSelect(dynamicSqlParam);
		if(LmisConstant.RESULT_CODE_ERROR.equals(_lmisResult.getCode())) return _lmisResult;
		List<Map<String, Object>> result =  (List<Map<String, Object>>) _lmisResult.getData();
		if(ObjectUtils.isNull(result)) throw new Exception(LBASEConstant.EBASE000007);
		if(result.size() != 1) throw new Exception(LBASEConstant.EBASE000008);
		return new LmisResult<T>(LmisConstant.RESULT_CODE_SUCCESS, result.get(0));
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> executeInsert(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
			
		// TODO(业务校验)


		BasisExchangeRate rate = dynamicSqlService.generateTableModel((DynamicSqlParam<BasisExchangeRate>) dynamicSqlParam, new BasisExchangeRate()).getTableModel();

		//导入验证
		BasisCurrency basisCurrency = new BasisCurrency();
		basisCurrency.setIsDeleted(false);
		basisCurrency.setIsDisabled(false);
		if(ObjectUtils.isNull(rate.getRecourseCurrency())) throw new Exception(LBASEConstant.EBASE000038);
		basisCurrency.setCurrencyCode(rate.getRecourseCurrency());
		if(basisCurrencyMapper.retrieve(basisCurrency).size()!=1) throw new Exception(LBASEConstant.EBASE000039);
		if(ObjectUtils.isNull(rate.getTargetCurrency())) throw new Exception(LBASEConstant.EBASE000040);
		basisCurrency.setCurrencyCode(rate.getTargetCurrency());
		if(basisCurrencyMapper.retrieve(basisCurrency).size()!=1) throw new Exception(LBASEConstant.EBASE000041);
		//非空校验
		if(ObjectUtils.isNull(rate.getRateCode())) throw new Exception(LBASEConstant.EBASE000042);
		//唯一校验
		BasisExchangeRate checkRate=new BasisExchangeRate();
		checkRate.setIsDeleted(false);
		checkRate.setRateCode(rate.getRateCode());
		if(basisExchangeRateMapper.retrieve((T) checkRate).size()>0) throw new Exception(LBASEConstant.EBASE000043);
		BigDecimal exchangeRate;
		if(!ObjectUtils.isNull(rate.getExchangeRate())){
		exchangeRate = new BigDecimal(rate.getExchangeRate().trim());
		}else {
			throw new  Exception(LBASEConstant.EBASE000044);
		}
		if(rate.getRecourseCurrency().equals(rate.getTargetCurrency())&&exchangeRate.compareTo(new BigDecimal("1"))!=0){
            throw  new  Exception(LBASEConstant.EBASE000045);
		}

		checkRate.setIsDeleted(false);
		checkRate.setRateCode(null);
		checkRate.setRecourseCurrency(rate.getRecourseCurrency());
		checkRate.setTargetCurrency(rate.getTargetCurrency());
		if(basisExchangeRateMapper.retrieve((T) checkRate).size()>0) throw new Exception(LBASEConstant.EBASE000046);
		
		
		//创建人
		dynamicSqlParam.setCreateBy(session.getAttribute("lmisUserId").toString());
		//更新人
		dynamicSqlParam.setUpdateBy(session.getAttribute("lmisUserId").toString());
		//所属机构
		dynamicSqlParam.setPwrOrg(session.getAttribute("lmisUserOrg").toString());	
		
		// 插入操作
		return dynamicSqlService.executeInsert(dynamicSqlParam);
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> executeUpdate(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
			
		// TODO(业务校验)
		//存在校验
		BasisExchangeRate rate = dynamicSqlService.generateTableModel((DynamicSqlParam<BasisExchangeRate>) dynamicSqlParam, new BasisExchangeRate()).getTableModel();
		BasisExchangeRate checkRate=new BasisExchangeRate();
		checkRate.setIsDeleted(false);
		checkRate.setRateCode(rate.getRateCode());
		 List<T> rataList = basisExchangeRateMapper.retrieve((T) checkRate);
		if(rataList.size()==0) throw new Exception(LBASEConstant.EBASE000001);
		
		if(rate.getRecourseCurrency().equals(rate.getTargetCurrency())) throw new Exception(LBASEConstant.EBASE000047);
		
		if(!rataList.get(0).getRecourseCurrency().equals(rate.getRecourseCurrency())||!rataList.get(0).getTargetCurrency().equals(rate.getTargetCurrency())) {
			checkRate.setRateCode(null);
			checkRate.setRecourseCurrency(rate.getRecourseCurrency());
			checkRate.setTargetCurrency(rate.getTargetCurrency());
			if(basisExchangeRateMapper.retrieve((T) checkRate).size()>0) throw new Exception(LBASEConstant.EBASE000046);
		}
		
		//更新人
		dynamicSqlParam.setUpdateBy(session.getAttribute("lmisUserId").toString());
		
		// 更新操作
		return dynamicSqlService.executeUpdate(dynamicSqlParam);
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> deleteBasisExchangeRate(T t) throws Exception {
			
		// TODO(业务校验)
		
		
		//存在校验
		BasisExchangeRate checkRate=new BasisExchangeRate();
		checkRate.setIsDeleted(false);
		checkRate.setRateCode(t.getRateCode());
		if(basisExchangeRateMapper.retrieve((T) checkRate).size()==0) throw new Exception(LBASEConstant.EBASE000001);
		
		//更新人
		t.setUpdateBy(session.getAttribute("lmisUserId").toString());
		
		// 删除操作
		return new LmisResult<T>(LmisConstant.RESULT_CODE_SUCCESS, basisExchangeRateMapper.logicalDelete(t));
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> switchBasisExchangeRate(T t) throws Exception {

		//存在校验
		BasisExchangeRate checkRate=new BasisExchangeRate();
		checkRate.setIsDeleted(false);
		checkRate.setRateCode(t.getRateCode());
		if(basisExchangeRateMapper.retrieve((T) checkRate).size()==0) throw new Exception(LBASEConstant.EBASE000001);
		//更新人
		t.setUpdateBy(session.getAttribute("lmisUserId").toString());
		return new LmisResult<T>(LmisConstant.RESULT_CODE_SUCCESS, basisExchangeRateMapper.shiftValidity(t));
	}

}
