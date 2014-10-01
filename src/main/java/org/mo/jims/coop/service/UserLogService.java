package org.mo.jims.coop.service;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.open.common.service.BaseService;

public class UserLogService implements BaseService<TbUserLog, Long> {
	
	private UserLogRepository userLogRepository;

	@Override
	public TbUserLog getByPK(Long id) {
		return userLogRepository.selectByPK(id);
	}

	@Override
	public boolean save(TbUserLog entity) {
		userLogRepository.insert(entity);
		return true;
	}

	@Override
	public boolean alter(TbUserLog entity) {
		userLogRepository.updateByPK(entity);
		return true;
	}

	@Override
	public boolean removeByPK(Long id) {
		userLogRepository.deleteByPK(id);
		return true;
	}

	public UserLogRepository getUserLogRepository() {
		return userLogRepository;
	}

	@Resource(name = "userLogRepository")
	public void setUserLogRepository(UserLogRepository userLogRepository) {
		this.userLogRepository = userLogRepository;
	}

}
