package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.Commit;
import serviceimpl.CommitServiceimpl;
@RequestMapping("controller")
@Controller
public class CommitController {
	
	@Autowired
	@Qualifier("commitservice") 
	
	private CommitServiceimpl comitserviceipml;

	public void setComitserviceipml(CommitServiceimpl comitserviceipml) {
		this.comitserviceipml = comitserviceipml;
	}
	
	//添加留言
	
	@RequestMapping(value="addliuyan",method=RequestMethod.POST)
	public String addliuyan(HttpServletRequest request) {
		
		String commitname = request.getParameter("commitname");
		
		String date = request.getParameter("committime");
	    Date d1  = null;
		try {
			d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		String commitneiromng = request.getParameter("commitneiromng");
		
		Commit commit = new Commit(commitname,d1,commitneiromng);
		
		
		comitserviceipml.addluyan(commit);
		
		return "liuyans";
		
	}
	
	//浏览留言
		@RequestMapping("queryliuyan")
		public String queryliuyan(HttpServletRequest request) {
		  List<Commit> queryliuyan = comitserviceipml.queryliuyan();
			
		  request.setAttribute("queryliuyan", queryliuyan);	
			return "liuyansuccess";
			
		}
		
		//删除不良留言
		@RequestMapping(value="deleteliuyan",method=RequestMethod.POST)
		public String deleteliuyan(HttpServletRequest request) {
		 
			String commitname = request.getParameter("commitname");
			
		    if(comitserviceipml.deleteliuyan(commitname) == true) {
		    	return "ds";
		    	
		    }
			
		    return "d";
		}
		

}
