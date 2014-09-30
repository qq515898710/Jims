package org.mo.jims.coop.controller;

import javax.annotation.Resource;

import org.mo.jims.coop.dto.UserDTO;
import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.service.UserService;
import org.mo.open.common.util.JsonResponse;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coop/sys/")
public class UserController {
	
	private UserService userService;
	private UserDTO userDTO;

	@RequestMapping(value = "IIk15dX0+6BqWuCaUE0kEh8kB9Ww/4zb.html", method = RequestMethod.GET)
	public ModelAndView caoZuoYuanGuanLiInfo(ModelMap model) {
		userDTO = new UserDTO();
		Page<TbUser> allUserInfo = userService.getALLUserInfo(
				userDTO.toObject(), 1, 10);
		model.put("baseActive", "sysManage");
		model.put("active", "CaoZuoYuanGuanLi");
		model.put("page", allUserInfo);
		return new ModelAndView("coop/sysManage/CaoZuoYuanGuanLi", model);
	}

	@RequestMapping(value = "CaoZuoYuanGuanLi.html", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public JsonResponse showUserInfo(
			@RequestParam(required = true, defaultValue = "10") int size,
			@RequestParam(required = true, defaultValue = "1") int page,
			@RequestBody(required = false) UserDTO userDTO) {
		Page<TbUser> allUserInfo = userService.getALLUserInfo(
				userDTO.toObject(), page, size);
		return null;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
