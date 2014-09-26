package org.mo.jims.coop.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.mo.jims.coop.entity.TbUser;
import org.mo.open.common.util.BaseTest;

public class UserServiceTest extends BaseTest {
	private TbUser user = null;
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void testSaveUserLoginLog() {
		user = userService.getUserByName("moziqi");
		userService.saveUserLoginLog(user);
	}

	@Test
	public void testGetUserByName() {
		user = userService.getUserByName("moziqi");
		System.out.println("-------------------" + user.getUsername());
	}

}
