<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML >
<html lang="zh-cn">
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>进销存管理系统</title>
<!-- basic styles -->
<link rel="icon" type="image/png" href="assets/images/favicon.ico" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<script src="assets/js/ace-extra.min.js"></script>
<script src="assets/js/jquery-2.0.3.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/ace.min.js"></script>
</head>
<body>
  <div class="navbar navbar-default" id="navbar"> 
   <script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script> 
   <div class="navbar-container" id="navbar-container"> 
    <div class="navbar-header pull-left"> 
     <a href="javascript:void();" class="navbar-brand"> <small> <i class="icon-leaf"></i> ACE进销存管理系统 </small> </a> 
     <!-- /.brand --> 
    </div> 
    <!-- /.navbar-header --> 
    <div class="navbar-header pull-right" role="navigation"> 
     <ul class="nav ace-nav">
      <li class="light-blue"><a data-toggle="dropdown" href="#" class="dropdown-toggle"> <img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" /> <span class="user-info"> <small>欢迎光临,</small> moziqi </span> <i class="icon-caret-down"></i> </a> 
       <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close"> 
        <li><a href="#"> <i class="icon-cog"></i> 设置 </a></li> 
        <li><a href="#"> <i class="icon-user"></i> 个人资料 </a></li> 
        <li class="divider"></li> 
        <li><a href="#"> <i class="icon-off"></i> 退出 </a></li> 
       </ul></li> 
     </ul> 
     <!-- /.ace-nav --> 
    </div> 
    <!-- /.navbar-header --> 
   </div> 
   <!-- /.container --> 
  </div>
  <!--.navbar  navbar-default-->