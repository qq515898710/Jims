package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.mo.jims.coop.entity.TbUser;
import org.mo.open.common.util.BaseTest;
import org.mo.open.common.util.Page;

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

	@Test
	public void testSaveUser() {
		user = new TbUser();
		user.setName("moziqi2");
		user.setUsername("管理员");
		user.setPassword("123456456");
		boolean saveUser = userService.saveUser(user);
		if (saveUser) {
			System.out.println("保存成功");
		} else {
			System.out.println("保存失败,用户名已存在");
		}
	}

	@Test
	public void testGetALLUserInfo() {
		Page<TbUser> allUserInfo = userService.getALLUserInfo(0, 10);
		List<TbUser> content = allUserInfo.getContent();
		for (int i = 0; i < 10; i++) {
			TbUser tbUser = content.get(i);
			System.out.println("--------------------" + tbUser.getName());
		}

	}
}
