<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/common/meta.jsp"%>
<script type="text/javascript" src="<s:url value='/scripts/frame/wmsOutBoundReset.js' includeParams='none' encode='false'><s:param name="version"><s:property value="#VERSION" /></s:param></s:url>"></script>
<title><s:text name="title.system.outbounddata.maintain"></s:text></title>
</head>
<body style="background-color: #f2f2f2;" contextpath="<%=request.getContextPath() %>">
	<form id="queryForm" name="queryForm">
		<table>
			<tr>
				<td class="label">作业单:</td>
				<td colspan="3"><textarea loxiaType="input" trim="true" id="codeList" name="codeList"></textarea></td>
				<td colspan="2"><label style="color:red; font-size:14px">
					支持多个单据号同时查询。多个单据号，以英文逗号分隔
				</label></td>
			</tr>
		</table>
	</form>
	<div class="buttonlist">
		<button type="button" loxiaType="button" class="confirm" id="search" ><s:text name="button.search"></s:text> </button>
		<button type="button" loxiaType="button" id="reset"><s:text name="button.reset"></s:text> </button>
	</div>
	<table id="tbl-orderList"></table>
	<div id="pager"></div>
	<div class="buttonlist">
		<button type="button" loxiaType="button" class="confirm" id="send">错误次数重置为0</button>
	</div>
</body>
</html>