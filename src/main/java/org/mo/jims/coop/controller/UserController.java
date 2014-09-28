package org.mo.jims.coop.controller;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coop/sys/")
public class UserController {
	private UserService userService;
	private TbUser user = null;
	private int page = 1;
	private int size = 5;

	@RequestMapping(value = "CaoZuoYuanGuanLi.html", method = RequestMethod.GET)
	public ModelAndView CaoZuoYuanGuanLi(ModelMap model) {
		model.put("baseActive", "sysManage");
		model.put("active", "CaoZuoYuanGuanLi");
		userService.getALLUserInfo(user, page, size);
		return new ModelAndView("coop/sysManage/CaoZuoYuanGuanLi", model);
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public TbUser getUser() {
		return user;
	}

	public void setUser(TbUser user) {
		this.user = user;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
