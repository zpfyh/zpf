package serviceimpl;

import java.util.List;

import bean.Newlei;
import bean.News;
import bean.Page;
import mapper.NewsMapper;
import service.NewsService;

public class NewsServiceimpl  implements NewsService{
	
	private NewsMapper newsmapper;
	

	public void setNewsmapper(NewsMapper newsmapper) {
		this.newsmapper = newsmapper;
	}

	//按主题查询
	public News queryNewsZhuti(String zhuti) {
		
		return newsmapper.queryNewsZhuti(zhuti);
	}
	
	
	
	//查询所有
	public List<News> queryallnews(){
		
		return newsmapper.queryallnews();
	}
	
	
     	//删除新闻
	public boolean  deletenews(String zhuti) {
		
		 if(zhuti != null) {
		
		   return newsmapper.deletenews(zhuti);
	     }
		return false;
}
	

	
	//判断新闻是否为空
	
	  public boolean ISnews(String zhuti) {
		  return newsmapper.queryNewsZhuti(zhuti)==null? false:true;
	  }
	  
	//添加新闻
	  
	 public  void addnwes(News nwes) {
		
	  newsmapper.addnwes(nwes);
     }
	  
	 
	 
	 // 删除新闻
      public boolean editnews(News nwes) {
    	 return  newsmapper.editnews(nwes);
    	 
	 }
	  
      
      //分页
      public  int totalCount() {
    	 // System.out.println(newsmapper.totalCount());
    	  return newsmapper.totalCount();
      }
	  
      public List<News> queryPage(Page page){
    	  return newsmapper.queryPage(page);
      }
     
      //按新闻类别查询新闻
     public   Newlei queryNewsZhutilei(String newleibie) {
		return newsmapper.queryNewsZhutilei(newleibie);
    	 
     }
	  
	  
		
}
