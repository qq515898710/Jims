/***********************************************************************
 * Module:  TbUser.java
 * Author:  YK
 * Purpose: Defines the Class TbUser
 ***********************************************************************/

import java.util.*;

/** 操作员信息
 * 
 * @pdOid 5f5069a6-e3ba-47b0-a330-11cda2695c7e */
public class TbUser {
   /** 帐号
    * 
    * @pdOid 25c6914e-a38f-43f3-ae31-b26d0a4c3faa */
   public java.lang.String name;
   /** 用户名
    * 
    * @pdOid 6592702f-b21d-4861-9265-dee0181af106 */
   public java.lang.String username;
   /** 密码
    * 
    * @pdOid 9a8402ff-e740-43bc-ae54-69bedd67ec7f */
   public java.lang.String password;
   
   /** @pdRoleInfo migr=no name=TbUserLog assc=reference1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbUserLog> tbUserLog;
   /** @pdRoleInfo migr=no name=TbUserRole assc=reference2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbUserRole> tbUserRole;
   /** @pdRoleInfo migr=no name=TbSell assc=reference8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbSell> tbSell;
   /** @pdRoleInfo migr=no name=TbSellReturn assc=reference12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbSellReturn> tbSellReturn;
   /** @pdRoleInfo migr=no name=TbStock assc=reference13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbStock> tbStock;
   /** @pdRoleInfo migr=no name=TbStockReturn assc=reference15 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TbStockReturn> tbStockReturn;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TbUserLog> getTbUserLog() {
      if (tbUserLog == null)
         tbUserLog = new java.util.HashSet<TbUserLog>();
      return tbUserLog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTbUserLog() {
      if (tbUserLog == null)
         tbUserLog = new java.util.HashSet<TbUserLog>();
      return tbUserLog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTbUserLog */
   public void setTbUserLog(java.util.Collection<TbUserLog> newTbUserLog) {
      removeAllTbUserLog();
      for (java.util.Iterator iter = newTbUserLog.iterator(); iter.hasNext();)
         addTbUserLog((TbUserLog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbUserLog */
   public void addTbUserLog(TbUserLog newTbUserLog) {
      if (newTbUserLog == null)
         return;
      if (this.tbUserLog == null)
         this.tbUserLog = new java.util.HashSet<TbUserLog>();
      if (!this.tbUserLog.contains(newTbUserLog))
      {
         this.tbUserLog.add(newTbUserLog);
         newTbUserLog.setTbUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbUserLog */
   public void removeTbUserLog(TbUserLog oldTbUserLog) {
      if (oldTbUserLog == null)
         return;
      if (this.tbUserLog != null)
         if (this.tbUserLog.contains(oldTbUserLog))
         {
            this.tbUserLog.remove(oldTbUserLog);
            oldTbUserLog.setTbUser((TbUser)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbUserLog() {
      if (tbUserLog != null)
      {
         TbUserLog oldTbUserLog;
         for (java.util.Iterator iter = getIteratorTbUserLog(); iter.hasNext();)
         {
            oldTbUserLog = (TbUserLog)iter.next();
            iter.remove();
            oldTbUserLog.setTbUser((TbUser)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<TbUserRole> getTbUserRole() {
      if (tbUserRole == null)
         tbUserRole = new java.util.HashSet<TbUserRole>();
      return tbUserRole;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTbUserRole() {
      if (tbUserRole == null)
         tbUserRole = new java.util.HashSet<TbUserRole>();
      return tbUserRole.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTbUserRole */
   public void setTbUserRole(java.util.Collection<TbUserRole> newTbUserRole) {
      removeAllTbUserRole();
      for (java.util.Iterator iter = newTbUserRole.iterator(); iter.hasNext();)
         addTbUserRole((TbUserRole)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTbUserRole */
   public void addTbUserRole(TbUserRole newTbUserRole) {
      if (newTbUserRole == null)
         return;
      if (this.tbUserRole == null)
         this.tbUserRole = new java.util.HashSet<TbUserRole>();
      if (!this.tbUserRole.contains(newTbUserRole))
      {
         this.tbUserRole.add(newTbUserRole);
         newTbUserRole.setTbUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTbUserRole */
   public void removeTbUserRole(TbUserRole oldTbUserRole) {
      if (oldTbUserRole == null)
         return;
      if (this.tbUserRole != null)
         if (this.tbUserRole.contains(oldTbUserRole))
         {
            this.tbUserRole.remove(oldTbUserRole);
            oldTbUserRole.setTbUser((TbUser)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTbUserRole() {
      if (tbUserRole != null)
      {
         TbUserRole oldTbUserRole;
         for (java.util.Iterator iter = getIteratorTbUserRole(); iter.hasNext();)
         {
            oldTbUserRole = (TbUserRole)iter.next();
            iter.remove();
            oldTbUserRole.setTbUser((TbUser)null);
         }
      }
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
         newTbSell.setTbUser(this);      
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
            oldTbSell.setTbUser((TbUser)null);
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
            oldTbSell.setTbUser((TbUser)null);
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
         newTbSellReturn.setTbUser(this);      
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
            oldTbSellReturn.setTbUser((TbUser)null);
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
            oldTbSellReturn.setTbUser((TbUser)null);
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
         newTbStock.setTbUser(this);      
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
            oldTbStock.setTbUser((TbUser)null);
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
            oldTbStock.setTbUser((TbUser)null);
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
         newTbStockReturn.setTbUser(this);      
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
            oldTbStockReturn.setTbUser((TbUser)null);
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
            oldTbStockReturn.setTbUser((TbUser)null);
         }
      }
   }

}