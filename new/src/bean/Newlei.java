package bean;

import java.util.List;

public class Newlei {

 private String newleibie;
 private  int newid;
 
  List<News> news;
  
  
  public Newlei() {
		
	}

  public Newlei(String newleibie) {
		
		this.newleibie = newleibie;
	}
public Newlei(String newleibie, int newid, List<News> news) {
	
	this.newleibie = newleibie;
	this.newid = newid;
	this.news = news;
}

public String getNewleibie() {
	return newleibie;
}

public void setNewleibie(String newleibie) {
	this.newleibie = newleibie;
}

public int getNewid() {
	return newid;
}

public void setNewid(int newid) {
	this.newid = newid;
}

public List<News> getNews() {
	return news;
}

public void setNews(List<News> news) {
	this.news = news;
}
 
}
