package com.lmis.sys.userRole.service.impl;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.lmis.sys.userRole.model.SysUserRole;
import com.lmis.sys.userRole.service.SysUserRoleServiceInterface;
import org.apache.log4j.Logger;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.lmis.common.dynamicSql.service.DynamicSqlServiceInterface;
import com.lmis.constant.LBASEConstant;

import org.springframework.beans.factory.annotation.Autowired;

import com.lmis.sys.userRole.dao.SysUserRoleMapper;
import com.lmis.common.dynamicSql.model.DynamicSqlParam;
import com.lmis.framework.baseInfo.LmisPageObject;
import com.lmis.framework.baseInfo.LmisConstant;
import com.lmis.framework.baseInfo.LmisResult;
import com.lmis.common.dataFormat.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 * @ClassName: SysUserRoleServiceImpl
 * @Description: TODO(业务层实现类)
 * @author codeGenerator
 * @date 2018-01-09 16:43:38
 * 
 * @param <T>
 */
@Transactional(rollbackFor=Exception.class)
@Service
public class SysUserRoleServiceImpl<T extends SysUserRole> implements SysUserRoleServiceInterface<T>{

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(SysUserRoleServiceImpl.class);
	@Resource(name="dynamicSqlServiceImpl")
	DynamicSqlServiceInterface<Map<String, Object>> dynamicSqlService;
	@Autowired
	private SysUserRoleMapper<T> sysUserRoleMapper;
	
	@Autowired
	private HttpSession session;
	
	@Override
	public LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam, LmisPageObject pageObject) throws Exception {
		return dynamicSqlService.executeSelect(dynamicSqlParam, pageObject);
	}

	@Override
	public LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
		LmisResult<?> lmisResult = new LmisResult<T>();
		LmisResult<?> _lmisResult = dynamicSqlService.executeSelect(dynamicSqlParam);
		if(LmisConstant.RESULT_CODE_ERROR.equals(_lmisResult.getCode())) {
			return _lmisResult;
		}
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> result =  (List<Map<String, Object>>) _lmisResult.getData();
		if(ObjectUtils.isNull(result)) throw new Exception(LBASEConstant.EBASE000007);
		if(result.size() != 1) throw new Exception(LBASEConstant.EBASE000008);
		lmisResult.setData(result.get(0));
		lmisResult.setCode(LmisConstant.RESULT_CODE_SUCCESS);
		return lmisResult;
	}

	@Override
	public LmisResult<?> executeInsert(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
		// TODO(业务校验)
		//创建人
		dynamicSqlParam.setCreateBy(session.getAttribute("lmisUserId").toString());
		//更新人
		dynamicSqlParam.setUpdateBy(session.getAttribute("lmisUserId").toString());
		//所属机构
		dynamicSqlParam.setPwrOrg(session.getAttribute("lmisUserOrg").toString());	
		// 插入操作
		return dynamicSqlService.executeInsert(dynamicSqlParam);
	}

	@Override
	public LmisResult<?> executeUpdate(DynamicSqlParam<T> dynamicSqlParam) throws Exception {
			
		// TODO(业务校验)
		
		// 更新操作
		return dynamicSqlService.executeUpdate(dynamicSqlParam);
	}

	@Override
	public LmisResult<?> deleteSysUserRole(T t) throws Exception {
		LmisResult<T> lmisResult = new LmisResult<T>();
			
		// TODO(业务校验)
		
		// 删除操作
		if(sysUserRoleMapper.logicalDelete(t) == 1) lmisResult.setCode(LmisConstant.RESULT_CODE_SUCCESS);
		return lmisResult;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findUserRoleList(SysUserRole sysUserRole) throws Exception {
		sysUserRole.setIsDeleted(false);
		return  sysUserRoleMapper.retrieve((T) sysUserRole);
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> addUserRole(List<SysUserRole> userRoleList) throws Exception {
		LmisResult<T> lmisResult = new LmisResult<T>();
		
		List<SysUserRole> insertList=new ArrayList<>();
		for (SysUserRole sysUserRole : userRoleList) {
			
			//创建人
			sysUserRole.setCreateBy(session.getAttribute("lmisUserId").toString());
			//更新人
			sysUserRole.setUpdateBy(session.getAttribute("lmisUserId").toString());
			//所属机构
			sysUserRole.setPwrOrg(session.getAttribute("lmisUserOrg").toString());	
			
			insertList.add(sysUserRole);
		}
		if(insertList.size()>0) {
			sysUserRoleMapper.createBatch((List<T>) insertList);
		}
		lmisResult.setCode(LmisConstant.RESULT_CODE_SUCCESS);
		return lmisResult;
	}

	@SuppressWarnings("unchecked")
	@Override
	public LmisResult<?> deleteUserRole(List<SysUserRole> userRoleList) throws Exception {
		LmisResult<T> lmisResult = new LmisResult<T>();
		for (SysUserRole sysUserRole : userRoleList) {
			sysUserRole.setIsDeleted(false);
			List<T> list = sysUserRoleMapper.retrieve((T) sysUserRole);
			T t = list.get(0);
			//更新人
			t.setUpdateBy(session.getAttribute("lmisUserId").toString());
			sysUserRoleMapper.logicalDelete(t);
		}
		lmisResult.setCode(LmisConstant.RESULT_CODE_SUCCESS);
		return lmisResult;
	}




}
