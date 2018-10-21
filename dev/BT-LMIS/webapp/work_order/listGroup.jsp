<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<%@ include file="/templet/common.jsp" %>
		<title>LMIS</title>
		<meta name="description" content="overview &amp; stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link type="text/css" href="<%=basePath %>css/table.css" rel="stylesheet" />
		<script type= "text/javascript" src= "<%=basePath %>js/common_view.js" ></script>
        <style type="text/css">
         label{
          margin-right: 15px;
          font-size: 14px;
         }
        </style>
	</head>
<script>
	$(function() {
		$("#table_content tbody tr").dblclick(
			function() {
			   penDiv('/BT-LMIS/controller/groupMessageController/listGroup.do?id='+ $(this).children(":first").children(":first").val()+ "&group_name="+ $(this).children().eq(1).text());
		});
	});

	$(document).ready(function() {
		
	});
</script>
<body>
		<div>
		<input type="hidden" name="groupCodeJsp" id="groupCodeJsp" value="${groupCode}">
		<input type="hidden" name="groupNamejsp" id="groupNamejsp" value="${groupName}">
		<input type="hidden" name="statusJsp" id="statusJsp" value="${status}">
		<input type="hidden" name="superiorJsp" id="superiorJsp" value="${superior}">
		<input type="hidden" name="if_allotJsp" id="if_allotJsp" value="${if_allot}">
		</div>
		<div class="row">
		<div class="col-xs-12">
			<div class="row">
				<div class="col-xs-12">
					<div class="widget-box">
						<div class="widget-header widget-header-small">
							<h5 class="widget-title lighter">查询栏</h5>
							<a class="pointer" title="初始化" onclick="refresh();"><i
								class="fa fa-refresh"></i></a>
						</div>
						<div class="widget-body">
							<div class="widget-main">
								<form id="lg_form" name="lg_form" class="container search_form">
									<div class="row form-group">
		  			<div class="col-md-1 no-padding text-center search-title"><label class="control-label blue">组别编码:</label></div>
		  			<div class="col-md-3 no-padding">
		  			    <select id="group_code" name="group_code" data-edit-select="1">
			  				<option value= "">---请选择---</option>
			  				 <c:forEach items= "${seniorQuery}" var= "street" >
			  					    <option value="${street.group_code}" <c:if test="${groupPar.group_code==street.group_code}">selected</c:if> >${street.group_code}</option>
							 </c:forEach>
						</select>
		  			</div>
		  			<div class="col-md-1 no-padding text-center search-title"><label class="control-label blue">组别名称:</label></div>
		  			<div class="col-md-3 no-padding">
		  			    <select id="group_name" name="group_name" style="width: 50%;" data-edit-select="1">
			  					<option value= "">---请选择---</option>
			  					<c:forEach items= "${seniorQuery}" var= "street" >
			  					    <option value="${street.group_name}" <c:if test="${groupPar.group_name==street.group_name}">selected</c:if> >${street.group_name}</option>
								</c:forEach>
						</select>
		  			</div>
		  			
		  			<div class="col-md-1 no-padding text-center search-title"><label class="control-label blue">启用状态:</label></div>
		  			<div class="col-md-3 no-padding">
		  			  <select id="status"  name="status" style="width: 60%;" data-edit-select="1">
		  			       <option value="">---请选择---</option>
		  			       <option value="1" <c:if test="${groupPar.status=='1'}">selected='selected'</c:if>>启用</option>
		  			       <option value="0" <c:if test="${groupPar.status=='0'}">selected='selected'</c:if>>禁用</option>
		  			  </select>
		  			</div>
		  		</div>
									<div class="senior-search">
										<div class="row form-group">
		  			<div class="col-md-1 no-padding text-center search-title"><label class="control-label blue">上级组别:</label></div>
		  			<div class="col-md-3 no-padding">
		  			  <select id="superior" name="superior" style="width: 50%;" data-edit-select="1">
			  					<option value= "">---请选择---</option>
			  					<c:forEach items= "${seniorQuery}" var= "street" >
			  					    <option value="${street.id}" <c:if test="${groupPar.superior==street.id}">selected</c:if> >${street.group_name}</option>
								</c:forEach>
						</select>
		  			</div>
		  		<div class="col-md-1 no-padding text-center search-title"><label class="control-label blue">自动分配:</label></div>
		  			<div class="col-md-3 no-padding">
		  			  <select id="if_allot"  name="if_allot" style="width: 60%;" class='select' data-edit-select="1">
		  			     <option value="">---请选择---</option>
		  			       <option value="1" <c:if test="${groupPar.if_allot=='1'}">selected='selected'</c:if>>是</option>
		  			       <option value="0" <c:if test="${groupPar.if_allot=='0'}">selected='selected'</c:if>>否</option>
		  			  </select>
		  		</div>
		  		</div>
									</div>
									<div class="row text-center">
										<a class="senior-search-shift pointer" title="高级查询"><i
											class="fa fa-angle-double-down fa-2x" aria-hidden="true"></i></a>
									</div>
								</form>
							</div>
						</div>
					</div>
		<div
						style="margin-top: 10px; margin-bottom: 10px; margin-left: 20px;">
	        <button class="btn btn-sm btn-white btn-default btn-bold btn-round btn-width" onclick="findGroup();">
				<i class="ace-icon fa fa-search grey bigger-120">
					查询
				</i>
			</button>
			<button class="btn btn-sm btn-white btn-info btn-bold btn-round btn-width" onclick= "openDiv('${root}control/groupMessageController/newlyGroupWord.do');" >
				<i class="ace-icon fa fa-plus-circle blue bigger-120">
					新增
				</i>
			</button>
			<button class="btn btn-sm btn-white btn-danger btn-bold btn-round btn-width" onclick="deleteGroup();">
				<i class="ace-icon fa fa-trash-o red bigger-120">
					删除
				</i>
			</button>
			<button class="btn btn-sm btn-white btn-warning btn-bold btn-round btn-width" onclick="updateStatus('0');">
				<i class="ace-icon fa fa-lock orange bigger-120" >
					禁用
				</i>
			</button>
			<button class="btn btn-sm btn-white btn-success btn-bold btn-round btn-width" onclick="updateStatus('1');">
				<i class="ace-icon fa fa-unlock green bigger-120" >
					启用
				</i>
			</button>
		</div>
			<div class="search-table">
				<jsp:include page="/templet/table.jsp" flush= "true" />
			</div>
		</div>
			</div>
		</div>
	</div>
	</body>
	<script type="text/javascript">
	  	function findGroup() {
		  	var data=$("#lg_form").serialize();
		  	openDivs('${root}control/groupMessageController/listGroup.do?',data); 
		}
		function pageJump() {
			  var data=$("#lg_form").serialize();
		      openDiv('${root}control/groupMessageController/listGroup.do?'+data+'&startRow='+$("#startRow").val()+'&endRow='+$("#startRow").val()+"&page="+$("#pageIndex").val()+"&pageSize="+$("#pageSize").val());
		} 
		function inverseCkb(items){
			$('[name='+items+']:checkbox').each(function(){
				this.checked=!this.checked;
			});
		}
		/**
	   	* 修改菜单状态
	   	*/
		function updateStatus(status) {
			if ($("input[name='ckb']:checked").length == 1) {
				var priv_ids = [];
				$("input[name='ckb']:checked").each(function() {
					id = $(this).val();
				});
				
				var message = '确定修改吗?';

				if (status == '0') {
					message = '确定禁用吗？';
				} else {
					message = '确定启用吗？';
				}
				
				if (!confirm(message)) {
					return;
				}
				var url = root
						+ "/control/groupMessageController/updateStatus.do?id="
						+ id + "&status=" + status;
				$.ajax({
					type : "POST",
					url : url,
					dataType : "text",
					data : "",
					success : function(data) {
						if (data == 'true') {
							pageJump();
						} else if (data == 'false') {
							alert("成功!");
						} else {
							alert("失败!");
						}
					}
				});
			} else {
				alert("请选择一行!");
			}
		}
		function upBg(id){
			$("*[id*=tr_]").css("background","#ffffff");
			$("#tr_"+id).css("background","#C6E2FF");
		}
		
		function deleteGroup() {
			if ($("input[name='ckb']:checked").length >= 1) {
				var priv_ids = [];
				$("input[name='ckb']:checked").each(function() {
					priv_ids.push($.trim($(this).val()));
				});
				if (!confirm("确定删除吗?")) {
					return;
				}
				$.ajax({
							type : "POST",
							url : root
									+ "/control/groupMessageController/deleteGroup.do?",
							dataType : "text",
							data : "privIds=" + priv_ids,
							success : function(data) {
								if (data == 'true') {
									pageJump();
								} else if (data == 'false') {
									alert("已启用状态不能删除!");
								} else {
									alert("包含已启用状态不能删除!");
								}
							}
						});
			} else {
				alert("请选择一行!");
			}
		}
        //修改主表信息
		function updateSgroup(id,group_code,group_name,superior,if_allot,instruction,status){
			var data = "&id="+id+"&group_code="+group_code+"&group_name="+group_name+"&superior="+superior+"&if_allot="+if_allot+"&instruction="+instruction+"&status="+status;
			openDivs('${root}control/groupMessageController/updateSgroup.do?',data);
		}
		function upBgbyId(id){
			$("*[id*=tr_]").css("background","#ffffff");
			$("#tr_"+id).css("background","#C6E2FF");
		}	
		function refresh() {
			$("#lg_form select").each(function(){
				$(this).val(-1);
				
			})
			findGroup();
		}
	</script>
</html>
<!-- <style>

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
</style> -->
