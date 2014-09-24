/***********************************************************************
 * Module:  TbSellReturn.java
 * Author:  YK
 * Purpose: Defines the Class TbSellReturn
 ***********************************************************************/

import java.util.*;

/** 销售退货信息
 * 
 * @pdOid b0f3b7c2-6e6d-4372-9738-fd3a97855e0c */
public class TbSellReturn {
   /** @pdOid 8af72770-ef27-482f-a14f-e571ccc88ee8 */
   public java.lang.String id;
   /** @pdOid a695e323-3b60-43b1-b793-0294b7d3ba73 */
   public float unitCost;
   /** @pdOid 63affd46-cd4d-4a9b-bb75-7239d44913ac */
   public int amount;
   /** @pdOid b5adb198-6758-46e3-8acd-3661d8372bcb */
   public float sum;
   /** @pdOid 9a04e624-384f-471c-910e-62c683ed6ea7 */
   public java.util.Date time;
   /** @pdOid c208f615-fbb0-4fe0-a1ed-3e0e2464be59 */
   public java.lang.String clearingForm;
   /** @pdOid bc15b0fa-f9de-415e-8fcf-c445ca33e54c */
   public java.lang.String handler;
   
   /** @pdRoleInfo migr=no name=TbGoodInfo assc=reference10 mult=0..1 side=A */
   public TbGoodInfo tbGoodInfo;
   /** @pdRoleInfo migr=no name=TbCustomerInfo assc=reference11 mult=0..1 side=A */
   public TbCustomerInfo tbCustomerInfo;
   /** @pdRoleInfo migr=no name=TbUser assc=reference12 mult=0..1 side=A */
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
            oldTbGoodInfo.removeTbSellReturn(this);
         }
         if (newTbGoodInfo != null)
         {
            this.tbGoodInfo = newTbGoodInfo;
            this.tbGoodInfo.addTbSellReturn(this);
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
            oldTbCustomerInfo.removeTbSellReturn(this);
         }
         if (newTbCustomerInfo != null)
         {
            this.tbCustomerInfo = newTbCustomerInfo;
            this.tbCustomerInfo.addTbSellReturn(this);
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
            oldTbUser.removeTbSellReturn(this);
         }
         if (newTbUser != null)
         {
            this.tbUser = newTbUser;
            this.tbUser.addTbSellReturn(this);
         }
      }
   }

}