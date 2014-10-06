package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.repository.UserRoleRepository;
import org.mo.open.common.entity.UserRole;
import org.mo.open.common.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service( "userRoleService")
public class UserRoleService  {
	private UserRoleRepository userRoleRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<UserRole> gettAll() {
		return userRoleRepository.selectAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public UserRole getByPK(Long id) {
		return userRoleRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean save(UserRole entity) {
		userRoleRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(UserRole entity) {
		userRoleRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean removeByPK(Long id) {
		userRoleRepository.deleteByPK(id);
		return true;
	}

	public UserRoleRepository getUserRoleRepository() {
		return userRoleRepository;
	}

	@Resource(name = "userRoleRepository")
	public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
		this.userRoleRepository = userRoleRepository;
	}
}
