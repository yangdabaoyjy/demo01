package com.factorStudy.demo02.usermag.beans;

public class UserInfo {

	private Long id;
	private String name;
	private String pwd;
	public UserInfo(Long id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}
