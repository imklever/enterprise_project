var extBarcode = null;
var outboundSn = null;
$j.extend(loxia.regional['zh-CN'],{
	ENTITY_INMODE				:	"上架批次处理模式",
	ENTITY_EXCELFILE			:	"正确的excel导入文件",
	ENTITY_STA_CREATE_TIME		:	"作业创建时间",
	ENTITY_STA_ARRIVE_TIME		:	"预计到货日期",
	ENTITY_STA_CODE				:	"作业单号",
	ENTITY_STA_PROCESS			:	"执行情况",
	ENTITY_STA_UPDATE_TIME		:	"上次执行时间",
	ENTITY_STA_PO				:	"源仓库",
	ENTITY_STA_OWNER			:	"店铺名称",
	ENTITY_STA_SUP				:	"供应商名称",
	ENTITY_STA_SEND_MODE		:	"送货方式",
	ENTITY_STA_REMANENT			:	"剩余计划入库量（件）",
	ENTITY_STA_COMMENT			:	"作业单备注",
	ENTITY_SKU_BARCODE			:	"条形码",
	ENTITY_SKU_JMCODE			:	"商品编码",
	ENTITY_SKU_KEYPROP			:	"扩展属性",
	ENTITY_SKU_NAME				:	"商品名称",
	ENTITY_SKU_SUPCODE			:	"货号",
	ENTITY_STALINE_TOTAL		:	"计划量执行量",
	ENTITY_STALINE_COMPLETE		:	"已执行量",
	ENTITY_STALINE_CURRENT		:	"本次执行量",
	ENTITY_LOCATION				:	"库位",
	ENTITY_LOCATION_CAPACITY	:	"库容",
	ENTITY_LOCATION_CURRENT		:	"当前库存数",
	ENTITY_LOCATION_ADD			:	"上架数",			
	INVALID_QTY					:	"第{0}行的收货数量不是有效的数字类型!",
	INVALID_QTY_G				:	"第{0}行的本次执行量大于未收货的数量,请核对每个商品[或许存在相同的商品]的本次执行量!",
	LABEL_ENPTY					:	"无",
	LABEL_BARCODE				:	"切换为使用条码方式录入",
	LABEL_JMCODE				:	"切换为使用商品编码方式录入",
	LABEL_TOTAL					:	"总计：",
	INVALID_NOT_EXIST 			:	"{0}不正确/不存在",
	MSG_CONFIRM_CLOSESTA		:	"您确定要关闭本次库间移入收货吗?",
	MSG_NO_ACTION				:	"本次收货数量为0!",
	MSG_CLOSESTA_FAILURE		:	"关闭作业申请单失败!",
	MSG_CONFIRM_CANCEL_STV		:	"如果返回，前面的操作将全部作废。您确定要返回吗?",
	MSG_ERROR_INMODE			:	"当前库位不满足单批隔离上架模式!",
	MSG_ERROR_LOCATION_QTY		:	"当前库位库容不能满足当前上架数量!",
	MSG_ERROR_STALINE_QTY		:	"实际上架数量≠计划量",
	MSG_WARN_STALINE_QTY		:	"实际输入的上架数量小于计划量,差异的数据录入到虚拟仓!",
	TABLE_CAPTION_STA			:	"库间移入待收货列表",
	TABLE_CAPTION_STALINE		:	"库间移入待收货明细表",
	MSG_LOCATION_CAPACITY		:	"不限",
	ENTITY_STALINE_SNS			:	"SN序列号",			
	LABEL_ADD_SNS				:	"维护序列号",
	INVALID_SN					:	"请按正确的格式填写SN序列号",
	INVALID_SN_LINE				:	"请按正确的格式填写第{0}行SN序列号",
	OPERATING 					:	"商品上架情况打印中，请等待...",
	CORRECT_FILE_PLEASE         :   "请选择正确的Excel导入文件"
});

function i18(msg, args){return loxia.getLocaleMsg(msg,args);}
function divToggle(id){
	if($j(id).hasClass("hidden")){
		$j(id).removeClass("hidden");
	}else{
		$j(id).addClass("hidden");
	}
}
function staListToggle(){	divToggle("#div-sta-list");}
function staToggle(){divToggle("#div-sta-detail");}
function stvToggle(){divToggle("#div-stv");}
function showdetail(obj){
	staListToggle();
	var staId=$j(obj).parent().parent().attr("id");
	var sta=$j("#tbl-inbound-purchase").jqGrid("getRowData",staId);
	$j("#staId").val(staId);
	$j("#createTime3").val(sta.createTime);
	$j("#po3").val(sta.refSlipCode);
	$j("#owner3").val(sta.owner);
	$j("#supplier3").val(sta.supplier);
	$j("#status3").val($j(obj).parent().next().html());
	$j("#left3").val(sta.remnant);
	if(!sta['stvId']){//没有未完成的STV
		staToggle();
//	 	$j("div-sta-detail").removeClass("hidden");
//	 	$j("#tbl-shelve").addClass("hidden");
		$j("#tbl-orderNumber").jqGrid('setGridParam', // stvLineListThreePl   stalinelist
			{url:$j("body").attr("contextpath")+"/stvlinelistthreepl.json?sta.id="+staId}).trigger("reloadGrid",[{page:1}]);
		$j("#createTime,#createTime2").html(sta.createTime);
		$j("#po,#po2").html(sta.refSlipCode);
		$j("#owner,#owner2").html(sta.owner);
		$j("#supplier,#supplier2").html(sta.supplier);
		$j("#status,#status2").html($j(obj).parent().next().html());
		$j("#left,#left2").html(sta.remnant);
	}else{
		$j("#stvId").val(sta['stvId']);
		$j("#nowNum").val(sta['stvTotal']);
		tostvInfo(sta['stvId'],sta);
	}
	$j("#barCode").trigger("focus");
}
//条码扫描模块
//返回<条码,行>,存在相同的条码的时候,只保存第一个
function getBarCodeMap(){
	var codeMap={};
	$j.each($j("#tbl-orderNumber").jqGrid("getRowData"),function(i,row){
		if(!codeMap[row['barCode']]){//不存在相同的条码则添加
			codeMap[row['barCode']]=row;	
		}
	});
	return codeMap;
}
//条码checkmaster
function checkBarCode(value,obj){
	if($j.trim(value).length==0)return loxia.SUCCESS;
	if(getBarCodeMap()[$j.trim(value)]){
		return loxia.SUCCESS;
	}
	for(var key in extBarcode){
		for(var i in extBarcode[key]){
			if($j.trim(value) == extBarcode[key][i]){
				return loxia.SUCCESS;
			}
		}
	}
	return i18("INVALID_NOT_EXIST",i18("ENTITY_SKU_BARCODE"));
	
}
//reset条码扫描后的表单
function resetBarCodeForm(id){
	$j("#tbl-orderNumber").jqGrid('resetSelection');
	$j("#tbl-orderNumber").jqGrid('setSelection',id);
	loxia.byId("barCodeCount").setEnable(false);
	document.getElementById("addForm").reset();
	$j("#barCode").removeClass("ui-loxia-error").focus();
	loxia.tip($j("#barCode"));
}
//商品编码手动输入模块
//返回<商品编码_扩展属性,行>,存在相同商品编码_扩展属性,只保存第一个
function getCodeMap(){
	var codeMap={};
	$j.each($j("#tbl-orderNumber").jqGrid("getRowData"),function(i,row){
		if(!codeMap[row['jmcode']+"_"+$j.trim(row['keyProperties'])]){
			codeMap[row['jmcode']+"_"+$j.trim(row['keyProperties'])]=row;
			codeMap[row['jmcode']]=row['jmcode'];
		}
	});
	return codeMap;
}
//根据商品编码,返回扩展属性数组
function getKeyProps(code){
	var arr=[];
	$j.each($j("#tbl-orderNumber").jqGrid("getRowData"),function(i,row){
		if(row['jmcode']==code){
			if(!$j.trim(row['keyProperties']))
				arr.push($j.trim(row['keyProperties']));
		}
	});
	return arr.sort();
}
//商品编码checkmaster
function checkJmCode(value,obj){
	if($j.trim(value).length==0)return loxia.SUCCESS;
	var code=$j.trim(value),sku=getCodeMap()[code];
	var $proplist = $j("#keyProps");
	refreshKeyProps();
	if(sku){//当前jqgrid已经有指定的商品编码
			$j.each(getKeyProps(code),function(i,e){
				$j('<option value="'+e+'">'+(e==''?i18("LABEL_ENPTY"):e)+'</option>').appendTo($proplist);
			});
		return loxia.SUCCESS;
	}else{
		return i18("INVALID_NOT_EXIST",i18("ENTITY_SKU_JMCODE"));//getSkus(value,obj);
	}	
}
function refreshKeyProps(){
	var obj=$j("#keyProps");
	$j("#keyProps option").remove();
	$j('<option value="select">'+i18("LABEL_SELECT")+'</option>').appendTo(obj);
}
function getPostData(receiveAll,staId){
	var postData={},index=-1,total=0;
	postData['stv.sta.id']=staId;
	$j.each($j("#tbl-orderNumber").jqGrid("getRowData"),function(i,row){
		var addQuantity=$j.trim($j("#tbl-orderNumber tr[id="+row['id']+"] :input").val());
		var completeQuantity=row['completeQuantity'];
		if(receiveAll||addQuantity.length>0){
			if(receiveAll){
				addQuantity=row['quantity']-completeQuantity;
			}else{
				addQuantity=parseInt(addQuantity,10);
			}
			if(isNaN(addQuantity)||addQuantity<0){
					postData['error']=i18("INVALID_QTY",i+1);
					return ;
			}
			if(row['quantity']-completeQuantity<addQuantity){
				postData['error']=i18("INVALID_QTY_G",i+1);
				return ;
			}else if(addQuantity>0){
				index+=1;
				postData['stv.stvLines['+index+'].quantity']=addQuantity;
				postData['stv.stvLines['+index+'].skuCost']=row['skuCost'];
				postData['stv.stvLines['+index+'].sku.id']=row['skuId'];
				postData['stv.stvLines['+index+'].sku.barCode']=row['barCode'];
				postData['stv.stvLines['+index+'].staLine.id']=row['id'];	
				if($j("#tbl-orderNumber tr[id="+row['id']+"] td:last").html()!=""){
					var sn=$j("#tbl-orderNumber tr[id="+row['id']+"] .sns").val();
					if(sn&&sn.length>0&&sn.split(",").length==addQuantity){
						postData['stv.stvLines['+index+'].sns']=$j("#tbl-orderNumber tr[id="+row['id']+"] .sns").val();
					}else{
						postData['error']=i18("INVALID_SN_LINE",i+1);
				return ;
					}
				}
				total+=addQuantity;
			}
		}
	});
	postData['total']=total;
	$j("#nowNum").val(total);
	return postData;
}
function addsns(obj){
//	if($j("#needSn").attr("checked")){
		var id=$j(obj).parents("tr").attr("id");
		var text=$j(obj).parent('td').find(".sns");
		if(!text||text.length==0){
			text=$j("<input type='hidden' class='sns' />").appendTo($j(obj).parent('td'));
		}
//		$j("#sns").val(text.val());
		reloadgrid(text.val());
		$j("#dialog-sns").attr('targetId',id).dialog("open");	
//	}else{
//		alert("请确定'是否必须填写SN序列号'再执行本次操作");
//	}
	}
function reloadgrid(value){
	var index=1;
	$j("#tbl-sns").jqGrid("clearGridData");
	if(value&&value.length>0){
		var arr=value.split(","),index=arr.length;
		for(var i=0;i<arr.length;i++){
			var row={};
			row["id"]=i;
			row["sns"]=arr[i];
			$j("#tbl-sns").jqGrid('addRowData',i+1,row);
		}
		index+=arr.length;
	}
	$j("#snsindex").val(index);
}
function valtext(obj){
	var arr=[];
	$j.each($j("#tbl-sns").jqGrid("getRowData"),function(i,row){
		arr.push(row["sns"]);
	});
	$j(obj).val(arr.join(","));
}

$j(document).ready(function (){
	$j("#dialog-sns").dialog({title: "SN序列号", modal:true, autoOpen: false, width: 400});
	$j("#needSn").click(function(){
		$j("#tbl-orderNumber .ui-button").toggle();
	});
	$j("#confirmsns").click(function(){
		var targetId=$j("#dialog-sns").attr('targetId');
			var addQuantity=$j.trim($j("#tbl-orderNumber tr[id="+targetId+"] td[aria-describedby$='quantity']").text()),sns_len=$j("#tbl-sns").jqGrid("getDataIDs").length;
			if(sns_len!=addQuantity){
				if(confirm("SN序列号个数="+sns_len+", 与本次执行量="+addQuantity+"不相等, 您确定SN序列号的个数正确?")){
					$j("#tbl-orderNumber tr[id="+targetId+"] input[name='addQuantity']").val(sns_len);
				}
			} else {
				$j("#tbl-orderNumber tr[id="+targetId+"] input[name='addQuantity']").val(sns_len);
			}
			valtext($j("#tbl-orderNumber tr[id="+targetId+"] .sns"));
			$j("#dialog-sns").dialog("close");
	});	
	$j("#tbl-sns").jqGrid({
		datatype: "local",
		colNames: ["ID",i18("ENTITY_STALINE_SNS")],
		colModel: [
		           {name: "id", index: "id", hidden: true},		         
		           {name: "sns", index: "sns",sortable:false}],
		caption: i18("ENTITY_STALINE_SNS"),
	   	sortname: 'sns',
	    multiselect: true,
		sortorder: "desc",
		width:300,
		height:"auto",
		rownumbers:true,
		rowNum:-1,
		jsonReader: { repeatitems : false, id: "0" }
	});
	reloadgrid();
	
	//SN对对话框删除选中行
	$j("#delSelRows").click(function(){
		var ids = $j("#tbl-sns").jqGrid('getGridParam','selarrrow');
		for(var id in ids){
			$j("#tbl-sns tr[id='" + ids[id] + "']").remove();
		}
	});
	
	$j("#snscode").keydown(function(evt){
		if(evt.keyCode === 13){
			evt.preventDefault();
			var reg=/^[a-zA-Z0-9]+$/,sns=$j("#snscode").val();
			
			//判断SN号是否是出库SN号
			if(outboundSn == null){
				jumbo.showMsg("未找到入库SN号");
				return;
			}
			var isOutSn = false;
			for(var i in outboundSn){
				if(outboundSn[i].sn == sns){
					var data = $j("#tbl-orderNumber").jqGrid("getRowData",$j("#dialog-sns").attr("targetid"));
					var barcode = data.barCode;
					if(barcode != outboundSn[i].barcode){
						jumbo.showMsg("入库SN号与商品不匹配！");
						return ;
					}
					isOutSn = true;
					break;
				}
			}
			if(!isOutSn){
				jumbo.showMsg("SN号 : [" + sns + "] 非移库出库SN号");
				return;
			}
			
			//判断重复
			var isSame = false;
	 		$j("#tbl-sns tr[id]").each(function(i,tr){
	 			var data = $j("#tbl-sns").jqGrid("getRowData",$j(tr).attr("id"));
	 			if(data["sns"] == sns){
	 				jumbo.showMsg("输入SN号重复");
	 				isSame = true;
	 			}
	 		});
	 		if(isSame){
	 			return;
	 		}
			
			if(sns&&sns.length>0&&reg.test(sns)){
				var row={},index=$j("#snsindex").val();
				row["id"]=index;
				row["sns"]=sns;
				$j("#tbl-sns").jqGrid('addRowData',index,row);
				$j("#snsindex").val(++index);
				$j("#snscode").val("");
			}else{
				loxia.tip($j("#snscode"),"请按正确的格式输入SN序列号");
			}
		}
	});
	var entry=$j("body").attr("contextpath")+"/warehouse/externaltransentry.do";
	var status=loxia.syncXhr($j("body").attr("contextpath") + "/formateroptions.json",{"categoryCode":"whSTAProcessStatus"});
	if(!status.exception){
		//STA作业申请单
		$j("#tbl-inbound-purchase").jqGrid({
			url:$j("body").attr("contextpath")+"/stalistjsonnopagination.json?sta.intType=32",
			datatype: "json",
			colNames: ["ID","STVID","STVTOTAL","STVMODE",i18("ENTITY_STA_CREATE_TIME"),//i18("ENTITY_STA_ARRIVE_TIME"),
			           i18("ENTITY_STA_CODE"),
				i18("ENTITY_STA_PROCESS"),i18("ENTITY_STA_UPDATE_TIME"),i18("ENTITY_STA_PO"),
				i18("ENTITY_STA_REMANENT"),i18("ENTITY_STA_COMMENT")],
			colModel: [
			           {name: "id", index: "id", hidden: true},		         
			           {name: "stvId", index: "stvId", hidden: true},		         
			           {name: "stvTotal", index: "stv_total", hidden: true},		         
			           {name: "stvMode", index: "stv_mode", hidden: true},		         
			           {name: "createTime", index: "sta.create_time", width: 200, resizable: true,sortable:false},
			           //{name: "arriveTime",  width: 200, resizable: true,sortable:false},
			           {name: "code", index: "sta.code",formatter:"linkFmatter", formatoptions:{onclick:"showdetail"}, width: 200, resizable: true,sortable:false},
			           {name: "processStatus", index: "status", width: 100, resizable: true,
				        	   formatter:'select',editoptions:status,sortable:false},
			           {name: "inboundTime", index: "inbound_time", width: 200, resizable: true,sortable:false},
			           {name: "mainName", index: "mainName", width: 150, resizable: true,sortable:false},
		               {name: "remnant", index: "remnant", width: 100, resizable: true,sortable:false},
		               {name:"memo",index:"memo",width:150,resizable:true,sortable:false}],
			caption: i18("TABLE_CAPTION_STA"),
			postData:{"columns":"id,stvId,stvTotal,stvMode,createTime,arriveTime,code,processStatus,inboundTime,mainName,remnant,memo"},
	   	sortname: 'sta.create_time',
	    multiselect: false,
		sortorder: "desc",
		width:"auto",
		height:"auto",
		loadonce:true,
		viewrecords: true,
   		rownumbers:true,
		rowNum:-1,
		jsonReader: { repeatitems : false, id: "0" }
		});
	}else{
		jumbo.showMsg(i18("ERROR_INIT"));
	}
	//STA作业申请单行
	$j("#tbl-orderNumber").jqGrid({
		datatype: "json",
		colNames: ["ID","STAID","SKUID","OWNER","skuCost",i18("ENTITY_SKU_BARCODE"),i18("ENTITY_SKU_JMCODE"),i18("ENTITY_SKU_KEYPROP"),
			i18("ENTITY_SKU_NAME"),i18("ENTITY_SKU_SUPCODE"),i18("ENTITY_STALINE_TOTAL"),
			i18("ENTITY_STALINE_COMPLETE"),i18("ENTITY_STALINE_CURRENT"),i18("ENTITY_STALINE_SNS")],
		colModel: [
		           {name: "id", index: "id", hidden: true,sortable:false},	
		           {name: "sta.id", index: "sta.id", hidden: true,sortable:false},	
		           {name: "skuId", index: "sku.id", hidden: true,sortable:false},	
		           {name: "owner", index: "owner", hidden: true,sortable:false},	
		           {name: "skuCost", index: "skuCost", hidden: true,sortable:false},	
		           {name: "barCode", index: "sku.BAR_CODE", width: 100, resizable: true,sortable:false},
		           {name: "jmcode", index: "sku.JM_CODE", width: 100, resizable: true,sortable:false},
		           {name: "keyProperties", index: "sku.KEY_PROPERTIES", width: 120, resizable: true,sortable:false},
		           {name: "skuName", index: "sku.name", width: 80, resizable: true,sortable:false},
		           {name: "jmskuCode", index: "sku.SUPPLIER_CODE", width: 120, resizable: true,sortable:false},
		           {name: "quantity", index: "quantity", width: 100, resizable: true,sortable:false},
		           {name: "completeQuantity", index: "completeQuantity", width: 100, resizable: true,sortable:false},  // completeQuantity  totalQuantity
	               {name: "addQuantity", hidden: true,formatter:"loxiaInputFmatter", formatoptions:{loxiaType:"number",min:"0"}, width: 160, resizable: true,sortable:false},
	              	{name: "isSnSku", width: 120,resizable:true,sortable:false, formatter:"boolButtonFmatter", formatoptions:{"buttons":{label:i18("LABEL_ADD_SNS"), onclick:"addsns(this,event);"}}},
	               ],
		caption: i18("TABLE_CAPTION_STALINE"),
	   	sortname: 'isSnSku,sku.bar_Code',
	    multiselect: false,
		viewrecords: true, 
	    postData:{"columns":"id,skuId,owner,skuCost,isSnSku,barCode,jmcode,keyProperties,skuName,jmskuCode,quantity"},
		sortorder: "desc", 
		height:"auto",
		loadonce:true,
		viewrecords: true,
	   	rownumbers:true,
		rowNum:-1,
		jsonReader: { repeatitems : false, id: "0" },
		loadComplete:function(){
			loxia.initContext($j("#tbl-orderNumber"));
			var postData = {};
			$j("#tbl-orderNumber tr:gt(0)>td[aria-describedby$='barCode']").each(function (i,tag){
				postData["skuBarcodes[" + i + "]"] = $j(tag).html();
			});
			extBarcode = loxia.syncXhr($j("body").attr("contextpath") + "/findskuBarcodeList.json",postData);
			
			var staid = $j("#staId").val();
			var rs = loxia.syncXhr($j("body").attr("contextpath") + "/findOutBoundSn.json",{"staid" : staid});
			if( rs && rs.sns){
				outboundSn = rs.sns;
			}
		}
	});
	//条码
	loxia.byId("barCodeCount").setEnable(false);
	$j("#barCode,#barCodeCount").keydown(function(evt){
		if(evt.keyCode === 13){
			evt.preventDefault();
			var count = parseInt($j("#barCodeCount").val()||"1",10);
			var barcode = $j.trim($j("#barCode").val());
			if(barcode!=""){
				var sku=getBarCodeMap()[barcode];
				if(!sku){
					for(var key in extBarcode){
						for(var i in extBarcode[key]){
							if(barcode == extBarcode[key][i]){
								sku = getBarCodeMap()[key];
								break;
							}
						}
						if(sku){
							break;
						}
					}
				}
				if(sku){
					if (!sku.isSnSku == ''){
						jumbo.showMsg("条码为：" + sku.barCode + "的商品必须输入SN号");
						return;
					}else {
						var addQuantity=$j.trim($j("#tbl-orderNumber tr[id="+sku['id']+"] :input").val());
						if(addQuantity.length==0) addQuantity=0;
						else	addQuantity=parseInt(addQuantity,10);
						if(isNaN(addQuantity)||addQuantity<0){
							loxia.tip($j("#tbl-orderNumber tr[id="+sku['id']+"] :input"),i18("INVALID_NUMBER"));
						}else{
							sku['addQuantity']= addQuantity-0 + (isNaN(count)?1:count);
							$j("#tbl-orderNumber").jqGrid('setRowData',sku['id'],sku);
							resetBarCodeForm(sku['id']);
							loxia.initContext($j("#tbl-orderNumber"));
						}
					}
				}else{
					loxia.tip($j("#barCode"),i18("INVALID_NOT_EXIST",i18("ENTITY_SKU_BARCODE")));
				}
			}else{
				loxia.tip($j("#barCode"),i18("INVALID_ENTITY_EMPTY",i18("ENTITY_SKU_BARCODE")));
			}
		}
	});	
	//条码方式录入
	$j("#barCodeAdd").click(function(){
		loxia.byId("barCodeCount").setEnable(true);
		$j("#barCodeCount").select(); 
	});
	//切换条码录入/编码录入
	$j("#switch-op-mode").click(function(){
		if($j(this).attr("current") === "barcode-select"){
			$j("#barcode-select").hide();
			$j("#code-select").show();
			$j(this).attr("current","code-select").button("option","label",i18("LABEL_BARCODE"));
		}else{
			$j("#code-select").hide();
			$j("#barcode-select").show();
			$j(this).attr("current","barcode-select").button("option","label",i18("LABEL_JMCODE"));
		}
	});
	//扩展属性
	$j("#keyProps").change(function(){
			var sku=getCodeMap()[$j.trim($j("#skuCode").val())+"_"+$j(this).val()];
			if(sku){
				$j("#skuName").html(sku['skuName']);
				$j("#supplierCode").html(sku['skujmCode']);
			}
	});
	$j("#skuCount").focus(function(){
		$j(this).select();
	});
	//编码录入方式按钮
	$j("#skuAdd").click(function(){
		if($j("#skuCode").val().length==0){
			loxia.tip($j("#skuCode"),i18("INVALID_ENTITY_EMPTY",i18("ENTITY_SKU_JMCODE")));
			return;
		}
		if($j("#keyProps option:selected").text()==i18("LABEL_SELECT")){
			loxia.tip($j("#keyProps"),i18("INVALID_MAND",i18("ENTITY_SKU_KEYPROP")));
			return;
		}
		var count = parseInt($j("#skuCount").val(),10),
		sku=getCodeMap()[$j.trim($j("#skuCode").val())+"_"+$j("#keyProps").val()];
		if(sku){
			if (!sku.isSnSku == ''){
				jumbo.showMsg("条码为：" + sku.barCode + "的商品必须输入SN号");
				return;
			}else {
				var addQuantity=$j.trim($j("#tbl-orderNumber tr[id="+sku['id']+"] :input").val());
				if(addQuantity.length==0) addQuantity=0;
				else	addQuantity=parseInt(addQuantity,10);
				if(isNaN(addQuantity)||addQuantity<0){
					loxia.tip($j("#tbl-orderNumber tr[id="+sku['id']+"] :input"),i18("INVALID_NUMBER"));
				}else{
					sku['addQuantity']= addQuantity-0 + (isNaN(count)?1:count);
					$j("#tbl-orderNumber").jqGrid('setRowData',sku['id'],sku);
					$j("#tbl-orderNumber").jqGrid('resetSelection');
					$j("#tbl-orderNumber").jqGrid('setSelection',sku['id']);
					refreshKeyProps();
					$j("#skuCode").val("");$j("#skuCount").val(1);
					$j("#skuName,#supplierCode").html("");
					$j("#skuCode").focus();
				}
			}
		}else{
			loxia.tip($j("#skuCode"),i18("INVALID_NOT_EXIST",i18("ENTITY_SKU_JMCODE")));
		}
		loxia.initContext($j("#tbl-orderNumber"));
		if($j("needSn").attr("checked")){
				$j("#tbl-orderNumber .ui-button").show();
		}else{
				$j("#tbl-orderNumber .ui-button").hide();
		}
	});
	$j("#skuCode").bind("blur",function(){
		checkJmCode($j("#skuCode").val(),this);
	});
	
    //执行入库
	$j("#executeInventory").click(function(){
		if(confirm(i18("MSG_CONFIRM"))){
			var stvId=$j("#stvId").val();
			var staId=$j("#staId").val();
			executeInventory(false,stvId,staId);
		}
	});
	
		
	$j("#receive,#receiveAll").click(function(){
		var postData=getPostData(true,$j("#staId").val());
		postData['staId']=$j("#staId").val();
		if(postData['error']){
			jumbo.showMsg(postData['error']);
		}else if(($j(this).attr("id")=="receive" || $j(this).attr("id")=="pdaReceive")&&(!postData['stv.stvLines[0].sku.id'])){
			jumbo.showMsg(i18("MSG_NO_ACTION"));
			return true;
		} else if(confirm(i18("MSG_CONFIRM"))){
			loxia.lockPage();
			loxia.asyncXhrPost($j("body").attr("contextpath") + "/transCrossInboundReceive.json",
				postData,
				{
				success:function (data) {
					loxia.unlockPage();
					if(data&&data.msg){
						jumbo.showMsg(i18("MSG_FAILURE")+data.msg);
						window.location=loxia.getTimeUrl(entry);
					}else{
						jumbo.showMsg(i18("MSG_SUCCESS"));
						$j("#stvId").val(data.stvId);
						staToggle();
						tostvInfo(data.stvId);
					}
				   },
				error:function(data){
					loxia.unlockPage();
						jumbo.showMsg(i18("MSG_FAILURE"));
					}
				});
		}
	});
	$j("#closeSta").click(function(){
		if(confirm(i18("MSG_CONFIRM_CLOSESTA"))){
			loxia.lockPage();
				loxia.asyncXhrPost($j("body").attr("contextpath") + "/closesta.json",
					{'sta.id':$j("#staId").val()},
					{
					success:function (data) {
						loxia.unlockPage();
						window.location=loxia.getTimeUrl(entry);
					   },
					error:function(data){
						loxia.unlockPage();
						jumbo.showMsg(i18("MSG_CLOSESTA_FAILURE"));
					}
					});
		}
	});
	
	$j("#export").click(function(){
		var iframe = document.createElement("iframe");
		iframe.src = loxia.getTimeUrl($j("body").attr("contextpath") + "/warehouse/staexportforpurchase.do?sta.id="+$j("#staId").val());
		iframe.style.display = "none";
		$j("#download").append($j(iframe));
	});
	
	$j("button[name='backto']").click(function(){
		 window.location=loxia.getTimeUrl(entry);
	});

	$j("#cancelStv").click(function(){
		if(confirm(i18("MSG_CONFIRM_CANCEL_STV"))){
			loxia.lockPage();
			loxia.asyncXhrPost($j("body").attr("contextpath") + "/cancelstv.json",
				{'stv.id':$j("#stvId").val()},
				{
				success:function (data) {
					loxia.unlockPage();
					if(data&&data.msg){
						jumbo.showMsg(data.msg);
					}
					window.location=loxia.getTimeUrl(entry);
				   },
				error:function(data){
					loxia.unlockPage();
					jumbo.showMsg(i18("MSG_FAILURE"));
					window.location=loxia.getTimeUrl(entry);
				}
				});
		}
	});
	
	/**
	* 打印上架商品情况
	*/
	$j("#printSkuInfo").click(function(){
		var stvId=$j("#stvId").val();
		var staId=$j("#staId").val();
		var plid = $j("#div2").attr("plId");
		jumbo.showMsg(i18("OPERATING"));//商品上架情况打印中，请等待...
		var url = $j("body").attr("contextpath") + "/json/printpurchaseinfo.do?stv.id=" + stvId;
		printBZ(loxia.encodeUrl(url),true);
	});
	
	/**
	 * 导入模版 导出
	 */
	$j("#inExport").click(function(){
		var iframe = document.createElement("iframe");
		iframe.src = loxia.getTimeUrl($j("body").attr("contextpath") + "/warehouse/externalInExport.do?sta.id="+$j("#staId").val());
		iframe.style.display = "none";
		$j("#download").append($j(iframe));
	});
	
	/**
	 * 导入
	 */
	$j("#inImport").click(function(){
		var file=$j.trim($j("#staFile").val()),errors=[];
		if(file==""||file.indexOf("xls")==-1){
			errors.push(i18("INVALID_MAND",i18("ENTITY_EXCELFILE")));
		}
		if(errors.length>0){
			jumbo.showMsg(errors.join("<br/>"));
		}else{
			$j("#importForm").attr("action", loxia.getTimeUrl($j("body").attr("contextpath") 
					+ "/warehouse/externalInImport.do?sta.id="+$j("#staId").val()));
			loxia.submitForm("importForm");
		}
	});
	
	// 导出明细
	$j("#exportInventory").click(function(){
		var iframe = document.createElement("iframe");
		iframe.src = loxia.getTimeUrl($j("body").attr("contextpath") + "/warehouse/invExportForPurchase.do?sta.id="+$j("#staId").val());
		iframe.style.display = "none";
		$j("#download").append($j(iframe));
	});
	
	// 导入
	$j("#importPurchaseInbound").click(function(){
		if(!/^.*\.xls$/.test($j("#file").val())){
			jumbo.showMsg(i18("CORRECT_FILE_PLEASE"));//请选择正确的Excel导入文件
			return false;
		}
		loxia.lockPage();
		$j("#importPurchaseInboundForm").attr("action",$j("body").attr("contextpath") + "/warehouse/importPurchaseInbound.do?sta.id=" + $j("#staId").val() + "&stv.id=" + $j("#stvId").val());
		$j("#importPurchaseInboundForm").submit();
	});

});
//根据stvId显示带有建议库位的预上架列表
function tostvInfo(stvId,sta){
	loxia.lockPage();
	stvToggle();
	loxia.asyncXhrPost(window.parent.$j("body").attr("contextpath")+"/json/stvinfogroupbatchcode.json",{	"stv.id":stvId},
		{
			success:function (data) {
			    if(data&&data.msg){
			    	loxia.unlockPage();
			    	jumbo.showMsg(data.msg);	
			    }else{
			    	showLines(data);
			    	loxia.unlockPage();
			    	loxia.initContext($j("#stvlineListtable"));
			    }
			}, 
				error:function(data){
				loxia.unlockPage();
				jumbo.showMsg(i18("MSG_FAILURE"));	
            }			   
		}); 	  
  }   
//显示带有建议库位的预上架列表  
function showLines(data){	
	var rs =[],header=getLocationsTableHeader(),foot=getLocationsTableFoot();
	$j("#stvlineListtable tr:gt(0)").remove();
	$j.each(data,function(i, line) {
		var html=[],templete=getLocationsTableTemplete(line);
		html.push(getSkuInfo(line));
		html.push("<form skuId=\""+line.skuId+"\" skuCost=\""+line.skuCost+"\" staLineId=\""+line.stalineId+"\" total=\""+line.totalQuantity+"\"  owner=\""+line.owner+"\" >");
		html.push(header);
		html.push(getLocationsTable(line));
		html.push(templete);
		html.push(foot);
		html.push(" </form></td></tr>");
    	rs.push(html.join(""));
    	  });
	  $j("#stvlineListtable tr:gt(0)").remove();
	  $j("#stvlineList").after(rs.join(""));
	  loxia.initContext($j("#div-stv"));
 }

//SKU信息 
function getSkuInfo(line){	 
	var html=[];
	html.push("<tr skuId=\""+line.skuId+"\" skuCost=\""+line.skuCost+"\" staLineId=\""+line.stalineId+"\" total=\""+line.totalQuantity+"\"  owner=\""+line.owner+"\" batchCode='"+line.batchCode+"' >");
	html.push("<td>"+line.barCode+"</td>");
	html.push("<td>"+line.skuCode+"</td>");
    html.push("<td>"+(!line.keyProperties?'&nbsp;':line.keyProperties)+"</td>");
    html.push("<td>"+line.skuName+"</td>");
    html.push("<td>"+line.supplierCode+"</td>");
    html.push("<td>"+line.owner+"</td>");
     html.push("<td class=\"decimal\">"+line.totalQuantity+"</td><td>");
    return html.join("");
}
//库位EditableTable表头
function getLocationsTableHeader(){	       
	    var html ="	<div loxiaType=\"edittable\" class=\"district\">"+
		"<table operation=\"add,delete\" append=\"0\" width=\"450\">"+
			"<thead>"+
				"<tr>"+
					"<th><input type=\"checkbox\" /></th>"+
					"<th width=\"300\">"+i18("ENTITY_LOCATION")+"</th>"+
					"<th>"+i18("ENTITY_LOCATION_CAPACITY")+"</th>"+
					"<th>"+i18("ENTITY_LOCATION_CURRENT")+"</th>"+
					"<th>"+i18("ENTITY_LOCATION_ADD")+"</th>"+
				"</tr>"+
			"</thead>";
	    return html;
}
//循环显示库位编码-上架数量列表
function getLocationsTable(line){
	var tb=[];
	var url=$j("body").attr("contextpath") + "/findallavaillocations.json";
	tb.push(" <tbody>");
	$j.each(line.stvLines,function(i, item) {
		//var url=$j("body").attr("contextpath") + "/findavaillocationforpurchase.json?sku.id="+line.skuId+"&stv.id="+$j("#stvId").val()+"&stv.owner="+line.owner;
		tb.push("<tr id=\""+item.id+"\" skuId=\""+line.skuId+"\" skuCost=\""+line.skuCost+"\" staLineId=\""+line.stalineId+"\"  owner=\""+line.owner+"\" batchCode='"+line.batchCode+"' >");
		tb.push("<td><input type=\"checkbox\" /></td>");
		var loc = item.locationCode == null ? '' : item.locationCode;
		tb.push("<td width=\"150\"><input loxiaType=\"input\"  value=\""+loc+"\" checkmaster=\"checklocation\" aclist=\""+url+"\" /></td>");
		tb.push("<td>"+(item.locationAvailable==0||item.locationAvailable==null?i18("MSG_LOCATION_CAPACITY"):item.locationAvailable)+"</td>");
		tb.push("<td>"+(item.locationInventory==0?'':item.locationInventory)+"</td>");
		tb.push("<td width=\"150\" class=\"decimal\"><input class=\"getcount\" value=\""+item.quantity+"\" checkmaster=\"checksjNum\"  loxiaType=\"number\" /></td>");
		tb.push("</tr>");
	   	});
	tb.push(" </tbody>");
	return tb.join("");	   
}
//新增库位-上架数量的模版
function getLocationsTableTemplete(line){
	  //var url=$j("body").attr("contextpath") + "/findavaillocationforpurchase.json?sku.id="+line.skuId+"&stv.id="+$j("#stvId").val()+"&stv.owner="+line.owner;
	  var url=$j("body").attr("contextpath") + "/findallavaillocations.json";
	  var tb2= " <tbody> "+
					"<tr  skuId=\""+line.skuId+"\" skuCost=\""+line.skuCost+"\" staLineId=\""+line.stalineId+"\"  owner=\""+line.owner+"\" batchCode='"+line.batchCode+"'>"+
					"<td><input type=\"checkbox\" /></td>"+
					"<td width=\"150\"><input  loxiaType=\"input\" checkmaster=\"checklocation\" aclist=\""+url+"\" /></td>"+
					"<td>&nbsp;</td>"+
					"<td>&nbsp;</td>"+
					"<td width=\"150\" class=\"decimal\"><input class=\"getcount\" checkmaster=\"checksjNum\" loxiaType=\"number\" aclist=\""+url+"\" /></td>"+
					"</tr>"+
					"</tbody> ";
				
	  return tb2;
}

//库位EditableTable.Foot
function getLocationsTableFoot(){
	var foot = " <tfoot>"+
				" <tr>"+
				"<td colspan=\"4\" class=\"decimal\">"+i18("LABEL_TOTAL")+"</td> "+
					" <td class=\"decimal\" id=\"total\" decimal=\"0\"></td>"+
				"</tr>"+
			"</tfoot> </table></div>";
	return foot;
}

function executeInventory(closeSta,stvId,staId){
	if(validateLocationQuantity()){
		var postData={},index=-1;
		$j.each($j("#stvlineList").nextAll(),function(i,tr){
			var skuId=$j(tr).attr("skuId"),staLineId=$j(tr).attr("staLineId"),owner=$j(tr).attr("owner");
			var batchCode = $j(tr).attr("batchCode");
			var skuCost = $j(tr).attr("skuCost");
			$j.each($j(tr).find("table tbody:eq(0) tr"),function(y,innerTr){
				if($j.trim($j(innerTr).find("td:eq(4) :input").val())>0){
					index+=1;
				postData["stvlineList[" + index + "].location.code"]=$j.trim($j(innerTr).find("td:eq(1) :input").val());
				postData["stvlineList[" + index + "].quantity"]=$j.trim($j(innerTr).find("td:eq(4) :input").val());
				postData["stvlineList[" + index + "].staLine.id"]=staLineId;
				postData["stvlineList[" + index + "].sku.id"]=skuId;
				postData["stvlineList[" + index + "].owner"]=owner;
				postData["stvlineList[" + index + "].batchCode"]=batchCode;
				postData["stvlineList[" + index + "].skuCost"]=skuCost;
				if($j(innerTr).attr("id")){
					postData["stvlineList[" + index + "].id"]=$j(innerTr).attr("id");	
				}
				}
			});
		});
		postData["stv.id"]=stvId;
		postData["sta.intStatus"]=closeSta?10:5;	
		loxia.asyncXhrPost(window.parent.$j("body").attr("contextpath")+"/json/executeinventory.json",postData,
		{
			success:function (data) {
				if(data&&data.message){
					 jumbo.showMsg(data.message);	
				}else{
					window.location=$j("body").attr("contextpath")+"/warehouse/externaltransentry.do";;
				}	
			}, 
	       error:function(){
				 jumbo.showMsg(i18("MSG_FAILURE"));	
			}			   
		}); 
	}
}
   
function closePO(){
	if(validateLocationQuantity()){
		executeInventory(true,$j("#stvId").val(),$j("#staId").val()); 
	}
}

/**
 * 检查上架数量
 * @return {TypeName} 
 */
function validateLocationQuantity(){
	var errMsg=[];
	$j.each($j("#stvlineList").nextAll(),function(i, tr) {
		if($j(tr).attr("total")!=$j(tr).find("#total").html()){
			errMsg.push($j(tr).find("td:eq(3)").html()+i18("MSG_ERROR_STALINE_QTY"));
		}    	
	});   
	if(errMsg.length>0){
		jumbo.showMsg(errMsg.join("<br/>")); 
		return false;
	}
	return true;
}


// 库位校验
function checklocation(value,obj){
	var code=$j.trim(value);	
	if(code.length==0){
		return i18("INVALID_ENTITY_EMPTY",i18("ENTITY_LOCATION"));
	}
   var data={};
   data["stvid"]=$j("#stvId").val();
   data["locationCode"]=code;
	var rs = loxia.syncXhr(window.parent.$j("body").attr("contextpath")+"/findlocationtranstypebycode.json",data);
    var ex = rs.exception;
    var result = rs.result;
    if(rs.exception){
		$j(obj.element).parent().next().html('');
    	$j(obj.element).parent().next().next().html('');
		return i18("INVALID_NOT_EXIST",i18("ENTITY_LOCATION"));
	}else{ 
		if (result == 'success'){
			$j(obj.element).parent().next().html(rs.location.capacity==0?i18("MSG_LOCATION_CAPACITY"):rs.location.capacity);
		    $j(obj.element).parent().next().next().html(rs.location.qty);
			return loxia.SUCCESS;
		}else if(result == 'error'){
			return rs.message;
		}
	}
}

function checksjNum(value,obj){
	$j("form[stalineid="+$j(obj.element).parent().parent().attr("stalineid")+"]").find("#total").html("");
    var value=parseInt($j.trim(value)),ocu =$j(obj.element).parent().prev().text(),cap=$j(obj.element).parent().prev().prev().text();
    if(isNaN(value)||value<0){
    	return i18("INVALID_NUMBER");	
    }
    if(isNaN(cap)){
    	return loxia.SUCCESS;
    }
    if(($j.trim(ocu).length==0&&cap<value)||($j.trim(ocu).length>0&&(cap-ocu<value))){
   		return i18("MSG_ERROR_LOCATION_QTY");	
	    }
	   return loxia.SUCCESS;
   }


function importReturn(){
	jumbo.showMsg("导入执行成功");
	window.location=$j("body").attr("contextpath")+"/warehouse/externaltransentry.do";
}