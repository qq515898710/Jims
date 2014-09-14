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
      <div class="row"> 
       <div class="col-xs-12"> 
        <h3 class="header smaller lighter blue">客户信息管理</h3> 
        <div class="table-header">
         所有信息
        </div> 
        <div class="table-responsive"> 
         <div id="sample-table-2_wrapper" class="dataTables_wrapper" role="grid"> 
          <div class="row"> 
           <div class="col-sm-6"> 
            <div id="sample-table-2_length" class="dataTables_length"> 
             <label>显示 <select size="1" name="sample-table-2_length" aria-controls="sample-table-2"><option value="10" selected="selected">10</option> <option value="25">25</option> <option value="50">50</option> <option value="100">100</option></select> 记录 </label> 
            </div> 
           </div> 
           <div class="col-sm-6"> 
            <div class="dataTables_filter" id="sample-table-2_filter"> 
             <label>查找: <input type="text" aria-controls="sample-table-2" /></label> 
            </div> 
           </div> 
          </div> 
          <table id="sample-table-2" class="table table-striped table-bordered table-hover dataTable" aria-describedby="sample-table-2_info"> 
           <thead> 
            <tr role="row">
             <th class="center sorting_disabled" role="columnheader" rowspan="1" colspan="1" style="width: 57px;" aria-label=""> <label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label> </th> 
             <th class="sorting_desc" role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 163px;" aria-sort="descending" aria-label="Domain: activate to sort column ascending">Domain</th> 
             <th class="sorting" role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 122px;" aria-label="Price: activate to sort column ascending">Price</th> 
             <th class="hidden-480 sorting" role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 133px;" aria-label="Clicks: activate to sort column ascending">Clicks</th> 
             <th class="sorting" role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 193px;" aria-label="Update: activate to sort column ascending"> <i class="icon-time bigger-110 hidden-480"></i> Update </th> 
             <th class="hidden-480 sorting" role="columnheader" tabindex="0" aria-controls="sample-table-2" rowspan="1" colspan="1" style="width: 170px;" aria-label="Status: activate to sort column ascending">Status</th> 
             <th class="sorting_disabled" role="columnheader" rowspan="1" colspan="1" style="width: 156px;" aria-label=""></th> 
            </tr> 
           </thead> 
           <tbody role="alert" aria-live="polite" aria-relevant="all"> 
            <tr class="odd"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">year.com</a></td> 
             <td class="">$48</td> 
             <td class="hidden-480">3,990</td> 
             <td class="">Feb 15</td> 
             <td class="hidden-480 "><span class="label label-sm label-warning">Expiring</span></td> 
             <td class=" "> 
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
            <tr class="even"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">view.com</a></td> 
             <td class="">$45</td> 
             <td class="hidden-480">4,100</td> 
             <td class="">Mar 12</td> 
             <td class="hidden-480 "><span class="label label-sm label-success">Registered</span></td> 
             <td class=" "> 
              <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons"> 
               <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i> </a> 
               <a class="green" href="#"> <i class="icon-pencil bigger-130"></i> </a> 
               <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a> 
              </div> 
              <div class="visible-xs visible-sm hidden-md hidden-lg"> 
               <div class="inline position-relative"> 
                <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown"> <i class="icon-caret-down icon-only bigger-120"></i> </button> 
                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close"> 
                 <li><a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View"> <span class="blue"> <i class="icon-zoom-in bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit"> <span class="green"> <i class="icon-edit bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete"> <span class="red"> <i class="icon-trash bigger-120"></i> </span> </a></li> 
                </ul> 
               </div> 
              </div> </td> 
            </tr> 
            <tr class="odd"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">up.com</a></td> 
             <td class="">$95</td> 
             <td class="hidden-480">8,520</td> 
             <td class="">Feb 22</td> 
             <td class="hidden-480 "><span class="label label-sm label-info arrowed arrowed-righ">Sold</span> </td> 
             <td class=" "> 
              <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons"> 
               <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i> </a> 
               <a class="green" href="#"> <i class="icon-pencil bigger-130"></i> </a> 
               <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a> 
              </div> 
              <div class="visible-xs visible-sm hidden-md hidden-lg"> 
               <div class="inline position-relative"> 
                <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown"> <i class="icon-caret-down icon-only bigger-120"></i> </button> 
                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close"> 
                 <li><a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View"> <span class="blue"> <i class="icon-zoom-in bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit"> <span class="green"> <i class="icon-edit bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete"> <span class="red"> <i class="icon-trash bigger-120"></i> </span> </a></li> 
                </ul> 
               </div> 
              </div> </td> 
            </tr> 
            <tr class="even"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">team.com</a></td> 
             <td class="">$40</td> 
             <td class="hidden-480">3,200</td> 
             <td class="">Feb 09</td> 
             <td class="hidden-480 "><span class="label label-sm label-inverse arrowed-in">Flagged</span> </td> 
             <td class=" "> 
              <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons"> 
               <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i> </a> 
               <a class="green" href="#"> <i class="icon-pencil bigger-130"></i> </a> 
               <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a> 
              </div> 
              <div class="visible-xs visible-sm hidden-md hidden-lg"> 
               <div class="inline position-relative"> 
                <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown"> <i class="icon-caret-down icon-only bigger-120"></i> </button> 
                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close"> 
                 <li><a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View"> <span class="blue"> <i class="icon-zoom-in bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit"> <span class="green"> <i class="icon-edit bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete"> <span class="red"> <i class="icon-trash bigger-120"></i> </span> </a></li> 
                </ul> 
               </div> 
              </div> </td> 
            </tr> 
            <tr class="odd"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">sight.com</a></td> 
             <td class="">$58</td> 
             <td class="hidden-480">6,100</td> 
             <td class="">Feb 19</td> 
             <td class="hidden-480 "><span class="label label-sm label-inverse arrowed-in">Flagged</span> </td> 
             <td class=" "> 
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
            <tr class="even"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">shine.com</a></td> 
             <td class="">$25</td> 
             <td class="hidden-480">2,200</td> 
             <td class="">Apr 01</td> 
             <td class="hidden-480 "><span class="label label-sm label-inverse arrowed-in">Flagged</span> </td> 
             <td class=" "> 
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
            <tr class="odd"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">share.com</a></td> 
             <td class="">$30</td> 
             <td class="hidden-480">3,200</td> 
             <td class="">Feb 11</td> 
             <td class="hidden-480 "><span class="label label-sm label-info arrowed arrowed-righ">Sold</span> </td> 
             <td class=" "> 
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
            <tr class="even"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">rise.com</a></td> 
             <td class="">$42</td> 
             <td class="hidden-480">3,900</td> 
             <td class="">Feb 01</td> 
             <td class="hidden-480 "><span class="label label-sm label-info arrowed arrowed-righ">Sold</span> </td> 
             <td class=" "> 
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
            <tr class="odd"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">right.com</a></td> 
             <td class="">$50</td> 
             <td class="hidden-480">4,400</td> 
             <td class="">Apr 01</td> 
             <td class="hidden-480 "><span class="label label-sm label-warning">Expiring</span></td> 
             <td class=" "> 
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
            <tr class="even"> 
             <td class="center"><label> <input type="checkbox" class="ace" /> <span class="lbl"></span> </label></td> 
             <td class=" sorting_1"><a href="#">pro.com</a></td> 
             <td class="">$55</td> 
             <td class="hidden-480">4,250</td> 
             <td class="">Jan 21</td> 
             <td class="hidden-480 "><span class="label label-sm label-success">Registered</span></td> 
             <td class=" "> 
              <div class="visible-md visible-lg hidden-sm hidden-xs action-buttons"> 
               <a class="blue" href="#"> <i class="icon-zoom-in bigger-130"></i> </a> 
               <a class="green" href="#"> <i class="icon-pencil bigger-130"></i> </a> 
               <a class="red" href="#"> <i class="icon-trash bigger-130"></i> </a> 
              </div> 
              <div class="visible-xs visible-sm hidden-md hidden-lg"> 
               <div class="inline position-relative"> 
                <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown"> <i class="icon-caret-down icon-only bigger-120"></i> </button> 
                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close"> 
                 <li><a href="#" class="tooltip-info" data-rel="tooltip" title="" data-original-title="View"> <span class="blue"> <i class="icon-zoom-in bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-success" data-rel="tooltip" title="" data-original-title="Edit"> <span class="green"> <i class="icon-edit bigger-120"></i> </span> </a></li> 
                 <li><a href="#" class="tooltip-error" data-rel="tooltip" title="" data-original-title="Delete"> <span class="red"> <i class="icon-trash bigger-120"></i> </span> </a></li> 
                </ul> 
               </div> 
              </div> </td> 
            </tr> 
           </tbody> 
          </table> 
          <div class="row"> 
           <div class="col-sm-6"> 
            <div class="dataTables_info" id="sample-table-2_info">
             Showing 1 to 10 of 23 entries
            </div> 
           </div> 
           <div class="col-sm-6"> 
            <div class="dataTables_paginate paging_bootstrap"> 
             <ul class="pagination"> 
              <li class="prev disabled"><a href="#"><i class="icon-double-angle-left"></i></a></li> 
              <li class="active"><a href="#">1</a></li> 
              <li><a href="#">2</a></li> 
              <li><a href="#">3</a></li> 
              <li class="next"><a href="#"><i class="icon-double-angle-right"></i></a></li> 
             </ul> 
            </div> 
           </div> 
          </div> 
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
	$('#loading-btn').on(ace.click_event, function () {
		var btn = $(this);
		btn.button('loading')
		setTimeout(function () {
			btn.button('reset')
		}, 2000)
	});

	$('#id-button-borders').attr('checked' , 'checked').on('click', function(){
			$('#default-buttons .btn').toggleClass('no-border');
	});
})
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