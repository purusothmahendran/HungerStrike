package com.hungerstrike.model;

public class DeliveryAgent {
	
	private String agentid   ; 
	private String agentpwd        ;
	private String  fname       ;
	private String  lname        ;
	private String  email        ;
	private String  phone        ;
	private String  role;
	public String getAgentid() {
		return agentid;
	}
	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}
	public String getAgentpwd() {
		return agentpwd;
	}
	public void setAgentpwd(String agentpwd) {
		this.agentpwd = agentpwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	} 
	
	
}
