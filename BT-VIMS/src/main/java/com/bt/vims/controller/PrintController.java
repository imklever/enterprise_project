package com.bt.vims.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JFileChooser;

import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bt.vims.model.Visitors;
import com.bt.vims.utils.PrintUtil;
import com.bt.vims.utils.Result;
import com.bt.vims.utils.ShellUtils;

import net.sf.jasperreports.engine.JRException;
/**
 * 
 *@author jinggong.li
 *@date 2018年6月1日
 */
@Controller
@RequestMapping("/control/printController")
public class PrintController {
	private static final Logger logger = Logger.getLogger(PrintController.class);
	@RequestMapping("/print.do")
	@ResponseBody
	public Result<List> print(HttpServletRequest req) {
		String printName = String.valueOf(req.getParameter("printName"));
		//String printName = "MyPrint_test";
		Result<List> result = new Result<List>();
	    List<Visitors> list = new ArrayList<Visitors>();
			for(int i=1;i<=1;i++) {
				 Visitors visitor = new Visitors();
				 visitor.setContent("面试");
				 visitor.setVisitor_name("访客访客访客访客"+i);
		         visitor.setHost("访客访客访客访客"+i);
		         visitor.setVisitor_date("6月7日");
		         visitor.setVisitor_year("2018");
		         visitor.setVisitor_type("03");
		         list.add(visitor);
			}
			for(int i=1;i<=1;i++) {
				 Visitors visitor = new Visitors();
				 visitor.setVisitor_name("访客访客访客访客访客"+i);
		         visitor.setHost("访客访客访客访客访客访客"+i);
		         visitor.setContent("访客");
		         visitor.setVisitor_date("6月7日");
		         visitor.setVisitor_year("2018");
		         visitor.setVisitor_type("01");
		         list.add(visitor);
			}	
			for(int i=1;i<=0;i++) {
				 Visitors visitor = new Visitors();
				 visitor.setVisitor_name("李"+i);
		         visitor.setContent("访客");
		         visitor.setHost("宝尊集团");
		         visitor.setVisitor_date("5月31日");
		         visitor.setVisitor_year("2018");
		         visitor.setVisitor_type("02");
		         visitor.setVisitorNum(i);
		         list.add(visitor);
			}
			int print_flag;
			print_flag = PrintUtil.printConnection(printName,list);
			result.setCode(print_flag);
		    return result;
    }
	
	
	@RequestMapping("/pdf.do")
	@ResponseBody
	public int pdf(HttpServletRequest req) {
		return ShellUtils.executeShell("/home/test/print.sh","/home/test.pdf","myprint");
    }	

	
	@RequestMapping("/uuid.do")
	@ResponseBody
	public String getPath(HttpServletRequest req,@RequestParam(required=false) String m) {
		String path = req.getSession().getServletContext().getRealPath("/exportFile");
		return path;
		
	}
	/*@RequestMapping("/getpdf.do")
	@ResponseBody
	public String getpdf(HttpServletRequest req) throws JRException {
		List<Visitors> list = new ArrayList<Visitors>();
		for(int i=1;i<=4;i++) {
			 Visitors visitor = new Visitors();
	         visitor.setHost("李京功"+i);
	         visitor.setVisitor_name("宝尊集团"+i);
	         visitor.setVisitor_date("5月17日");
	         visitor.setVisitor_year("2018");
	         list.add(visitor);
		}
		return PrintUtil.jsperChangePdf(list);
    }*/
	//进行预浏览
    //JasperViewer.viewReport(jasperPrint,false); 
	
	
	/*public static void main(String[] args) {
		List<Visitors> list = new ArrayList<Visitors>();
		for(int i=1;i<=5;i++) {
			 Visitors visitor = new Visitors();
			 visitor.setContent("面试");
			 visitor.setVisitor_name("石头"+i);
	         visitor.setHost("李京功"+i);
	         visitor.setVisitor_date("5月17日");
	         visitor.setVisitor_year("2018");
	         visitor.setVisitor_type("03");
	         list.add(visitor);
		}
		for(int i=1;i<=5;i++) {
			 Visitors visitor = new Visitors();
			 visitor.setVisitor_name("董"+i);
	         visitor.setHost("李京功"+i);
	         visitor.setContent("访客");
	         visitor.setVisitor_date("5月17日");
	         visitor.setVisitor_year("2018");
	         visitor.setVisitor_type("01");
	         list.add(visitor);
		}	
		for(int i=1;i<=10;i++) {
			 Visitors visitor = new Visitors();
			 visitor.setVisitor_name("李京功"+i);
	         visitor.setContent("访客");
	         visitor.setHost("宝尊集团");
	         visitor.setVisitor_date("5月17日");
	         visitor.setVisitor_year("2018");
	         visitor.setVisitor_type("02");
	         visitor.setVisitorNum(i);
	         list.add(visitor);
		}
	
	int  print_flag = PrintUtil.printConnection("myprint",list);
	System.out.println(print_flag);
  }*/
	
}