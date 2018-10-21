<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<%@ include file="/base/yuriy.jsp" %>
		<title>OP</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<script type="text/javascript" src="<%=basePath %>js/selectFilter.js"></script>
		<script type="text/javascript" src="<%=basePath %>js/henrySelectFilter.js"></script>
		<script type='text/javascript'>
	
		$(document).ready(function() {
			$('#provice_code').bind('change',function(){
				if(this.value==''){
					$('#city_code').html('<option value="">---请选择---</option>');
					$('#state_code').html('<option value="">---请选择---</option>');	
				}
				$.post('${root}control/orderPlatform/waybillMasterController/getArea.do?area_code='+this.value,function(data){	
					if(data.toString()=='[object XMLDocument]'){
						  window.location='/BT-OP';
							return;
					  };
			    if(data.nodeName=='#document')toMain();		
				var  htmlStr='<option value="">---请选择---</option>';
				$.each(data.area,function(index,item){
					htmlStr=htmlStr+'<option value='+this.area_code+'>'+this.area_name+'</option>';		
				});
				$('#city_code').html(htmlStr);
				$('#state_code').html('<option value="">---请选择---</option>');
				});
				
				var city_code=document.getElementById("city_code").value;
				if(city_code=="" ||city_code==null ||city_code==undefined){
					$("#span_city_code").show();
				}else{
					$("#span_city_code").hide();
				}
				var state_code=document.getElementById("state_code").value;
				if(state_code=="" ||state_code==null ||state_code==undefined){
					$("#span_state_code").show();
				}else{
					$("#span_state_code").hide();
				}
				
				var provice_code=document.getElementById("provice_code").value;
				if(provice_code=="" ||provice_code==null ||provice_code==undefined){
					$("#span_provice_code").show();
				}else{
					$("#span_provice_code").hide();
				}
			});
			$('#city_code').bind('change',function(){
				if(this.value==''){
					$('#state_code').html('<option value="">---请选择---</option>');	
				}
				$.post('${root}control/orderPlatform/waybillMasterController/getArea.do?area_code='+this.value,function(data){
					if(data.toString()=='[object XMLDocument]'){
						  window.location='/BT-OP';
							return;
					  };
				if(data.nodeName=='#document')toMain();
				var  htmlStr='<option value="">---请选择---</option>';
				$.each(data.area,function(index,item){
					htmlStr=htmlStr+'<option value='+this.area_code+'>'+this.area_name+'</option>';		
				});
				$('#state_code').html(htmlStr);
				});
				
				var city_code=document.getElementById("city_code").value;
				if(city_code=="" ||city_code==null ||city_code==undefined){
					$("#span_city_code").show();
				}else{
					$("#span_city_code").hide();
				}
				var state_code=document.getElementById("state_code").value;
				if(state_code=="" ||state_code==null ||state_code==undefined){
					$("#span_state_code").show();
				}else{
					$("#span_state_code").hide();
				}
			});
			
			
			$('#state_code').bind('change',function(){
				var state_code=document.getElementById("state_code").value;
				if(state_code=="" ||state_code==null ||state_code==undefined){
					$("#span_state_code").show();
				}else{
					$("#span_state_code").hide();
				}
			
			});
			
			
			$('#org_provice_code').bind('change',function(){
				if(this.value==''){
					$('#org_city_code').html('<option value="">---请选择---</option>');
					$('#org_state_code').html('<option value="">---请选择---</option>');	
				}
				$.post('${root}control/orderPlatform/waybillMasterController/getArea.do?area_code='+this.value,function(data){	
					if(data.toString()=='[object XMLDocument]'){
						  window.location='/BT-OP';
							return;
					  };
			    if(data.nodeName=='#document')toMain();		
				var  htmlStr='<option value="">---请选择---</option>';
				$.each(data.area,function(index,item){
					htmlStr=htmlStr+'<option value='+this.area_code+'>'+this.area_name+'</option>';		
				});
				$('#org_city_code').html(htmlStr);
				$('#org_state_code').html('<option value="">---请选择---</option>');
				});
				
				
				var org_state_code=document.getElementById("org_state_code").value;
				if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
					$("#span_org_state_code").show();
				}else{
					$("#span_org_state_code").hide();
				}
				var org_city_code=document.getElementById("org_city_code").value;
				if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
					$("#span_org_city_code").show();
				}else{
					$("#span_org_city_code").hide();
				}
				var org_provice_code=document.getElementById("org_provice_code").value;
				if(org_provice_code=="" ||org_provice_code==null ||org_provice_code==undefined){
					$("#span_org_provice_code").show();
				}else{
					$("#span_org_provice_code").hide();
				}
			});
			$('#org_city_code').bind('change',function(){
				if(this.value==''){
					$('#org_state_code').html('<option value="">---请选择---</option>');	
				}
				$.post('${root}control/orderPlatform/waybillMasterController/getArea.do?area_code='+this.value,function(data){
					if(data.toString()=='[object XMLDocument]'){
						  window.location='/BT-OP';
							return;
					  };
				if(data.nodeName=='#document')toMain();
				var  htmlStr='<option value="">---请选择---</option>';
				$.each(data.area,function(index,item){
					htmlStr=htmlStr+'<option value='+this.area_code+'>'+this.area_name+'</option>';		
				});
				$('#org_state_code').html(htmlStr);
				});
				
				
				var org_state_code=document.getElementById("org_state_code").value;
				if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
					$("#span_org_state_code").show();
				}else{
					$("#span_org_state_code").hide();
				}
				var org_city_code=document.getElementById("org_city_code").value;
				if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
					$("#span_org_city_code").show();
				}else{
					$("#span_org_city_code").hide();
				}
			});
			
			$('#org_state_code').bind('change',function(){
				var org_state_code=document.getElementById("org_state_code").value;
				if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
					$("#span_org_state_code").show();
				}else{
					$("#span_org_state_code").hide();
				}
			});
			$('#expressCode').bind('change',function(){
				ExpressCodeChange("expressCode","producttype_name");
				var producttype_name=document.getElementById("producttype_name").value;
				if(producttype_name=="" ||producttype_name==null ||producttype_name==undefined){
					$("#span_producttype_name").show();
				}else{
					$("#span_producttype_name").hide();
				}
				var expressCode=document.getElementById("expressCode").value;
				if(expressCode=="" ||expressCode==null ||expressCode==undefined){
					$("#span_expressCode").show();
				}else{
					$("#span_expressCode").hide();
				}
				if(expressCode=="BSC"){
					var sendcode=document.getElementById("sendcode").value;
					if(sendcode=="" ||sendcode==null ||sendcode==undefined){
						$("#span_sendcode").show();
					}else{
						$("#span_sendcode").hide();
					}
				}else{
					$("#span_sendcode").hide();
				}
			});

			$('#pay_path').bind('change',function(){
				var pay_path=document.getElementById("pay_path").value;
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					$("#span_pay_path").show();
				}else{
					$("#span_pay_path").hide();
					if(pay_path==4){
						ToPayPath("cost_center");
					}else{
						$("#cost_center").next().attr("disabled", "disabled");
						$('#cost_center').next().attr("placeholder", "---请选择---");
						$('#cost_center').next().val(""); 
						$("#span_cost_center").hide();
					}
				}
				
			});
			$('#cost_center').bind('change',function(){
				var cost_center=document.getElementById("cost_center").value;
				if(cost_center=="" ||cost_center==null ||cost_center==undefined){
					$("#cost_center").next().attr("disabled", "disabled");
					$('#cost_center').next().attr("placeholder", "---请选择---");
					$('#cost_center').next().val(""); 
					$("#span_cost_center").hide();
					//$("#span_cost_center").show();
				}else{
					$("#span_cost_center").hide();
				}
			});
			$('#producttype_name').bind('change',function(){
				var producttype_name=document.getElementById("producttype_name").value;
				if(producttype_name=="" ||producttype_name==null ||producttype_name==undefined){
					$("#span_producttype_name").show();
				}else{
					$("#span_producttype_name").hide();
				}
			});
			
			/* $('#to_orgnization').bind('change',function(){
				ToOrgnizationChange("to_orgnization","org_provice_code","org_city_code","org_state_code","to_street","to_contacts","to_phone","to_address");
				var org_state_code=document.getElementById("org_state_code").value;
				if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
					$("#span_org_state_code").show();
				}else{
					$("#span_org_state_code").hide();
				}
				var org_city_code=document.getElementById("org_city_code").value;
				if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
					$("#span_org_city_code").show();
				}else{
					$("#span_org_city_code").hide();
				}
				var org_provice_code=document.getElementById("org_provice_code").value;
				if(org_provice_code=="" ||org_provice_code==null ||org_provice_code==undefined){
					$("#span_org_provice_code").show();
				}else{
					$("#span_org_provice_code").hide();
				}
				
				var to_address=document.getElementById("to_address").value;
				if(to_address=="" ||to_address==null ||to_address==undefined){
					$("#span_to_address").show();
				}else{
					$("#span_to_address").hide();
				}
				var to_phone=document.getElementById("to_phone").value;
				if(to_phone=="" ||to_phone==null ||to_phone==undefined){
					$("#span_to_phone").show();
				}else{
					$("#span_to_phone").hide();
				}
				var to_contacts=document.getElementById("to_contacts").value;
				if(to_contacts=="" ||to_contacts==null ||to_contacts==undefined){
					$("#span_to_contacts").show();
				}else{
					$("#span_to_contacts").hide();
				}
			}); */
		});
		
		function ToPayPath(cost_center){
			cost_center= "#" +cost_center;
			$(cost_center).next().attr("disabled", false);
			document.getElementById('cost_center').value="";
			$("#span_cost_center").show();
		}
		
		
		/* function ToOrgnizationChange(to_orgnization, org_provice_code, org_city_code, org_state_code,to_street ,to_contacts ,to_phone, to_address){
			to_orgnization= "#" +to_orgnization;
			org_provice_code= "#" +org_provice_code;
			org_city_code= "#" +org_city_code;
			org_state_code= "#" +org_state_code;
			to_street= "#" +to_street;
			to_contacts= "#" +to_contacts;
			to_phone= "#" +to_phone;
			to_address= "#" +to_address;
			var to_orgnization = document.getElementById('to_orgnization').value;
			if(to_orgnization==""){
				$(org_provice_code).val("");
				$(org_city_code).val("");
				$(org_state_code).val("");
				$(to_street).val("");
				$(to_contacts).val("");
				$(to_phone).val("");
				$(to_address).val("");
				$(org_provice_code).next().val("");
				$(org_provice_code).next().attr("placeholder", "---请选择---");
				$(org_city_code).next().val("");
				$(org_city_code).next().attr("placeholder", "---请选择---");
				$(org_city_code).next().attr("disabled", "disabled");
				$(org_state_code).next().val("");
				$(org_state_code).next().attr("placeholder", "---请选择---");
				$(org_state_code).next().attr("disabled", "disabled");
			}
			else{
				$.ajax({
					url : "${root}control/orderPlatform/organizationInformationController/toOrgnization.do",
					type : "post",
					data : {
						"org_name" : to_orgnization
					},
					dataType : "json",
					async : false, 
					success : function(result) {
						$(org_provice_code).next().attr("disabled", false);
						$(org_provice_code).children(":first").siblings().remove();
						$(org_provice_code).siblings("ul").children(":first").siblings().remove();
						$(org_city_code).next().attr("disabled", false);
						$(org_city_code).children(":first").siblings().remove();
						$(org_city_code).siblings("ul").children(":first").siblings().remove();
						$(org_state_code).next().attr("disabled", false);
						$(org_state_code).children(":first").siblings().remove();
						$(org_state_code).siblings("ul").children(":first").siblings().remove();
						var content1 = '';
						var content2 = '';
						var content3 = '';
						var content4 = '';
						var content5 = '';
						var content6 = '';
						for(var i =0; i < result.areas.length; i++){
							if(result.areas[i].area_code==result.organizationInformation.org_province_code ){
								var t =i;
							}
							content1 += 
								'<option value="' 
								+ result.areas[i].area_code 
								+ '">'
								+result.areas[i].area_name 
								+'</option>'
							content2 += 
								'<li class="m-list-item" data-value="'
								+ result.areas[i].area_code
								+ '">'
								+ result.areas[i].area_name
								+ '</li>'
							}
					 	for(var x =0; x < result.city.length; x++){
					 		if(result.city[x].area_code==result.organizationInformation.org_city_code ){
								var c =x;
							}
							content3 += 
								'<option value="' 
								+ result.city[x].area_code 
								+ '">'
								+result.city[x].area_name 
								+'</option>'
							content4 += 
								'<li class="m-list-item" data-value="'
								+ result.city[x].area_code
								+ '">'
								+ result.city[x].area_name
								+ '</li>'
							}
						for(var y =0; y < result.state.length; y++){
							if(result.state[y].area_code==result.organizationInformation.org_state_code ){
								var s =y;
							}
							content5 += 
								'<option value="' 
								+ result.state[y].area_code 
								+ '">'
								+result.state[y].area_name 
								+'</option>'
							content6 += 
								'<li class="m-list-item" data-value="'
								+ result.state[y].area_code
								+ '">'
								+ result.state[y].area_name
								+ '</li>'
							} 
						
						 $(org_provice_code).next().val(result.areas[t].area_name );
						$(org_provice_code).next().attr("placeholder", result.areas[t].area_name );
						$(org_city_code).next().val(result.city[c].area_name);
						$(org_city_code).next().attr("placeholder", result.city[c].area_name);
						$(org_state_code).next().val(result.state[s].area_name);
						$(org_state_code).next().attr("placeholder", result.state[s].area_name);
						
						
						$(org_provice_code + " option:eq("+0+")").after(content1);
						$(org_provice_code + " option:eq("+(t+1)+")").attr("selected", true);
						$(org_provice_code).siblings("ul").children().eq(0).after(content2);
						$(org_provice_code).siblings("ul").children().eq(t+1).addClass("m-list-item-active");
						
						
					 	$(org_city_code + " option:eq(0)").after(content3);
						$(org_city_code + " option:eq("+(c+1)+")").attr("selected", true);
						$(org_city_code).siblings("ul").children().eq(0).after(content4);
						$(org_city_code).siblings("ul").children().eq(c+1).addClass("m-list-item-active"); 
						$(org_state_code + " option:eq(0)").after(content5);
						$(org_state_code + " option:eq("+(s+1)+")").attr("selected", true);
						$(org_state_code).siblings("ul").children().eq(0).after(content6);
						$(org_state_code).siblings("ul").children().eq(s+1).addClass("m-list-item-active"); 
						document.getElementById("to_street").value=result.organizationInformation.org_street;
						document.getElementById("to_contacts").value=result.organizationInformation.org_contacts;
						document.getElementById("to_phone").value=result.organizationInformation.org_phone;
						document.getElementById("to_address").value=result.organizationInformation.org_address;
					}
			});
		}
		} */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		function ExpressCodeChange(upper, lower,pay){
			upper = "#" + upper;
			lower = "#" +lower;
			pay = "#" +pay;
			var express_code = $(upper).val();
			$('#pay_path').next().attr("placeholder", "---请选择---");
			$('#pay_path').next().val(""); 
			$("#cost_center").next().attr("disabled", "disabled");
			$('#cost_center').next().attr("placeholder", "---请选择---");
			$('#cost_center').next().val(""); 
			document.getElementById("cost_center").value=""
			if(express_code == ""){
				$(lower).children(":first").siblings().remove();
				$(lower).val("");
				$(lower).next().val("");
				$(lower).next().attr("placeholder", "---请选择---");
				$(lower).next().attr("disabled", "disabled");
				$(pay).next().attr("disabled", "disabled");
				document.getElementById("pay_path").value=""
			} else {
				$(pay).next().attr("disabled", false);
				$.ajax({
					url : "${root}control/orderPlatform/transportProductTypeController/getProductTypeCode.do",
					type : "post",
					data : {
						"express_code" : express_code
					},
					dataType : "json",
					async : false, 
					success : function(result) {
						$(lower).next().attr("disabled", false);
						$(lower).children(":first").siblings().remove();
						$(lower).siblings("ul").children(":first").siblings().remove();
						var content1 = '';
						var content2 = '';
						for(var i =0; i < result.product.length; i++){
							content1 += 
								'<option value="' 
								+ result.product[i].product_type_code 
								+ '">'
								+result.product[i].product_type_name 
								+'</option>'
							content2 += 
								'<li class="m-list-item" data-value="'
								+ result.product[i].product_type_code
								+ '">'
								+ result.product[i].product_type_name
								+ '</li>'
						}
						$(lower).next().val("");
						$(lower).next().attr("placeholder", "---请选择---");
						$(lower + " option:eq(0)").after(content1);
						$(lower + " option:eq(0)").attr("selected", true);
						$(lower).siblings("ul").children(":first").after(content2);
						$(lower).siblings("ul").children(":first").addClass("m-list-item-active");
						var expressCode =document.getElementById("expressCode").value;
						if(expressCode=="SF"||expressCode=="SFSM"){
							$("#span_pay_path").show();
						}else{
							$("#span_pay_path").hide();
						}
						
					},
					error : function(result) {
						alert(result);
					}
				});
			}
		}
		
		function onchecks(){
		       var tb = document.getElementById("tableId");
		       var tr1 = tb.insertRow(tb.rows.length);
		       index= tb.rows.length;
		       var sku_code="sku_code"+(index-1);
		       var sku_name="sku_name"+(index-1);
		       var qty="qty"+(index-1);
		       var weight="weight"+(index-1);
		       var volumn="volumn"+(index-1);
		       var amount="amount"+(index-1);  
		       var td1 = tr1.insertCell();
		       td1.align = "center";
		       td1.innerHTML="<input id='ckb' name='ckb' type='checkbox' style='width: 30px;'>";    
		       var td3 = tr1.insertCell();
		       td3.innerHTML="<input type='text' style='width: 100px;'  name='sku_code' id='"+sku_code+"' class='sku_code_obj' />";
		       var td4 = tr1.insertCell();
		      td4.innerHTML="<input type='text' style='width: 100px;' name='sku_name' id='"+sku_name+"' class='sku_name_obj' />";
		       var td5 = tr1.insertCell();
		      td5.innerHTML="<input type='text' style='width: 100px;' onafterpaste='value=value.replace(/\D/g,'')' name='qty' id='"+qty+"' class='qty_obj' onblur='setStyleqty()'/>";
		       var td6 = tr1.insertCell();
		      td6.innerHTML="<input type='text' style='width: 100px;' onkeyup='value=value.replace(/[^\d\.]/g,'')' name='weight' id='"+weight+"' class='weight_obj' onblur='setStyleweight()'/>";
		      var td7 = tr1.insertCell();
		      td7.innerHTML="<input type='text' style='width: 100px;' onkeyup='value=value.replace(/[^\d\.]/g,'')' name='volumn' id='"+volumn+"' class='volumn_obj' onblur='setStylevolumn()'/>";
		      var td8 = tr1.insertCell();
		      td8.innerHTML="<input type='text' style='width: 100px;' onkeyup='value=value.replace(/[^\d\.]/g,'')' name='amount' id='"+amount+"' class='amount_obj' onblur='setStyleamount()'/>";
		      var td9 = tr1.insertCell();
		      td9.innerHTML="<input type='button' value='删除行' onclick='deleteRow(this);' style='width: 100px;'>";
		      index++;
		}
		function updateLogistics(){
			var from_orgnization=document.getElementById("from_orgnization").value;
			var status=document.getElementById("status").value;
			
			var expressCode=document.getElementById("expressCode").value;
			var producttype_name=document.getElementById("producttype_name").value;
			/* var to_orgnization=document.getElementById("to_orgnization").value; */
			var org_provice_code=document.getElementById("org_provice_code").value;
			var org_city_code=document.getElementById("org_city_code").value;
			var org_state_code=document.getElementById("org_state_code").value;
			
			var to_contacts=document.getElementById("to_contacts").value;
			var to_phone=document.getElementById("to_phone").value;
			var to_address=document.getElementById("to_address").value;
			var provice_code=document.getElementById("provice_code").value;
			var city_code=document.getElementById("city_code").value;
			var state_code=document.getElementById("state_code").value;
			var from_contacts=document.getElementById("from_contacts").value;
			var from_phone=document.getElementById("from_phone").value;
			var from_address=document.getElementById("from_address").value;
			if(status==0||status=="0"||status==2||status=="2"){
				alert("该状态下不能修改订单！");
				return false;
			}
			if(from_orgnization=="" ||from_orgnization==null ||from_orgnization==undefined){
				alert("发货机构为必填项，请重新输入");
				return false;
			}
			if(expressCode=="" ||expressCode==null ||expressCode==undefined){
				alert("快递公司必填项，请重新输入");
				return false;
			}
			if(producttype_name=="" ||producttype_name==null ||producttype_name==undefined){
				alert("快递业务类型必填项，请重新输入");
				return false;
			}
			if(org_provice_code=="" ||org_provice_code==null ||org_provice_code==undefined){
				alert("省必填项，请重新输入");
				return false;
			}
			if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
				alert("市必填项，请重新输入");
				return false;
			}
			if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
				alert("区必填项，请重新输入");
				return false;
			}
			if(to_contacts=="" ||to_contacts==null ||to_contacts==undefined){
				alert("收货人必填项，请重新输入");
				return false;
			}
			if(to_contacts.length>20){
				alert("收货人联系人名称长度过长，请重新输入");
				return false;
			}
			if(from_contacts.length>20){
				alert("发货人联系人名称长度过长，请重新输入");
				return false;
			}
			if(to_phone=="" ||to_phone==null ||to_phone==undefined){
				alert("收货人电话必填项，请重新输入");
				return false;
			}
			if(to_address=="" ||to_address==null ||to_address==undefined){
				alert("收货人地址必填项，请重新输入");
				return false;
			}
			if(to_address.length>35){
				alert("收货人地址过长，请重新输入");
				return false;
			}
			if(from_address.length>35){
				alert("发货人地址过长，请重新输入");
				return false;
			}
			if(provice_code=="" ||provice_code==null ||provice_code==undefined){
				alert("发货人省必填项，请重新输入");
				return false;
			}
			if(city_code=="" ||city_code==null ||city_code==undefined){
				alert("发货人市必填项，请重新输入");
				return false;
			}
			if(state_code=="" ||state_code==null ||state_code==undefined){
				alert("发货人区必填项，请重新输入");
				return false;
			}
			if(from_contacts=="" ||from_contacts==null ||from_contacts==undefined){
				alert("发货人必填项，请重新输入");
				return false;
			}
			if(from_phone=="" ||from_phone==null ||from_phone==undefined){
				alert("发货人电话必填项，请重新输入");
				return false;
			}
			if(from_address=="" ||from_address==null ||from_address==undefined){
				alert("发货人地址必填项，请重新输入");
				return false;
			}  
			if(expressCode=="BSC"){
				var sendcode=document.getElementById("sendcode").value;
				if(sendcode=="" ||sendcode==null ||sendcode==undefined){
					alert("当前快递寄件码必填，请输入");
					return false;
				}
			}
			if(expressCode=="SF"){
				var pay_path=document.getElementById("pay_path").value;
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					alert("当前快递类型必须选择支付方式");
					return false;
				}
			}
			if(expressCode=="SFSM"){
				var pay_path=document.getElementById("pay_path").value;
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					alert("当前快递类型必须选择支付方式");
					return false;
				}
			}
			if(pay_path==4){
				var cost_center=document.getElementById("cost_center").value;
				if(cost_center=="" ||cost_center==null ||cost_center==undefined){
					alert("当前支付方式必须选择成本中心");
					return false;
				}
			}
			if(amount_flag==1){
				var insured=document.getElementById("insured").value;
				if(insured=="" ||insured==null ||insured==undefined){
					alert("选择保价必须填写保价金额");
					return false;
				}
			}
			 /* var tb = document.getElementById("tableId"); //根据id找到这个表格
			 var rows = tb.rows; //取得这个table下的所有行  */
			 var tb = document.getElementsByClassName("sku_code_obj"); //根据id找到这个表格
			 var myRows = null;
			 var jsonArray= new Array();
			 var amount_flag = 0;
			 for(var i=0;i<tb.length;i++)//循环遍历所有的tr行 
			 { 
				 var cell1 =  document.getElementsByClassName("sku_code_obj")[i].value;
			 	 var cell2 =  document.getElementsByClassName("sku_name_obj")[i].value;
			 	 var cell3 =  document.getElementsByClassName("qty_obj")[i].value;
			 	if(cell3=="" ||cell3==null ||cell3==undefined||cell3==0){
					alert("件数必须大于0，请重新输入");
					return false;
				}  
				 var cell4 =  document.getElementsByClassName("weight_obj")[i].value;
				 var cell5 =  document.getElementsByClassName("volumn_obj")[i].value;
				 var cell6 =  document.getElementsByClassName("amount_obj")[i].value; 
				 if($("input[name='placenorder']:checked").length==1){
					 if(cell6=="" ||cell6==null ||cell6==undefined||cell6==0){
							alert("金额必须大于0，请重新输入");
							return false;
						} 
					 amount_flag = 1;
					}
				 myRows=eval("([{'sku_code': '"+cell1+"','sku_name': '"+cell2+"', 'serial_number': '"+i+"','qty': '"+cell3+"', 'weight': '"+cell4+"','volumn': '"+cell5+"', 'amount': '"+cell6+"', 'amount_flag': '"+amount_flag+"'}])"); 
				 jsonArray.push(myRows);
			 }
			 var param = "";
			 var param =$("#updateForm").serialize();
			$.ajax({
				type: "POST",
			  	url: "${root}control/orderPlatform/waybillMasterController/updateLogistics.do?"+param,
				dataType: "json",
				data: 'json='+JSON.stringify(jsonArray),
				success: function (data) {  
				    if(data.data==0){
    	            	alert("操作成功！");
    	            	loadingCenterPanel('${root }/control/orderPlatform/waybillMasterController/backToMain.do?time='+new Date().getTime());
    	            }else if(data.data!=0){
    	            	alert("操作失败！");
    	            	alert(data.msg);
    	             }
                    }
			});	 
		}
		function cancelLogisticsupdate(){
			var from_orgnization=document.getElementById("from_orgnization").value;
			var status=document.getElementById("status").value;
			
			var expressCode=document.getElementById("expressCode").value;
			var producttype_name=document.getElementById("producttype_name").value;
			/* var to_orgnization=document.getElementById("to_orgnization").value; */
			var org_provice_code=document.getElementById("org_provice_code").value;
			var org_city_code=document.getElementById("org_city_code").value;
			var org_state_code=document.getElementById("org_state_code").value;
			
			var to_contacts=document.getElementById("to_contacts").value;
			var to_phone=document.getElementById("to_phone").value;
			var to_address=document.getElementById("to_address").value;
			var provice_code=document.getElementById("provice_code").value;
			var city_code=document.getElementById("city_code").value;
			var state_code=document.getElementById("state_code").value;
			var from_contacts=document.getElementById("from_contacts").value;
			var from_phone=document.getElementById("from_phone").value;
			var from_address=document.getElementById("from_address").value;
			var pay_path=document.getElementById("pay_path").value;
			var cost_center=document.getElementById("cost_center").value;
			/* if(status==0||status=="0"||status==2||status=="2"){
				alert("该状态下不能修改订单！");
				return false;
			} */
			if(from_orgnization=="" ||from_orgnization==null ||from_orgnization==undefined){
				alert("发货机构为必填项，请重新输入");
				return false;
			}
			if(expressCode=="" ||expressCode==null ||expressCode==undefined){
				alert("快递公司必填项，请重新输入");
				return false;
			}
			if(producttype_name=="" ||producttype_name==null ||producttype_name==undefined){
				alert("快递业务类型必填项，请重新输入");
				return false;
			}
			if(org_provice_code=="" ||org_provice_code==null ||org_provice_code==undefined){
				alert("省必填项，请重新输入");
				return false;
			}
			if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
				alert("市必填项，请重新输入");
				return false;
			}
			if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
				alert("区必填项，请重新输入");
				return false;
			}
			if(to_contacts=="" ||to_contacts==null ||to_contacts==undefined){
				alert("收货人必填项，请重新输入");
				return false;
			}
			if(to_contacts.length>20){
				alert("收货人联系人名称长度过长，请重新输入");
				return false;
			}
			if(from_contacts.length>20){
				alert("发货人联系人名称长度过长，请重新输入");
				return false;
			}
			if(to_phone=="" ||to_phone==null ||to_phone==undefined){
				alert("收货人电话必填项，请重新输入");
				return false;
			}
			if(to_address=="" ||to_address==null ||to_address==undefined){
				alert("收货人地址必填项，请重新输入");
				return false;
			}
			if(to_address.length>35){
				alert("收货人地址过长，请重新输入");
				return false;
			}
			if(from_address.length>35){
				alert("发货人地址过长，请重新输入");
				return false;
			}
			if(provice_code=="" ||provice_code==null ||provice_code==undefined){
				alert("发货人省必填项，请重新输入");
				return false;
			}
			if(city_code=="" ||city_code==null ||city_code==undefined){
				alert("发货人市必填项，请重新输入");
				return false;
			}
			if(state_code=="" ||state_code==null ||state_code==undefined){
				alert("发货人区必填项，请重新输入");
				return false;
			}
			if(from_contacts=="" ||from_contacts==null ||from_contacts==undefined){
				alert("发货人必填项，请重新输入");
				return false;
			}
			if(from_phone=="" ||from_phone==null ||from_phone==undefined){
				alert("发货人电话必填项，请重新输入");
				return false;
			}
			if(from_address=="" ||from_address==null ||from_address==undefined){
				alert("发货人地址必填项，请重新输入");
				return false;
			}  
			if(expressCode=="BSC"){
				var sendcode=document.getElementById("sendcode").value;
				if(sendcode=="" ||sendcode==null ||sendcode==undefined){
					alert("当前快递寄件码必填，请输入");
					return false;
				}
			}
			if(expressCode=="SF"){
				var pay_path=document.getElementById("pay_path").value;
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					alert("当前快递类型必须选择支付方式");
					return false;
				}
			}
			if(expressCode=="SFSM"){
				var pay_path=document.getElementById("pay_path").value;
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					alert("当前快递类型必须选择支付方式");
					return false;
				}
			}
			if(pay_path==3){
				var cost_center=document.getElementById("cost_center").value;
				if(cost_center=="" ||cost_center==null ||cost_center==undefined){
					alert("当前支付方式必须选择成本中心");
					return false;
				}
			}
				
			 /* var tb = document.getElementById("tableId"); //根据id找到这个表格
			 var rows = tb.rows; //取得这个table下的所有行  */
			 var tb = document.getElementsByClassName("sku_code_obj"); //根据id找到这个表格
			 var myRows = null;
			 var jsonArray= new Array();
			 var amount_flag = 0;
			 for(var i=0;i<tb.length;i++)//循环遍历所有的tr行 
			 { 
				 var cell1 =  document.getElementsByClassName("sku_code_obj")[i].value;
			 	 var cell2 =  document.getElementsByClassName("sku_name_obj")[i].value;
			 	 var cell3 =  document.getElementsByClassName("qty_obj")[i].value;
			 	if(cell3=="" ||cell3==null ||cell3==undefined||cell3==0){
					alert("件数必须大于0，请重新输入");
					return false;
				}  
				 var cell4 =  document.getElementsByClassName("weight_obj")[i].value;
				 var cell5 =  document.getElementsByClassName("volumn_obj")[i].value;
				 var cell6 =  document.getElementsByClassName("amount_obj")[i].value; 
				 if($("input[name='placenorder']:checked").length==1){
					 if(cell6=="" ||cell6==null ||cell6==undefined||cell6==0){
							alert("金额必须大于0，请重新输入");
							return false;
						} 
					 amount_flag = 1;
					}
				 myRows=eval("([{'sku_code': '"+cell1+"','sku_name': '"+cell2+"', 'serial_number': '"+i+"','qty': '"+cell3+"', 'weight': '"+cell4+"','volumn': '"+cell5+"', 'amount': '"+cell6+"', 'amount_flag': '"+amount_flag+"'}])"); 
				 jsonArray.push(myRows);
			 }
			 var param = "";
			 var param =$("#updateForm").serialize();
			$.ajax({
				type: "POST",
			  	url: "${root}control/orderPlatform/waybillMasterController/cancelLogisticsupdate.do?"+param,
				dataType: "json",
				data: 'json='+JSON.stringify(jsonArray),
				success: function (data) {  
				    if(data.data==0){
    	            	alert("操作成功！");
    	            	loadingCenterPanel('${root }/control/orderPlatform/waybillMasterController/backToMain.do?time='+new Date().getTime());
    	            }else if(data.data!=0){
    	            	alert("操作失败！");
    	            	alert(data.msg);
    	             }
		    //find();
                    }
			});	 
		}
		
		function  no_returntostart(){
			loadingCenterPanel('${root }/control/orderPlatform/waybillMasterController/backToMain.do?time='+new Date().getTime());
		}
		
		
		function deleteRow(obj) 
		{ 
		$(obj).parent().parent().remove(); 
		setStyleqty();
		setStyleweight();
		setStylevolumn();
		setStyleamount();
		}
		
		function setStyleqty()
		{
			 var sum = document.getElementById("total_qty").value=0*1;
			 var objs= $(".qty_obj");
				$.each(objs,function(index,item){
					var qty = item.value;
					sum = sum*1 + qty*1;
				});
			document.getElementById("total_qty").value = sum*1;
		}
		function setStyleweight()
		{
			 var sum = document.getElementById("total_weight").value=0*1;
			 var objs= $(".weight_obj");
				$.each(objs,function(index,item){
					var weight = item.value;
					sum = sum*1 + weight*1;
				});
			document.getElementById("total_weight").value = sum*1;
		}
		function setStylevolumn()
		{
			 var sum = document.getElementById("total_volumn").value=0*1;
			 var objs= $(".volumn_obj");
				$.each(objs,function(index,item){
					var volumn = item.value;
					sum = sum*1 + volumn*1;
				});
			document.getElementById("total_volumn").value = sum*1;
		}
		function setStyleamount()
		{
			var sum = document.getElementById("total_amount").value=0*1;
			 var objs= $(".amount_obj");
			$.each(objs,function(index,item){
				var amount = item.value;
				sum = sum*1 + amount*1;
			});
			document.getElementById("total_amount").value = sum*1;
		}
		
		
		function  returntostart(){
			var result = confirm("您还未保存，确定离开吗？");
			if(result){
				loadingCenterPanel('${root }/control/orderPlatform/waybillMasterController/backToMain.do?time='+new Date().getTime());
			}
			
		}
		
		$(function() { 
			$("#span_sendcode").hide();
			var from_address=document.getElementById("from_address").value;
			if(from_address=="" ||from_address==null ||from_address==undefined){
				$("#span_from_address").show();
			}else{
				$("#span_from_address").hide();
			}
			var from_phone=document.getElementById("from_phone").value;
			if(from_phone=="" ||from_phone==null ||from_phone==undefined){
				$("#span_from_phone").show();
			}else{
				$("#span_from_phone").hide();
			}
			var from_contacts=document.getElementById("from_contacts").value;
			if(from_contacts=="" ||from_contacts==null ||from_contacts==undefined){
				$("#span_from_contacts").show();
			}else{
				$("#span_from_contacts").hide();
			}
			var to_address=document.getElementById("to_address").value;
			if(to_address=="" ||to_address==null ||to_address==undefined){
				$("#span_to_address").show();
			}else{
				$("#span_to_address").hide();
			}
			var to_address=document.getElementById("to_address").value;
			if(to_address=="" ||to_address==null ||to_address==undefined){
				$("#span_to_address").show();
			}else{
				$("#span_to_address").hide();
			}
			var to_phone=document.getElementById("to_phone").value;
			if(to_phone=="" ||to_phone==null ||to_phone==undefined){
				$("#span_to_phone").show();
			}else{
				$("#span_to_phone").hide();
			}
			var to_contacts=document.getElementById("to_contacts").value;
			if(to_contacts=="" ||to_contacts==null ||to_contacts==undefined){
				$("#span_to_contacts").show();
			}else{
				$("#span_to_contacts").hide();
			}
			
			
			var producttype_name=document.getElementById("producttype_name").value;
			if(producttype_name=="" ||producttype_name==null ||producttype_name==undefined){
				$("#span_producttype_name").show();
			}else{
				$("#span_producttype_name").hide();
			}
			var expressCode=document.getElementById("expressCode").value;
			if(expressCode=="" ||expressCode==null ||expressCode==undefined){
				$("#span_expressCode").show();
			}else{
				$("#span_expressCode").hide();
			}
			var org_state_code=document.getElementById("org_state_code").value;
			if(org_state_code=="" ||org_state_code==null ||org_state_code==undefined){
				$("#span_org_state_code").show();
			}else{
				$("#span_org_state_code").hide();
			}
			var org_city_code=document.getElementById("org_city_code").value;
			if(org_city_code=="" ||org_city_code==null ||org_city_code==undefined){
				$("#span_org_city_code").show();
			}else{
				$("#span_org_city_code").hide();
			}
			var org_provice_code=document.getElementById("org_provice_code").value;
			if(org_provice_code=="" ||org_provice_code==null ||org_provice_code==undefined){
				$("#span_org_provice_code").show();
			}else{
				$("#span_org_provice_code").hide();
			}
			var city_code=document.getElementById("city_code").value;
			if(city_code=="" ||city_code==null ||city_code==undefined){
				$("#span_city_code").show();
			}else{
				$("#span_city_code").hide();
			}
			var state_code=document.getElementById("state_code").value;
			if(state_code=="" ||state_code==null ||state_code==undefined){
				$("#span_state_code").show();
			}else{
				$("#span_state_code").hide();
			}
			
			var provice_code=document.getElementById("provice_code").value;
			if(provice_code=="" ||provice_code==null ||provice_code==undefined){
				$("#span_provice_code").show();
			}else{
				$("#span_provice_code").hide();
			}
			var cost_center=document.getElementById("cost_center").value;
			var pay_path=document.getElementById("pay_path").value;
			if(expressCode=="SF"||expressCode=="SFSM"){
				if(pay_path=="" ||pay_path==null ||pay_path==undefined){
					$("#span_pay_path").show();
				}else{
					$("#span_pay_path").hide();
				}
			}
			if(cost_center=="" ||cost_center==null ||cost_center==undefined){
				if(pay_path==4){
					$("#span_cost_center").show();
				}else{
					$("#span_cost_center").hide();
					cost_center= "#" +cost_center;
					$("#cost_center").next().attr("disabled", true);
				}
			}else{
				$("#span_cost_center").hide();
			}
		});
		
		
		
		function onclk(nowEle){
			var to_contacts=document.getElementById("to_contacts").value;
			if(to_contacts=="" ||to_contacts==null ||to_contacts==undefined){
				$("#span_to_contacts").show();
			}else{
				$("#span_to_contacts").hide();
			}
		  // var nextEle = nowEle.nextSibling;
		  //alert(nextEle.className);
		}
		
		function onclk_sendcode(nowEle){
			var expressCode=document.getElementById("expressCode").value;
			if(expressCode=="BSC"){
				var sendcode=document.getElementById("sendcode").value;
				if(sendcode=="" ||sendcode==null ||sendcode==undefined){
					$("#span_sendcode").show();
				}else{
					$("#span_sendcode").hide();
				}
			}
		}
		
		function onclkto_phone(nowEle){
			var to_phone=document.getElementById("to_phone").value;
			if(to_phone=="" ||to_phone==null ||to_phone==undefined){
				$("#span_to_phone").show();
			}else{
				$("#span_to_phone").hide();
			}
		}
		function onclkto_address(nowEle){
			var to_address=document.getElementById("to_address").value;
			if(to_address=="" ||to_address==null ||to_address==undefined){
				$("#span_to_address").show();
			}else{
				$("#span_to_address").hide();
			}
		}
		function onclkfrom_contacts(nowEle){
			var from_contacts=document.getElementById("from_contacts").value;
			if(from_contacts=="" ||from_contacts==null ||from_contacts==undefined){
				$("#span_from_contacts").show();
			}else{
				$("#span_from_contacts").hide();
			}
		}
		function onclkfrom_phone(nowEle){
			var from_phone=document.getElementById("from_phone").value;
			if(from_phone=="" ||from_phone==null ||from_phone==undefined){
				$("#span_from_phone").show();
			}else{
				$("#span_from_phone").hide();
			}
		}
		function onclkfrom_address(nowEle){
			var from_address=document.getElementById("from_address").value;
			if(from_address=="" ||from_address==null ||from_address==undefined){
				$("#span_from_address").show();
			}else{
				$("#span_from_address").hide();
			}
		}
		function change(){
			var mydiv1 = document.getElementById("mydiv1").value;
	           if(mydiv1==""){
	        	   document.getElementById("mydiv1").value="1";
	        	   slideDown();
	            }else{
	            	document.getElementById("mydiv1").value="";
	        	   slideUp();
	           }
			 }
		function slideDown(){
			$("#mydiv1").hide(400);
		 }

		 function slideUp(){
			 $("#mydiv1").show(400);
		 }
	</script>
	</head>
	<body>
	<div class="page-header">
		<h1 style='margin-left: 20px'>修改宝尊运单</h1>
	</div>
		<div style="margin-top: 20px;margin-left: 20px;margin-bottom: 20px;">
		<div class= "widget-header header-color-blue">
					<h4>运单路由信息</h4>
				<input id="chcdk" onchange="change()" type="checkbox" class="ace ace-switch ace-switch-5" />
				<span class="lbl"></span>
	       	</div>
			<div id="mydiv1" style="display: none;">
		  <div class="panel-body">
		  <form id="query_logistics" >			
			<table id="query_logistics_inf" align="center"> 
				<!-- <tr>
					<td class="td_cs" style="width: 100px">时间:</td>
					<td class="td_cs" style="width: 100px">运单状态:</td>
				</tr> -->
				<tr >
					<td class="td_cs" style="width: 200px"
						title="${queryParam.update_time }">
						<fmt:formatDate value="${queryParam.update_time }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td class="td_cs" style="width: 200px"
						title="${queryParam.status }">
							<c:if test="${queryParam.status=='0'}">已作废</c:if>
							<c:if test="${queryParam.status=='1'}">已录单</c:if>
							<c:if test="${queryParam.status=='2'}">待揽收</c:if>
 							<c:if test="${queryParam.status=='4'}">已下单</c:if>
 							<c:if test="${queryParam.status=='5'}">已揽收</c:if>
 							<c:if test="${queryParam.status=='6'}">已发运</c:if>
 							<c:if test="${queryParam.status=='7'}">已签收</c:if>
 							<c:if test="${queryParam.status=='8'}">签收失败</c:if>
 							<c:if test="${queryParam.status=='9'}">已退回</c:if>
 							<c:if test="${queryParam.status=='10'}">已取消</c:if>
						</td>
				</tr>
				<tbody>
			  		<c:forEach items= "${interfaceRouteinfo }" var= "records" varStatus='status'>
				  		<tr>
				  			<td class="td_cs" style="width: 200px"
								title="${records.route_time }">
								<fmt:formatDate value="${records.route_time }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
							<td class="td_cs" style="width: 200px"
								title="${records.route_remark }">${records.route_remark }</td>
				  		</tr>
		  			</c:forEach>
		  		</tbody>
			</table>
			</form>
		  
		  </div>
		  </div>
		
		
		
		 <form id="updateForm">			
			<table > 
			   <tr> 
		  			<td width="160px" align="left"><label style="width: 95px;">状态</label></td>
		  				<td width="170px" align="left">
		  					<input type='text' id='status' name='status'  value="已录单"  disabled="true" style="width: 160px;">
		  				</td>
		  				<td width="60px"></td>
		  				<td width="160px" align="left"><label>是否保价</label></td>
		  				<td width="170px" align="left">
			  				<select id="placenorder" name="placenorder" data-edit-select="1" style="width: 168px;">
			  					<c:if test="${queryParam.amount_flag=='1'}"> 
									<option selected='selected' value="1">是</option>
								 </c:if>
			  					<c:if test="${queryParam.amount_flag=='0'}"> 
									<option selected='selected' value="0">否</option>
								 </c:if>
							</select>
		  				</td>
		  			<td></td>
		  			<td  align="left"><label style="width: 95px;">保价金额</label></td>
		  			<td  align="left">
		  				<input type='text' id='insured' name='insured' style="width: 160px;" value="${queryParam.insured}">
		  			</td>
		  				<%-- <td width="160px" align="left"><label>支付方式</label></td>
		  				<td width="170px" align="left">
							<select id="pay_path" name="pay_path" data-edit-select="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
			  				  <c:forEach items= "${pay_path}" var= "street" >
			  					 <c:if test='${street.pay_path eq queryParam.pay_path }'> 
									<option selected='selected' value="${street.pay_path}">${street.pay_ame}</option>
								 </c:if>
								 <c:if test='${street.pay_path ne queryParam.pay_path }'> 
									<option  value="${street.pay_path}">${street.pay_ame}</option>
								 </c:if>
							 </c:forEach> 
						</select><span id="span_pay_path" style="color:red;">*</span>
		  				</td>
		  				<td width="60px"></td>
		  				<td align="left"><label style="width: 70px;">成本中心</label></td>
		  				<td  align="left">
						<select id="cost_center" name="cost_center" data-edit-select="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
			  				  <c:forEach items= "${cost_center}" var= "street" >
			  					 <c:if test='${street.cost_center eq queryParam.cost_center }'> 
									<option selected='selected' value="${street.cost_center}">${street.mis}</option>
								 </c:if>
								 <c:if test='${street.cost_center ne queryParam.cost_center }'> 
									<option  value="${street.cost_center}">${street.mis}</option>
								 </c:if>
							 </c:forEach> 
						</select><span id="span_cost_center" style="color:red;">*</span>
		  				</td> --%>
		  				<td></td>
		  			</tr>
		  		<tr>
		  			<td align="left"><label style="width: 70px;">快递公司</label></td>
		  			<td  align="left">
		  				<select id="expressCode" name="expressCode" data-edit-select="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
			  				  <c:forEach items= "${venders}" var= "street" >
			  					 <c:if test='${street.express_code eq queryParam.expressCode }'> 
									<option selected='selected' value="${street.express_code}">${street.express_name}</option>
								 </c:if>
								 <c:if test='${street.express_code ne queryParam.expressCode }'> 
									<option  value="${street.express_code}">${street.express_name}</option>
								 </c:if>
							 </c:forEach> 
						</select><span id="span_expressCode" style="color:red;">*</span>
		  			</td>
		  			<td ></td>
		  			<td align="left"><label style="width: 95px;">快递业务类型</label></td>
		  			<td align="left">
		  				<select id="producttype_name" name="producttype_code" data-edit-select="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
							 <c:forEach items="${type}" var = "street" >
							    <c:if test='${street.product_type_code eq queryParam.producttype_code }'> 
									<option selected='selected' value="${street.product_type_code}">${street.product_type_name}</option>
								 </c:if>
								 <c:if test='${street.product_type_code ne queryParam.producttype_code }'> 
									<option  value="${street.product_type_code}">${street.product_type_name}</option>
								 </c:if>
							</c:forEach>
						</select><span id="span_producttype_name" style="color:red;">*</span>
		  			</td>
		  			<td width="60px"></td>
		  			<td  align="left"><label style="width: 95px;">备注</label></td>
		  			<td  align="left">
		  				<input type='text' id='memo' name='memo' style="width: 160px;" value="${queryParam.memo}">
		  			</td>
		  			<td></td>
		  		</tr>
		  		
		  		<tr>
		  			<td width="160px" align="left"><label>支付方式</label></td>
		  				<td width="170px" align="left">
						<c:if test="${org.id==165|| org.id==166}">
		  				<select id="pay_path" name="pay_path" data-edit-select="1" style="width: 168px;">
		  					<option value= "">---请选择---</option>
			  				<option value= "4">寄付月结</option>
		  				 	<%-- <c:forEach items= "${pay_path}" var= "street" >
		  					    <option value="${street.pay_path}"  >${street.pay_ame}</option>
						 	</c:forEach>  --%>
						</select><span id="span_pay_path" style="color:red;"></span>
						</c:if>
						<c:if test="${org.id==176|| org.id==177|| org.id==178}">
		  				<select id="pay_path" name="pay_path" data-edit-select="1" style="width: 168px;">
		  					<option value= "">---请选择---</option>
			  				<option value= "3">第三方付</option>
		  				 	<%-- <c:forEach items= "${pay_path}" var= "street" >
		  					    <option value="${street.pay_path}"  >${street.pay_ame}</option>
						 	</c:forEach>  --%>
						</select><span id="span_pay_path" style="color:red;"></span>
						</c:if>
						<c:if test="${org.id!=176&& org.id!=177&& org.id!=178&& org.id!=165&& org.id!=166}">
			  			<select id="pay_path" name="pay_path" data-edit-select="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
			  				  <c:forEach items= "${pay_path}" var= "street" >
			  					 <c:if test='${street.pay_path eq queryParam.pay_path }'> 
									<option selected='selected' value="${street.pay_path}">${street.pay_ame}</option>
								 </c:if>
								 <c:if test='${street.pay_path ne queryParam.pay_path }'> 
									<option  value="${street.pay_path}">${street.pay_ame}</option>
								 </c:if>
							 </c:forEach> 
						</select><span id="span_pay_path" style="color:red;">*</span>
						</c:if>
		  				</td>
		  				<td width="60px"></td>
		  				<td align="left"><label style="width: 70px;">成本中心</label></td>
		  				<td  align="left" colspan="4">
						<select id="cost_center" name="cost_center" data-edit-select-baozun="1" style="width: 168px;">
			  				<option value= "">---请选择---</option>
			  				  <c:forEach items= "${cost_center}" var= "street" >
			  					 <c:if test='${street.cost_center eq queryParam.cost_center }'> 
									<option selected='selected' value="${street.cost_center}">${street.mis}</option>
								 </c:if>
								 <c:if test='${street.cost_center ne queryParam.cost_center }'> 
									<option  value="${street.cost_center}">${street.mis}</option>
								 </c:if>
							 </c:forEach> 
						</select>
						<c:if test="${org.id==165|| org.id==166}">
		  				<span id="span_cost_center" style="color:red;">*</span>
						</c:if>
						<c:if test="${org.id==176|| org.id==177|| org.id==178}">
		  				<span id="span_cost_center" style="color:red;"></span>
						</c:if>
						<c:if test="${org.id!=176&& org.id!=177&& org.id!=178&& org.id!=165&& org.id!=166}">
		  				<span id="span_cost_center" style="color:red;">*</span>
						</c:if>
		  				</td>
		  			
		  			<!-- <td></td>
		  			<td></td>
		  			<td></td>
		  			<td></td> -->
		  		</tr>
		  		
		  		<tr >
		  			<td  align="left" colspan="5"><label style="width: 70px;font-family:'黑体'; font-size:17px; font-weight:bold;">发货信息</label></td>
		  			<td></td>
		  			<td  align="left"><label style="width: 95px;">发货机构</label></td>
		  			<td  align="left">
		  				<select id="from_orgnization" name="from_orgnization" data-edit-select="1" style="width: 168px;">
				  				<option value="${org.org_name}" selected>${org.org_name}</option>
						</select>
		  			</td>
		  			<td></td>
		  		</tr>
		  		<tr>
		  			
		  			<td align="left" >发货联系人</td>
		  			<td align="left">
		  				<input type='text' id='from_contacts' name='from_contacts' onblur="onclkfrom_contacts(this)" value="${queryParam.from_contacts}" style="width: 160px;"><span id="span_from_contacts" style="color:red;">*</span>
		  			</td>
		  			<td>
		  			
		  			</td>
		  			<td  align="left"><label style="width: 95px;">发货联系电话</label></td>
		  			<td align="left">
		  				<input type='text' id='from_phone' onkeyup="value=value.replace(/[^\* \- \d.]/g,'')" onblur="onclkfrom_phone(this)" name='from_phone' value="${queryParam.from_phone}" style="width: 160px;"><span id='span_from_phone' style="color:red;">*</span>
		  			</td>
		  			<td></td>
		  			<td></td><td></td><td></td>
		  		</tr>
		  		<tr>
		  			<td align="left" >省</td>
		  			<td  align="left" >
		  				<select id="provice_code" name="from_province_code" data-edit-select="1" style="width: 168px;" onchange='shiftArea(1,"provice_code","city_code","state_code","")'>
			  				<option value= "">---请选择---</option>
			  				<c:forEach items="${areas}" var = "area" >
							    <c:if test='${queryParam.from_province_code eq area.area_code }'> 
									<option selected='selected' value="${area.area_code}">${area.area_name}</option>
								 </c:if>
								 <c:if test='${queryParam.from_province_code ne area.area_code }'> 
									<option  value="${area.area_code}">${area.area_name}</option>
								 </c:if>
							</c:forEach>
						</select><span id="span_provice_code" style="color:red;">*</span>
		  			</td>
		  			<td></td>
		  			<td align="left" >市</td>
		  			<td align="left">
		  				<select id="city_code" name="from_city_code" data-edit-select="1" style="width: 168px;" onchange='shiftArea(2,"provice_code","city_code","state_code","")'>
			  				<option value= "">---请选择---</option>
							<c:forEach items="${fromcity}" var = "cityVar" >
							    <c:if test='${queryParam.from_city_code eq cityVar.area_code}'>
									<option selected='selected'  value="${cityVar.area_code}">${cityVar.area_name}</option>
								</c:if>
								<c:if test='${queryParam.from_city_code ne cityVar.area_code}'>
									<option  value="${cityVar.area_code}">${cityVar.area_name}</option>
								</c:if>
							</c:forEach>
						</select><span id="span_city_code" style="color:red;">*</span>
		  			</td>
		  			<td>
		  			
		  			</td>
		  			<td align="left"><label style="width: 95px;" >区</label></td>
		  			<td align="left">
			  				<select id="state_code" name="from_state_code" data-edit-select="1" style="width: 168px;" >
			  				<option value= "">---请选择---</option>
							<c:forEach items="${fromstate}" var = "stateVar" >
						      <c:if test='${stateVar.area_code eq queryParam.from_state_code }'> 
								<option selected='selected' value="${stateVar.area_code}">${stateVar.area_name}</option>
							  </c:if>
							  <c:if test='${stateVar.area_code ne queryParam.from_state_code }'> 
								<option  value="${stateVar.area_code}">${stateVar.area_name}</option>
							  </c:if>	
							</c:forEach>
						</select>
		  			</td>
		  			<td>
		  			<span id="span_state_code" style="color:red;">*</span>
		  			</td>
		  		</tr>
		  		<tr>
		  			<td align="left"  >发货地址</td>
		  			<td align="left" colspan="8">
		  				<input type='text' id='from_address' style="width: 877px;" name='from_address'onblur="onclkfrom_address(this)" value="${queryParam.from_address}" ><span  id='span_from_address' style="color:red;">*</span>
		  			</td>
		  			<!-- <td></td>
		  			<td></td>
		  			<td></td> -->
		  		</tr>
		  		<tr  >
		  			<td  align="left" colspan="5"><label style="width: 70px;font-family:'黑体'; font-size:17px; font-weight:bold;">收货信息</label></td>
		  			<td></td>
		  			<td  align="left"></td>
		  			<td  align="left">
		  			</td>
		  			<td></td>
		  		</tr>
		  		<tr>
		  			<td  align="left"><label style="width: 95px;">收货联系人</label></td>
		  			<td  align="left">
		  				<input type='text' id='to_contacts' onblur="onclk(this)" name='to_contacts' value="${queryParam.to_contacts}" style="width: 160px;"><span id="span_to_contacts"style="color:red;">*</span>
		  			</td>
		  			<td>
		  			
		  			</td>
		  			<td  align="left"><label style="width: 95px;">收货联系电话</label></td>
		  			<td  align="left">
		  				<input type='text' onkeyup="value=value.replace(/[^\* \- \d.]/g,'')" onblur="onclkto_phone(this)" id='to_phone' name='to_phone' value="${queryParam.to_phone}" style="width: 160px;"><span id="span_to_phone" style="color:red;">*</span>
		  			</td>
		  			<td></td>
		  			<td></td>
		  			<td></td>
		  			<td></td>
		  		</tr>
		  		<tr>
		  			<td  align="left"><label style="width: 70px;">省</label></td>
		  			<td  align="left">
		  				<select id="org_provice_code" name="to_province_code" data-edit-select="1" style="width: 168px;" onchange='shiftArea(1,"org_provice_code","org_city_code","org_state_code","")'>
			  				<option value= "">---请选择---</option>
			  				<c:forEach items="${areas}" var = "area" >
							    <c:if test='${queryParam.to_province_code eq area.area_code }'> 
									<option selected='selected' value="${area.area_code}">${area.area_name}</option>
								 </c:if>
								 <c:if test='${queryParam.to_province_code ne area.area_code }'> 
									<option  value="${area.area_code}">${area.area_name}</option>
								 </c:if>
							</c:forEach>
						</select><span id="span_org_provice_code" style="color:red;">*</span>
		  			</td>
		  			<td ></td>
		  			<td  align="left"><label>市</label></td>
		  			<td  align="left">
		  				<select id="org_city_code" name="to_city_code" data-edit-select="1" style="width: 168px;" onchange='shiftArea(2,"org_provice_code","org_city_code","org_state_code","")'>
			  				<option value= "">---请选择---</option>
							<c:forEach items="${tocity}" var = "cityVar" >
							    <c:if test='${queryParam.to_city_code eq cityVar.area_code}'>
									<option selected='selected'  value="${cityVar.area_code}">${cityVar.area_name}</option>
								</c:if>
								<c:if test='${queryParam.to_city_code ne cityVar.area_code}'>
									<option  value="${cityVar.area_code}">${cityVar.area_name}</option>
								</c:if>
							</c:forEach>
						</select><span id="span_org_city_code" style="color:red;">*</span>
		  			</td>
		  			<td align="left"></td>
		  			<td  align="left"><label style="width: 95px;">区</label></td>
		  			<td  align="left">
		  				<select id="org_state_code" name="to_state_code" data-edit-select="1" style="width: 168px;" >
			  				<option value= "">---请选择---</option>
							<c:forEach items="${tostate}" var = "stateVar" >
						      <c:if test='${stateVar.area_code eq queryParam.to_state_code }'> 
								<option selected='selected' value="${stateVar.area_code}">${stateVar.area_name}</option>
							  </c:if>
							  <c:if test='${stateVar.area_code ne queryParam.to_state_code }'> 
								<option  value="${stateVar.area_code}">${stateVar.area_name}</option>
							  </c:if>	
							</c:forEach>
						</select><span id="span_org_state_code" style="color:red;">*</span>
		  			</td>
		  			<td >
		  			
		  			</td>
		  		</tr>
		  		
		  		<tr> 
		  			<td  align="left"><label style="width: 70px;">收货地址</label></td>
		  			<td  align="left" colspan="8">
		  				<input type='text' id='to_address' name='to_address'  style="width: 877px;"  onblur="onclkto_address(this)" value="${queryParam.to_address}"><span id="span_to_address" style="color:red;">*</span>
		  			</td>
		  		</tr>
		  		<tr>
		  			<td>
		  				<input id="id" type=text name="id" style="display:none" value="${queryParam.id}">
		  			</td>
		  		</tr>
			</table>
			
				<div border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;"  class="divclass">
				<input type="button" value="添加行" onclick="onchecks();"> 
				
			 <table border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;" id="tableId" >
				<tr>
					<td><label style="width: 30px;">选择</label></td>
					<td><label style="width: 100px;">商品代码</label></td>
					<td><label style="width: 100px;">商品描述</label></td>
					<td><label style="width: 100px;">件数</label></td>
					<td><label style="width: 100px;">毛重</label></td>
					<td><label style="width: 100px;">体积</label></td>
					<td><label style="width: 100px;">金额</label></td>
					<td><label style="width: 100px;"></label></td>
				</tr>
				<tbody  align="center">
			  		<c:forEach items= "${wd }" var= "records" varStatus='status'>
				  		<tr ondblclick='toUpdate("${records.id}")'>
					  		<td align = "center"><input id="ckb" name="ckb" type="checkbox" value="${records.id}"></td>
							<td><label><input style="width: 100px;" class="sku_code_obj" id="sku_code${status.count }" name="sku_code" title="${records.sku_code }" value="${records.sku_code }"/></label></td>
							<td><label ><input style="width: 100px;" class="sku_name_obj" id="sku_name${status.count }" name="sku_name" title="${records.sku_name }" value="${records.sku_name }"></label></td>
							<td><label ><input style="width: 100px;" class="qty_obj" onkeyup="value=value.replace(/[^\d]/g,'')" id="qty${status.count }" name="qty" onblur="setStyleqty()" title="${records.qty }" value="${records.qty }"/></label></td>
							<td><label ><input style="width: 100px;" class="weight_obj" onkeyup="value=value.replace(/[^\d\.]/g,'')" id="weight${status.count }" name="weight" onblur="setStyleweight()" title="${records.weight }" value="${records.weight }"/></label></td>
							<td><label ><input style="width: 100px;" class="volumn_obj"  onkeyup="value=value.replace(/[^\d\.]/g,'')" id="volumn${status.count }" name="volumn" onblur="setStylevolumn()" title="${records.volumn }" value="${records.volumn }"/></label></td>
							<td><label ><input style="width: 100px;"  class="amount_obj" onkeyup="value=value.replace(/[^\d\.]/g,'')" id="amount${status.count }" name="amount" onblur="setStyleamount()" title="${records.amount }" value="${records.amount }"/></label></td>
							<td><label style="width: 100px;"></label></td>
						</tr>
		  			</c:forEach>
		  		</tbody>
				</table>
				<table border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;" >
				<tr>
					<td><label style="width: 30px;">合计</label></td>
					<td><label style="width: 100px;"></label></td>
					<td><label style="width: 100px;"></label></td>
					<td><label  ><input type="text"   readonly id="total_qty" name="total_qty" value="${queryParam.total_qty }" style="width: 100px;" /></label></td>
					<td><label ><input type="text"   readonly id="total_weight" name="total_weight" value="${queryParam.total_volumn }" style="width: 100px;"/></label></td>
					<td><label ><input type="text"  readonly id="total_volumn" name="total_volumn" value="${queryParam.total_volumn }" style="width: 100px;"/></label></td>
					<td><label><input type="text"  readonly id="total_amount" name="total_amount" value="${queryParam.total_amount }" style="width: 100px;"/></label></td>
					<td><label><input type="text"  readonly style="width: 100px;"/></label></td>
				</tr>
			</table>
			</div>
			<div>
			<table width='95%'> 
			   <tr> 
		  			<td width="10%" align="middle"><label>制单人:</label></td>
		  			<td width="25%" align="middle">
		  				<input type='text' id='create_user' disabled="true" name='create_user' value="${org.org_name}" style="width: 260px;"/>
		  			</td>
		  			<td width="10%" align="middle"><label>修改人:</label></td>
		  			<td width="25%" align="middle">
		  				<input type='text' id='update_user' disabled="true" name='update_user' value="${org.org_name}" style="width: 260px;"/>
		  			</td>
		  		</tr>
		  	</table>
		  	</div>
		  	<input type='text' id='order_id' name='order_id' style="display:none" value="${queryParam.order_id}">
			</form>
			</div>
					<div class= "modal-footer" >
						
						<c:if test="${queryParam.status=='1'}">
							<button id= "btn_back" type= "button" class= "btn btn-default"  onclick="returntostart()">
								<i class= "icon-undo" aria-hidden= "true" ></i>返回
							</button>
			     			<button id= "btn_submit" type= "button" class= "btn btn-primary" onclick="updateLogistics();" >
			     				<i class= "icon-save" aria-hidden= "true" ></i>保存
			     			</button>
		     			</c:if>
						<c:if test="${queryParam.status=='10'}">
							<button id= "btn_back" type= "button" class= "btn btn-default"  onclick="returntostart()">
								<i class= "icon-undo" aria-hidden= "true" ></i>返回
							</button>
			     			<button id= "btn_submit" type= "button" class= "btn btn-primary" onclick="cancelLogisticsupdate();" >
			     				<i class= "icon-save" aria-hidden= "true" ></i>保存
			     			</button>
		     			</c:if>
		     			<c:if test="${queryParam.status!='1'&& queryParam.status!='10'}">
							<button id= "btn_back" type= "button" class= "btn btn-default"  onclick="no_returntostart()">
								<i class= "icon-undo" aria-hidden= "true" ></i>返回
							</button>
		     			</c:if>
					</div>
	</body>
</html>
<style>

td,input{
font-size: 14px
}

.divclass{
border:5px solid #E0EEEE} 

.select {
    padding: 3px 4px;
    height: 30px;
    width: 160px;
   text-align: enter;
}


.table_head_line td {
font-weight: bold;
font-size: 16px
}

.m-input-select {
    display: inline-block;
    position: relative;
    -webkit-user-select: none;
    width: 160px;
    }
.baozun-input-select {
    display: inline-block;
    position: relative;
    -webkit-user-select: none;
    width: 487px;
    }
</style>
