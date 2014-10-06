package org.mo.open.common.security;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.aspectj.weaver.SimpleAnnotationValue;
import org.mo.jims.coop.entity.TbUser;
import org.mo.jims.coop.entity.TbUserPermission;
import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.jims.coop.repository.UserPermissionRepository;
import org.mo.jims.coop.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("sUserDetailsService")
public class SUserDetailsService implements UserDetailsService {
	
	protected static Logger logger = LoggerFactory.getLogger(SUserDetailsService.class);

	private UserPermissionRepository userPermissionRepository;
	private UserLogRepository userLogRepository;
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		UserDetails userDetails = null;
		TbUser selcetByName = userRepository.selcetByName(name);
		if (selcetByName == null) {
			throw new UsernameNotFoundException("该" + name + "不存在");
		}
		userDetails = new Authentication(selcetByName, selcetByName.getName(),
				selcetByName.getPassword(), true, true, true, true, grantAuthorities(selcetByName));
		return null;
	}
	private List<GrantedAuthority> grantAuthorities(TbUser tbUser){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		long id = tbUser.getTbUserRole().getId();
		TbUserPermission selectByPK = userPermissionRepository.selectByPK(id);
//		authorities.add(new SimpleGrantedAuthority(role));
		return null;
	}

	public UserPermissionRepository getUserPermissionRepository() {
		return userPermissionRepository;
	}

	@Resource(name = "userPermissionRepository")
	public void setUserPermissionRepository(UserPermissionRepository userPermissionRepository) {
		this.userPermissionRepository = userPermissionRepository;
	}

	public UserLogRepository getUserLogRepository() {
		return userLogRepository;
	}

	@Resource(name = "userLogRepository")
	public void setUserLogRepository(UserLogRepository userLogRepository) {
		this.userLogRepository = userLogRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	@Resource(name = "userRepository")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
