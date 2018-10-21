package com.bt.lmis.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bt.lmis.code.BaseMapper;

/**
* @ClassName: TotalVolumeMapper
* @Description: TODO(TotalVolumeMapper)
* @author Yuriy.Jiang
*
* @param <T>
*/ 
public interface TotalVolumeMapper<T> extends BaseMapper<T> {

	/** 
	* @Title: findByCBID 
	* @Description: TODO(根据合同ID查询超过部分体积阶梯) 
	* @param @param id
	* @param @return    设定文件 
	* @return List<Map<String,Object>>    返回类型 
	* @throws 
	*/
	public List<Map<String, Object>> findByCBID(@Param("cbid")String id);
}
