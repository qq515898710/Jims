/***********************************************************************
 * Module:  TbStock.java
 * Author:  YK
 * Purpose: Defines the Class TbStock
 ***********************************************************************/

import java.util.*;

/** 入库信息主要内容
 * 
 * @pdOid 8ebb042b-74ea-478c-b0e2-a366ad52d7d9 */
public class TbStock {
   /** 入库编号,以"rk"字符串为前缀,加上商品的入库日期,再以3位数字作为后缀
    * 
    * @pdOid 497419ac-c5ed-44c4-9358-6a8c49a026f0 */
   public java.lang.String id;
   /** 品种数量
    * 
    * @pdOid 20d6f463-b9f7-48a1-9da7-adc7e6e51abc */
   public int varietyAmount;
   /** 单价
    * 
    * @pdOid 118991ce-407e-4377-b2f2-198882759c15 */
   public float unitCost;
   /** 数量
    * 
    * @pdOid ad0bdb13-a40f-4b08-80bd-e921baa5264b */
   public int amount;
   /** 合计金额
    * 
    * @pdOid fe5f3f5f-864b-4fe6-8ed6-8d53ca214170 */
   public float sum;
   /** 验收结论
    * 
    * @pdOid 4fce28e6-f1dd-429d-89e3-1e25adc2b588 */
   public java.lang.String check;
   /** 入货时间
    * 
    * @pdOid a97de47a-b159-429c-9250-646f50387966 */
   public java.util.Date time;
   /** 结算方式
    * 
    * @pdOid a14feaaa-d062-4a64-9fcf-51ab7976e22b */
   public java.lang.String clearingForm;
   /** 经手人
    * 
    * @pdOid 003d0e92-121e-45c0-84ac-8ac6aa85b6b7 */
   public java.lang.String handler;
   
   /** @pdRoleInfo migr=no name=TbProviderInfo assc=reference9 mult=0..1 side=A */
   public TbProviderInfo tbProviderInfo;
   /** @pdRoleInfo migr=no name=TbUser assc=reference13 mult=0..1 side=A */
   public TbUser tbUser;
   /** @pdRoleInfo migr=no name=TbGoodInfo assc=reference16 mult=0..1 side=A */
   public TbGoodInfo tbGoodInfo;
   
   
   /** @pdGenerated default parent getter */
   public TbProviderInfo getTbProviderInfo() {
      return tbProviderInfo;
   }
   
   /** @pdGenerated default parent setter
     * @param newTbProviderInfo */
   public void setTbProviderInfo(TbProviderInfo newTbProviderInfo) {
      if (this.tbProviderInfo == null || !this.tbProviderInfo.equals(newTbProviderInfo))
      {
         if (this.tbProviderInfo != null)
         {
            TbProviderInfo oldTbProviderInfo = this.tbProviderInfo;
            this.tbProviderInfo = null;
            oldTbProviderInfo.removeTbStock(this);
         }
         if (newTbProviderInfo != null)
         {
            this.tbProviderInfo = newTbProviderInfo;
            this.tbProviderInfo.addTbStock(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public TbUser getTbUser() {
      return tbUser;
   }
   
   /** @pdGenerated default parent setter
     * @param newTbUser */
   public void setTbUser(TbUser newTbUser) {
      if (this.tbUser == null || !this.tbUser.equals(newTbUser))
      {
         if (this.tbUser != null)
         {
            TbUser oldTbUser = this.tbUser;
            this.tbUser = null;
            oldTbUser.removeTbStock(this);
         }
         if (newTbUser != null)
         {
            this.tbUser = newTbUser;
            this.tbUser.addTbStock(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public TbGoodInfo getTbGoodInfo() {
      return tbGoodInfo;
   }
   
   /** @pdGenerated default parent setter
     * @param newTbGoodInfo */
   public void setTbGoodInfo(TbGoodInfo newTbGoodInfo) {
      if (this.tbGoodInfo == null || !this.tbGoodInfo.equals(newTbGoodInfo))
      {
         if (this.tbGoodInfo != null)
         {
            TbGoodInfo oldTbGoodInfo = this.tbGoodInfo;
            this.tbGoodInfo = null;
            oldTbGoodInfo.removeTbStock(this);
         }
         if (newTbGoodInfo != null)
         {
            this.tbGoodInfo = newTbGoodInfo;
            this.tbGoodInfo.addTbStock(this);
         }
      }
   }

}