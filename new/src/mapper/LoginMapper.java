package mapper;

import bean.Login;
import bean.Student;

public interface LoginMapper {
	
	//����Ա��¼����
	Login Denglu(Login login);
	
	
	//����Աע�����
	void Zhuce(Login login);
	
	
	//�޸Ĺ���Ա����
    boolean editpassword(Login login);
	
	
	//ѧ����¼
	Student  studentDenglu(Student student);
	//ѧ��ע��
	void studentZhuce(Student student);

}
