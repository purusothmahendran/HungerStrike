package com.hungerstrike.model;

public class OrderItemList {
	
	private String itemid  ; 
	private String orderid       ;
	private int  quantity      ;
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
