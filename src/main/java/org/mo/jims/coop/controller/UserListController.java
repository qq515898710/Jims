package org.mo.jims.coop.controller;

import javax.annotation.Resource;

import org.mo.jims.coop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coop/")
public class UserListController {
	public UserService userListService;

	public UserService getUserListService() {
		return userListService;
	}

	@Resource(name = "userListService")
	public void setUserListService(UserService userListService) {
		this.userListService = userListService;
	}

}
