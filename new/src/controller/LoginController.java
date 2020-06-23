package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSONObject;

import bean.Login;
import bean.Student;
import serviceimpl.LoginServiceimpl;

import util.Md5;



@RequestMapping("controller")  
@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("loginserrvice")  //娉ㄨВ娉ㄥ叆
	private LoginServiceimpl loginserrvice;

	public void setLoginserrvice(LoginServiceimpl loginserrvice) {
		this.loginserrvice = loginserrvice;
	}
	
	
	@RequestMapping(value="denglu",method=RequestMethod.POST)
	public String denglu(@RequestParam("username") String username,@RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response,Model model) {
		
		//Map<String, String> ret = new HashMap<String, String>();
		
		String user = request.getParameter("username");
	     String pass = request.getParameter("password");
	     String admin = request.getParameter("admin");
	    String people = request.getParameter("people");
			
			
			//判断为管理员登录
			if(admin != null) {
		//登录密码加密
	     String md5 = Md5.JM(pass);	 
	     Login login = new Login(user,md5);  
	     if(username.length() == 0 || password.length() == 0) {
	    	
	    	System.out.println("用户名或密码不能为空！！！");
	    	
	    	  return "fail";
	    	  
	     }
	      Login login1 =  loginserrvice.Denglu(login);
	      if(login1 != null) {
	    	  model.addAttribute("login1", login1.getUsername() );
	    	 // return "haotaigli";
	    	  //redircetredircet:view/haotaigli.html
	    	  return "success";
	      }
	}if(people != null) {
		
		Student student = new Student(username, password);
		   if(username.length() == 0 || password.length() == 0) {
		    	
		    	System.out.println("鐢ㄦ埛鍚嶅瘑鐮佷笉鑳戒负绌�");
		    	
		    	  return "fail";
		    	  
		     }
		   Student login1  = loginserrvice.studentDenglu(student);
		   if(login1 != null) {
		    	  model.addAttribute("login1", login1.getUsername() );
		    	  return "peoplesuccess"; 
		      }
	}
			 return "fail";
	   }

	@RequestMapping("zhuce")
	public String zhuce(@RequestParam("username") String username,@RequestParam("password") String password, HttpServletRequest request) {
		
		String user = request.getParameter("username");
	     String pass = request.getParameter("password");
	     String kl = Md5.KL(pass);
         Login login = new Login(user,kl);    
        
         if(username.length() == 0 || password.length() == 0) {
 	    	
 	    	System.out.println("用户名密码不能为空！！！！");
 	    	
 	    	  return "fail";
 	    	  
 	     }
         
	     loginserrvice.Zhuce(login);
	     return "success";
	    
	}
	
	
	//学锟斤拷注锟斤拷
	@RequestMapping("studentzhuce")
	public String studentzhuce( HttpServletRequest request) {
		
	   	String username = request.getParameter("username");
	     String password = request.getParameter("password");
	    
         Student stu = new Student(username,password);    
        
         if(username.length() == 0 || password.length() == 0) {
 	    	
 	    	System.out.println("娉ㄥ唽澶辫触");
 	    	
 	    	  return "fail";
 	    	  
 	     }
         
         loginserrvice.studentZhuce(stu);
	    
	     return "su";
	    
	}
	
	//修改管理员密码
	@RequestMapping(value="editpassword",method=RequestMethod.POST)
	public String editpassword( HttpServletRequest request) {
		
	    	String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      String md5 = Md5.JM(password);
         Login login = new Login(username,md5);    
         boolean editpassword = loginserrvice.editpassword(login);
         
	     if(editpassword == true) {
	    	 return "e";
	     }
	    return "failpassword";
	}
	
	

}
