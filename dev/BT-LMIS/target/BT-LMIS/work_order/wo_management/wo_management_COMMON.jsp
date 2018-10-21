<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 查件界面弹窗 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class= "modal-body container" >
	<div class= "row" style= "margin-bottom: 15px;" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "orderNum_label_${wo_display.woType }" class= "no-padding-right blue" for= "orderNum_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-3" >
			<input id= "orderNum_${wo_display.woType }" name= "orderNum_${wo_display.woType }" class= "form-control" type="text" ${type == "process" && wo_display.wo_process_status_display == "处理中" ? "": "disabled= 'disabled'" } />
		</div>
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "result_label_${wo_display.woType }" class= "no-padding-right blue" for= "result_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-3" >
			<input id= "result_${wo_display.woType }" name= "result_${wo_display.woType }" class= "form-control" type="text" />
		</div>
		<%-- <div class= "col-xs-3" style= "text-align: right;" >
			<label id= "sendTime_label_${wo_display.woType }" class= "no-padding-right blue" for= "sendTime_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-3" >
			<input id= "sendTime_${wo_display.woType }" name= "sendTime_${wo_display.woType }" class= "Wdate" type="text" style= "width: 100%; height: 34px;" onfocus= "WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" ${type == "process" && wo_display.wo_process_status_display == "处理中" ? "": "disabled= 'disabled'" } />
	   	</div> --%>
   	</div>
	<div class= "row" style= "margin-bottom: 15px;" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "resultPart_label_${wo_display.woType }" class= "no-padding-right blue" for= "resultPart_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-3" >
			<input id= "resultPart_${wo_display.woType }" name= "resultPart_${wo_display.woType }" class= "form-control" type="text"/>
		</div>
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "dutyBelong_label_${wo_display.woType }" class= "no-padding-right blue" for= "dutyBelong_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-3" >
			<input id= "dutyBelong_${wo_display.woType }" name= "dutyBelong_${wo_display.woType }" class= "form-control" type="text" />
		</div>
   	</div>
	<div class= "row" style= "margin-bottom: 15px;" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "remark_label_${wo_display.woType }" class= "no-padding-right blue" for= "remark_${wo_display.woType }" style= "white-space: nowrap;" >
			</label>
		</div>
		<div class= "col-xs-9" >
			<input id= "remark_${wo_display.woType }" name= "remark_${wo_display.woType }" class= "form-control" type="text" />
		</div>
   	</div>
   	<%-- <div class= "row form-group" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "resultInfo_label_${wo_display.woType }" class= "no-padding-right blue" for= "resultInfo_${wo_display.woType }" style= "white-space: nowrap;" >
	       	</label>
       	</div>
       	<div class= "col-xs-9">
			<textarea id= "resultInfo_${wo_display.woType }" class= "form-control" style= "height: 150px;" cols= "30" disabled= 'disabled' ></textarea>
       	</div>
	</div> --%>
	<div class= "row form-group" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "resultInfo_label_${wo_display.woType }" class= "no-padding-right blue" for= "resultInfo_${wo_display.woType }" style= "white-space: nowrap;" >
	       	</label>
       	</div>
       	<div class= "col-xs-9">
			<select id= "resultInfo_${wo_display.woType }"  style= "width: 100%; height: 34px;" 
				${type == "process" && wo_display.wo_process_status_display == "处理中" ? "": "disabled= 'disabled'" }  >
				<option value="">---请选择---</option>
				<c:forEach var="res" items="${resultInfo}">
					<option value="${res}">${res}</option>
				</c:forEach>
			</select>
       	</div>
	</div>
	
  	<div class= "row form-group" >
		<div class= "col-xs-2" style= "text-align: right;" >
			<label id= "fileName_label_${wo_display.woType }" class= "no-padding-right blue" style= "white-space: nowrap;" >
           	</label>
       	</div>
      	<div class= "col-xs-9">
			<COMMON_UPLOAD></COMMON_UPLOAD>
       	</div>
	</div>
</div>
<div class="modal-footer" ${type == "process" && wo_display.wo_process_status_display == "处理中"?"":"style='display: none;'" }>
    <button id="save_${wo_display.woType }" type="button" class="btn btn-primary" onclick="operation('${wo_display.woType }', 0);">
		<i class="icon-save"></i>保存
	</button>
	<button id="process_${wo_display.woType }" type="button" class="btn btn-inverse" onclick="operation('${wo_display.woType }', 1);">
   		<i class="icon-tasks"></i>处理查件
   </button>
</div>
