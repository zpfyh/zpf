<%@page import="bean.Page"%>
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

<table border="1px">
<th>主题</th>
 <th>栏目</th>
 <th>附件</th>
 <th>内容</th>
 <th>发布人姓名</th>
 <th>手机</th>
 <th>邮件</th>
 <th>邮编</th>
 <th>删除新闻</th>

  <%
      Page p =(Page) request.getAttribute("p");
   
        for(News nwes:p.getNews()){
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
    	 <td><a href="deleteNewsZhuti?zhuti=<%=nwes.getZhuti() %>">删除</a></td>
    	</tr>
	 
	  
  <%  }
    %>
   

</table>
 <a href="queryallnewsPage?currentPage=0">首页</a>
 <a href="queryallnewsPage?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>
 <a href="queryallnewsPage?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>
 <a href="queryallnewsPage?currentPage=<%=p.getTotalCounts()%>">尾页</a>
 <br>
 <br>
  <a href="success.jsp">返回</a>
</body>
</html>