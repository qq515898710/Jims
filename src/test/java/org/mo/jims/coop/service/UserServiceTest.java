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
	public void testGetUserByName() {
		user = userService.getByPK("es");
		System.out.println(user.getUsername()+"--"+user.getTbUserRole().getId()+"---"+user.getTbUserRole().getType());
	}

	@Test
	public void testSaveUser() {
		user = new TbUser();
		user.setName("LS");
		user.setUsername("光明游侠");
		user.setPassword("123456456");
		boolean saveUser = userService.save(user);
		if (saveUser) {
			System.out.println("保存成功");
		} else {
			System.out.println("保存失败,用户名已存在");
		}
	}

	@Test
	public void testGetALLUserInfo() {
		user = new TbUser();
		Page<TbUser> allUserInfo = userService.getALLUserInfo(user,1, 10);
		List<TbUser> content = allUserInfo.getContent();
		for (int i = 0; i < content.size(); i++) {
			TbUser tbUser = content.get(i);
			System.out.println("--------------------" + tbUser.getName());
		}

	}
}
