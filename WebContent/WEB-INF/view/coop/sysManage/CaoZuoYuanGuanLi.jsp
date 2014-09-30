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
     <!-- 导航条 --> 
     <jsp:include page="/WEB-INF/view/nav.jsp"></jsp:include> 
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
       <li><i class="icon-home home-icon"></i> <a href="home.html">首页</a></li> 
       <li><a href="coop/sys/CaoZuoYuanGuanLi.html">操作员管理</a></li> 
      </ul> 
      <!-- .breadcrumb --> 
      <!-- 可添加div--> 
     </div> 
     <div class="page-content"> 
      <div class="row"> 
       <div class="col-xs-12"> 
        <h3 class="header smaller lighter blue">
          <button id="bt-add-dialog" class="btn hide-option" data-toggle="modal"  data-target="#add-dialog-message" title="查找"><i class="icon-search align-top bigger-125"></i>查找 </button>
          <button id="bt-add-dialog" class="btn btn-success hide-option" data-toggle="modal"  data-target="#add-dialog-message" title="添加"><i class="icon-plus-sign align-top bigger-125"></i>添加 </button>
          <button id="bt-edit-dialog" class="btn btn-primary hide-option" data-toggle="modal"  data-target="#edit-dialog-message" title="修改"><i class="icon-edit align-top bigger-125"></i>修改</button>
          <button id="bt-delete-dialog" class="btn btn-danger hide-option" data-toggle="modal"  data-target="#delete-dialog-message" title="删除"><i class="icon-trash align-top bigger-125"></i>删除 </button>
                   <button id="bt-delete-dialog" class="btn btn-purple hide-option" data-toggle="modal"  data-target="#delete-dialog-message"  title="模版execl表格导入,点&lt;更多&gt;下载 " ><i class=" icon-cloud-upload align-top bigger-125"></i>导入 </button>  
          <button id="bt-delete-dialog" class="btn btn-grey hide-option" data-toggle="modal"  data-target="#delete-dialog-message" title="导出"><i class="icon-cloud-download align-top bigger-125"></i>导出 </button>  
        <div class="btn-group"> 
   <button data-toggle="dropdown" class="btn btn-pink dropdown-toggle btn-lg "><i class="icon-stackexchange" ></i> 更多<i class="icon-angle-down icon-on-right"></i></button> 
   <ul class="dropdown-menu"> 
    <li> <a href="#"><i class="icon-print"></i> 打印</a> </li> 
    <li class="divider"></li> 
    <li> <a href="#"><i class="icon-long-arrow-down"></i> 模版表格下载</a> </li> 
   </ul> 
  </div>
        </h3> 
        <div class="table-header">
          所有信息 
        </div> 
        <div class="table-responsive"> 
         <div id="sample-table-2_wrapper" class="dataTables_wrapper" role="grid">
         <div class="row">
            <div class="col-sm-6">
               <div id="page" >
                  <label>显示 
                    <select size="1" name="size"  id="size">
                      <option value="10" selected="selected">10</option>
                      <option value="25">25</option><option value="50">50</option>
                      <option value="100">100</option></select> 记录</label>
             </div ><!--#sample-table-2_length  -->
           </div><!--.col-sm-6  -->
         </div><!--.row  -->
          <!-- 显示列表数据 --> 
          <table id="sample-table-2" class="table table-striped table-bordered table-hover dataTable" aria-describedby="sample-table-2_info"> 
           <thead> 
            <tr role="row"> 
             <th class="center" role="columnheader" rowspan="1" colspan="1" style="width: 57px;" aria-label=""> <label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label> </th> 
             <th  role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 57px;" >序号</th> 
             <th  role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 163px;">帐号</th> 
             <th  role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 133px;" >姓名</th> 
             <th  role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 193px;" > <i class="icon-time bigger-110 hidden-480"></i> 密码 </th> 
             <th role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 170px;" >用户类型</th> 
             <th  role="columnheader" rowspan="1" colspan="1" style="width: 156px;" ></th> 
            </tr> 
           </thead> 
           <tbody role="alert" aria-live="polite" aria-relevant="all">
           <c:forEach items="${page.content}" var="userlist" varStatus="status">
           <tr> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td >${ status.index + 1}</td> 
             <td ><a href="#">${userlist.name}</a></td> 
             <td>${userlist.username}</td> 
             <td>${userlist.password }</td> 
             <td><span class="label label-sm label-warning">
               <c:choose>
                 <c:when test="${userlist.tbUserRole.id eq 1}">管理员</c:when>
                 <c:when test="${userlist.tbUserRole.id eq 2}">操作员</c:when>
               </c:choose></span>
             </td> 
             <td> 
              <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons"> 
               <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i> </a> 
               <a class="green" href="#"> <i class="icon-pencil bigger-130"></i> </a> 
               <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a> 
              </div> 
              <div class="visible-xs visible-sm hidden-md hidden-lg"> 
               <div class="inline position-relative"> 
                <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown"> <i class="icon-caret-down icon-only bigger-120"></i> </button> 
                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close"> 
                 <li><a href="#" class="tooltip-info" data-rel="tooltip" title="View"> <span class="blue"> <i class="icon-zoom-in bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-success" data-rel="tooltip" title="Edit"> <span class="green"> <i class="icon-edit bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-error" data-rel="tooltip" title="Delete"> <span class="red"> <i class="icon-trash bigger-120"></i> </span> </a></li> 
                </ul> 
               </div> 
              </div> </td> 
            </tr> 
           </c:forEach>
           </tbody> 
          </table>
          <div class="row">
            <div class="col-sm-6">
              <div class="dataTables_info" id="sample-table-2_info">显示 1 到 10 记录，共 101 记录</div>
            </div><!--.col-sm-6  -->
            <div class="col-sm-6">
              <div class="dataTables_paginate paging_bootstrap">
                <ul class="pagination">
                  <li class="prev disabled">
                    <a href="#"><i class="icon-double-angle-left"></i></a>
                  </li>
                  <c:forEach var="i" begin="1" end="${page.totalPage }" step="1">
                     <li><a href="#">${i }</a></li>
<%--                      <c:when test="${i eq 5 }"></c:when> --%>
                  </c:forEach>
                  <li class="next">
                    <a href="#"><i class="icon-double-angle-right"></i></a>
                   </li>
                </ul><!--.pagination  -->
              </div><!--.dataTables_paginate  -->
            </div><!--.col-sm-6  -->
          </div><!--.row  -->
         </div> 
        </div> 
       </div> 
       <!-- /.col --> 
      </div> 
      <!-- /.row --> 
     </div> 
     <!-- /.page-content --> 
    </div> 
    <!-- /.main-content --> 
    <script type="text/javascript">
	jQuery(function($) {
		
		$( ".hide-option" ).tooltip({
			hide: {
				effect: "explode",
				delay: 250
			}
		});
		
	});
</script> 
    <!-- 工具导入 --> 
    <jsp:include page="/WEB-INF/view/tool.jsp"></jsp:include> 
    <!-- /#ace-settings-container --> 
   </div> 
   <!-- /.main-container-inner --> 
   <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"> <i class="icon-double-angle-up icon-only bigger-110"></i> </a> 
  </div>  
 </body>
</html>