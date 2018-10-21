<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fns" uri="http://java.sun.com/jsp/jstl/functions"%>
<script>
	$(function(){
		$("#table_content tbody tr").dblclick(function(){
			openDiv(
					'/BT-LMIS/controller/receiveDeadlineController/toForm.do?pid=' 
					+ $(this).children(":first").children(":first").val()
					
			);
			
		});
		
	});
</script>
<div class="title_div" id="sc_title">		
	<table class="table table-striped" style="table-layout: fixed;">
   		<thead>
	  		<tr class="table_head_line">
	  			<td class="td_ch"><input type="checkbox" id="checkAll" onclick="inverseCkb('ckb')"/></td>
	  			<td class="td_cs">物流服务商</td>
	  			<td class="td_cs">产品类型</td>
	  			<td class="td_cs">揽件仓库</td>
	  			<td class="td_cs">揽件截止时间</td>
	  			<td class="td_cs">到达省</td>
	  			<td class="td_cs">到达市</td>
	  			<td class="td_cs">到达区县</td>
	  			<td class="td_cs">到达街道</td>
	  		</tr>  	
		</thead>
	</table>
</div>
<div class="tree_div"></div>
<div style= "height: 400px; overflow: auto; overflow: scroll; border: solid #F2F2F2 1px;" id= "sc_content" onscroll= "init_td('sc_title', 'sc_content')" >
	<table id= "table_content" class= "table table-hover table-striped" style= "table-layout: fixed;" >
  		<tbody align= "center" >
	  		<c:forEach items= "${pageView.records}" var= "res" >
		  		<tr>
		  			<td class="td_ch"><input id="ckb" name="ckb" type="checkbox" value="${res.id}"></td>
		  			<td class="td_cs" title="${res.transport_name}">${res.transport_name}</td>
		  			<td class="td_cs" title="${res.product_type_name}">${res.product_type_name}</td>
		  			<td class="td_cs" title="${res.warehouse_name}">${res.warehouse_name}</td>
		  			<td class="td_cs" title="${res.embrace_time}">${res.embrace_time}</td>
		  			<td class="td_cs" title="${res.province_name}">${res.province_name}</td>
		  			<td class="td_cs" title="${res.city_name}">${res.city_name}</td>
		  			<td class="td_cs" title="${res.state_name}">${res.state_name}</td>
		  			<td class="td_cs" title="${res.street_name}">${res.street_name}</td>
		  		</tr>
	  		</c:forEach>
  		</tbody>
	</table>
</div>
<div style= "margin-right: 1%; margin-top: 20px;" >${pageView.pageView }</div>