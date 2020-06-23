package mapper;

import bean.Login;
import bean.Student;

public interface LoginMapper {
	
	//管理员登录操作
	Login Denglu(Login login);
	
	
	//管理员注册操作
	void Zhuce(Login login);
	
	
	//修改管理员密码
    boolean editpassword(Login login);
	
	
	//学生登录
	Student  studentDenglu(Student student);
	//学生注册
	void studentZhuce(Student student);

}
