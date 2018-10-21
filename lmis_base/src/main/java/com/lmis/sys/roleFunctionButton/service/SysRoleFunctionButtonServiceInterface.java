package com.lmis.sys.roleFunctionButton.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.stereotype.Service;
import com.lmis.framework.baseModel.PersistentObject;
import com.lmis.sys.roleFunctionButton.model.SysRoleFunctionButton;
import com.lmis.common.dynamicSql.model.DynamicSqlParam;
import com.lmis.framework.baseInfo.LmisPageObject;
import com.lmis.framework.baseInfo.LmisResult;

/** 
 * @ClassName: SysRoleFunctionButtonServiceInterface
 * @Description: TODO(业务层接口类)
 * @author codeGenerator
 * @date 2018-01-09 17:35:11
 * 
 * @param <T>
 */
@Transactional(rollbackFor=Exception.class)
@Service
public interface SysRoleFunctionButtonServiceInterface<T extends PersistentObject> {

	/**
	 * @Title: executeSelect
	 * @Description: TODO(执行搜索语句，获取多条记录，可分页)
	 * @param dynamicSqlParam
	 * @param pageObject
	 * @param Exception
	 * @return: LmisResult<?>
	 * @author: codeGenerator
	 * @date: 2018-01-09 17:35:11
	 */
	LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam, LmisPageObject pageObject) throws Exception;
	
	/**
	 * @Title: executeSelect
	 * @Description: TODO(执行搜索语句，获取单条记录，不分页)
	 * @param dynamicSqlParam
	 * @return: LmisResult<?>
	 * @author: codeGenerator
	 * @date: 2018-01-09 17:35:11
	 */
	LmisResult<?> executeSelect(DynamicSqlParam<T> dynamicSqlParam) throws Exception;
	
	/**
	 * @Title: executeInsert
	 * @Description: TODO(执行插入语句)
	 * @param dynamicSqlParam
	 * @return: LmisResult<?>
	 * @author: codeGenerator
	 * @date: 2018-01-09 17:35:11
	 */
	LmisResult<?> executeInsert(DynamicSqlParam<T> dynamicSqlParam) throws Exception;
	
	/**
	 * @Title: executeUpdate
	 * @Description: TODO(执行更新语句)
	 * @param dynamicSqlParam
	 * @return: LmisResult<?>
	 * @author: codeGenerator
	 * @date: 2018-01-09 17:35:11
	 */
	LmisResult<?> executeUpdate(DynamicSqlParam<T> dynamicSqlParam) throws Exception;
	
	/**
	 * @Title: deleteSysRoleFunctionButton
	 * @Description: TODO(删除)
	 * @param t
	 * @return: LmisResult<?>
	 * @author: codeGenerator
	 * @date: 2018-01-09 17:35:11
	 */
	LmisResult<?> deleteSysRoleFunctionButton(T t) throws Exception;

	LmisResult<?> addRoleFunctionButton(List<SysRoleFunctionButton> roleFbList) throws Exception;

	List<T> sysRoleFunctionButton(SysRoleFunctionButton sysRoleFunctionButton);
}
