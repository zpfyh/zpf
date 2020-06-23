<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>图书后台管理系统</title>
		<link rel="shortcut icon" href="img/favicon.ico"/>
		<link rel="stylesheet" href="../css/haotaigli.css" />		
</head>
<body>
<%
 Date date =new Date();

%>
	<div class="biaoti">
		            <div class="b1">
		            	<h2>欢迎进入新闻管理系统</h2>
		            </div>
		            <div class="b2"><span>当前登录管理员  :  ${login1} &nbsp;现在是北京时间：<%=date %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="new.html">退出系统</a></span></div>
		</div>
		
		<div class="nav">
			       <div class="nav1">
			  
                     <ul>
                     	<li>
                     		  <div class="nav222"><a href="queryallnewsPage">查看所有新闻</a></div>
                     		  <div class="g1">
                     		 
                                </form>
                     		  	
                     		  </div>
                     	</li>
                     	<li>
                     		 <div class="nav444"><a>按类别查看新闻</a></div>
                     		  <div class="g2">
                     		  	
                        <form action="queryNewsZhutileinewid" method="post">
                                                                                      输入新闻类别：<input type="text" name="newleibie"><br>
                        <input type="submit" value="查询">
                        </form>
                     		  	
                     		  	
                     		  </div>
                     	</li>
                     	
                     	<li>
                     		 <div class="nav444"><a>留言板</a></div>
                     		  <div class="g2">
                     		  	<form action="addliuyan" method="post">
                                                                                                                                       留言人姓名：<input name="commitname"><br>
                                                                                                                                        留言日期：<input type="text" name="committime"><br>
                                                                                                                                        新闻内容：<textarea cols="50" rows="10" name="commitneiromng"></textarea><br>                                                                                                                                                                           
                                       <input type="submit" value="留言">
</form>
                     		  	
                     		  </div>
                     	</li>
                     	
                       
			       </div>
			    
		</div>
       
</body>
</html>