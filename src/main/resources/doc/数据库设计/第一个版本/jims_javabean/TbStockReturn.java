/***********************************************************************
 * Module:  TbStockReturn.java
 * Author:  YK
 * Purpose: Defines the Class TbStockReturn
 ***********************************************************************/

import java.util.*;

/** 进货退货信息
 * 
 * @pdOid beac6355-c1b6-42d8-979d-a04facc8a7f1 */
public class TbStockReturn {
   /** 入库编号,以"rk"字符串为前缀,加上商品的入库日期,再以3位数字作为后缀
    * 
    * @pdOid 240f5809-96e6-46c7-8985-58bf202b1f3c */
   public java.lang.String id;
   /** 品种数量
    * 
    * @pdOid fd778410-a785-4439-9beb-eaa200569dc6 */
   public int varietyAmount;
   /** 单价
    * 
    * @pdOid 5872b64b-e743-4708-9226-1d3f71261c24 */
   public float unitCost;
   /** 数量
    * 
    * @pdOid dd6ff1c5-467e-40a3-a2e7-38790f01249e */
   public int amount;
   /** 合计金额
    * 
    * @pdOid ecfd6a97-695c-4be3-9188-df4d4458d4b0 */
   public float sum;
   /** 验收结论
    * 
    * @pdOid b1a463b5-5482-405b-8423-b82ebc9c2073 */
   public java.lang.String check;
   /** 退货时间
    * 
    * @pdOid db042fed-2570-4fb6-aba8-11df929d31ee */
   public java.util.Date time;
   /** 结算方式
    * 
    * @pdOid 240b44ea-bb9a-4bb0-88c5-1df97b5c490e */
   public java.lang.String clearingForm;
   /** 经手人
    * 
    * @pdOid 3193a08f-9149-4d4b-9954-8ceec9d9cde7 */
   public java.lang.String handler;
   
   /** @pdRoleInfo migr=no name=TbProviderInfo assc=reference14 mult=0..1 side=A */
   public TbProviderInfo tbProviderInfo;
   /** @pdRoleInfo migr=no name=TbUser assc=reference15 mult=0..1 side=A */
   public TbUser tbUser;
   /** @pdRoleInfo migr=no name=TbGoodInfo assc=reference17 mult=0..1 side=A */
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
            oldTbProviderInfo.removeTbStockReturn(this);
         }
         if (newTbProviderInfo != null)
         {
            this.tbProviderInfo = newTbProviderInfo;
            this.tbProviderInfo.addTbStockReturn(this);
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
            oldTbUser.removeTbStockReturn(this);
         }
         if (newTbUser != null)
         {
            this.tbUser = newTbUser;
            this.tbUser.addTbStockReturn(this);
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
            oldTbGoodInfo.removeTbStockReturn(this);
         }
         if (newTbGoodInfo != null)
         {
            this.tbGoodInfo = newTbGoodInfo;
            this.tbGoodInfo.addTbStockReturn(this);
         }
      }
   }

}