package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userLogService")
public class UserLogService {

	private UserLogRepository userLogRepository;

	/**
	 * 按名字查询分页显示
	 * 
	 * @param name
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbUserLog> getUserLogByName(String name, int page, int pageSize) {
		Page<TbUserLog> userLogPage = new Page<TbUserLog>();
		userLogPage.setCurrentPage(page);
		userLogPage.setPageSize(pageSize);
		userLogPage.setTotalElement(userLogRepository.countByName(name),pageSize);
		if(userLogPage.getTotalElement()==0){
			return userLogPage;
		}
		userLogPage.setContent(userLogRepository.selectByName(name, (page - 1) * pageSize, pageSize));
		return userLogPage;
	}

	/**
	 * 按名字模糊查询分页显示
	 * 
	 * @param name
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbUserLog> getUserLogByLikeName(String name, int page, int pageSize) {
		Page<TbUserLog> userLogPage = new Page<TbUserLog>();
		userLogPage.setCurrentPage(page);
		userLogPage.setPageSize(pageSize);
		userLogPage.setTotalElement(userLogRepository.countByLikeName(name),pageSize);
		if(userLogPage.getTotalElement()==0){
			return userLogPage;
		}
		userLogPage.setContent(userLogRepository.selectByLikeName(name, (page - 1) * pageSize, pageSize));
		return userLogPage;
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbUserLog getByPK(Long id) {
		return userLogRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean save(TbUserLog entity) {
		userLogRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(TbUserLog entity) {
		userLogRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
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
