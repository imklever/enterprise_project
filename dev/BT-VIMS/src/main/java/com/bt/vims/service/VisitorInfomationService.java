package com.bt.vims.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;

import com.bt.vims.model.VisitorInfomation;
import com.bt.vims.page.QueryParameter;
import com.bt.vims.page.QueryResult;

public interface VisitorInfomationService {
	
	/** 
	* @Title: save 
	* @Description: TODO(访客记录新增) 
	* @param @param vi    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public void save(VisitorInfomation vi);
	
	/** 
	* @Title: update 
	* @Description: TODO(访客记录更新) 
	* @param @param vi    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public void update(VisitorInfomation vi);
	
	/** 
	* @Title: query_all 
	* @Description: TODO(查询访客记录) 
	* @param @return    设定文件 
	* @return List<VisitorInfomation>    返回类型 
	* @throws 
	*/
	public List<VisitorInfomation> query_all(VisitorInfomation vi);
	
	/** 
	* @Title: query_by_id 
	* @Description: TODO(根据ID查询) 
	* @param @param id
	* @param @return    设定文件 
	* @return VisitorInfomation    返回类型 
	* @throws 
	*/
	public VisitorInfomation query_by_data(@Param("data")String data);
	
	/** 
	* @Title: query_host 
	* @Description: TODO(查询拜访人记录) 
	* @param @return    设定文件 
	* @return List<VisitorInfomation>    返回类型 
	* @throws 
	*/
	public List<Map<String, Object>> query_host();
	
	/**
	 * @param <T>
	 * 
	* @Title: findAllData 
	* @Description: TODO(分页查询访客记录) 
	* @param @param qr
	* @param @return    设定文件 
	* @author likun   
	* @return QueryResult<T>    返回类型 
	* @throws
	 */
	public <T> QueryResult<T> findAllData(QueryParameter qr);

	/** 
	* @Title: query 
	* @Description: TODO(根据条件查询) 
	* @param @param vi
	* @param @return    设定文件 
	* @return List<VisitorInfomation>    返回类型 
	* @throws 
	*/
	public List<VisitorInfomation> query(VisitorInfomation vi);
	
	/**
	 * 
	* @Title: getDetailData 
	* @Description: TODO(导出) 
	* @param @param param
	* @param @return    设定文件 
	* @author likun   
	* @return List<T>    返回类型 
	* @throws
	 */
	public List<?>getDetailData(Map<String, Object> param);
	
	public List<Map<String, Object>> query_check_log(@Param("username")String username);
	
	/**
	 * 调用新的打印机打印贴纸
	 * @param visitorData 访客信息
	 * @param request
	 * @return
	 */
	public int toNewPrinter(@Param("data")String visitorData, HttpServletRequest request);
	
	/**
	 * 查询当天的访客记录数（用于编号递增）
	 * @param vi
	 * @return
	 */
	public int getColumnTheDay(VisitorInfomation vi);
	
}
