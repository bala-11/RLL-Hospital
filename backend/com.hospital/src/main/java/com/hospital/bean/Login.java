package com.hospital.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Login {
	@Id

	private String emailid;
	private String password;
	private String role;

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [emailid=" + emailid + ", password=" + password + ", role=" + role + "]";
	}
	
	public Login(int id, String emailid, String password, String role) {
		super();
//		this.id = id;
		this.emailid = emailid;
		this.password = password;
		this.role = role;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
