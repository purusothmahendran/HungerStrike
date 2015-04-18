package com.hungerstrike.model;

public class OrderItemList {
	

	private int sno;
	private String itemid  ; 
	private int orderid       ;
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

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
}
