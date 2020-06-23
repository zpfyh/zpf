<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page  import="bean.News"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table border="1px">
 <thead>
 <th>主题</th>
 <th>栏目</th>
 <th>附件</th>
 <th>内容</th>
 <th>发布人姓名</th>
 <th>手机</th>
 <th>邮件</th>
 <th>邮编</th>
 </thead>
 <tr>
 <td>${requestScope.news.zhuti}</td>
 <td>${requestScope.news.lanmu} </td>
 <td>${requestScope.news.fujian}</td>
 <td>${requestScope.news.neirong}</td>
 <td>${requestScope.news.newname}</td>
 <td>${requestScope.news.phone}</td>
 <td>${requestScope.news.email} </td>
 <td>${requestScope.news.youbuan}</td>
 <tr>
 </table>
 
</body>
</html>