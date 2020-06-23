package mapper;

import java.util.List;

import bean.Commit;


public interface CommitMapper {
	
	//ÁôÑÔ°å¹¦ÄÜ
	void addluyan(Commit commit);
	
	
	//²é¿´ÁôÑÔ
	List<Commit> queryliuyan();
	
	//É¾³ıÁôÑÔ
	boolean deleteliuyan(String commitname);

}
