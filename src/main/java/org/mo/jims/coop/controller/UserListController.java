package org.mo.jims.coop.controller;

import javax.annotation.Resource;

import org.mo.jims.coop.service.UserListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coop/")
public class UserListController {
	public UserListService userListService;

	public UserListService getUserListService() {
		return userListService;
	}

	@Resource(name = "userListService")
	public void setUserListService(UserListService userListService) {
		this.userListService = userListService;
	}

}
