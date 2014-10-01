package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUserRole;
import org.mo.jims.coop.repository.UserRoleRepository;
import org.mo.open.common.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userRoleService")
public class UserRoleService implements BaseService<TbUserRole, Long> {
	private UserRoleRepository userRoleRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<TbUserRole> gettAll() {
		return userRoleRepository.selectAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	@Override
	public TbUserRole getByPK(Long id) {
		return userRoleRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	@Override
	public boolean save(TbUserRole entity) {
		userRoleRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	@Override
	public boolean alter(TbUserRole entity) {
		userRoleRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	@Override
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
