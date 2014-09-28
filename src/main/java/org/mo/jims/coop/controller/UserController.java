package org.mo.jims.coop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coop/sys/")
public class UserController {
	
	@RequestMapping(value = "CaoZuoYuanGuanLi.html", method = RequestMethod.GET)
	public ModelAndView CaoZuoYuanGuanLi(ModelMap model) {
		model.put("baseActive", "sysManage");
		model.put("active", "CaoZuoYuanGuanLi");
		return new ModelAndView("coop/sysManage/CaoZuoYuanGuanLi",model);
	}
}
