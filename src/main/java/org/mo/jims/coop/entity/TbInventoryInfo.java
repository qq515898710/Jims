/***********************************************************************
 * Module:  TbInventoryInfo.java
 * Author:  YK
 * Purpose: Defines the Class TbInventoryInfo
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 库存信息
 * 
 * @pdOid b7ab1f61-944f-4a54-8b9a-967bd038973c
 */
public class TbInventoryInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 * 
	 * @pdOid 5e1c6bfd-c319-445d-b140-a671de2c4780
	 */
	private java.lang.String id;
	/**
	 * 商品名称
	 * 
	 * @pdOid adc82e2a-eb8a-4dea-8286-35a9ddbdf029
	 */
	private java.lang.String name;
	/**
	 * 商品简称
	 * 
	 * @pdOid be9ad79e-d328-4ff8-91fd-414124961797
	 */
	private java.lang.String abbreviation;
	/**
	 * 产地
	 * 
	 * @pdOid 85c57e05-608c-4ddf-a63c-3225c2f94a44
	 */
	private java.lang.String origin;
	/**
	 * 规格
	 * 
	 * @pdOid f417663d-a335-4e37-ba66-4d4072180bb2
	 */
	private java.lang.String specification;
	/**
	 * 包装
	 * 
	 * @pdOid 008d76ea-2f19-4629-86a6-a8c7b95845d9
	 */
	private java.lang.String pack;
	/**
	 * 单位
	 * 
	 * @pdOid 804a9bc1-6ab0-47bf-8948-e0cebc901015
	 */
	private java.lang.String units;
	/**
	 * 单价
	 * 
	 * @pdOid 97a4ebcf-9d22-49f9-8539-e4aff83ee289
	 */
	private float unitCost;
	/**
	 * 库存数量
	 * 
	 * @pdOid 205606a7-caf9-4f76-8691-2811f8d12740
	 */
	private int amount;

	/** @pdRoleInfo migr=no name=TbUser assc=reference19 mult=0..1 side=A */
	private TbUser tbUser;
	
	

	public TbInventoryInfo() {
		super();
	}

	public TbInventoryInfo(String name, String abbreviation, String origin,
			String specification, String pack, String units, float unitCost,
			int amount) {
		super();
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		this.id = "i" + date.toString();
		this.name = name;
		this.abbreviation = abbreviation;
		this.origin = origin;
		this.specification = specification;
		this.pack = pack;
		this.units = units;
		this.unitCost = unitCost;
		this.amount = amount;
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
				oldTbUser.removeTbInventoryInfo(this);
			}
			if (newTbUser != null) {
				this.tbUser = newTbUser;
				this.tbUser.addTbInventoryInfo(this);
			}
		}
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
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

	public java.lang.String getSpecification() {
		return specification;
	}

	public void setSpecification(java.lang.String specification) {
		this.specification = specification;
	}

	public java.lang.String getPack() {
		return pack;
	}

	public void setPack(java.lang.String pack) {
		this.pack = pack;
	}

	public java.lang.String getUnits() {
		return units;
	}

	public void setUnits(java.lang.String units) {
		this.units = units;
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

}