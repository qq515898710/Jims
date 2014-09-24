/***********************************************************************
 * Module:  TbUserPermission.java
 * Author:  YK
 * Purpose: Defines the Class TbUserPermission
 ***********************************************************************/

import java.util.*;

/** 权限
 * 
 * @pdOid b93e9e09-bdff-4308-94f2-4e038ac5b8ea */
public class TbUserPermission {
   /** 编号
    * 
    * @pdOid 75ec6fda-2831-4b25-9997-c187f4cf08ad */
   public int id;
   /** 客户信息管理 
    * 
    * @pdOid 8ff5b211-6974-4d27-8d6d-501780dc8a34 */
   public int keHuGuanLi;
   /** 商品信息管理 
    * 
    * @pdOid f07faa76-df2c-4afe-b741-67ea65d7afd8 */
   public int shangPinGuanLi;
   /** 供应商信息管理 
    * 
    * @pdOid c4f9905c-82ef-48bc-9f97-3ee96d8b039f */
   public int gongYingShangGuanLi;
   /** 进货单 
    * 
    * @pdOid c0f2575d-97af-4797-bae4-b5d5a63e8f6a */
   public int jinHuoDan;
   /** 进货退货 
    * 
    * @pdOid c6d8a829-91e4-400a-9448-2e7e8b7b1ee4 */
   public int jinHuoTuiHuo;
   /**  销售单 
    * 
    * @pdOid ed62145e-9e71-4590-a506-c40334876fd3 */
   public int xiaoShouDan;
   /**  销售退货 
    * 
    * @pdOid 64a81445-eb7f-471a-a230-c491e0b5b8e0 */
   public int xiaoShouTuiHuo;
   /**  客户查询 
    * 
    * @pdOid 8080ffc4-1adc-42c0-8b78-79fd6fd7fd08 */
   public int keHuChaXun;
   /**  商品查询 
    * 
    * @pdOid 013d6f2b-ca3f-4077-85ae-4ad4a40c8831 */
   public int shangPinChaXun;
   /**  供应商查询 
    * 
    * @pdOid bda3bbe5-f50a-4c68-8416-d738e8718566 */
   public int gongYingShangChaXun;
   /** 销售查询 
    * 
    * @pdOid 59a76e29-5ca3-4c59-918f-fcd7b6e60fc2 */
   public int xiaoShouChaXun;
   /** 销售退货查询
    * 
    * @pdOid 019dbf4d-e9bd-4ac7-8fbc-fd3f1031b0f9 */
   public int xiaoShouTuiHuoChaXun;
   /** 入货查询
    * 
    * @pdOid b33fd0be-e7a3-4b85-a80a-398c6abba5fc */
   public int ruKuChaXun;
   /** 入库退货查询
    * 
    * @pdOid 44df8388-a38d-4bd3-94f9-e684410a852d */
   public int ruKuTuiHuoChaXun;
   /** 销售排行
    * 
    * @pdOid 8e15a521-eee9-4dc0-b5ee-044bfdf387dc */
   public int xiaoShouPaiHang;
   /** 库存盘点
    * 
    * @pdOid ffb100ee-905b-448c-9b7e-89049c78a08b */
   public int kuCunPanDian;
   /** 价格调整
    * 
    * @pdOid 69fefcb6-d1d2-4efa-a50a-726181347a30 */
   public int jiaGeTiaoZheng;
   /** 操作员管理
    * 
    * @pdOid a84d0903-0afd-430f-bb7b-51fa97853303 */
   public int caoZuoYuanGuanLi;
   /** 更改密码
    * 
    * @pdOid 03cf826a-3556-4468-96e6-6f63eae3295f */
   public int gengGaiMiMa;
   /** 权限管理
    * 
    * @pdOid 11418465-b69f-49cb-8f46-b8a5c3cd093d */
   public int quanXianGuanLi;
   
   /** @pdRoleInfo migr=no name=TbUserRole assc=reference3 mult=0..1 side=A */
   public TbUserRole tbUserRole;
   
   
   /** @pdGenerated default parent getter */
   public TbUserRole getTbUserRole() {
      return tbUserRole;
   }
   
   /** @pdGenerated default parent setter
     * @param newTbUserRole */
   public void setTbUserRole(TbUserRole newTbUserRole) {
      if (this.tbUserRole == null || !this.tbUserRole.equals(newTbUserRole))
      {
         if (this.tbUserRole != null)
         {
            TbUserRole oldTbUserRole = this.tbUserRole;
            this.tbUserRole = null;
            oldTbUserRole.removeTbUserPermission(this);
         }
         if (newTbUserRole != null)
         {
            this.tbUserRole = newTbUserRole;
            this.tbUserRole.addTbUserPermission(this);
         }
      }
   }

}