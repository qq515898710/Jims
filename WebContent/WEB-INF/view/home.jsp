<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
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
     
     <!-- 导航条 -->
     <jsp:include page="nav.jsp"></jsp:include>
     
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
      <div class="page-header"> 
       <h1> <small> 登录成功！ </small> </h1> 
      </div> 
      <!-- /.page-header --> 
      <div class="row"> 
       <div class="col-xs-12"> 
        <!-- PAGE CONTENT BEGINS --> 
        <div class="alert alert-block alert-success"> 
         <button type="button" class="close" data-dismiss="alert"> <i class="icon-remove"></i> </button> 
         <i class="icon-ok green"></i> 欢迎使用 
         <strong class="green"> Ace进销存管理系统 <small>(v1.0)</small> </strong> 
        </div> 
       </div> 
       <!-- /.col --> 
      </div> 
      <!-- /.row --> 
     </div> 
     <!-- /.page-content --> 
    </div> 
    <!-- /.main-content --> 
    
    <!-- 工具导入 -->
    <jsp:include page="tool.jsp"></jsp:include>
    
    <!-- /#ace-settings-container --> 
   </div> 
   <!-- /.main-container-inner --> 
   <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"> <i class="icon-double-angle-up icon-only bigger-110"></i> </a> 
  </div>  
 </body>
</html>