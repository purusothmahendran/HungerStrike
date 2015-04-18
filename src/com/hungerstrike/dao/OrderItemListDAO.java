package com.hungerstrike.dao;

import java.util.List;

import com.hungerstrike.model.OrderItemList;

public interface OrderItemListDAO {
	public void insertInOrderItemList(int orderId,String itemId,String qty);
	public List<OrderItemList> getOrderItemList(int orderId);

}
