package org.mo.jims.coop.repository;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.entity.TbUserRole;
import org.mo.open.common.util.BaseTest;

public class UserRepositoryTest extends BaseTest {
	private UserRepository userRepository;
	private TbUser tbUser = null;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Resource(name = "userRepository")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Test
	public void testSelcetByName() {
		TbUser selcetByName = userRepository.selcetByName("moziqi");
		System.out.println(selcetByName.getUsername()
				+ selcetByName.getTbUserRole().getId()
				+ selcetByName.getTbUserRole().getType());
	}

	@Test
	public void testSelectByPK() {
		TbUser selectByPK = userRepository.selectByPK("moziqi");
		System.out.println(selectByPK.getUsername()
				+ selectByPK.getTbUserRole().getId()
				+ selectByPK.getTbUserRole().getType());
	}

	@Test
	public void testCountAll() {
		int countAll = userRepository.countAll(tbUser.getName(),
				tbUser.getUsername());
		System.out.println(countAll);
	}

	@Test
	public void testSelectAll() {
		int offset = 10;
		int size = 5;
		List<TbUser> selectAll = userRepository.selectAll(tbUser.getName(),
				tbUser.getUsername(), offset, size);
		Iterator<TbUser> iterator = selectAll.iterator();
		while (iterator.hasNext()) {
			TbUser next = iterator.next();
			System.out.println(next.getUsername());
		}
	}

	@Test
	public void testInsert() {
		tbUser = new TbUser();
		for (int i = 60; i > 20; i--) {
			tbUser.setName("name" + i);
			tbUser.setUsername("uname" + i);
			tbUser.setPassword("123465");
			userRepository.insert(tbUser);
		}

	}

	@Test
	public void testUpdateByPK() {
		TbUser entity = new TbUser();
		entity.setName("moziqi");
		entity.setUsername("梓奇");
		entity.setPassword("123456");
		TbUserRole newTbUserRole = new TbUserRole();
		newTbUserRole.setId(1);
		newTbUserRole.setType(0);
		entity.setTbUserRole(newTbUserRole);
		userRepository.updateByPK(entity);
	}

	@Test
	public void testDeleteByPK() {
		userRepository.deleteByPK("n9");
	}

}
