package com.data.model;

public class LogInVar {
	private String uname;
	private String pwd;
	private String sid;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return uname;
	}
	

}
