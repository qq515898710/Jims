/***********************************************************************
 * Module:  TbStockReturn.java
 * Author:  YK
 * Purpose: Defines the Class TbStockReturn
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;

/**
 * 进货退货信息
 * 
 * @pdOid beac6355-c1b6-42d8-979d-a04facc8a7f1
 */
public class TbStockReturn implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 入库编号,以"rk"字符串为前缀,加上商品的入库日期,再以3位数字作为后缀
	 * 
	 * @pdOid 240f5809-96e6-46c7-8985-58bf202b1f3c
	 */
	private java.lang.String id;
	/**
	 * 品种数量
	 * 
	 * @pdOid fd778410-a785-4439-9beb-eaa200569dc6
	 */
	private int varietyAmount;
	/**
	 * 单价
	 * 
	 * @pdOid 5872b64b-e743-4708-9226-1d3f71261c24
	 */
	private float unitCost;
	/**
	 * 数量
	 * 
	 * @pdOid dd6ff1c5-467e-40a3-a2e7-38790f01249e
	 */
	private int amount;
	/**
	 * 合计金额
	 * 
	 * @pdOid ecfd6a97-695c-4be3-9188-df4d4458d4b0
	 */
	private float sum;
	/**
	 * 验收结论
	 * 
	 * @pdOid b1a463b5-5482-405b-8423-b82ebc9c2073
	 */
	private java.lang.String check_conclusion;
	/**
	 * 退货时间
	 * 
	 * @pdOid db042fed-2570-4fb6-aba8-11df929d31ee
	 */
	private java.util.Date time;
	/**
	 * 结算方式
	 * 
	 * @pdOid 240b44ea-bb9a-4bb0-88c5-1df97b5c490e
	 */
	private java.lang.String clearingForm;
	/**
	 * 经手人
	 * 
	 * @pdOid 3193a08f-9149-4d4b-9954-8ceec9d9cde7
	 */
	private java.lang.String handler;

	/** @pdRoleInfo migr=no name=TbProviderInfo assc=reference14 mult=0..1 side=A */
	private TbProviderInfo tbProviderInfo;
	/** @pdRoleInfo migr=no name=TbUser assc=reference15 mult=0..1 side=A */
	private TbUser tbUser;
	/** @pdRoleInfo migr=no name=TbGoodInfo assc=reference17 mult=0..1 side=A */
	private TbGoodInfo tbGoodInfo;

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public int getVarietyAmount() {
		return varietyAmount;
	}

	public void setVarietyAmount(int varietyAmount) {
		this.varietyAmount = varietyAmount;
	}

	public float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public java.lang.String getCheck_conclusion() {
		return check_conclusion;
	}

	public void setCheck_conclusion(java.lang.String check_conclusion) {
		this.check_conclusion = check_conclusion;
	}


	public java.util.Date getTime() {
		return time;
	}

	public void setTime(java.util.Date time) {
		this.time = time;
	}

	public java.lang.String getClearingForm() {
		return clearingForm;
	}

	public void setClearingForm(java.lang.String clearingForm) {
		this.clearingForm = clearingForm;
	}

	public java.lang.String getHandler() {
		return handler;
	}

	public void setHandler(java.lang.String handler) {
		this.handler = handler;
	}

	/** @pdGenerated default parent getter */
	public TbProviderInfo getTbProviderInfo() {
		return tbProviderInfo;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newTbProviderInfo
	 */
	public void setTbProviderInfo(TbProviderInfo newTbProviderInfo) {
		if (this.tbProviderInfo == null
				|| !this.tbProviderInfo.equals(newTbProviderInfo)) {
			if (this.tbProviderInfo != null) {
				TbProviderInfo oldTbProviderInfo = this.tbProviderInfo;
				this.tbProviderInfo = null;
				oldTbProviderInfo.removeTbStockReturn(this);
			}
			if (newTbProviderInfo != null) {
				this.tbProviderInfo = newTbProviderInfo;
				this.tbProviderInfo.addTbStockReturn(this);
			}
		}
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
				oldTbUser.removeTbStockReturn(this);
			}
			if (newTbUser != null) {
				this.tbUser = newTbUser;
				this.tbUser.addTbStockReturn(this);
			}
		}
	}

	/** @pdGenerated default parent getter */
	public TbGoodInfo getTbGoodInfo() {
		return tbGoodInfo;
	}

	/**
	 * @pdGenerated default parent setter
	 * @param newTbGoodInfo
	 */
	public void setTbGoodInfo(TbGoodInfo newTbGoodInfo) {
		if (this.tbGoodInfo == null || !this.tbGoodInfo.equals(newTbGoodInfo)) {
			if (this.tbGoodInfo != null) {
				TbGoodInfo oldTbGoodInfo = this.tbGoodInfo;
				this.tbGoodInfo = null;
				oldTbGoodInfo.removeTbStockReturn(this);
			}
			if (newTbGoodInfo != null) {
				this.tbGoodInfo = newTbGoodInfo;
				this.tbGoodInfo.addTbStockReturn(this);
			}
		}
	}

}