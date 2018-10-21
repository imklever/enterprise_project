<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<%@ include file="yuriy.jsp" %>
	<!-- css -->
	<link rel="stylesheet" href="${root}css/jquery-ui.main.css">
	<link rel="stylesheet" href="${root}css/jquery.mobile-1.3.2.min.css">
	<link rel="stylesheet" href="${root}css/ui-dialog.css">
	<!-- js -->
	<script src="${root }js/jquery-1.8.3.min.js"></script>
	<script src="${root }js/jquery.mobile-1.3.2.min.js"></script>
	<script src="${root }js/jquery.min.js"></script>
	<script src="${root }js/jquery-ui.min.js"></script>
	<script src="${root}js/dialog.js"></script>
	<script src="${root}js/dialog-min.js"></script>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>宝尊电商-登记</title>
		<style type="text/css">
			textarea.ui-input-text { min-height: 90px; };
		</style>
		<style type="text/css">
			.opendiv {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: 75px;
				margin-top: -203px;
				width: 125px;
				height: 120px;
				border:1px;
				border-color:blue;
				text-align: center;
				padding-top: 20px;
				solid:#F00;
			}
			.main {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: -150px;
				margin-top: -250px;
				width: 200px;
				height: 200px;
				border:1px;
				text-align: center;
				padding-top: 20px;
				solid:#F00;
			}
			.main2 {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: 260px;
				margin-top: -250px;
				width: 100px;
				height: 140px;
				border:1px;
				text-align: center;
				solid:#F00;
			}
			</style>
	</head>

	<body>
		<div data-role="page" id="pageone" style="vertical-align:middle;" align="center">
			<div data-role="header" data-theme="b">
				<div style="height: 60px;">
					<div style="display: inline;float: left;"><h3>&nbsp;&nbsp;[Visitor information management system]访客信息管理系统</h3></div>
					<div style="display: inline;float: right;margin-right: 10px;"><img alt="log" src="${root}img/baozun.png" style="height: 60px;width: 160px;"></div>
					<div style="display: inline;float: right;margin-right: 10px;margin-top: 25px;">欢迎,${session_user.name}｜<a href="javascript:void();" onclick="out_login();">[退出]</a></div>
				</div>
			</div>
			<!-- 公共的拍照区域代码 -->
			<div style="display: none;" id="publicDiv">
				<div style="width: 600px;height: 400px;" >
									<div class="main2" style="width: 200px;height: 240px;display: inline;background-color: #838B83;">
										<canvas id="canvas" width="200px" height="240px"></canvas>
									</div>
									<div style="width: 100%;height: 240px;">
										<div class="main"  style="width: 200px;height: 220px;margin-left: 35px;display: inline;background-color: #838B83;">
											<video id="video" style='width:200px;height:200px;' autoplay></video>
										</div>
										<div class="opendiv" style="BORDER-RIGHT: 2px dashed;border-right-color:#87CEEB	; BORDER-TOP: 2px dashed;border-top-color:#87CEEB; BORDER-LEFT: 2px dashed;border-left-color:#87CEEB; BORDER-BOTTOM: 2px dashed;border-bottom-color:#87CEEB; "></div>
									</div>
				</div>
		        <div style="width: 200px;margin-left: 160px;margin-bottom: 10px;">
									<input id='picture'  tabindex="10" type="button"  value="拍照/重拍" />
				</div>
			</div>
			<div style="width: 1200px;height: 400px;margin-top: 20px;" id="bodys" name="bodys">
				<table width="100%">
						<tr height="35px;">
						<td width="5.5%">访客类型:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Type)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<select name="visitorType" id="visitorType" onclick="selectType();">
											<option value="01">个人</option>
											<option value="02">团体</option>
										</select>
									</div>
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td></tr>
					</table>
					<!-- 拍照次数 -->
					<input id="pzid" name="pzid" type="hidden" value="0" />
					<input type="hidden" id="addressName" value="${addressName}" /> <!-- 根据登陆地址名称进行分流老模板新模板 -->
					<form id="sign_main" name="sign_main">
					<table width="100%" id = "table1">
						<tr height="35px;">
							<td width="15%">访客姓名:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Name)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<input id="visitor_name" name="visitor_name" type="text" tabindex="1"/>
									</div>
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
							<td rowspan="7" width="45%">
								<div id="sign1"></div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">联系电话:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Phone Number)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<input id="visitor_phone" name="visitor_phone"  tabindex="2" type="text"/>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">工作单位:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Company Name)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
									<div  class="ui-block-a" style="width: 300px;">
										<input id="visitor_company_name" name="visitor_company_name"  tabindex="3" type="text"/>
									</div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">拜访对象:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Host)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
										<input type="hidden" id="visit_obj" name="visit_obj" />
									  	<input id="host" name="host"  tabindex="4" />
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">拜访人数:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Number)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
									  	<input type="text" name="visitorNum"  value="1" readonly="readonly"/>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">车牌号:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(License Plate Number)</td>
							<td width="40%">
								<div style="width: 300px;">
									<div style="float: left;">
										<fieldset data-role="controlgroup" data-type="horizontal">
									        <input type="radio" name="license_plate_number_flag" id="license_plate_number_flaga" onfocus="lpn_y();" value="1" >
									        <label id="laba" name="laba" for="license_plate_number_flaga" onclick="lpn_n();">Y</label>
									        <input type="radio" name="license_plate_number_flag" id="license_plate_number_flagb" onfocus="lpn_n();" value="0" checked="checked">
									        <label id="labb" name="labb" for="license_plate_number_flagb" onclick="lpn_y();">N</label>
									    </fieldset>
									</div>
									<div style="width: 180px;float: right;margin-top: 5px;">
										<input id="license_plate_number" name="license_plate_number" required="required" tabindex="7" type="text" value="---无---" readonly="readonly"/>
									</div>
								</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">事由:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Content)</td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<select id="content" name="content" tabindex="8" onclick="choose();">
											<option value="商务洽谈">商务洽谈(Business Negotiation)</option>
											<option value="供应商">供应商(Supplier)</option>
											<option value="新员工入职">新员工入职(New Employee Orientation)</option>
											<option value="面试">面试(Interview)</option>
											<option value="未带门卡">未带门卡(Without A Card)</option>
											<option value="物业">物业(Property)</option>
										</select>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">应聘岗位:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Position)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
									  	<input id="applyFor" name="applyFor" tabindex="4" />
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;display: none;" id = "mustSign">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="100px;">
							<td width="15%">备注:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Remark)</td>
							<td width="40%">
								<div style="width: 300px;">
									<textarea id="remark" name="remark" rows="6" cols="" tabindex="9" style="resize:none"></textarea>
								</div>
							</td>
						</tr>
						<tr height="30px;" align="center">
							<td colspan="2" align="right">
							</td>
							<td colspan="7" align="left">
							</td>
						</tr>
						<tr height="35px;" align="center">
							<td colspan="9" align="center">
								<div style="width: 750px;height: 30px;">
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input type="button"  tabindex="11" onclick="save();" value="保存并打印" />
									</div>
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input type="button"  tabindex="11" onclick="next_save();" value="添加同行人" />
									</div>
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input  type="button" tabindex="12" onclick="sign();" value="重置"/>
									</div>
								</div>
							</td>
						</tr>
					</table>
					</form>
					<form id="fillForm" name="fillForm">
					<table width="100%" id = "table2" style="display: none;">
						<tr height="35px;">
							<td width="15%">工作单位:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Company Name)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
									<div  class="ui-block-a" style="width: 300px;">
										<input id="visitorCompanyName" name="visitor_company_name"  tabindex="3" type="text"/>
									</div>
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
							<td rowspan="7" width="45%">
								<div id="sign2"></div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">拜访人数:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Visitor Number)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
									  	<input type="text" id="visitorNum" name="visitorNum"/>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">联系电话:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Phone Number)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<input id="visitorPhone" name="visitor_phone"  tabindex="2" type="text"/>
									</div>
								
					               <!--  <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div> -->
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">拜访对象:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Host)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
										<input type="hidden" id="visit_obj" name="visit_obj" />
									  	<input id="host2" name="host"  tabindex="4" />
									</div>
								
					                <!-- <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div> -->
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">事由:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Content)</td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<select id="content2" name="content" tabindex="8">
											<option value="商务洽谈">商务洽谈(Business Negotiation)</option>
											<option value="供应商">供应商(Supplier)</option>
											<option value="新员工入职">新员工入职(New Employee Orientation)</option>
											<!-- <option value="4">面试(Interview)</option> -->
											<option value="未带门卡">未带门卡(Without A Card)</option>
											<option value="物业">物业(Property)</option>
										</select>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<!-- <tr height="35px;">
							<td width="15%">应聘岗位:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Position)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;z-index: 999">
									  	<input id="applyFor2" name="applyFor" tabindex="4" />
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr> -->
						<tr height="100px;">
							<td width="15%">备注:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Remark)</td>
							<td width="40%">
								<div style="width: 300px;">
									<textarea id="remark2" name="remark" rows="6" cols="" tabindex="9" style="resize:none"></textarea>
								</div>
							</td>
						</tr>
						<tr height="100px;" align="center">
							<td colspan="2" align="right">
							</td>
							<td colspan="7" align="left">
							</td>
						</tr>
						<tr height="100px;" align="center">
							<td colspan="9" align="center">
								<div style="width: 750px;height: 30px;">
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input type="button"  tabindex="11" onclick="save();" value="保存并打印" />
									</div>
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input type="button"  tabindex="11" onclick="next_save();" value="添加同行人" />
									</div>
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input  type="button" tabindex="12" onclick="sign();" value="重置"/>
									</div>
								</div>
							</td>
						</tr>
						</table>
				</form>
			</div>
			<div data-role="footer"  data-theme="b" data-position="fixed">
			    <div data-role="navbar" data-iconpos="left">
			      <ul>
			        <li><a href="javascript.void();" onclick="main_list();" data-icon="home">主&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
			        <li><a href="javascript.void();" onclick="address()" data-icon="check">地&nbsp;&nbsp;&nbsp;&nbsp;址</a></li>
			        <li><a href="javascript.void();" onclick="sign_out();" data-icon="info">签&nbsp;&nbsp;&nbsp;&nbsp;出</a></li>
			        <li><a href="javascript.void();" onclick="detailed_list()" data-icon="info">查&nbsp;看&nbsp;记&nbsp;录</a></li>
			      </ul>
			    </div>
			</div>
		</div>
	</body>
	<script type="text/javascript">
	$(function() {
		var publicDiv = $("#publicDiv").show();
		$("#sign1").html(publicDiv);
	});
	
	function selectType() { //根据下拉选择01或者02显示不同的内容
		var publicDiv = $("#publicDiv").show(); //此处是公共的拍摄区域代码
		var visitorType = $("#visitorType option:selected").val();
		if(visitorType == "02"){
			$("#sign1 div.publicDiv").remove(); //切换团体时移除个体表单中的拍摄区域
			$("#sign2").html(publicDiv);
			$("#table1").hide(); 
			$("#table2").show(); 	
		}else{
			$("#sign2 div.publicDiv").remove(); //切换个体时移除团体表单中的拍摄区域
			$("#sign1").html(publicDiv);
			$("#table2").hide(); 
			$("#table1").show(); 	
		}
	}
	
	/** 根据事由值来显示岗位必填符号 **/
	function choose() {
		var content = $("#content option:selected").val(); //获取事由下拉选的值
		if(content == '面试'){
			$("#mustSign").show();
		}else{
			$("#mustSign").hide();
		}
	}
	//验证团体和个体内容必填项
	function valite() {
		var visitorType = $("#visitorType option:selected").val();
		var phonePattern = /^[\u4e00-\u9fa5]+$/;  //输入中文
		var patten = /^[A-Za-z.\u4e00-\u9fa5]+$/; //只能输入中文字母小数点
		if(visitorType == "02"){
			var companyName = $("#visitorCompanyName").val();
			if(companyName == null || companyName == "" ){
				showModal("工作单位不能为空！");
				document.getElementById("visitorCompanyName").focus();
				return false;
			}
			var visitorNum = $("#visitorNum").val();
			if(visitorNum == null || visitorNum == ""){
				showModal("拜访人数不能为空！");
				document.getElementById("visitorNum").focus();
				return false;
			}
			if(visitorNum < 3 || visitorNum > 15){
				showModal("拜访人数应不小于3不大于15！");
				document.getElementById("visitorNum").focus();
				return false;
			}
			var phone = $("#visitorPhone").val();
			if((phone != null && phone != "") && phone.match(phonePattern)){
				showModal("联系电话不能输入中文!");
				document.getElementById("visitorPhone").focus();
		    	return false;
			}
			if((phone != null && phone != "") && phone.length > 40){
				showModal("联系电话长度不能超过40!");
				document.getElementById("visitorPhone").focus();
		    	return false;
			}
			var host2 = $("#host2").val();
			if((host2 != null && host2 != "") && !host2.match(patten)){
				showModal("拜访对象只能输入字母汉字小数点!");
				document.getElementById("host2").focus();
				return false;
			}
			if((host2 != null && host2 != "") && host2.length > 50){
				showModal("拜访对象长度不能超过50!");
				document.getElementById("host2").focus();
				return false;
			}
			/* var content2 = $("#content2 option:selected").val(); //获取事由下拉选的值
			var applyFor2 = $("#applyFor2").val();
			if(content2 == '4' && (applyFor2 == null || applyFor2 == "")){
				showModal("应聘职位不能为空！");
				return false;
			} */
			return true;
		}else{
			var content = $("#content option:selected").val(); //获取事由下拉选的值
			var visitor_name = $("#visitor_name").val();
		    var visitor_phone = $("#visitor_phone").val();
		    var host = $("#host").val();
		    var visitor_company_name = $("#visitor_company_name").val();
		    var license_plate_number_flag = $("#license_plate_number_flag").val();
		    var content = $("#content").val();
			if (visitor_name == null || visitor_name == undefined || visitor_name == ''){
				showModal("访客姓名不能为空!");
		    	document.getElementById("visitor_name").focus();
		    	return false;
		    }
			if(!visitor_name.match(patten)){
				showModal("访客姓名只能输入字母汉字小数点!");
		    	document.getElementById("visitor_name").focus();
		    	return false;
			}
			if(visitor_name.length > 40){
				showModal("访客姓名长度不能超过40!");
				document.getElementById("visitor_name").focus();
		    	return false;
			}
			if(visitor_phone == null || visitor_phone == undefined || visitor_phone == ''){
				showModal("联系电话不能为空!");
		    	$('#visitor_phone').focus();
		    	return false;
		    }
			if(visitor_phone.match(phonePattern)){
				showModal("联系电话不能输入中文!");
		    	$('#visitor_phone').focus();
		    	return false;
			}
			if(visitor_phone.length > 40){
				showModal("联系电话长度不能超过40!");
		    	$('#visitor_phone').focus();
		    	return false;
			}
			if(host == null || host == undefined || host == ''){
				showModal("拜访对象不能为空!");
		    	document.getElementById("host").focus();
		    	return false;
		    }
			if(!host.match(patten)){
				showModal("拜访对象只能输入字母汉字小数点!");
				document.getElementById("host").focus();
				return false;
			}
			if(host.length > 50){
				showModal("拜访对象长度不能超过50!");
				document.getElementById("host").focus();
		    	return false;
			}
			if(content == null || content == undefined || content == '') { 
				showModal("事由不能为空!");
		    	document.getElementById("content").focus();
		    	return false;
		    }
			var applyFor = $("#applyFor").val();
			if(content == '面试' && (applyFor == null || applyFor == "")){
				showModal("应聘职位不能为空！");
				return false;
			}
			return true;
		}
	}
	function showModal(content) {
		var d = dialog({
			title : '提示',
			content : content,
			lock : true,
			ok : function(){}
		});
		d.showModal();
	}
		
	function yuriy_ajx(obj,msg){
		if(obj.attr("id")=='visitor_name'){
			var visitor_name = msg.substring(0,msg.indexOf("/"));
			var a = msg.substring(msg.indexOf("/")+1,msg.length);
			var visitor_phone = a.substring(0,a.indexOf("/"));
			var visitor_company_name = a.substring(a.indexOf("/")+1,a.length);;
			$("#visitor_name").val(visitor_name);
			$("#visitor_phone").val(visitor_phone);
			$("#visitor_company_name").val(visitor_company_name);
	    	document.getElementById("host").focus();
		}
//			if(obj.attr("id")=='host'){
//		    	document.getElementById("license_plate_number_flagb").focus();
//			}
	}
	function yz(){
		var host = $("#host").val();
		var list = host.split("/");
		if(list.length!=4){
	    	alert("拜访对象错误,请[选择]拜访对象!");
	    	$('#host').val("");
	    	document.getElementById("host").focus();
		}
	}
	<!--自动补全-->
	$(function() {
		<!--访客信息-->
    	var visitor_names = ${visitor_names};
    	var hosts = ${hosts};
    	$("#visitor_name").autocomplete({
      		source: visitor_names
		});
    	$("#host").autocomplete({
      		source: hosts
		});
		});
	
	function save(){
		if(!valite()){ //验证必填项
			return;
		}
	    var image = new Image();
	    var data = canvas.toDataURL();
	    var imageDateB64 = data.substring(22);
	    var visitorType = $("#visitorType option:selected").val(); //用作区分团体和个体并分别提交表单
	    var addressName = $("#addressName").val(); //登陆地址名称
	    if($("#pzid").val() == 0){
			    	var flag = confirm("没有拍照,是否打印!");
			    	if(flag){
			    		if(visitorType == "01"){
			    		$.ajax({
							type: "POST",  
							url: root+"/control/mainController/saveSign.do?",  
							//我们用text格式接收  
							//dataType: "text",   
							//json格式接收数据  
							dataType: "json",  
							data: $.param({
								'visitorType' : visitorType
							}) + '&' + $('#sign_main').serialize()+"&imageDataurl=" + imageDateB64,
							cache : false,
							async : false,
							success: function (data) {
								if(data.code='200'){
									$('#sign_main')[0].reset();
									context.clearRect(0,0,200,260);
									if(addressName == '智汇园'){ //只有在地址名称是智汇园时才调用新模板
										$.ajax({ //新模板打印信息
											type : "POST",
											url : "${root}control/mainController/toNewPrinter.do",  
											data : {"visitorData" : data.msg},
											dataType: "JSON",  
											success : function(data) {
												if(data.msg == 'success'){
													showModal("保存且打印成功！");
												}else{
													showModal("保存成功但打印失败！");
												}
											}
										});
									}else{ //老模板打印信息
										window.open("${root}control/mainController/toPrintPage.do?data="+data.msg, "windowName", "height=600, width=600, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
									}
								}
							}  
						}); 
			    }else{
			    	$.ajax({
						type: "POST",  
						url: root+"/control/mainController/saveSign.do?",  
						//我们用text格式接收  
						//dataType: "text",   
						//json格式接收数据  
						dataType: "json",  
						data: $.param({
							'visitorType' : visitorType
						}) + '&' + $('#fillForm').serialize()+"&imageDataurl=" + imageDateB64,
						cache : false,
						async : false,
						success: function (data) {
							if(data.code='200'){
								$('#fillForm')[0].reset();
								context.clearRect(0,0,200,260);
								if(addressName == '智汇园'){
									$.ajax({ //新模板打印信息
										type : "POST",
										url : "${root}control/mainController/toNewPrinter.do",  
										data : {"visitorData" : data.msg},
										dataType: "JSON",  
										success : function(data) {
											if(data.msg == 'success'){
												showModal("保存且打印成功！");
											}else{
												showModal("保存成功但打印失败！");
											}
										}
									});
								}else{ //老模板打印信息
									window.open("${root}control/mainController/toPrintPage.do?data="+data.msg, "windowName", "height=600, width=600, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
								}
							}
						}  
					});
			    }
			 }
	    }else{
	    	if(visitorType == "01"){
		    	$.ajax({  
					type: "POST",  
					url: root+"/control/mainController/saveSign.do?",  
					//我们用text格式接收  
					//dataType: "text",   
					//json格式接收数据  
					dataType: "json",  
					data: $.param({
						'visitorType' : visitorType
					}) + '&' + $('#sign_main').serialize()+"&imageDataurl=" + base64encode(utf16to8(imageDateB64)),
					cache : false,
					async : false,
					success: function (data) { 
						if(data.code='200'){
							$('#sign_main')[0].reset();
							context.clearRect(0,0,200,260);
							if(addressName == '智汇园'){
								$.ajax({ //新模板打印信息
									type : "POST",
									url : "${root}control/mainController/toNewPrinter.do",  
									data : {"visitorData" : data.msg},
									dataType: "JSON",  
									success : function(data) {
										if(data.msg == 'success'){
											showModal("保存且打印成功！");
										}else{
											showModal("保存成功但打印失败！");
										}
									}
								});
							}else{ //老模板打印信息
								window.open("${root}control/mainController/toPrintPage.do?data="+data.msg, "windowName", "height=600, width=600, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
							}
						}
					}  
				}); 
	    }else{
	    	$.ajax({
				type: "POST",  
				url: root+"/control/mainController/saveSign.do?",  
				//我们用text格式接收  
				//dataType: "text",   
				//json格式接收数据  
				dataType: "json",  
				data: $.param({
					'visitorType' : visitorType
				}) + '&' + $('#fillForm').serialize()+"&imageDataurl=" + base64encode(utf16to8(imageDateB64)),
				cache : false,
				async : false,
				success: function (data) {
					if(data.code='200'){
						$('#fillForm')[0].reset();
						context.clearRect(0,0,200,260);
						if(addressName == '智汇园'){
							$.ajax({ //新模板打印信息
								type : "POST",
								url : "${root}control/mainController/toNewPrinter.do",  
								data : {"visitorData" : data.msg},
								dataType: "JSON",  
								success : function(data) {
									if(data.msg == 'success'){
										showModal("保存且打印成功！");
									}else{
										showModal("保存成功但打印失败！");
									}
								}
							});
						}else{ //老模板打印信息
							window.open("${root}control/mainController/toPrintPage.do?data="+data.msg, "windowName", "height=600, width=600, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
						}
					}
				}  
			});
	    }
	  }
	}
	function next_save(){
		var visitorType = $("#visitorType option:selected").val(); //用作区别个体和团体
		$.ajax({
			type: "POST",  
			url: root+"/control/mainController/next_save.do?",  
			//我们用text格式接收  
			//dataType: "text",   
			//json格式接收数据  
			dataType: "json",  
			data: null,
			cache : false,
			async : false,
			success: function (data) {
				if(data.code='200'){
					if(visitorType == '01'){
						 $("#host").val(data.list.host);
						 $("#visitor_company_name").val(data.list.visitor_company_name);
						 $("#remark").val(data.list.remark);
					}else{
						 $("#host2").val(data.list.host);
						 $("#visitorCompanyName").val(data.list.visitor_company_name);
						 $("#remark2").val(data.list.remark);
					}
				}else{
				   alert("暂无同行人!");
				}
			}  
		}); 
	}
	function address() {
		window.location.href="${root}control/addressControl/addressList.do";
	}
	function sign() {
		window.location.href="${root}control/mainController/sign.do";
	}
	function sign_out() {
		window.location.href="${root}control/mainController/sign_out.do";
	}
	function detailed_list() {
		window.location.href="${root}control/mainController/detailed_list.do";
	}
	function main_list() {
		window.location.href="${root}control/mainController/main_list.do";
	}
	function out_login() {
		window.location.href="${root}control/userController/outLogin.do";
	}
	function lpn_y(){
		$("#license_plate_number").val("---无---")
	  	$("#license_plate_number").attr("disabled",true);
    	document.getElementById("content").focus();
		var host = $("#host").val();
		var list = host.split("/");
//			if(list.length!=4){
//		    	alert("拜访对象错误,请[选择]拜访对象!");
//			}
    	document.getElementById("content").focus();
	  	$("#license_plate_number_flagb").attr("checked","checked");
	}
	function lpn_n(){
	  	$("#license_plate_number").removeAttr("disabled");
	  	$("#license_plate_number").removeAttr("readonly");
		$("#license_plate_number").val("")
    	document.getElementById("license_plate_number").focus();
		var host = $("#host").val();
		var list = host.split("/");
//			if(list.length!=4){
//		    	alert("拜访对象错误,请[选择]拜访对象!");
//		  	}
		
    	document.getElementById("license_plate_number").focus();
	  	$("#license_plate_number_flaga").attr("checked","checked");
	}
	$(document).ready(function(){$('input[type=text]:first').focus();});
	
	
		var context = canvas.getContext("2d");
		//当DOM树构建完成的时候就会执行DOMContentLoaded事件  
		window.addEventListener("DOMContentLoaded", function() {
			//获得Canvas对象  
			var canvas = document.getElementById("canvas");
			//获得video摄像头区域  
			var video = document.getElementById("video");
			var videoObj = {
				"video" : true
			};
			var errBack = function(error) {
				console.log("Video capture error: ", error.code);
			};
			//获得摄像头并显示到video区域  
			if (navigator.getUserMedia) {
				// Standard  
				navigator.getUserMedia(videoObj, function(stream) {
					video.src = stream;
					video.play();
				}, errBack);
			} else if (navigator.webkitGetUserMedia) {
				// WebKit-prefixed 
				navigator.webkitGetUserMedia(videoObj, function(stream) {
// 					video.src = window.webkitURL.createObjectURL(stream);
					video.play();
				}, errBack);
			} else if (navigator.mozGetUserMedia) {
				// Firefox-prefixed  
				navigator.mozGetUserMedia(videoObj, function(stream) {
					video.src = window.URL.createObjectURL(stream);
					video.play();
				}, errBack);
			}
		}, false);
		// 触发拍照动作  
		document.getElementById("picture").addEventListener("click", function() {
			$("#pzid").val(parseInt($("#pzid").val())+1);
			<!--context.drawImage(img,sx,sy,swidth,sheight,x,y,width,height); -->
// 			img	规定要使用的图像、画布或视频。
// 			sx	可选。开始剪切的 x 坐标位置。
// 			sy	可选。开始剪切的 y 坐标位置。
// 			swidth	可选。被剪切图像的宽度。
// 			sheight	可选。被剪切图像的高度。
// 			x	在画布上放置图像的 x 坐标位置。
// 			y	在画布上放置图像的 y 坐标位置。
// 			width	可选。要使用的图像的宽度。（伸展或缩小图像）
// 			height	可选。要使用的图像的高度。（伸展或缩小图像）
		    context.drawImage(video,130,0,4000,5600, 0, 0,2000,2800);
		});
	</script>
</html>