package service;

import bean.Login;
import bean.Student;

public interface LoginService {
	Login Denglu(Login login);

	
	void Zhuce(Login login);
	
	
	// 修改管理员密码
	boolean editpassword(Login login);
	
	//学生操作
	void studentZhuce(Student student);
	
	Student  studentDenglu(Student student);
}
