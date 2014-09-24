/***********************************************************************
 * Module:  TbCustomerInfo.java
 * Author:  YK
 * Purpose: Defines the Class TbCustomerInfo
 ***********************************************************************/

import java.util.*;

/** 客户信息
 * 
 * @pdOid d3d3374b-b973-496e-bc52-dabe57c25e5c */
public class TbCustomerInfo {
   /** 客户的ID编号，以字符串"c"为编号的前缀,加上4位数字做编号的后缀
    * 
    * @pdOid 35a88241-c144-4144-9d60-90a1eefee07d */
   public java.lang.String id;
   /** 客户名称
    * 
    * @pdOid 63da94d6-e49c-4db5-9a45-3056028b5acd */
   public java.lang.String cname;
   /** 简称
    * 
    * @pdOid f21f8222-a53d-4c6c-a330-02bdb081d15e */
   public java.lang.String abbreviation;
   /** 地址
    * 
    * @pdOid 38d92d6a-846e-4361-8cd2-95738fab8c14 */
   public java.lang.String address;
   /** 邮政编号
    * 
    * @pdOid 49237d00-75c5-416e-b2cd-6ce761fd8a77 */
   public java.lang.String postalCode;
   /** 电话
    * 
    * @pdOid 1db50354-dcbc-419c-9b58-d01ca8b95656 */
   public java.lang.String phone;
   /** 传真
    * 
    * @pdOid e1102902-4b1c-4e74-81f8-ca15cd064fd2 */
   public java.lang.String fax;
   /** 联系人
    * 
    * @pdOid 904c6f0f-ce90-4f54-ac40-ca4b2a1aba31 */
   public java.lang.String contacts;
   /** 联系人电话
    * 
    * @pdOid 9c97d75c-ea18-4a30-a74d-40e9a37dca51 */
   public java.lang.String telephone;
   /** 电子邮箱
    * 
    * @pdOid b7294c06-a5f3-4eea-b1fa-52396b0c6849 */
   public java.lang.String email;
   /** 开户行
    * 
    * @pdOid 702a15c6-7cb6-4281-8ec6-a076d2134f4a */
   public java.lang.String depositBank;
   /** 帐号
    * 
    * @pdOid 80320ddf-c44f-469f-bf21-0ff7aa8e9c14 */
   public java.lang.String accountBank;
   
   /** @pdRoleInfo migr=no name=TbSell assc=reference7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbSell> tbSell;
   /** @pdRoleInfo migr=no name=TbSellReturn assc=reference11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbSellReturn> tbSellReturn;
   
   
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
   
   /** @pdGenerated default setter
     * @param newTbSell */
   public void setTbSell(java.util.Collection<TbSell> newTbSell) {
      removeAllTbSell();
      for (java.util.Iterator iter = newTbSell.iterator(); iter.hasNext();)
         addTbSell((TbSell)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbSell */
   public void addTbSell(TbSell newTbSell) {
      if (newTbSell == null)
         return;
      if (this.tbSell == null)
         this.tbSell = new java.util.HashSet<TbSell>();
      if (!this.tbSell.contains(newTbSell))
      {
         this.tbSell.add(newTbSell);
         newTbSell.setTbCustomerInfo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbSell */
   public void removeTbSell(TbSell oldTbSell) {
      if (oldTbSell == null)
         return;
      if (this.tbSell != null)
         if (this.tbSell.contains(oldTbSell))
         {
            this.tbSell.remove(oldTbSell);
            oldTbSell.setTbCustomerInfo((TbCustomerInfo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbSell() {
      if (tbSell != null)
      {
         TbSell oldTbSell;
         for (java.util.Iterator iter = getIteratorTbSell(); iter.hasNext();)
         {
            oldTbSell = (TbSell)iter.next();
            iter.remove();
            oldTbSell.setTbCustomerInfo((TbCustomerInfo)null);
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
   
   /** @pdGenerated default setter
     * @param newTbSellReturn */
   public void setTbSellReturn(java.util.Collection<TbSellReturn> newTbSellReturn) {
      removeAllTbSellReturn();
      for (java.util.Iterator iter = newTbSellReturn.iterator(); iter.hasNext();)
         addTbSellReturn((TbSellReturn)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbSellReturn */
   public void addTbSellReturn(TbSellReturn newTbSellReturn) {
      if (newTbSellReturn == null)
         return;
      if (this.tbSellReturn == null)
         this.tbSellReturn = new java.util.HashSet<TbSellReturn>();
      if (!this.tbSellReturn.contains(newTbSellReturn))
      {
         this.tbSellReturn.add(newTbSellReturn);
         newTbSellReturn.setTbCustomerInfo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbSellReturn */
   public void removeTbSellReturn(TbSellReturn oldTbSellReturn) {
      if (oldTbSellReturn == null)
         return;
      if (this.tbSellReturn != null)
         if (this.tbSellReturn.contains(oldTbSellReturn))
         {
            this.tbSellReturn.remove(oldTbSellReturn);
            oldTbSellReturn.setTbCustomerInfo((TbCustomerInfo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbSellReturn() {
      if (tbSellReturn != null)
      {
         TbSellReturn oldTbSellReturn;
         for (java.util.Iterator iter = getIteratorTbSellReturn(); iter.hasNext();)
         {
            oldTbSellReturn = (TbSellReturn)iter.next();
            iter.remove();
            oldTbSellReturn.setTbCustomerInfo((TbCustomerInfo)null);
         }
      }
   }

}