package bean;

import java.util.List;

public class Page {
	// ��ǰҳ
	private int currentPage;
	//ҳ���С
	  private int pageSize;
	  //������
	  private int totalCount;
	  
	  //��ҳ��
	  private int totalPage;
	  
	  // ��ǰҳ�����ݼ���
	  private List<News> news;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		//�Զ�������ҳ��
		this.totalPage = this.totalCount%this.pageSize==0?this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
	}

	public int getTotalCounts() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}
// ��ҳ��
//	public void setTotalPage(int totalPage) {
//		this.totalPage = totalPage;
//	}



	public Page(int currentPage, int pageSize, int totalCount, int totalPage, List<News> news) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.news = news;
	}
	  
	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public Page() {
		
	}  
	  

}
