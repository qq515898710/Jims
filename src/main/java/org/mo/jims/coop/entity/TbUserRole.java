/***********************************************************************
 * Module:  TbUserRole.java
 * Author:  YK
 * Purpose: Defines the Class TbUserRole
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;

/**
 * 角色
 * 
 * @pdOid 792363dd-cb06-4c4a-bea8-bfe9fe545544
 */
public class TbUserRole implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 * 
	 * @pdOid d707091a-5e35-4259-acf8-49a822f33274
	 */
	private long id;
	/**
	 * 角色类型
	 * 
	 * @pdOid 1503aa9c-c493-4a2c-a464-7fc957a33330
	 */
	private int type;

	/**
	 * @pdRoleInfo migr=no name=TbUserPermission assc=reference3
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	private java.util.Collection<TbUserPermission> tbUserPermission;
	/** @pdRoleInfo migr=no name=TbUser assc=reference2 mult=0..1 side=A */
	private java.util.Collection<TbUser> tbUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TbUserPermission> getTbUserPermission() {
		if (tbUserPermission == null)
			tbUserPermission = new java.util.HashSet<TbUserPermission>();
		return tbUserPermission;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTbUserPermission() {
		if (tbUserPermission == null)
			tbUserPermission = new java.util.HashSet<TbUserPermission>();
		return tbUserPermission.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTbUserPermission
	 */
	public void setTbUserPermission(
			java.util.Collection<TbUserPermission> newTbUserPermission) {
		removeAllTbUserPermission();
		for (java.util.Iterator iter = newTbUserPermission.iterator(); iter
				.hasNext();)
			addTbUserPermission((TbUserPermission) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTbUserPermission
	 */
	public void addTbUserPermission(TbUserPermission newTbUserPermission) {
		if (newTbUserPermission == null)
			return;
		if (this.tbUserPermission == null)
			this.tbUserPermission = new java.util.HashSet<TbUserPermission>();
		if (!this.tbUserPermission.contains(newTbUserPermission)) {
			this.tbUserPermission.add(newTbUserPermission);
			newTbUserPermission.setTbUserRole(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbUserPermission
	 */
	public void removeTbUserPermission(TbUserPermission oldTbUserPermission) {
		if (oldTbUserPermission == null)
			return;
		if (this.tbUserPermission != null)
			if (this.tbUserPermission.contains(oldTbUserPermission)) {
				this.tbUserPermission.remove(oldTbUserPermission);
				oldTbUserPermission.setTbUserRole((TbUserRole) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbUserPermission() {
		if (tbUserPermission != null) {
			TbUserPermission oldTbUserPermission;
			for (java.util.Iterator iter = getIteratorTbUserPermission(); iter
					.hasNext();) {
				oldTbUserPermission = (TbUserPermission) iter.next();
				iter.remove();
				oldTbUserPermission.setTbUserRole((TbUserRole) null);
			}
		}
	}

	public java.util.Collection<TbUser> getTbUser() {
		if (tbUser == null)
			tbUser = new java.util.HashSet<TbUser>();
		return tbUser;
	}

	public java.util.Iterator getIteratorTbUser() {
		if (tbUser == null)
			tbUser = new java.util.HashSet<TbUser>();
		return tbUser.iterator();
	}

	public void setTbUser(java.util.Collection<TbUser> tbUser) {
		this.tbUser = tbUser;
	}

	public void addTbUser(TbUser newTbUser) {
		if (newTbUser == null)
			return;
		if (this.tbUser == null)
			this.tbUser = new java.util.HashSet<TbUser>();
		if (!this.tbUser.contains(newTbUser)) {
			this.tbUser.add(newTbUser);
			newTbUser.setTbUserRole(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbUser
	 */
	public void removeTbUser(TbUser oldTbUser) {
		if (oldTbUser == null)
			return;
		if (this.tbUser != null)
			if (this.tbUser.contains(oldTbUser)) {
				this.tbUser.remove(oldTbUser);
				oldTbUser.setTbUserRole((TbUserRole) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbUser() {
		if (tbUser != null) {
			TbUser oldTbUser;
			for (java.util.Iterator iter = getIteratorTbUser(); iter
					.hasNext();) {
				oldTbUser = (TbUser) iter.next();
				iter.remove();
				oldTbUser.setTbUserRole((TbUserRole) null);
			}
		}
	}
}