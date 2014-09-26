package org.mo.jims.coop.service;

import java.util.Date;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.jims.coop.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserService {

	private UserRepository userRepository;
	private UserLogRepository userLogRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbUser getUserByName(String name) {
		TbUser tbUser = null;
		tbUser = userRepository.selcetByName(name);
		return tbUser;
	}

	@Transactional(noRollbackFor = Exception.class)
	public void saveUserLoginLog(TbUser tbUser) {
		TbUserLog entity = new TbUserLog();
		entity.setTbUser(tbUser);
		entity.setTime(new Date(System.currentTimeMillis()));
		userLogRepository.insert(entity);
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Resource(name = "userRepository")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserLogRepository getUserLogRepository() {
		return userLogRepository;
	}

	@Resource(name = "userLogRepository")
	public void setUserLogRepository(UserLogRepository userLogRepository) {
		this.userLogRepository = userLogRepository;
	}

}
