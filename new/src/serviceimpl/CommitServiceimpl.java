package serviceimpl;

import java.util.List;

import bean.Commit;
import mapper.CommitMapper;
import service.CommitService;

public class CommitServiceimpl implements CommitService {
	
	private CommitMapper commitmapper;

	public void setCommitmapper(CommitMapper commitmapper) {
		this.commitmapper = commitmapper;
	}

    public void addluyan(Commit commit) {
    	
    	commitmapper.addluyan(commit);
	}
    
  public List<Commit> queryliuyan(){
	 return  commitmapper.queryliuyan();
  }
	
	
  public boolean deleteliuyan(String commitname) {
	  
	  if(commitname != null) {
		  return  commitmapper.deleteliuyan(commitname);
	  }
	  return false;
  
  }
	
		

	
}
