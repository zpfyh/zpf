<%@page import="bean.News"%>
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

<table>
<th>主题</th>
 <th>栏目</th>
 <th>附件</th>
 <th>内容</th>
 <th>发布人姓名</th>
 <th>手机</th>
 <th>邮件</th>
 <th>邮编</th>

  <%
    List<News> queryallnews =(List<News>) request.getAttribute("queryallnews");
    for(News nwes:queryallnews){
    %>
    	<tr>
    	<td><%=nwes.getZhuti() %></td>
    	<td><%=nwes.getLanmu() %></td>
    	<td><%=nwes.getFujian() %></td>
    	<td><%=nwes.getNeirong()%></td>
    	<td><%=nwes.getNewname() %></td>
    	<td><%=nwes.getPhone() %></td>
    	<td><%=nwes.getEmail() %></td>
    	<td><%=nwes.getYoubuan()%></td>
    	
    	</tr>
	 
	  
  <%  }
  
    
  %>
</table>
</body>
</html>