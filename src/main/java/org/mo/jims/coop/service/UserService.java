package org.mo.jims.coop.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.jims.coop.repository.UserRepository;
import org.mo.open.common.service.BaseService;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserService {

	private UserRepository userRepository;
	private UserLogRepository userLogRepository;

	public boolean checkLogin(TbUser user){
		TbUser login = null;
		login = userRepository.selectUserByNameAndPassword(user.getName(), user.getPassword());
		if (login != null) {
			return true;
		}
		return false;
	}
	/**
	 * 分页显示用户信息, 从1算起
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbUser> getALLUserInfo(TbUser user, int page, int pageSize) {
		Page<TbUser> userPage = new Page<TbUser>();
		userPage.setCurrentPage(page);
		userPage.setPageSize(pageSize);
		userPage.setTotalElement(
				userRepository.countAll(user.getName(), user.getUsername()),
				pageSize);
		if (userPage.getTotalElement() == 0) {
			return userPage;
		}
		List<TbUser> selectAll = userRepository.selectAll(user.getName(),
				user.getUsername(), (page - 1) * pageSize, pageSize);
		userPage.setContent(selectAll);
		return userPage;
	}

	/**
	 * 保存用户登录日志信息
	 * 
	 * @param tbUser
	 */
	@Transactional(noRollbackFor = Exception.class)
	private void saveUserLoginLog(TbUser tbUser) {
		TbUserLog entity = new TbUserLog();
		entity.setTbUser(tbUser);
		entity.setTime(new Date(System.currentTimeMillis()));
		userLogRepository.insert(entity);
	}

	/**
	 * 获取用户名
	 * 
	 * @param name
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbUser getByPK(String name) {
		TbUser tbUser = null;
		tbUser = userRepository.selcetByName(name);
		return tbUser;
	}

	/**
	 * 保存用户信息,返回true保存成功,返回false用户名存在保存失败
	 * 
	 * @param tbUser
	 * @return
	 */
	@Transactional(noRollbackFor = Exception.class)
	public boolean save(TbUser entity) {
		TbUser userByName = this.getByPK(entity.getName());
		if (userByName != null) {
			return false;
		}
		userRepository.insert(entity);
		this.saveUserLoginLog(entity);
		return true;
	}

	/**
	 * 修改用户信息
	 * 
	 * @param tbUser
	 */
	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(TbUser entity) {
		userRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean removeByPK(String id) {
		userRepository.deleteByPK(id);
		return true;
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
