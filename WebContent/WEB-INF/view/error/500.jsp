<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/header.jsp"></jsp:include>
<div class="main-container" id="main-container"> 
   <script type="text/javascript">
		try {
			ace.settings.check('main-container', 'fixed')
		} catch (e) {
		}
	</script> 
   <div class="main-container-inner"> 
    <a class="menu-toggler" id="menu-toggler" href="#"> <span class="menu-text"></span> </a> 
    <div class="sidebar" id="sidebar"> 
     <script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'fixed')
				} catch (e) {
				}
			</script> 
     <div class="sidebar-shortcuts" id="sidebar-shortcuts"> 
      <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large"> 
       <button class="btn btn-success"> <i class="icon-signal"></i> </button> 
       <button class="btn btn-info"> <i class="icon-pencil"></i> </button> 
       <button class="btn btn-warning"> <i class="icon-group"></i> </button> 
       <button class="btn btn-danger"> <i class="icon-cogs"></i> </button> 
      </div> 
      <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini"> 
       <span class="btn btn-success"></span> 
       <span class="btn btn-info"></span> 
       <span class="btn btn-warning"></span> 
       <span class="btn btn-danger"></span> 
      </div> 
     </div> 
     <!-- #sidebar-shortcuts --> 
     <ul class="nav nav-list"> 
      <li><a href="#" class="dropdown-toggle"> <i class="icon-dashboard"></i> <span class="menu-text"> 基本信息管理</span><b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>客户信息管理 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>商品信息管理 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>供应商信息管理 </a></li> 
       </ul></li> 
      <li><a href="javascript:void()" class="dropdown-toggle"> <i class="icon-text-width"></i> <span class="menu-text"> 进货管理 </span><b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>进货单 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>进货退货 </a></li> 
       </ul></li> 
      <li><a href="#" class="dropdown-toggle"> <i class="icon-desktop"></i> <span class="menu-text"> 销售管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i> //todo </a></li> 
       </ul></li> 
      <li><a href="#" class="dropdown-toggle"> <i class="icon-list"></i> <span class="menu-text"> 查询统计 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 客户查询 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 商品查询 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i> 供应商查询 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>销售查询 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i>销售退货查询 </a></li> 
        <li><a href="javascript:void()"> <i class="icon-double-angle-right"></i> //todo </a></li> 
       </ul></li> 
      <li><a href="#" class="dropdown-toggle"> <i class="icon-edit"></i> <span class="menu-text"> 库存管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="form-elements.html"> <i class="icon-double-angle-right"></i> 库存盘点 </a></li> 
        <li><a href="form-elements.html"> <i class="icon-double-angle-right"></i> 价格调整 </a></li> 
       </ul></li> 
      <li><a href="#" class="dropdown-toggle"> <i class="icon-tag"></i> <span class="menu-text"> 系统管理 </span> <b class="arrow icon-angle-down"></b> </a> 
       <ul class="submenu"> 
        <li><a href="profile.html"> <i class="icon-double-angle-right"></i> 用户信息 </a></li> 
       </ul></li> 
     </ul> 
     <!-- /.nav-list --> 
     <div class="sidebar-collapse" id="sidebar-collapse"> 
      <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i> 
     </div> 
     <script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'collapsed')
				} catch (e) {
				}
			</script> 
    </div> 
    <div class="main-content"> 
     <div class="breadcrumbs" id="breadcrumbs"> 
      <script type="text/javascript">
					try {
						ace.settings.check('breadcrumbs', 'fixed')
					} catch (e) {
					}
				</script> 
      <ul class="breadcrumb"> 
       <li><i class="icon-home home-icon"></i> <a href="javascript:void()">首页</a></li> 
       <li><a href="javasript:void()">500</a></li> 
      </ul> 
      <!-- .breadcrumb --> 
      <div class="nav-search" id="nav-search"> 
       <form class="form-search"> 
        <span class="input-icon"> <input type="text" placeholder="请输入查询的内容" class="nav-search-input" id="nav-search-input" autocomplete="off" /> <i class="icon-search nav-search-icon"></i> </span> 
       </form> 
      </div> 
      <!-- #nav-search --> 
     </div> 
     <div class="page-content"> 
      <div class="row"> 
       <div class="col-xs-12"> 
        <!-- PAGE CONTENT BEGINS --> 
        <div class="error-container"> 
         <div class="well"> 
          <h1 class="grey lighter smaller"> <span class="blue bigger-125"> <i class="icon-random"></i> 500 </span> 发生了一些错误 </h1> 
          <hr /> 
          <h3 class="lighter smaller"> 我们正在修理<i class="icon-wrench icon-animated-wrench bigger-125"></i> on 它! </h3> 
          <div class="space"></div> 
          <div> 
           <h4 class="lighter smaller">与此同时,试试下面的其中之一吧:</h4> 
           <ul class="list-unstyled spaced inline bigger-110 margin-15"> 
            <li><i class="icon-hand-right blue"></i> 阅读常见问题</li> 
            <li><i class="icon-hand-right blue"></i> 给我们更多的信息关于这个特定的错误发生!</li> 
           </ul> 
          </div> 
          <hr /> 
          <div class="space"></div> 
          <div class="center"> 
           <a href="javascript:void();" class="btn btn-grey"> <i class="icon-arrow-left"></i> 返回 </a> 
           <a href="home.html" class="btn btn-primary"> <i class="icon-dashboard"></i> 主页 </a> 
          </div> 
         </div> 
        </div> 
        <!-- PAGE CONTENT ENDS --> 
       </div> 
       <!-- /.col --> 
      </div> 
      <!-- /.row --> 
     </div> 
     <!-- /.page-content --> 
    </div> 
    <!-- /.main-content --> 
    <!-- 一些基本设置 --> 
    <div class="ace-settings-container" id="ace-settings-container"> 
     <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn"> 
      <i class="icon-cog bigger-150"></i> 
     </div> 
     <div class="ace-settings-box" id="ace-settings-box"> 
      <div> 
       <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" /> 
       <label class="lbl" for="ace-settings-navbar"> 固定导航条</label> 
      </div> 
      <div> 
       <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" /> 
       <label class="lbl" for="ace-settings-sidebar"> 固定滑动条</label> 
      </div> 
      <div> 
       <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" /> 
       <label class="lbl" for="ace-settings-breadcrumbs">固定面包屑</label> 
      </div> 
      <div> 
       <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" /> 
       <label class="lbl" for="ace-settings-add-container"> 切换窄屏 <b></b> </label> 
      </div> 
     </div> 
    </div> 
    <!-- /#ace-settings-container --> 
   </div> 
   <!-- /.main-container-inner --> 
   <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"> <i class="icon-double-angle-up icon-only bigger-110"></i> </a> 
  </div>  
 </body>
</html>