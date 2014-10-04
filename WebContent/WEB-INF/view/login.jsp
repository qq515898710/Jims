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
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
  <meta content="width=device-width, initial-scale=1.0" name="viewport" /> 
  <title>进销存管理系统 | 登录</title> 
  <!-- basic styles --> 
  <link rel="stylesheet" href="assets/css/bootstrap.min.css" media="all" /> 
  <link rel="stylesheet" href="assets/css/font-awesome.min.css" media="all" /> 
  <link rel="stylesheet" href="assets/css/ace.min.css" media="all" /> 
  <link rel="stylesheet" href="assets/css/ace-rtl.min.css" media="all" /> 
  <link rel="icon" type="image/png" href="assets/images/favicon.ico" /> 
 </head> 
 <!-- 配色网站 http://tool.c7sky.com/webcolor/#hue_8 --> 
 <body class="login-layout" style=""> 
  <div class="main-container"> 
   <div class="main-content"> 
    <div class="row"> 
     <div class="col-sm-10 col-sm-offset-1"> 
      <div class="login-container"> 
       <div class="center"> 
        <h1> <i class="icon-leaf green"></i><span class="purple">进销存管理系统</span> </h1> 
        <h4 class="blue">&copy; Company moziqi</h4> 
       </div> 
       <div class="space-6"></div> 
       <div class="position-relative"> 
        <div id="login-box" class="login-box visible widget-box no-border"> 
         <div class="widget-body"> 
          <div class="widget-main"> 
           <h4 class="header blue lighter bigger"> <i class="icon-coffee green"></i> 欢迎使用 </h4> 
           <div class="space-6"></div> 
           <!-- 登录表单 --> 
           <form id="login" > 
            <fieldset> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> 
                <input type="text" class="form-control" placeholder="请输入用户名" id="name" name="name" /> <i class="icon-user"></i> </span> 
             </label> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> 
                <input type="password" class="form-control" placeholder="请输入密码"  id="password" name="password"/> <i class="icon-lock"></i> </span> 
             </label> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> 
                <input type="text "  placeholder="验证码"  id="code" name="code"/>
                <img src="captcha-image" alt="验证码" width="60 " height="30" style="margin-bottom: -3px"  id="codeImage"/></span>
             </label> 
             <div class="space"></div> 
             <div class="clearfix"> 
              <label class="inline"> <input type="checkbox" class="ace"  id="remember" name="remember"/> <span class="lbl"> 记住</span> </label> 
              <button type="button" class="width-35 pull-right btn btn-sm btn-primary" id="loginButton"> <i class="icon-key"></i>登录 </button> 
             </div> 
             <div class="space-4"></div> 
            </fieldset> 
           </form> 
          </div> 
          <!-- /widget-main --> 
          <div class="toolbar clearfix"> 
           <div> 
            <a href="#" onclick="show_box('forgot-box'); return false;" class="forgot-password-link"> <i class="icon-arrow-left"></i> 忘记密码 </a> 
           </div> 
           <div> 
            <a href="#" onclick="show_box('signup-box'); return false;" class="user-signup-link"> 注册 <i class="icon-arrow-right"></i> </a> 
           </div> 
          </div> 
         </div> 
         <!-- /widget-body --> 
        </div> 
        <!-- /login-box --> 
        <div id="forgot-box" class="forgot-box widget-box no-border"> 
         <div class="widget-body"> 
          <div class="widget-main"> 
           <h4 class="header red lighter bigger"> <i class="icon-key"></i> 重置密码 </h4> 
           <div class="space-6"></div> 
           <p>请输入您的邮箱地址</p> 
           <!-- 找回密码表单 --> 
           <form id="forget"> 
            <fieldset> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> <input type="email" class="form-control" placeholder="请输入邮箱地址" /> <i class="icon-envelope"></i> </span> </label> 
             <div class="clearfix"> 
              <button type="button" class="width-35 pull-right btn btn-sm btn-danger"> <i class="icon-lightbulb"></i> 发送! </button> 
             </div> 
            </fieldset> 
           </form> 
          </div> 
          <!-- /widget-main --> 
          <div class="toolbar center"> 
           <a href="#" onclick="show_box('login-box'); return false;" class="back-to-login-link"> 返回登录 <i class="icon-arrow-right"></i> </a> 
          </div> 
         </div> 
         <!-- /widget-body --> 
        </div> 
        <!-- /forgot-box --> 
        <div id="signup-box" class="signup-box widget-box no-border"> 
         <div class="widget-body"> 
          <div class="widget-main"> 
           <h4 class="header green lighter bigger"> <i class="icon-group blue"></i> 注册新用户 </h4> 
           <div class="space-6"></div> 
           <p>请输入您的信息:</p> 
           <form id="signup"> 
            <fieldset> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> <input type="email" class="form-control" placeholder="请输入邮箱地址" /> <i class="icon-envelope"></i> </span> </label> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> <input type="text" class="form-control" placeholder="请输入用户名" /> <i class="icon-user"></i> </span> </label> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> <input type="password" class="form-control" placeholder="请输入密码" /> <i class="icon-lock"></i> </span> </label> 
             <label class="block clearfix"> <span class="block input-icon input-icon-right"> <input type="password" class="form-control" placeholder="再次输入密码" /> <i class="icon-retweet"></i> </span> </label> 
             <label class="block"> <input type="checkbox" class="ace" /> <span class="lbl">我接受 <a href="#">用户协议</a> </span> </label> 
             <div class="space-24"></div> 
             <div class="clearfix"> 
              <button type="reset" class="width-30 pull-left btn btn-sm"> <i class="icon-refresh"></i> 重置 </button> 
              <button type="button" class="width-65 pull-right btn btn-sm btn-success"> 注册<i class="icon-arrow-right icon-on-right"></i> </button> 
             </div> 
            </fieldset> 
           </form> 
          </div> 
          <div class="toolbar center"> 
           <a href="#" onclick="show_box('login-box'); return false;" class="back-to-login-link"> <i class="icon-arrow-left"></i> 返回登录 </a> 
          </div> 
         </div> 
         <!-- /widget-body --> 
        </div> 
        <!-- /signup-box --> 
       </div> 
       <!-- /position-relative --> 
      </div> 
     </div> 
     <!-- /.col --> 
    </div> 
    <!-- /.row --> 
   </div> 
   <!-- .main-content --> 
  </div> 
  <img id="loading" src="assets/css/images/loading.gif" alt="正在加载中..."  />
  <!-- .main-container --> 
  <script src="assets/js/jquery-2.0.3.min.js"></script> 
  <script src="assets/js/jquery.lazyload.js"></script> 
  <script type="text/javascript">
  	$(document).ready(function(){
  	  	
	      $('#codeImage').click(function () {//生成验证码
	      	$(this).attr('src', 'captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); 
	      })

	  	$("#loginButton").click(function() {
			$.ajax({
				type : "POST",
				url : "checklogin",
				contentType : "application/json", // 必须有
	 			dataType : "json", // 表示返回值类型，不必须
				data : JSON.stringify({
					'name' : $("#name").val(),
					'password' : $("#password").val(),
					'code':$("#code").val()
				}),
				async: true,
				success : function(data) {
					if(data.info == 1){
						location.href="home.html";
					}else if(data.user_error ==2 ){
						alert("帐号不存在或密码错误");
					}else if(data.code_error == 3){
						window.location.reload(true);
						alert("验证码错误");
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {  
	                 alert(XMLHttpRequest.status+"-"+XMLHttpRequest.readyState+"-"+textStatus);
	            }
			});
		});
	  });
	  
	function show_box(id) {
		jQuery('.widget-box.visible').removeClass('visible');
		jQuery('#' + id).addClass('visible');
	}
	</script>  
 </body>
</html>