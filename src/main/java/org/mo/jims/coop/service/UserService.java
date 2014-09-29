package org.mo.jims.coop.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.jims.coop.repository.UserRepository;
import org.mo.jims.coop.repository.UserRoleRepository;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserService {

	private UserRepository userRepository;
	private UserLogRepository userLogRepository;
	private UserRoleRepository userRoleRepository;

	/**
	 * 获取用户名
	 * 
	 * @param name
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbUser getUserByName(String name) {
		TbUser tbUser = null;
		tbUser = userRepository.selcetByName(name);
		return tbUser;
	}

	/**
	 * 分页显示用户信息
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbUser> getALLUserInfo(TbUser user, int page, int size) {
		Page<TbUser> userPage = new Page<TbUser>();
		// userPage.setTotalElement(userRepository.countAll(), size);
		// if (userPage.getTotalElement() == 0) {
		// return userPage;
		// }
		List<TbUser> selectAll = userRepository.selectAll(user.getName(),
				user.getUsername(), (page - 1) * size, size);
		userPage.setContent(selectAll);
		return userPage;

	}

	/**
	 * 保存用户信息,返回true保存成功,返回false用户名存在保存失败
	 * 
	 * @param tbUser
	 * @return
	 */
	@Transactional(noRollbackFor = Exception.class)
	public boolean saveUser(TbUser tbUser) {
		TbUser userByName = this.getUserByName(tbUser.getName());
		if (userByName != null) {
			return false;
		}
		userRepository.insert(tbUser);
		this.saveUserLoginLog(tbUser);
		return true;
	}

	/**
	 * 修改用户信息
	 * 
	 * @param tbUser
	 */
	@Transactional(noRollbackFor = Exception.class)
	public void alterUser(TbUser tbUser) {
		userRepository.updateByPK(tbUser);
	}

	/**
	 * 保存用户登录日志信息
	 * 
	 * @param tbUser
	 */
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

	public UserRoleRepository getUserRoleRepository() {
		return userRoleRepository;
	}

	@Resource(name = "userRoleRepository")
	public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
		this.userRoleRepository = userRoleRepository;
	}

}
