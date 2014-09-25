package org.mo.jims.coop.service;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserService {
	private UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Resource(name = "userRepository")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Transactional(readOnly=true)
	public TbUser getUserByName(String name) {
		TbUser tbUser = null;
		tbUser = userRepository.selcetByName(name);
		return tbUser;
	}
}
