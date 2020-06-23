package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bean.Newlei;
import bean.News;
import bean.Page;
import serviceimpl.NewsServiceimpl;

@RequestMapping("controller") 
@Controller
public class NewsController {
	
	@Autowired
	@Qualifier("newsservice") 
	private NewsServiceimpl newserviceimpl;
	
	public void setNewserviceimpl(NewsServiceimpl newserviceimpl) {
		this.newserviceimpl = newserviceimpl;
	}

	
	//按主题查询新闻
	@RequestMapping(value="queryNewsZhuti",method=RequestMethod.POST)
	public String queryNewsZhuti(HttpServletRequest request) {
		
		String zhu = request.getParameter("zhuti");
		
	  News news = newserviceimpl.queryNewsZhuti(zhu);
		
	  request.setAttribute("news", news);	
		return "result";
		
	}
	
	
	
	//查询所有新闻 
	@RequestMapping("queryallnews")
	public String queryallnews(HttpServletRequest request) {
	  List<News> queryallnews = newserviceimpl.queryallnews();
		
	  request.setAttribute("queryallnews", queryallnews);	
		return "allnews";
		
	}
	
	
	//按主题删除新闻
	
	@RequestMapping(value="deleteNewsZhuti",method=RequestMethod.POST)
	public String deleteNewsZhuti(@RequestParam("zhuti") String zhuti,HttpServletRequest request) {
		if(newserviceimpl.deletenews(zhuti) == true) {
			return "deletesuccessnew";
		}
		
		return "deletefail";
		
		
	}
	
	//添加新闻
	
	@RequestMapping(value="addnwes",method=RequestMethod.POST)
	public String addnwes(HttpServletRequest request) {
		String zhuti = request.getParameter("zhuti");
		String lanmu = request.getParameter("lanmu");
		String fujian = request.getParameter("fujian");
		String neirong = request.getParameter("neirong");
		String newname = request.getParameter("newname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String youbian = request.getParameter("youbuan");
		News news = new News(zhuti,lanmu,fujian,neirong,newname,phone,email,youbian);
		
		newserviceimpl.addnwes(news);
		return "addnwessucces";
		
		
	}
	
	//修改新闻
	@RequestMapping(value="editnews",method=RequestMethod.POST)
	public String editnews (HttpServletRequest request) {
		
		String zhuti = request.getParameter("zhuti");
		
		String lanmu = request.getParameter("lanmu");
		String fujian = request.getParameter("fujian");
		String neirong = request.getParameter("neirong");
		String newname = request.getParameter("newname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String youbian = request.getParameter("youbuan");
		News news = new News(zhuti,lanmu,fujian,neirong,newname,phone,email,youbian);
		boolean editnews = newserviceimpl.editnews(news);
		if(editnews == true) {
		return "editsuccess";
		}
		
		return "deletefail";
		
		
	}
	
	
	//分页查询新闻
	
	@RequestMapping("queryallnewsPage")
	public String queryallnewsPage(HttpServletRequest request) {
		
		  Page page = new Page();
	
		  Integer count = newserviceimpl.totalCount();
		  page.setTotalCount(count);
			String cpage = request.getParameter("currentPage");
			if(cpage == null) {
				cpage="0";
			}
			Integer currentPage  =Integer.parseInt(cpage) ;
			page.setCurrentPage(currentPage);
	
			Integer pageSize =5;
			page.setPageSize(pageSize);
			
	      List<News> news = newserviceimpl.queryPage(page);
	       
	      page.setNews(news);
		
	      request.setAttribute("p", page);	
	       
		  return "pageallnews";
		
	}
	
	//按类别查询新闻
	
	@RequestMapping(value="queryNewsZhutileinewid",method=RequestMethod.POST)
	public String queryNewsZhutileinewid(HttpServletRequest request) {
		
		String newleibie = request.getParameter("newleibie");
		
		//先查新闻类别信息
       Newlei queryNewsZhutilei = newserviceimpl.queryNewsZhutilei(newleibie);
     //  System.out.println(queryNewsZhutilei);
       request.setAttribute("queryNewsZhutilei", queryNewsZhutilei);
       
       //在新闻类别里新闻信息
        List<News> news = queryNewsZhutilei.getNews();
       request.setAttribute("news", news);	
       
	  	
		return "newleibiepage";
	}
	
	
	
	

}
