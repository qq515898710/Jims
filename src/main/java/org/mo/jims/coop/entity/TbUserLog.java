/***********************************************************************
 * Module:  TbUserLog.java
 * Author:  YK
 * Purpose: Defines the Class TbUserLog
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;

/**
 * 登录日志信息
 * 
 * @pdOid dbf2b643-4e87-48dc-895f-7988b48ab82a
 */
public class TbUserLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 * 
	 * @pdOid 5ad45ce9-280a-4d83-a882-c656ed6dc685
	 */
	private long id;
	/**
	 * 登录时间
	 * 
	 * @pdOid fbbe21d8-8d0c-4065-8bdb-146ef8b7a224
	 */
	private java.util.Date time;

	/** @pdRoleInfo migr=no name=TbUser assc=reference1 mult=0..1 side=A */
	private TbUser tbUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.util.Date getTime() {
		return time;
	}

	public void setTime(java.util.Date time) {
		this.time = time;
	}

	/** @pdGenerated default parent getter */
	public TbUser getTbUser() {
		return tbUser;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newTbUser
	 */
	public void setTbUser(TbUser newTbUser) {
		if (this.tbUser == null || !this.tbUser.equals(newTbUser)) {
			if (this.tbUser != null) {
				TbUser oldTbUser = this.tbUser;
				this.tbUser = null;
				oldTbUser.removeTbUserLog(this);
			}
			if (newTbUser != null) {
				this.tbUser = newTbUser;
				this.tbUser.addTbUserLog(this);
			}
		}
	}

}