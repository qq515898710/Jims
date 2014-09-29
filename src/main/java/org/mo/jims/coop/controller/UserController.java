package org.mo.jims.coop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.dto.UserDTO;
import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.service.UserService;
import org.mo.open.common.util.Page;
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
	private UserDTO userDTO;
	private static int PAGE = 0;
	private static int SIZE = 10;

	@RequestMapping(value = "CaoZuoYuanGuanLi.html", method = RequestMethod.GET)
	public ModelAndView CaoZuoYuanGuanLi(ModelMap model) {
		userDTO = new UserDTO();
		Page<TbUser> allUserInfo = userService.getALLUserInfo(userDTO.toObject(), PAGE, SIZE);
		model.put("baseActive", "sysManage");
		model.put("active", "CaoZuoYuanGuanLi");
		model.put("page", allUserInfo);
		return new ModelAndView("coop/sysManage/CaoZuoYuanGuanLi", model);
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
