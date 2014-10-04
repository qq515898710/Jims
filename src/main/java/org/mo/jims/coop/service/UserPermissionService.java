package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUserPermission;
import org.mo.jims.coop.repository.UserPermissionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service( "userPermissionService")
public class UserPermissionService  {
	private UserPermissionRepository userPermissionRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<TbUserPermission> gettAll() {
		return userPermissionRepository.selectAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbUserPermission getByPK(Long id) {
		return userPermissionRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean save(TbUserPermission entity) {
		userPermissionRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(TbUserPermission entity) {
		userPermissionRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean removeByPK(Long id) {
		userPermissionRepository.deleteByPK(id);
		return true;
	}

	public UserPermissionRepository getUserPermissionRepository() {
		return userPermissionRepository;
	}

	@Resource(name = "userPermissionRepository")
	public void setUserPermissionRepository(UserPermissionRepository userPermissionRepository) {
		this.userPermissionRepository = userPermissionRepository;
	}
}
