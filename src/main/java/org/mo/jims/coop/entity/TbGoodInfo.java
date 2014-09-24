/***********************************************************************
 * Module:  TbGoodInfo.java
 * Author:  YK
 * Purpose: Defines the Class TbGoodInfo
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;

/**
 * 商品信息
 * 
 * @pdOid 6f763144-a1d3-484b-82c8-565f983f8ef2
 */
public class TbGoodInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 商品编号是商品的唯一标识，它是商品信息表的主键，用于区分不同的商品，前缀使用“g”字符串
	 * 
	 * @pdOid c2cdf06e-125a-4a4e-a715-288750e279d1
	 */
	private java.lang.String id;
	/**
	 * 商品名字
	 * 
	 * @pdOid c8286539-40b9-4ac0-8ab7-9462f8754129
	 */
	private java.lang.String gname;
	/**
	 * 简称
	 * 
	 * @pdOid 85e5c686-87eb-476b-8551-70b7fdf388d7
	 */
	private java.lang.String abbreviation;
	/**
	 * 产品
	 * 
	 * @pdOid 238dd909-2ca2-4a05-9c20-53090b5126f3
	 */
	private java.lang.String origin;
	/**
	 * 单位
	 * 
	 * @pdOid 118e89f0-111f-407e-9c9b-93ce8664d783
	 */
	private java.lang.String units;
	/**
	 * 包装
	 * 
	 * @pdOid 1c8e6e37-ecc3-472a-97b4-b61fa64369ac
	 */
	private java.lang.String pack;
	/**
	 * 批准文号
	 * 
	 * @pdOid fdb6942a-ccde-481a-92af-c1a1635dc77a
	 */
	private java.lang.String approvalNum;
	/**
	 * 批号
	 * 
	 * @pdOid 7f9f6859-1b02-46eb-9685-540ccaa75201
	 */
	private java.lang.String batchNum;
	/**
	 * 备忘录(简介)
	 * 
	 * @pdOid a101135d-775d-4b24-9fb4-67e56d64b2dd
	 */
	private java.lang.String memo;

	/**
	 * @pdRoleInfo migr=no name=TbSell assc=reference6 coll=java.util.Collection
	 *             impl=java.util.HashSet mult=0..*
	 */
	private java.util.Collection<TbSell> tbSell;
	/**
	 * @pdRoleInfo migr=no name=TbSellReturn assc=reference10
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	private java.util.Collection<TbSellReturn> tbSellReturn;
	/**
	 * @pdRoleInfo migr=no name=TbStock assc=reference16
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	private java.util.Collection<TbStock> tbStock;
	/**
	 * @pdRoleInfo migr=no name=TbStockReturn assc=reference17
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 */
	private java.util.Collection<TbStockReturn> tbStockReturn;
	/** @pdRoleInfo migr=no name=TbProviderInfo assc=reference5 mult=0..1 side=A */
	private TbProviderInfo tbProviderInfo;

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getGname() {
		return gname;
	}

	public void setGname(java.lang.String gname) {
		this.gname = gname;
	}

	public java.lang.String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(java.lang.String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public java.lang.String getOrigin() {
		return origin;
	}

	public void setOrigin(java.lang.String origin) {
		this.origin = origin;
	}

	public java.lang.String getUnits() {
		return units;
	}

	public void setUnits(java.lang.String units) {
		this.units = units;
	}

	public java.lang.String getPack() {
		return pack;
	}

	public void setPack(java.lang.String pack) {
		this.pack = pack;
	}

	public java.lang.String getApprovalNum() {
		return approvalNum;
	}

	public void setApprovalNum(java.lang.String approvalNum) {
		this.approvalNum = approvalNum;
	}

	public java.lang.String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(java.lang.String batchNum) {
		this.batchNum = batchNum;
	}

	public java.lang.String getMemo() {
		return memo;
	}

	public void setMemo(java.lang.String memo) {
		this.memo = memo;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TbSell> getTbSell() {
		if (tbSell == null)
			tbSell = new java.util.HashSet<TbSell>();
		return tbSell;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTbSell() {
		if (tbSell == null)
			tbSell = new java.util.HashSet<TbSell>();
		return tbSell.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTbSell
	 */
	public void setTbSell(java.util.Collection<TbSell> newTbSell) {
		removeAllTbSell();
		for (java.util.Iterator iter = newTbSell.iterator(); iter.hasNext();)
			addTbSell((TbSell) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTbSell
	 */
	public void addTbSell(TbSell newTbSell) {
		if (newTbSell == null)
			return;
		if (this.tbSell == null)
			this.tbSell = new java.util.HashSet<TbSell>();
		if (!this.tbSell.contains(newTbSell)) {
			this.tbSell.add(newTbSell);
			newTbSell.setTbGoodInfo(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbSell
	 */
	public void removeTbSell(TbSell oldTbSell) {
		if (oldTbSell == null)
			return;
		if (this.tbSell != null)
			if (this.tbSell.contains(oldTbSell)) {
				this.tbSell.remove(oldTbSell);
				oldTbSell.setTbGoodInfo((TbGoodInfo) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbSell() {
		if (tbSell != null) {
			TbSell oldTbSell;
			for (java.util.Iterator iter = getIteratorTbSell(); iter.hasNext();) {
				oldTbSell = (TbSell) iter.next();
				iter.remove();
				oldTbSell.setTbGoodInfo((TbGoodInfo) null);
			}
		}
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TbSellReturn> getTbSellReturn() {
		if (tbSellReturn == null)
			tbSellReturn = new java.util.HashSet<TbSellReturn>();
		return tbSellReturn;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTbSellReturn() {
		if (tbSellReturn == null)
			tbSellReturn = new java.util.HashSet<TbSellReturn>();
		return tbSellReturn.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTbSellReturn
	 */
	public void setTbSellReturn(
			java.util.Collection<TbSellReturn> newTbSellReturn) {
		removeAllTbSellReturn();
		for (java.util.Iterator iter = newTbSellReturn.iterator(); iter
				.hasNext();)
			addTbSellReturn((TbSellReturn) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTbSellReturn
	 */
	public void addTbSellReturn(TbSellReturn newTbSellReturn) {
		if (newTbSellReturn == null)
			return;
		if (this.tbSellReturn == null)
			this.tbSellReturn = new java.util.HashSet<TbSellReturn>();
		if (!this.tbSellReturn.contains(newTbSellReturn)) {
			this.tbSellReturn.add(newTbSellReturn);
			newTbSellReturn.setTbGoodInfo(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbSellReturn
	 */
	public void removeTbSellReturn(TbSellReturn oldTbSellReturn) {
		if (oldTbSellReturn == null)
			return;
		if (this.tbSellReturn != null)
			if (this.tbSellReturn.contains(oldTbSellReturn)) {
				this.tbSellReturn.remove(oldTbSellReturn);
				oldTbSellReturn.setTbGoodInfo((TbGoodInfo) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbSellReturn() {
		if (tbSellReturn != null) {
			TbSellReturn oldTbSellReturn;
			for (java.util.Iterator iter = getIteratorTbSellReturn(); iter
					.hasNext();) {
				oldTbSellReturn = (TbSellReturn) iter.next();
				iter.remove();
				oldTbSellReturn.setTbGoodInfo((TbGoodInfo) null);
			}
		}
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TbStock> getTbStock() {
		if (tbStock == null)
			tbStock = new java.util.HashSet<TbStock>();
		return tbStock;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTbStock() {
		if (tbStock == null)
			tbStock = new java.util.HashSet<TbStock>();
		return tbStock.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTbStock
	 */
	public void setTbStock(java.util.Collection<TbStock> newTbStock) {
		removeAllTbStock();
		for (java.util.Iterator iter = newTbStock.iterator(); iter.hasNext();)
			addTbStock((TbStock) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTbStock
	 */
	public void addTbStock(TbStock newTbStock) {
		if (newTbStock == null)
			return;
		if (this.tbStock == null)
			this.tbStock = new java.util.HashSet<TbStock>();
		if (!this.tbStock.contains(newTbStock)) {
			this.tbStock.add(newTbStock);
			newTbStock.setTbGoodInfo(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbStock
	 */
	public void removeTbStock(TbStock oldTbStock) {
		if (oldTbStock == null)
			return;
		if (this.tbStock != null)
			if (this.tbStock.contains(oldTbStock)) {
				this.tbStock.remove(oldTbStock);
				oldTbStock.setTbGoodInfo((TbGoodInfo) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbStock() {
		if (tbStock != null) {
			TbStock oldTbStock;
			for (java.util.Iterator iter = getIteratorTbStock(); iter.hasNext();) {
				oldTbStock = (TbStock) iter.next();
				iter.remove();
				oldTbStock.setTbGoodInfo((TbGoodInfo) null);
			}
		}
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TbStockReturn> getTbStockReturn() {
		if (tbStockReturn == null)
			tbStockReturn = new java.util.HashSet<TbStockReturn>();
		return tbStockReturn;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTbStockReturn() {
		if (tbStockReturn == null)
			tbStockReturn = new java.util.HashSet<TbStockReturn>();
		return tbStockReturn.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTbStockReturn
	 */
	public void setTbStockReturn(
			java.util.Collection<TbStockReturn> newTbStockReturn) {
		removeAllTbStockReturn();
		for (java.util.Iterator iter = newTbStockReturn.iterator(); iter
				.hasNext();)
			addTbStockReturn((TbStockReturn) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTbStockReturn
	 */
	public void addTbStockReturn(TbStockReturn newTbStockReturn) {
		if (newTbStockReturn == null)
			return;
		if (this.tbStockReturn == null)
			this.tbStockReturn = new java.util.HashSet<TbStockReturn>();
		if (!this.tbStockReturn.contains(newTbStockReturn)) {
			this.tbStockReturn.add(newTbStockReturn);
			newTbStockReturn.setTbGoodInfo(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTbStockReturn
	 */
	public void removeTbStockReturn(TbStockReturn oldTbStockReturn) {
		if (oldTbStockReturn == null)
			return;
		if (this.tbStockReturn != null)
			if (this.tbStockReturn.contains(oldTbStockReturn)) {
				this.tbStockReturn.remove(oldTbStockReturn);
				oldTbStockReturn.setTbGoodInfo((TbGoodInfo) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllTbStockReturn() {
		if (tbStockReturn != null) {
			TbStockReturn oldTbStockReturn;
			for (java.util.Iterator iter = getIteratorTbStockReturn(); iter
					.hasNext();) {
				oldTbStockReturn = (TbStockReturn) iter.next();
				iter.remove();
				oldTbStockReturn.setTbGoodInfo((TbGoodInfo) null);
			}
		}
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
				oldTbProviderInfo.removeTbGoodInfo(this);
			}
			if (newTbProviderInfo != null) {
				this.tbProviderInfo = newTbProviderInfo;
				this.tbProviderInfo.addTbGoodInfo(this);
			}
		}
	}

}