package com.hungerstrike.model;

public class RestaurantStaff {
	
	private String ownerid; 
	private String ownerpwd    ;
	private String  fname    ;
	private String lname     ;
	private String  email     ;
	private String phone     ;
	private String role; 
	
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	
	public String getOwnerpwd() {
		return ownerpwd;
	}
	public void setOwnerpwd(String ownerpwd) {
		this.ownerpwd = ownerpwd;
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
