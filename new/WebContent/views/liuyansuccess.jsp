<%@page import="java.util.List"%>
<%@page import="bean.Commit"%>
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
<th>留言人姓名</th>
 <th>留言时间</th>
 <th>留言内容</th>
 

  <%
  List<Commit> queryliuyan =(List<Commit>) request.getAttribute("queryliuyan");
    for(Commit commit:queryliuyan){
    %>
    	<tr>
    	<td><%=commit.getCommitname() %></td>
    	<td><%=commit.getCommittime() %></td>
    	<td><%=commit.getCommitneirong() %></td>
    	</tr>
	 
	  
  <%  }
  
    
  %>
</table>
</body>
</html>
