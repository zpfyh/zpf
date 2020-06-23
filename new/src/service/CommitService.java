package service;

import java.util.List;

import bean.Commit;

public interface CommitService {
	//留言板功能
		void addluyan(Commit commit);
		
		//查看所有留言
		List<Commit> queryliuyan(); 
		
		boolean deleteliuyan(String commitname);
}
