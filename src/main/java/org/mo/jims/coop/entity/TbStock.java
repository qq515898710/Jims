/***********************************************************************
 * Module:  TbStock.java
 * Author:  YK
 * Purpose: Defines the Class TbStock
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 入库信息主要内容
 * 
 * @pdOid 8ebb042b-74ea-478c-b0e2-a366ad52d7d9
 */
public class TbStock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 入库编号,以"stock"字符串为前缀,加上商品的入库日期,再以3位数字作为后缀
	 * 
	 * @pdOid 497419ac-c5ed-44c4-9358-6a8c49a026f0
	 */
	private java.lang.String id;
	/**
	 * 品种数量
	 * 
	 * @pdOid 20d6f463-b9f7-48a1-9da7-adc7e6e51abc
	 */
	private int varietyAmount;
	/**
	 * 单价
	 * 
	 * @pdOid 118991ce-407e-4377-b2f2-198882759c15
	 */
	private float unitCost;
	/**
	 * 数量
	 * 
	 * @pdOid ad0bdb13-a40f-4b08-80bd-e921baa5264b
	 */
	private int amount;
	/**
	 * 合计金额
	 * 
	 * @pdOid fe5f3f5f-864b-4fe6-8ed6-8d53ca214170
	 */
	private float sum;
	/**
	 * 验收结论
	 * 
	 * @pdOid 4fce28e6-f1dd-429d-89e3-1e25adc2b588
	 */
	private java.lang.String check_conclusion;
	/**
	 * 入货时间
	 * 
	 * @pdOid a97de47a-b159-429c-9250-646f50387966
	 */
	private java.util.Date time;
	/**
	 * 结算方式
	 * 
	 * @pdOid a14feaaa-d062-4a64-9fcf-51ab7976e22b
	 */
	private java.lang.String clearingForm;
	/**
	 * 经手人
	 * 
	 * @pdOid 003d0e92-121e-45c0-84ac-8ac6aa85b6b7
	 */
	private java.lang.String handler;

	/** @pdRoleInfo migr=no name=TbProviderInfo assc=reference9 mult=0..1 side=A */
	private TbProviderInfo tbProviderInfo;
	/** @pdRoleInfo migr=no name=TbUser assc=reference13 mult=0..1 side=A */
	private TbUser tbUser;
	/** @pdRoleInfo migr=no name=TbGoodInfo assc=reference16 mult=0..1 side=A */
	private TbGoodInfo tbGoodInfo;

	public TbStock() {
		super();
	}

	public TbStock(int varietyAmount, float unitCost, int amount, float sum,
			String check_conclusion, Date time, String clearingForm,
			String handler) {
		super();
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		this.id = "stock" + date.toString();
		this.varietyAmount = varietyAmount;
		this.unitCost = unitCost;
		this.amount = amount;
		this.sum = sum;
		this.check_conclusion = check_conclusion;
		this.time = time;
		this.clearingForm = clearingForm;
		this.handler = handler;
	}

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
				oldTbProviderInfo.removeTbStock(this);
			}
			if (newTbProviderInfo != null) {
				this.tbProviderInfo = newTbProviderInfo;
				this.tbProviderInfo.addTbStock(this);
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
				oldTbUser.removeTbStock(this);
			}
			if (newTbUser != null) {
				this.tbUser = newTbUser;
				this.tbUser.addTbStock(this);
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
				oldTbGoodInfo.removeTbStock(this);
			}
			if (newTbGoodInfo != null) {
				this.tbGoodInfo = newTbGoodInfo;
				this.tbGoodInfo.addTbStock(this);
			}
		}
	}

}