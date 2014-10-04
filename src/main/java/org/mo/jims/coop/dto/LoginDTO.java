package org.mo.jims.coop.dto;

import java.io.Serializable;

import org.mo.jims.coop.entity.TbUser;

public class LoginDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String code;
	
	public TbUser toObject() {
		TbUser tbUser = new TbUser();
		tbUser.setName(name);
		tbUser.setUsername(username);
		tbUser.setPassword(password);
		return tbUser;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
