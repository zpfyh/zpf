package service;

import java.util.List;

import bean.Commit;

public interface CommitService {
	//���԰幦��
		void addluyan(Commit commit);
		
		//�鿴��������
		List<Commit> queryliuyan(); 
		
		boolean deleteliuyan(String commitname);
}
