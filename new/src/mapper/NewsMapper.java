package mapper;

import java.util.List;

import bean.Newlei;
import bean.News;
import bean.Page;

public interface NewsMapper {
	//�������ѯ����
	News queryNewsZhuti(String zhuti);
	
	
	//��ѯ������
	List<News> queryallnews();
	
	
	//ɾ������
	boolean deletenews(String zhuti);
	
	//�������
    void addnwes(News nwes);
    
    //�޸�����
   boolean editnews(News nwes);
   
   
   //��ҳ  ��ѯ�ܼ�¼��
   
      int  totalCount();
     
     //��ҳ
     List<News> queryPage(Page page);
     
     //������ѯ����
    


	Newlei queryNewsZhutilei(String newleibie);
	
}
