<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/denglu.css" />
</head>

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
function checkuser() {
	var myusername = $("#username").val();
	var myuserpass = $("#userpass").val();
	var myvcode = $("#vcode").val();
	var isu = true;
	//验证用户名
	if (myusername.trim() == "") {
		$("#msg_user").text("*用户名不能为空");
		isu = false;
	} else {
		$("#msg_user").text("");
	}
	//验证密码
	if (myuserpass.trim() == "") {
		$("#msg_pass").text("*密码不能为空");
		isu = false;
	} else {
		$("#msg_pass").text("");
	}
	//验证码
	if (myvcode.trim() == "") {
		$("#msg_code").text("*验证码不能为空");
		isu = false;
	} else {
		$("#msg_code").text("");
	}
}


</script>

<body>

<form  action="controller/denglu"  method="post">

		用户名：<input id="username" name="username" type="text" />
         <br>
                          密码：<input id="userpass" name="password" type="password" />
	   <span id="msg_pass"></span>
		<br>
	身份：<input type="radio" name="admin" value="管理员">管理员
	    <input type="radio" name="people" value="普通用户">普通用户
	<br>
                          验证码：<input id="vcode" type="text" />
         <span ><img alt="验证码" src="ValidCode"></span>
		<span id="msg_code"></span>
    <input type="submit" value="登  录"onclick="checkuser()" >
    <span id="msg"/>
			
	</form>

</body>
</html>