<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@include file="../../common/meta.jsp"%>
<title><s:text name="betweenlibary.title.inwarehouse"/></title>
<script type="text/javascript" src="<s:url value='/scripts/frame/warehouse/pickinglist-secondaryopc.js"' includeParams='none' encode='false'/>"></script>
<script type="text/javascript" src="<s:url value='/scripts/frame/warehouse/priority_city_config.js' includeParams='none' encode='false'/>"></script>

<style>
.showborder {
	border: thin;
}
</style>

</head>
<body style="background-color: #f2f2f2;" contextpath="<%=request.getContextPath() %>">
	<div id="staInfo">
	<form action="/generationPendingList.json" method="post" id="query-form">
		<span class="label" style="font-size: 15px;" >基础条件</span>
		<table id="filterTable" width="95%">
				<tr>
					<td class="label" width="13%"><s:text name="label.warehouse.pl.createtime"></s:text> </td>
					<td width="20%"><input loxiaType="date" name="fromDate" showtime="true"/></td>
					<td class="label" width="13%"><s:text name="label.warehouse.pl.to"></s:text> </td>
					<td width="20%"><input loxiaType="date" name="toDate" showtime="true"/></td>
					<td class="label" width="13%"><s:text name="label.warehouse.pl.sta"></s:text> </td>
					<td width="20%"><input name="sta.code" loxiaType="input" trim="true"/></td>
				</tr>
				<tr>
					<td class="label"><s:text name="label.warehouse.pl.refcode"></s:text> </td>
					<td><input name="sta.refSlipCode" loxiaType="input" trim="true"/></td>
					<td class="label" style="color: red;"><s:text name="label.warehouse.sta.isneedinvoice"></s:text> </td>
					<td>
						<select id="selIsNeedInvoice" name="isNeedInvoice" loxiaType="select">
							<option value="">--请选择是否需要发票--</option>
							<option value="1"><s:text name="label.warehouse.sta.isneedinvoice.true"></s:text> </option>
							<option value="0"><s:text name="label.warehouse.sta.isneedinvoice.false"></s:text></option>
						</select>
					</td>
					<td class="label">优先发货城市</td>
					<td>
						<select name="city" id="priorityCity" loxiaType="select">
							<option value="">请选择</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td class="label" style="color: red;"><s:text name="label.warehouse.pl.sta.delivery"></s:text> </td>
					<td>
						<select name="sta.staDeliveryInfo.lpCode" id="selLpcode" loxiaType="select">
							<option value="">--请选择物流商--</option>
						</select>
					</td>
					<td class="label" >商品大小(<font style="color: red;">默认小件</font>)</td>
					<td id="skuConfigtd">
					</td>
					<td class="label"  style="color: red;">是否特殊处理</td>
					<td>
						<select name="sta.isSpecialPackaging" id="selIsSpPg" loxiaType="select">
							<option value="false">否</option>
							<option value="true">是</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="label" ></td>
					<td>
						<select name="sta.industryId" id="industryId" loxiaType="select">
							<option value="">--请选择行业--</option>
						</select>
					</td>
					<td class="label">商品分类</td>
					<td>
						<select name="categoryId" id="categoryId" loxiaType="select">
							<option value="">--请选择商品分类--</option>
						</select>
					</td>
					<td class="label">状态</td>
					<td>
						<select name="sta.status" id="status" loxiaType="select">
							<option value="">--请选择状态--</option>
							<option value="CREATED">已创建</option>
							<option value="FAILED">配货失败</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="label" style="color:blue">是否含SN号商品</td>
					<td>
						<select name="isSn" id="isSn" loxiaType="select">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</td>
					<td class="label" style="color:blue">运单时限类型</td>
					<td>
						<select name="transTimeType" id="transTimeType" loxiaType="select" >
							<option value="">--请选择运单时限类型--</option>
							<option value="1">普通</option>
							<option value="3">及时达</option>
							<option value="5">当日</option>
							<option value="6">次日</option>
							<option value="7">次晨</option>
							<option value="8">云仓专配次日</option>
							<option value="9">云仓专配隔日</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="label"  style="color: red;" width="13%"><s:text name="label.warehouse.sta.shop"></s:text> </td>
					<td width="20%">
						<div>
							<button type="button" loxiaType="button" class="confirm" id="btnSearchShop" >查询店铺</button>
						</div>
					</td>
					<td colspan="2">
						<div id="showShopList">
						</div>
						<input type="hidden" value="" id="postshopInput" />
					</td>
					<td class="label"  style="color: red;" width="13%">仓库</td>
					<td width="20%">
						<select id="selTrans" loxiaType="select" loxiaType="select">
							<option value="">--请选择仓库--</option>
						</select>
					</td>
				</tr>
			</table>
	</form>
	<div class="buttonlist">
		<button type="button" id="btn-query" loxiaType="button" class="confirm"><s:text name="button.search"></s:text> </button>
		<button type="button" loxiaType="button" id="reset"><s:text name="button.reset"></s:text> </button>
		<br /><br />
		<table id="tbl-staList-query"></table>
		<div id="pager_query"></div>
		<br/>
		<button type="button" loxiaType="button" id="confirm" class="confirm"><s:text name="button.pl.create"></s:text> </button>
		<br/><br/>
	<table>
			<tr>
				<td class="label">
					每批单据数，不填为无限制
				</td>
				<td width="60">
					<input loxiaType="number" id="autoSize" value="100"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					生成配货批数量，不填为全部创建
				</td>
				<td width="60">
					<input loxiaType="number" id="plCount"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button id="autoConfirm" type="button" loxiaType="button" class="confirm"><s:text name="button.pl.create.auto"></s:text> </button>
				</td>
			</tr>
	</table>
	</div>
</div>
<div id="staLineInfo" class="hidden">
	<table id="filterTable">
		<tr>
			<td class="label" width="15%"><s:text name="label.warehouse.pl.sta"></s:text> </td>
			<td width="15%"><span id="s_code"></span></td>
			<td class="label" width="15%"><s:text name="label.warehouse.pl.createtime"></s:text> </td>
			<td width="20%" ><span id="s_createTime"></span></td>
			<td width="15%" class="label"><s:text name="label.warehouse.pl.status"></s:text> </td>
			<td width="15%"><span id="s_status"></span></td>
		</tr>
		<tr>
			<td class="label"><s:text name="label.warehouse.pl.refcode"></s:text> </td>
			<td><span id="s_slipCode"></span></td>
			<td class="label"><s:text name="label.warehouse.sta.shop"></s:text> </td>
			<td colspan="3"><span id="s_owner"></span></td>
		</tr>
		<tr>
			<td class="label"><s:text name="label.warehouse.pl.sta.trantype"></s:text> </td>
			<td><span id="s_type"></span></td>
			<td class="label"><s:text name="label.warehouse.pl.sta.delivery"></s:text> </td>
			<td width="15%"><span id="s_trans"></span></td>
			<td class="label"><s:text name="label.warehouse.sta.isneedinvoice"></s:text> </td>
			<td><span id="s_inv"></span></td>
		</tr>
	</table>
	<table id="tbl_detail_list"></table>
	<div class="buttonlist">
		<button type="button" loxiaType="button" id="back" class="confirm"><s:text name="button.back"></s:text> </button>
	</div>
	<jsp:include page="/common/include/include-shop-query-multi.jsp"></jsp:include>
</div>
</body>
</html>