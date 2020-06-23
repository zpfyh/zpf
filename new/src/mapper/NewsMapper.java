package mapper;

import java.util.List;

import bean.Newlei;
import bean.News;
import bean.Page;

public interface NewsMapper {
	//按主题查询新闻
	News queryNewsZhuti(String zhuti);
	
	
	//查询所新闻
	List<News> queryallnews();
	
	
	//删除新闻
	boolean deletenews(String zhuti);
	
	//添加新闻
    void addnwes(News nwes);
    
    //修改新闻
   boolean editnews(News nwes);
   
   
   //分页  查询总记录数
   
      int  totalCount();
     
     //分页
     List<News> queryPage(Page page);
     
     //按类别查询新闻
    


	Newlei queryNewsZhutilei(String newleibie);
	
}
