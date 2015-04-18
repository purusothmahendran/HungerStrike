package com.hungerstrike.controller;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import antlr.PythonCodeGenerator;

import com.hungerstrike.dao.MenuItemDAO;
import com.hungerstrike.dao.OrderItemListDAO;
import com.hungerstrike.dao.OrdersDAO;
import com.hungerstrike.model.OrderItemList;
import com.hungerstrike.model.Orders;

@Controller
public class OrderController {

	@Autowired
	private OrdersDAO orderDAO;

	@Autowired
	private OrderItemListDAO orderItemListDAO;

	@Autowired
	private MenuItemDAO itemDAO;

	@RequestMapping("/order")
	public ModelAndView createOrder(@RequestParam("item") String[] itemids, @RequestParam("qty") String[] qtyList, @RequestParam("userId") String userId, @RequestParam("resId") String restaurantId) {
		// Create an orderid and insert orderid,restaurantid,userid in orders
		// table
		Map<String, String> itemAndQuantityMap = new HashMap<String, String>();

		for (int i = 0; i < itemids.length; i++) {
			if (!qtyList[i].equals("0")) {
				itemAndQuantityMap.put(itemids[i], qtyList[i]);
			}
		}
		int totalPrice = 0;
		int prepTime = 0;
		for (Map.Entry<String, String> entry : itemAndQuantityMap.entrySet()) {
			int qty = Integer.parseInt(itemAndQuantityMap.get(entry.getKey()));
			Map<String, Integer> priceAndPrepTime = itemDAO.getPriceAndTime(entry.getKey());
			totalPrice = totalPrice + priceAndPrepTime.get("price")*qty;
			prepTime = prepTime + priceAndPrepTime.get("prepTime");

		}
		double priceVal = (double)totalPrice;
		orderDAO.createOrder(userId, restaurantId,priceVal,prepTime);
		int orderId = orderDAO.getLastInsertedId();
		// now insert the other details in orderItemList table
		System.out.println("Inserted id :" + orderId);

		for (Map.Entry<String, String> entry : itemAndQuantityMap.entrySet()) {
			orderItemListDAO.insertInOrderItemList(orderId, entry.getKey(), entry.getValue());
		}

		List<OrderItemList> orderItemList = orderItemListDAO.getOrderItemList(orderId);
		System.out.println(orderItemList);
		for (OrderItemList item : orderItemList) {
			System.out.println("Id:" + item.getItemid() + "qty:" + item.getQuantity());
		}
		ModelAndView model = new ModelAndView("cart");
		model.addObject("list", orderItemList);
		return model;

	}

	public int randomNumUtil() {
		Random rand = new Random();
		int number = rand.nextInt(10000 - 1);
		return number;
	}

}
