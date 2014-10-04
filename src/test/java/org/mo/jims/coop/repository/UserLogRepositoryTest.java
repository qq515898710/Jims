package org.mo.jims.coop.repository;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.open.common.util.BaseTest;

public class UserLogRepositoryTest extends BaseTest {
	private UserLogRepository userLogRepository;

	public UserLogRepository getUserLogRepository() {
		return userLogRepository;
	}

	@Resource(name = "userLogRepository")
	public void setUserLogRepository(UserLogRepository userLogRepository) {
		this.userLogRepository = userLogRepository;
	}

	private String name;

	@Before
	public void init() {
		name = "moziqi";
	}

	@Test
	public void testCountByName() {

	}

	@Test
	public void testSelectByName() {
		userLogRepository.selectByName("moziqi", 1, 10);
	}

	@Test
	public void testCountByLikeName() {

	}

	@Test
	public void testSelectByLikeName() {

	}

	@Test
	public void testSelectByPK() {
		TbUserLog selectByPK = userLogRepository.selectByPK(new Long(1));
		System.out.println(selectByPK.getTime());
	}

	@Test
	public void testInsert() {

	}

	@Test
	public void testUpdateByPK() {

	}

	@Test
	public void testDeleteByPK() {

	}

}
