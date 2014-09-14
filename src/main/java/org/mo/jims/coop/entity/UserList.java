package org.mo.jims.coop.entity;

import java.io.Serializable;

/**
 * 系统用户信息
 * 
 * @author moziqi
 *
 */
public class UserList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String username;
	private String password;
	private String permission;

	public UserList() {
		super();
	}

	public UserList(String name, String username, String password,
			String permission) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.permission = permission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
