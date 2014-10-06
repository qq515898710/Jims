package org.mo.open.common.security;

import java.util.Collection;

import org.mo.jims.coop.entity.TbUser;
import org.springframework.security.core.GrantedAuthority;

/**
 * 身份验证
 * 
 * @author moziqi
 *
 */
public class Authentication extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 1L;
	
	private TbUser tbUser;
	
	private boolean expired; // 检验是否过期的

	private String latestMessage; // 最新消息
	
	public Authentication(TbUser tbUser, String username, String password,
			boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		this.tbUser = tbUser;
		this.expired =false;
	}

	public TbUser getTbUser() {
		return tbUser;
	}

	public void setTbUser(TbUser tbUser) {
		this.tbUser = tbUser;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public String getLatestMessage() {
		return latestMessage;
	}

	public void setLatestMessage(String latestMessage) {
		this.latestMessage = latestMessage;
	}
	
}
