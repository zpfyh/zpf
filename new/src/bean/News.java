package bean;

public class News {
	
	private String zhuti;
	private String lanmu;
	private String fujian;
	private String neirong;
	private String newname;
	private String phone;
	private String email;
	private String youbuan;
	public News(String zhuti) {
		
		this.zhuti = zhuti;
	}
	public String getZhuti() {
		return zhuti;
	}
	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}
	public String getLanmu() {
		return lanmu;
	}
	public void setLanmu(String lanmu) {
		this.lanmu = lanmu;
	}
	public String getFujian() {
		return fujian;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getYoubuan() {
		return youbuan;
	}
	public void setYoubuan(String youbuan) {
		this.youbuan = youbuan;
		
	}
	public News( String lanmu, String fujian, String neirong, String newname, String phone, String email,
			String youbuan) {
		
		
		this.lanmu = lanmu;
		this.fujian = fujian;
		this.neirong = neirong;
		this.newname = newname;
		this.phone = phone;
		this.email = email;
		this.youbuan = youbuan;
	}
	public News(String zhuti, String lanmu, String fujian, String neirong, String newname, String phone, String email,
			String youbuan) {
		
		this.zhuti = zhuti;
		this.lanmu = lanmu;
		this.fujian = fujian;
		this.neirong = neirong;
		this.newname = newname;
		this.phone = phone;
		this.email = email;
		this.youbuan = youbuan;
	}
	public News() {
		super();
	}
	@Override
	public String toString() {
		return "News [zhuti=" + zhuti + ", lanmu=" + lanmu + ", fujian=" + fujian + ", neirong=" + neirong
				+ ", newname=" + newname + ", phone=" + phone + ", email=" + email + ", youbuan=" + youbuan + "]";
	}

}
