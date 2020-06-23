<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>新闻发布后台管理系统</title>
		<link rel="shortcut icon" href="img/favicon.ico"/>
		<link rel="stylesheet" href="../css/haotaigli.css" />		
</head>
<body>
<%
 Date date =new Date();
%>
	<div class="biaoti">
		            <div class="b1">
		            	<h2>欢迎进入新闻发布后台管理系统</h2>
		            </div>
		            <div class="b2"><span>欢迎管理员: &nbsp; &nbsp;${login1}&nbsp;现在是北京时间:<%=date %>
		            	
		            	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="####">退出系统</a></span></div>
		</div>

		<div class="nav">
			       <div class="nav1">
			  
                     <ul>
                     	<li>
                     		  <div class="nav222"><a>添加新闻</a></div>
                     		  <div class="g1">
                     		  	<form action="addnwes" method="post">
                     		  		
                                                                      新闻主题：<input type="text" name="zhuti"><br>
                                                                      新闻栏目：<input type="text" name="lanmu"><br>
                                                                      新闻附件：<textarea cols="50" rows="10" name="fujian"></textarea><br>
                                                                       新闻内容：<textarea cols="50" rows="10" name="neirong"></textarea><br>
                                                                     发布者姓名：<input type="text" name="newname"><br>
                                                                     手机号：<input type="text" name="phone"><br>
                    email：<input type="text" name="email"><br>
                                                                      邮编：<input type="text" name="youbuan"><br>
                                    <input type="submit"  value="添加新闻"/>
                                </form>
                     		  	
                     		  </div>
                     	</li>
                     	<li>
                     		 <div class="nav444"><a href="queryallnewsPage">查询所有新闻</a></div>
                     		  <div class="g2">
                     		  	
                     		  	
                     		  </div>
                     	</li>
                     	<li>
                     		 <div class="nav333"><a>按主题查询新闻</a></div>
                     		  <div class="g3">
                     		  	<form action="queryNewsZhuti" method="post">
                                                                                                                          新闻主题:<input type="text" name="zhuti">
                                    <input type="submit" value="查询">
                                </form>
                     		  	
                     		  </div>
                     	</li>
                     	<li>
                     		<div class="nav555"><a>删除新闻</a></div>
                     		  <div class="g4">
                     		  
               	                   <form action="deleteNewsZhuti" method="post">
                                                                                                                 请输入要删除的 新闻主题:<input type="text" name="zhuti" >
                                     <input type="submit" value="删除">
                                     </form>
                     		  	
                     		  </div>
                     	</li>
                     	<li>
                     		 <div class="nav666"><a>修改新闻</a></div>
                     		  <div class="g5">
                     		  <form action="editnews" method="post">
                                                                                                                   新闻主题:<input type="text" name="zhuti"><br>
                                                                                                                   新闻栏目：<input type="text" name="lanmu"><br>
                                                                                                                     新闻附件：<input type="text" name="fujian"><br>
                                                                                                                       新闻内容：<input type="text" name="neirong"><br>
                                                                                                                     新闻发布人姓名：<input type="text" name="newname"><br>
                                                                                                                      手机：<input type="text" name="phone"><br>
                                 Email：<input type="text" name="email"><br>
                                                                                                                      邮编：<input type="text" name="youbuan"><br>
                               <input type="submit" value="修改新闻">
                              </form>
                     		  	
                     		  </div>
                     	</li>
                     	
                     	<li>
                     		 <div class="nav666"><a href="queryliuyan">查看浏览者留言</a></div>
                     		  <div class="g5">
                     		
                     		  	
                     		  </div>
                     	</li>
                     	
                     	<li>
                     		 <div class="nav666"><a>删除不良留言</a></div>
                     		  <div class="g5">
                     		  
                                 <form action="deleteliuyan" method="post">
                                                                                                                         留言人姓名：<input name="commitname"><br>
                                      <input type="submit" value="删除留言">
                                      </form>
                                  
                     		  	
                     		  </div>
                     	</li>
                     	
                     	     	<li>
                     		 <div class="nav666"><a>修改管理员密码</a></div>
                     		  <div class="g5">
                     		  	<form action="editpassword" method="post">
                   
		                                                                                            用户名:<input type="text" name="username" /><br />
		                                                                                                密码:<input type="text"name="password" /><br /> 
	
		                           <input type="submit" value="修改密码">
	</form>

                     		  	
                     		  </div>
                     	</li>
                     </ul>
                       
			       </div>
			    
		</div>
       
</body>
</html>