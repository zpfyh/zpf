package bean;

import java.util.Date;

public class Commit {
	
  private String commitname;
  private  Date  committime;
  private String commitneirong;



public Date getCommittime() {
	return committime;
}
public void setCommittime(Date committime) {
	this.committime = committime;
}
public String getCommitname() {
	return commitname;
}
public void setCommitname(String commitname) {
	this.commitname = commitname;
}
public String getCommitneirong() {
	return commitneirong;
}
public void setCommitneirong(String commitneirong) {
	this.commitneirong = commitneirong;
}
public Commit(String commitname, String commitneirong) {
	super();
	this.commitname = commitname;
	this.commitneirong = commitneirong;
}



public Commit(String commitname, Date committime, String commitneirong) {
	this.commitname = commitname;
	this.committime = committime;
	this.commitneirong = commitneirong;
}
@Override
public String toString() {
	return "Commit [commitname=" + commitname + ", committime=" + committime + ", commitneirong=" + commitneirong + "]";
}


  

  

}
