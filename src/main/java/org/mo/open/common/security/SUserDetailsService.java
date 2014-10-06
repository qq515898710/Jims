package org.mo.open.common.security;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.repository.UserLogRepository;
import org.mo.jims.coop.repository.PermissionRepository;
import org.mo.jims.coop.repository.UserRepository;
import org.mo.open.common.entity.Permission;
import org.mo.open.common.entity.User;
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

	private PermissionRepository permissionRepository;
	private UserLogRepository userLogRepository;
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		UserDetails userDetails = null;
		User selcetByName = userRepository.selcetByName(name);
		if (selcetByName == null) {
			throw new UsernameNotFoundException("该" + name + "不存在");
		}
		userDetails = new Authentication(selcetByName, selcetByName.getAccount(),
				selcetByName.getPassword(), true, true, true, true, grantAuthorities(selcetByName));
		return null;
	}
	private List<GrantedAuthority> grantAuthorities(User user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		long id = user.getRole().get
//		Permission selectByPK = permissionRepository.selectByPK(id);
//		authorities.add(new SimpleGrantedAuthority(role));
		return null;
	}

	public PermissionRepository getPermissionRepository() {
		return permissionRepository;
	}

	@Resource(name = "permissionRepository")
	public void setPermissionRepository(PermissionRepository permissionRepository) {
		this.permissionRepository = permissionRepository;
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
