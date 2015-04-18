package com.hungerstrike.dao;

import java.util.List;

import com.hungerstrike.model.Orders;

public interface OrdersDAO {
	public void createOrder(String userId, String restaurantId,double totalPrice,int totalPrepTime);
	public List<Orders> getOrder(int orderId);
	public int getLastInsertedId();

}
