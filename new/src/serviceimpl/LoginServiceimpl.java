package serviceimpl;

import bean.Login;
import bean.Student;
import mapper.LoginMapper;
import service.LoginService;

public class LoginServiceimpl  implements LoginService{
	
	
	 private LoginMapper loginmapper;
	 
	

	public void setLoginmapper(LoginMapper loginmapper) {
		this.loginmapper = loginmapper;
	}
	
	public Login Denglu(Login login) {
	  return	 loginmapper.Denglu(login);
		
//		if(loginmapper.Denglu(login) != null) {
//			System.out.println(login);
//			return true;
//		}
//		
//		return false;
	}
	
	public boolean editpassword(Login login) {			
     return loginmapper.editpassword(login);
		   
	}
	
	public void Zhuce(Login login) {
		loginmapper.Zhuce(login);
	}
	
	//学生登录
	public void studentZhuce(Student student) {
		loginmapper.studentZhuce(student);
	}
	
	//学生注册
	public  Student  studentDenglu(Student student) {
		
		return loginmapper.studentDenglu(student);
	}
 
}
