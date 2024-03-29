package com.bt.lmis.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bt.lmis.code.BaseController;
import com.bt.lmis.model.Busprice;
import com.bt.lmis.service.BuspriceService;
/**
 * 整车报价维护表控制器
 *
 */
@Controller
@RequestMapping("/control/lmis/buspriceController")
public class BuspriceController extends BaseController {

	private static final Logger logger = Logger.getLogger(BuspriceController.class);
	
	/**
	 * 整车报价维护表服务类
	 */
	@Resource(name = "buspriceServiceImpl")
	private BuspriceService<Busprice> buspriceService;
}
