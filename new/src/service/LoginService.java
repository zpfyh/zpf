package service;

import bean.Login;
import bean.Student;

public interface LoginService {
	Login Denglu(Login login);

	
	void Zhuce(Login login);
	
	
	// �޸Ĺ���Ա����
	boolean editpassword(Login login);
	
	//ѧ������
	void studentZhuce(Student student);
	
	Student  studentDenglu(Student student);
}
