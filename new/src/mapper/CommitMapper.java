package mapper;

import java.util.List;

import bean.Commit;


public interface CommitMapper {
	
	//���԰幦��
	void addluyan(Commit commit);
	
	
	//�鿴����
	List<Commit> queryliuyan();
	
	//ɾ������
	boolean deleteliuyan(String commitname);

}
