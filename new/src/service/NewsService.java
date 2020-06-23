package service;

import java.util.List;

import bean.Newlei;
import bean.News;
import bean.Page;

public interface NewsService {
	
	//按主题查询
	News queryNewsZhuti(String zhuti);
	
	
	//查询所有
	List<News> queryallnews();
	
	//ɾ������
	boolean deletenews(String zhuti);
	
	//�������
	 void addnwes(News nwes);
	 
	 //�޸�����
	 boolean editnews(News nwes);
	 
	 //��ҳ��ѯ�ܼ�¼��
	 public  int totalCount();
	 
	 //��ҳ
	  List<News> queryPage(Page page);
	 //����ѯ����
	  Newlei queryNewsZhutilei(String newleibie);
}
