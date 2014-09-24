/***********************************************************************
 * Module:  TbSell.java
 * Author:  YK
 * Purpose: Defines the Class TbSell
 ***********************************************************************/

import java.util.*;

/** 销售信息
 * 
 * @pdOid 62ee0ae5-f8e3-4c42-a0d0-1984063ce58c */
public class TbSell {
   /** 前缀"s",后缀1000格式
    * 
    * @pdOid 6ccf4dc8-fa6a-4003-af5c-030efd818fac */
   public java.lang.String id;
   /** 销售单价
    * 
    * @pdOid 03616cf5-e301-4d98-a3a0-e95124ae8f6d */
   public float unitCost;
   /** 数量
    * 
    * @pdOid 8fcea480-1ebb-4f11-a65b-417e3e085135 */
   public int amount;
   /** 金额
    * 
    * @pdOid f610dcef-8968-4691-adf9-43c5db5e4313 */
   public float sum;
   /** 销售时间
    * 
    * @pdOid 88304e6e-ea93-48fd-8ee0-7e44ab698c75 */
   public java.util.Date time;
   /** 结算方式
    * 
    * @pdOid 682ded0a-ac83-4f4b-ae2b-2f2196065601 */
   public java.lang.String clearingForm;
   /** @pdOid 76bd86e5-a111-4c32-bc0e-948b80465785 */
   public java.lang.String headler;
   
   /** @pdRoleInfo migr=no name=TbGoodInfo assc=reference6 mult=0..1 side=A */
   public TbGoodInfo tbGoodInfo;
   /** @pdRoleInfo migr=no name=TbCustomerInfo assc=reference7 mult=0..1 side=A */
   public TbCustomerInfo tbCustomerInfo;
   /** @pdRoleInfo migr=no name=TbUser assc=reference8 mult=0..1 side=A */
   public TbUser tbUser;
   
   
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
            oldTbGoodInfo.removeTbSell(this);
         }
         if (newTbGoodInfo != null)
         {
            this.tbGoodInfo = newTbGoodInfo;
            this.tbGoodInfo.addTbSell(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public TbCustomerInfo getTbCustomerInfo() {
      return tbCustomerInfo;
   }
   
   /** @pdGenerated default parent setter
     * @param newTbCustomerInfo */
   public void setTbCustomerInfo(TbCustomerInfo newTbCustomerInfo) {
      if (this.tbCustomerInfo == null || !this.tbCustomerInfo.equals(newTbCustomerInfo))
      {
         if (this.tbCustomerInfo != null)
         {
            TbCustomerInfo oldTbCustomerInfo = this.tbCustomerInfo;
            this.tbCustomerInfo = null;
            oldTbCustomerInfo.removeTbSell(this);
         }
         if (newTbCustomerInfo != null)
         {
            this.tbCustomerInfo = newTbCustomerInfo;
            this.tbCustomerInfo.addTbSell(this);
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
            oldTbUser.removeTbSell(this);
         }
         if (newTbUser != null)
         {
            this.tbUser = newTbUser;
            this.tbUser.addTbSell(this);
         }
      }
   }

}