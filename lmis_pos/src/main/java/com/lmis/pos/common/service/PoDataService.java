package com.lmis.pos.common.service;

import org.springframework.web.multipart.MultipartFile;

import com.lmis.framework.baseInfo.LmisResult;
import com.lmis.framework.baseModel.PersistentObject;
import com.lmis.pos.common.model.PosDataFileTemplete;

public interface PoDataService<T extends PersistentObject>  {

	LmisResult<?> poDataExcelUpload(String templeteId, MultipartFile file);

	LmisResult<?> deleteServiceDataSourceUploadFile(String fileId) throws Exception;
	
	LmisResult<?> fileUploadFileSchedule(String fileId) throws Exception;

	LmisResult<?> poDataExcelDownload(String templeteId,String filterJsonStr,Boolean isTemplete,String fileNames)throws Exception;

	PosDataFileTemplete getUploadTemplete(String templeteId) throws Exception;

	LmisResult<?> downLoadTemplete(String templeteId) throws Exception;
	
}
