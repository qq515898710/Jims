package org.mo.jims.coop.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.mo.jims.coop.dto.LoginDTO;
import org.mo.jims.coop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController{
	private UserService userService;

	@RequestMapping(value="checklogin",method=RequestMethod.POST)
	public ModelAndView checklogin(@ModelAttribute LoginDTO loginDTO, HttpSession session, ModelMap modelMap) {
		String codeImage = (String) session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		String code = loginDTO.getCode();
		boolean checkLogin = userService.checkLogin(loginDTO.toObject());
		boolean equalsIgnoreCase = code.equalsIgnoreCase(codeImage);
		if (checkLogin && equalsIgnoreCase) {
			System.out.println("登录成功");
		} else {
			if (!checkLogin) {
				System.out.println("帐号或密码错误!");
			}
			if (!equalsIgnoreCase) {
				System.out.println("验证码错误");
			}
		}
		return new ModelAndView("home");
	}
	
	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
