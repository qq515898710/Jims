<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <ul class="nav nav-list"> 
      <li id="baseManage"><a href="#" class="dropdown-toggle"> <i class="icon-dashboard"></i> <span class="menu-text"> 基本信息管理</span><b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="KeHuGuanLi"><a href="coop/cZKs8DCjl7PhWwE5HP9FeA==.html"> <i class="icon-double-angle-right"></i>客户信息管理 </a></li> 
        <li id="ShangPinGuanLi"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>商品信息管理 </a></li> 
        <li id="GongYingShangGuanLi"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>供应商信息管理 </a></li> 
       </ul></li> 
      <li id="stockManage"><a href="javascript:void()" class="dropdown-toggle"> <i class="icon-text-width"></i> <span class="menu-text"> 进货管理 </span><b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="JinHuoDan"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>进货单 </a></li> 
        <li id="JinHuoTuiHuo"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>进货退货 </a></li> 
       </ul></li> 
      <li id="sellManage"><a href="#" class="dropdown-toggle"> <i class="icon-desktop"></i> <span class="menu-text"> 销售管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="XiaoShouDan"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 销售单 </a></li> 
        <li id="XiaoShouTuiHuo"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 销售退货 </a></li> 
       </ul></li> 
      <li id="searchStatistic"><a href="#" class="dropdown-toggle"> <i class="icon-list"></i> <span class="menu-text"> 查询统计 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="KeHuChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 客户查询 </a></li> 
        <li id="ShangPinChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 商品查询 </a></li> 
        <li id="GongYingShangChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 供应商查询 </a></li> 
        <li id="XiaoShouChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>销售查询 </a></li> 
        <li id="XiaoShouTuiHuoChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>销售退货查询 </a></li> 
        <li id="RuKuChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>入货查询 </a></li> 
        <li id="RuKuTuiHuoChaXun"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>入库退货查询 </a></li> 
        <li id="XiaoShouPaiHang"><a href="javascript:void()"> <i class="icon-double-angle-right"></i>销售排行 </a></li> 
       </ul></li> 
      <li id="depotManage"><a href="#" class="dropdown-toggle"> <i class="icon-edit"></i> <span class="menu-text"> 库存管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="KuCunPanDian"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 库存盘点 </a></li> 
        <li id="JiaGeTiaoZheng"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 价格调整 </a></li> 
       </ul></li> 
      <li id="sysManage"><a href="#" class="dropdown-toggle"> <i class="icon-tag"></i> <span class="menu-text"> 系统管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li id="CaoZuoYuanGuanLi"><a href="coop/sys/IIk15dX0+6BqWuCaUE0kEh8kB9Ww/4zb.html/1/10"> <i class="icon-double-angle-right"></i> 操作员管理 </a></li> 
        <li id="GengGaiMiMa"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 更改密码 </a></li> 
        <li id="QuanXianGuanLi"><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 权限管理 </a></li> 
       </ul></li> 
     </ul>
     <input type="hidden" id="active" value="${active }"/>
     <input type="hidden" id="baseActive" value="${baseActive }"/>
<!-- /.nav-list --> 
<script type="text/javascript">
//点击那个就激活那个。。
var result = $("#active").val();
var result2 = $("#baseActive").val();
$(document).ready(function() {
	$("li[id="+result2+"]").addClass("active open");
	$("li[id="+result+"]").addClass("active");
});
</script>