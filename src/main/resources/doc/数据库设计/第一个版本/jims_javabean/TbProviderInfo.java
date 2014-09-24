/***********************************************************************
 * Module:  TbProviderInfo.java
 * Author:  YK
 * Purpose: Defines the Class TbProviderInfo
 ***********************************************************************/

import java.util.*;

/** 供应商信息
 * 
 * @pdOid 5b8cef88-08bb-4d4c-9e36-0766924f8e23 */
public class TbProviderInfo {
   /** 以"p"作为前缀,加上4位数做编号的后缀
    * 
    * @pdOid 39d989df-15aa-473d-9bec-04307935a40b */
   public java.lang.String id;
   /** 供应商名称
    * 
    * @pdOid 3a6cc5af-41cb-43a2-9401-730002f6a22b */
   public java.lang.String pname;
   /** 简称
    * 
    * @pdOid 2ecd342c-a3e4-4671-9237-67e34323ce67 */
   public java.lang.String abbreviation;
   /** 地址
    * 
    * @pdOid 885e415e-b346-417a-94d9-e7b4f2aa742a */
   public java.lang.String address;
   /** 邮政编码
    * 
    * @pdOid 3380e973-5007-4168-9398-b6aa8b121179 */
   public java.lang.String postalCode;
   /** 电话
    * 
    * @pdOid 84f9f8ab-7248-4378-b829-6ae1ff0576d1 */
   public java.lang.String phone;
   /** 传真
    * 
    * @pdOid 13000f02-21b4-43de-a3e8-a74f97eb82bc */
   public java.lang.String fax;
   /** 联系人
    * 
    * @pdOid 3b9ccb51-3132-4582-a3e4-717c63347615 */
   public java.lang.String contacts;
   /** 联系人电话
    * 
    * @pdOid 7959daf6-b91b-49e6-9247-76a4a8c968c3 */
   public java.lang.String telephone;
   /** 开户行
    * 
    * @pdOid e9106df2-090f-4fc5-8c9a-938f6efa92c0 */
   public java.lang.String depositBank;
   /** 电子邮箱
    * 
    * @pdOid 0fa9e5f9-bebe-4fb7-b8b2-5d9c45e7d25b */
   public java.lang.String email;
   
   /** @pdRoleInfo migr=no name=TbGoodInfo assc=reference5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbGoodInfo> tbGoodInfo;
   /** @pdRoleInfo migr=no name=TbStock assc=reference9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbStock> tbStock;
   /** @pdRoleInfo migr=no name=TbStockReturn assc=reference14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbStockReturn> tbStockReturn;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TbGoodInfo> getTbGoodInfo() {
      if (tbGoodInfo == null)
         tbGoodInfo = new java.util.HashSet<TbGoodInfo>();
      return tbGoodInfo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTbGoodInfo() {
      if (tbGoodInfo == null)
         tbGoodInfo = new java.util.HashSet<TbGoodInfo>();
      return tbGoodInfo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTbGoodInfo */
   public void setTbGoodInfo(java.util.Collection<TbGoodInfo> newTbGoodInfo) {
      removeAllTbGoodInfo();
      for (java.util.Iterator iter = newTbGoodInfo.iterator(); iter.hasNext();)
         addTbGoodInfo((TbGoodInfo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbGoodInfo */
   public void addTbGoodInfo(TbGoodInfo newTbGoodInfo) {
      if (newTbGoodInfo == null)
         return;
      if (this.tbGoodInfo == null)
         this.tbGoodInfo = new java.util.HashSet<TbGoodInfo>();
      if (!this.tbGoodInfo.contains(newTbGoodInfo))
      {
         this.tbGoodInfo.add(newTbGoodInfo);
         newTbGoodInfo.setTbProviderInfo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbGoodInfo */
   public void removeTbGoodInfo(TbGoodInfo oldTbGoodInfo) {
      if (oldTbGoodInfo == null)
         return;
      if (this.tbGoodInfo != null)
         if (this.tbGoodInfo.contains(oldTbGoodInfo))
         {
            this.tbGoodInfo.remove(oldTbGoodInfo);
            oldTbGoodInfo.setTbProviderInfo((TbProviderInfo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbGoodInfo() {
      if (tbGoodInfo != null)
      {
         TbGoodInfo oldTbGoodInfo;
         for (java.util.Iterator iter = getIteratorTbGoodInfo(); iter.hasNext();)
         {
            oldTbGoodInfo = (TbGoodInfo)iter.next();
            iter.remove();
            oldTbGoodInfo.setTbProviderInfo((TbProviderInfo)null);
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
   
   /** @pdGenerated default setter
     * @param newTbStock */
   public void setTbStock(java.util.Collection<TbStock> newTbStock) {
      removeAllTbStock();
      for (java.util.Iterator iter = newTbStock.iterator(); iter.hasNext();)
         addTbStock((TbStock)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbStock */
   public void addTbStock(TbStock newTbStock) {
      if (newTbStock == null)
         return;
      if (this.tbStock == null)
         this.tbStock = new java.util.HashSet<TbStock>();
      if (!this.tbStock.contains(newTbStock))
      {
         this.tbStock.add(newTbStock);
         newTbStock.setTbProviderInfo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbStock */
   public void removeTbStock(TbStock oldTbStock) {
      if (oldTbStock == null)
         return;
      if (this.tbStock != null)
         if (this.tbStock.contains(oldTbStock))
         {
            this.tbStock.remove(oldTbStock);
            oldTbStock.setTbProviderInfo((TbProviderInfo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbStock() {
      if (tbStock != null)
      {
         TbStock oldTbStock;
         for (java.util.Iterator iter = getIteratorTbStock(); iter.hasNext();)
         {
            oldTbStock = (TbStock)iter.next();
            iter.remove();
            oldTbStock.setTbProviderInfo((TbProviderInfo)null);
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
   
   /** @pdGenerated default setter
     * @param newTbStockReturn */
   public void setTbStockReturn(java.util.Collection<TbStockReturn> newTbStockReturn) {
      removeAllTbStockReturn();
      for (java.util.Iterator iter = newTbStockReturn.iterator(); iter.hasNext();)
         addTbStockReturn((TbStockReturn)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbStockReturn */
   public void addTbStockReturn(TbStockReturn newTbStockReturn) {
      if (newTbStockReturn == null)
         return;
      if (this.tbStockReturn == null)
         this.tbStockReturn = new java.util.HashSet<TbStockReturn>();
      if (!this.tbStockReturn.contains(newTbStockReturn))
      {
         this.tbStockReturn.add(newTbStockReturn);
         newTbStockReturn.setTbProviderInfo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbStockReturn */
   public void removeTbStockReturn(TbStockReturn oldTbStockReturn) {
      if (oldTbStockReturn == null)
         return;
      if (this.tbStockReturn != null)
         if (this.tbStockReturn.contains(oldTbStockReturn))
         {
            this.tbStockReturn.remove(oldTbStockReturn);
            oldTbStockReturn.setTbProviderInfo((TbProviderInfo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbStockReturn() {
      if (tbStockReturn != null)
      {
         TbStockReturn oldTbStockReturn;
         for (java.util.Iterator iter = getIteratorTbStockReturn(); iter.hasNext();)
         {
            oldTbStockReturn = (TbStockReturn)iter.next();
            iter.remove();
            oldTbStockReturn.setTbProviderInfo((TbProviderInfo)null);
         }
      }
   }

}