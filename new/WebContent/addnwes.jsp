<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="controller/addnwes" method="post">
 新闻主题:<input type="text" name="zhuti"><br>
 新闻栏目：<input type="text" name="lanmu"><br>
 新闻附件：<input type="text" name="fujian"><br>
 新闻内容：<input type="text" name="neirong"><br>
 新闻发布人姓名：<input type="text" name="newname"><br>
 手机：<input type="text" name="phone"><br>
 Email：<input type="text" name="email"><br>
 邮编：<input type="text" name="youbuan"><br>
 <input type="submit" value="新增新闻">
</form>
 

</body>
</html>