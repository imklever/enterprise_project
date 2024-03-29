<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 工单任务新增界面弹窗 -->
<style>
	.button {
		display:block;
		width: 120px;
		height: 34px;	
		border-width:1px;
		background-color: #e5e5e5;
		color: black;
    	border: 1px solid white;
    	-moz-border-radius: 15px;      /* Gecko browsers */
    	-webkit-border-radius: 15px;   /* Webkit browsers */
     	border-radius:15px;            /* W3C syntax */
     	line-height: 34px;
     	text-decoration: none;
	}
	#fileDiv a:hover {
		text-decoration:none;
	}

</style>
<script>
	JQueryUploadHelper.SESSIONID = "<%=session.getId()%>";
	$(document).ready(JQueryUploadHelper.init);
	
</script>
<div id= "woAdd_form" class= "modal fade" tabindex= "-1" role= "dialog" aria-labelledby= "formLabel" aria-hidden= "true" >
    <div class= "modal-dialog modal-lg" style= "width: 70%;" role= "document" >
        <div class= "modal-content" style= "border: 3px solid #394557;" >
            <div class= "modal-header" >
                <button type= "button" class= "close" data-dismiss= "modal" aria-label= "Close" onclick= "initalAddForm();" ><span aria-hidden= "true" >×</span></button>
                <h4 class= "modal-title" >工单任务新增</h4>
            </div>
            <div class= "modal-body container" >
            	<form id= "addForm" >
            		<div class= "row form-group" >
            			<input id= "fileName_common" name= "fileName_common" type= "hidden" />
            			<input id= "woSource" name= "woSource" type= "hidden" value= "人工创建" />
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "woNo" style= "white-space: nowrap;" >
                           		工单号&nbsp;: 
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "woNo" name= "woNo" type= "text" class= "form-control" readonly />
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                	<div class= "col-xs-1" style= "text-align: right;" >
	                    	<label class= "no-padding-right blue" for= "bySelf" style= "white-space: nowrap;" >
                           		自行处理&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                    	<input id="bySelf" name="bySelf" type="checkbox" class="ace ace-switch ace-switch-5" checked= "checked" onchange="isRealTimeProcess($(this));" />
							<span class="lbl"></span>
	                    </div>
	                    <div class= "col-xs-2" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                    	<label class= "no-padding-right blue" for= "realTime" style= "white-space: nowrap;" >
                           		立即处理&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                    	<input id="realTime" name="realTime" type="checkbox" class="ace ace-switch ace-switch-5" />
							<span class="lbl"></span>
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "woType" style= "white-space: nowrap;" >
                            	工单类型&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "woType" name= "woType" data-edit-select= "1" checkType= "{'NOTNULL': '不能为空'}"
	                        	onchange= "shiftType('woType', {'levelId': 'woLevel', 'exceptionId': 'exceptionType' });checkValue($(this));endueDisplay('woType');isDisplay()" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                       	<input id= "woTypeDisplay" name= "woTypeDisplay" type= "hidden" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "woLevel" style= "white-space: nowrap;" >
                            	工单级别&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "woLevel" name= "woLevel" data-edit-select= "1" checkType= "{'NOTNULL': '不能为空'}" onchange= "checkValue($(this));endueDisplay('woLevel');" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                        <input id= "woLevelDisplay" name= "woLevelDisplay" type= "hidden" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                	<div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "exceptionType" style= "white-space: nowrap;" >
                            	异常类型&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "exceptionType" name= "exceptionType" data-edit-select= "1" checkType= "{}" onchange= "checkValue($(this));endueDisplay('exceptionType');" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                        <input id= "exceptionTypeDisplay" name= "exceptionTypeDisplay" type= "hidden" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "queryPerson" style= "white-space: nowrap;" >
                            	查询人&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "queryPerson" name= "queryPerson" type= "text" class= "form-control" placeholder= "最大长度20" maxlength="20"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 20}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "expressNumber" style= "white-space: nowrap;" >
                            	快递单号&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "expressNumber" name= "expressNumber" type= "text" class= "form-control" placeholder= "最大长度30" maxlength="30"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 30}"
	                        	onblur= "checkValue($(this));getData();" /><!-- onkeydown= "checkValue($(this));getDataByEnter(window.event);" -->
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "carriers" style= "white-space: nowrap;" >
                           		物流服务商&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "carriers" name= "carriers" data-edit-select= "1" checkType= "{'NOTNULL': '不能为空'}" onchange= "checkValue($(this));endueDisplay('carriers');" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                        <input id= "carriersDisplay" name= "carriersDisplay" type= "hidden" />
	                    </div>
	                   	<div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "warehouses" style= "white-space: nowrap;" >
                            	发货仓库&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "warehouses" name= "warehouses" data-edit-select= "1" checkType= "{'NOTNULL': '不能为空'}" onchange= "checkValue($(this));endueDisplay('warehouses');" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                       	<input id= "warehousesDisplay" name= "warehousesDisplay" type= "hidden" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "transportTime" style= "white-space: nowrap;" >
                            	出库时间&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                    	<input id="transportTime" name="transportTime" type="text" style= "width: 100%; height: 34px;" class= "form-control Wdate" readonly placeholder= "" onfocus= "showCalendar($(this));"
	                    		checkType= "{'NOTNULL': '不能为空', 'yyyy-MM-dd hh:mm:ss': '非法时间'}" oninput= "checkValue($(this));" onblur= "javascript:if(!$(this).prop('readonly')){checkValue($(this));}" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                	<div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "platformNumber" style= "white-space: nowrap;" >
                            	平台订单号&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "platformNumber" name= "platformNumber" type= "text" class= "form-control" readonly placeholder= "最大长度30" maxlength="30"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 30}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "relatedNumber" style= "white-space: nowrap;" >
                            	相关单据号&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "relatedNumber" name= "relatedNumber" type= "text" class= "form-control" readonly placeholder= "最大长度30" maxlength="30"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 30}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "stores" style= "white-space: nowrap;" >
                            	店铺&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <select id= "stores" name= "stores" data-edit-select= "1" checkType= "{'NOTNULL': '不能为空'}" onchange= "checkValue($(this));endueDisplay('stores');" >
	                            <option value= "" >---请选择---</option>
	                        </select>
	                        <input id= "storesDisplay" name= "storesDisplay" type= "hidden" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "orderAmount" style= "white-space: nowrap;" >
                           		订单金额（元）&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "orderAmount" name= "orderAmount" type= "text" class= "form-control" readonly placeholder= "最大长度10" maxlength="10"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法', 'NUM': '非法数字'}" validate-param= "{'MAX': 10}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "recipient" style= "white-space: nowrap;" >
                           		收件人&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "recipient" name= "recipient" type= "text" class= "form-control" readonly placeholder= "最大长度20" maxlength="20"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 20}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "phone" style= "white-space: nowrap;" >
                           		联系电话&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-3" >
	                        <input id= "phone" name= "phone" type= "text" class= "form-control" readonly placeholder= "座机/手机，最大长度30" maxlength="30" checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 30}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>

				<div class= "row form-group"  id="bjid" style="display: none">

						<div class= "col-xs-1" style= "text-align: right;" >
							<label  class= "no-padding-right blue" style= "white-space: nowrap;" >
								店铺保价&nbsp;:
							</label>
						</div>
						<div class= "col-xs-1 " >
							<input id="store_bj" name="storebj" type="checkbox"   class="ace ace-switch ace-switch-5"/>
							<span class="lbl"></span>
						</div>
						<div class= "col-xs-5" style= "text-align: right;" >
							<label class= "no-padding-right blue"  style= "white-space: nowrap;" >
								快递保价&nbsp;:
							</label>
						</div>
					<div class= "col-xs-1 " >
						<input id="transport_bj" name="transportbj" type="checkbox"   class="ace ace-switch ace-switch-5"/>
						<span class="lbl"></span>
					</div>
					</div>
			<div class= "row form-group" id="cuoluofa" style="display: none" >
						<div class= "col-xs-1" style= "text-align: right;" >
							<label class= "no-padding-right blue" for= "mistake_product_count" style= "white-space: nowrap;" >
								错发商品数量&nbsp;:
							</label>
						</div>
						<div class= "col-xs-3" >
							<input id= "mistakeProductCount" name= "mistakeProductCount" type= "text" class= "form-control" readonly placeholder= "最大长度20" maxlength="20"
								   checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 20}" oninput= "checkValue($(this));" />
						</div>
						<div id="mistakeProductCountyz"  class= "addCheckInfo col-xs-2" validation= "0" >
						</div>
						<div class= "col-xs-1" style= "text-align: right;" >
							<label class= "no-padding-right blue" for= "mistake_barcode" style= "white-space: nowrap;" >
								错漏发条形码&nbsp;:
							</label>
						</div>
						<div class= "col-xs-3" >
							<input id= "mistakeBarcode" name= "mistakeBarcode" type= "text" class= "form-control" readonly placeholder= "最大长度30" maxlength="30" checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 30}" oninput= "checkValue($(this));" />
						</div>
						<div id ="mistakeBarcodeyz" class= "addCheckInfo col-xs-2" validation= "0" >
						</div>
					</div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-1" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "address" style= "white-space: nowrap;" >
                          		联系地址&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-9" >
	                        <input id= "address" name= "address" type= "text" class= "form-control" readonly placeholder= "最大长度120" maxlength="120"
	                        	checkType= "{'NOTNULL': '不能为空', 'LENGTH': '长度不合法'}" validate-param= "{'MAX': 120}" oninput= "checkValue($(this));" />
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	                <div class= "row form-group" >
	                    <div class= "col-xs-2" style= "text-align: right;" >
	                        <label class= "no-padding-right blue" for= "supplement_explain" style= "white-space: nowrap;" >
                          		主要内容处理说明&nbsp;:
	                        </label>
	                    </div>
	                    <div class= "col-xs-8" >
	                        <textarea id= "supplementExplain" name= "supplementExplain" class= "form-control" readonly style= "height: 150px;" cols= "30" placeholder= "最大长度120" maxlength="120"
	                        	checkType= "{'NOTNULL': '不能为空','LENGTH': '长度不合法'}" validate-param= "{'MAX': 120}" oninput= "checkValue($(this));" ></textarea>
	                    </div>
	                    <div class= "addCheckInfo col-xs-2" validation= "0" >
	                    </div>
	                </div>
	               <!--  <input id= "packageId" name= "packageId" value="" type= "hidden"/> -->
            	</form>
            	<div id="createPackages" class= "row form-group">
            		<div class= "col-xs-2" style= "text-align: right;" >
                        <label class= "no-padding-right blue" for= "process_content" style= "white-space: nowrap;" >
                         		包裹&nbsp;:
                        </label>
                    </div>
					<div class="col-xs-8" >
						<table id="tableTest" class="table table-bordered no-margin table-fixed table-hover table-striped">
						</table>
					</div>
				</div>
            	<div class= "row form-group" >
               		<div class= "col-xs-2" style= "text-align: right;" >
			        	<label  class= "no-padding-right blue" for= "fileList" style= "white-space: nowrap;" >
			        		附件列表&nbsp;:
			        	</label>
			      	</div>
		      		<div class= "col-xs-8">
				 		<div id= "fileDiv" style= "width: 100%; height: 150px; overflow: auto; border: 1px solid #e5e5e5;" >
					  		<div id= "fileQueue" style= "width: 100%;" ></div>	
						  	<ims></ims>
						</div>
						<input id= "myFile" name= "myFile" type= "file" multiple= "true" onselect= ""/>
						<hr>
			     		<!-- <button onclick= "javascript:$('#myFile').uploadify('cancel',$('.uploadifive-queue-item').first().data('file'))" class= "button" style= "float: right" >取消上传</button>
			     		<button onclick= "javascript:$('#myFile').uploadify('upload','*')" class= "button" style= "float: right;" >上传</button> -->
			     	</div>
                </div>
            </div>
            <div class= "modal-footer" >
                <button type= "button" class= "btn btn-default" data-dismiss= "modal" onclick= "initalAddForm();" >
                    <i class= "icon-undo" aria-hidden= "true" ></i>返回
                </button>
                <button type= "button" class= "btn btn-primary" onclick= "add('addForm');" >
                    <i class= "icon-save" aria-hidden= "true" ></i>保存
                </button>
            </div>
        </div>
    </div>
</div>
<script >
function isDisplay() {
if($("#woType").val()=="NOMSC"||$("#woType").val()=="OMSC"){
$("#bjid").removeAttr("style");
}else {
$("#bjid").attr("style","display: none");
}
if($("#woType").val()=="WTC00008"){
$("#cuoluofa").removeAttr("style");
}else {
$("#mistakeProductCountyz").attr("validation","1");
$("#mistakeBarcodeyz").attr("validation","1");
$("#cuoluofa").attr("style","display: none");
}

}

</script>