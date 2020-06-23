<%@page import="bean.News"%>
<%@page import="bean.Newlei"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1px">
<th>新闻类别</th>
<th>新闻编号<th>
 

  <%
   Newlei queryNewsZhutilei =(Newlei) request.getAttribute("queryNewsZhutilei");
   
    %>
    	<tr>
    	<td><%=queryNewsZhutilei.getNewleibie() %></td>
    	<td><%=queryNewsZhutilei.getNewid() %></td>
    	</tr>

 <th>主题</th>
  <th>栏目</th>
 <th>附件</th>
 <th>内容</th>
 <th>发布人姓名</th>
 <th>手机</th>
 <th>邮件</th>
 <th>邮编</th>
  <%
  List<News> news =(  List<News>) request.getAttribute("news");
    for(News n:news){
    %>
    	<tr>
    	<td><%=n.getZhuti() %></td>
    	<td><%=n.getLanmu()%></td>
    	<td><%=n.getFujian() %></td>
    	<td><%=n.getNewname()%></td>
    	<td><%=n.getNeirong() %></td>
    	<td><%=n.getPhone()%></td>
    	<td><%=n.getEmail() %></td>
    	<td><%=n.getYoubuan()%></td>
    	
    	</tr>

	  
  <%  }
  
    
  %>
</table>
</body>
</html>