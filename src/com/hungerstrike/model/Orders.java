package com.hungerstrike.model;

public class Orders {

	private String orderid;
	private String restaurantid;
	private String userid;
	private String agentid;
	private double totalprice;
	private int totalpreptime;
	private String preference;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getRestaurantid() {
		return restaurantid;
	}

	public void setRestaurantid(String restaurantid) {
		this.restaurantid = restaurantid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public int getTotalpreptime() {
		return totalpreptime;
	}

	public void setTotalpreptime(int totalpreptime) {
		this.totalpreptime = totalpreptime;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

}
