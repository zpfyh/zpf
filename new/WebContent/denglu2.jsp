<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/login.css" />
		<link rel="shortcut icon" href="img/favicon.ico"/>
</head>


<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
function getimg(){
	 $("#vimg").attr("src","ValidCode?id="+new Date().getTime());
  }
function vlogin(){
	  var usernamev = $("#username").val().trim();
	  var userpassv = $("#userpass").val().trim();
	  var vcodev =  $("#vcode").val().trim();
	  var errcount = 0;
	  //判断  为空的验证
	  if(usernamev==""){
		alert("*请输入用户名");
		  errcount++;
	  }
	  else{
		  $("#msg_user").text("");
	  }
	  if(userpassv==""){
		  alert("请输入密码");
		  errcount++;
	  }
	  else{
		  $("#msg_pass").text("");
	  }
	  if(vcodev==""){
		  alert("请输入验证码");
		  errcount++;
	  }
	  else{
		  $("#msg_vcode").text("");
	  }
	  
	  
 }

</script>

<body>

<div class="bigzhuye">
			<!--导航栏-->
			<div class="nav">
			<ul>
				<li><a href="#">首页</a></li>
				<li><a href="#">实时政治</a></li>
				<li><a href="#">最新新闻</a></li>
			</ul>
		</div>
		<!-- 主体内容 （登陆界面）-->
		<div class="main">
		<!--登录界面 -->
		<div class="main1">
				<div class="index">
					<form  action="controller/denglu" method="post" >
						 <p class="headline">用户登陆</p>
						 <p class="astyle">用户名：</p>
						 <input id="username" name="username" type="text" placeholder="请输入用户姓名" />
						 <span id="msg_user"  ></span>
						 <p class="astyle">密码：</p>
						 <input id="userpass" name="password" type="password" placeholder="请输入密码" />
						 <span id="msg_pass"  ></span>
						 <p class="astyle">身份：</p>
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="admin" value="管理员" >管理员
	                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="people" value="普通用户">普通用户
	                     <p class="astyle">验证码:</p>
                          <input id="vcode" type="text" />
                          <span id="msg_vcode"  ></span>
                         <span ><img id="vimg" alt="验证码" src="ValidCode" style="cursor:pointer" title="刷新 " onclick="getimg()"></span>
						 <input type="submit" value="登陆" onclick="vlogin()"  />
						 </br>
						
						 <p class="cstyle"><a href="zc.html">立即注册</a></p>
					</form>
			</div>
		</div>
			<!--新闻-->
		<div class="main2">
			<h1>新闻发布系统</h1></br>
				<h4>快&nbsp;新&nbsp;热</h4>
				</br>
				<p>国家政治</p></br>
				<p>头条</p></br>
				<p>娱乐</p></br>
		</div>
		</div>
		<!--页脚-->
		<div class="foot">
			<ul>
					<li><a href="#">实时新闻</a></li>
					<li><a href="#">最新新闻</a></li>
					<li><a href="#">最新政治</a></li>
					<li><a href="#">广告服务</a></li>
				</ul>
		</div>
		</div>

</body>
</html>