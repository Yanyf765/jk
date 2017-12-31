package cn.itcast.jk.controller.cargo.contract;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.domain.ExtCproduct;
import cn.itcast.jk.service.ExtCproductService;
import cn.itcast.jk.service.FactoryService;

/**
 * @Description 购销合同控制类
 * @author Administrator
 * @CreateTime 2017年12月26日
 */
@Controller
public class ExtCproductController extends BaseController{
	@Resource
	ExtCproductService extCproductService;
	@Resource
	FactoryService factoryService;
	
	
	@RequestMapping("/carge/extcproduct/tocreate.action")
	public String tocreate(String contractProductId,Model model){
		return null;
	}
	
	@RequestMapping("/carge/extcproduct/insert.action")
	public String insert(ExtCproduct extCproduct, Model model){
		return null;
	}
}
