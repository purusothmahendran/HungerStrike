package com.hungerstrike.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;

import com.hungerstrike.model.Orders;

public class OrdersDAOImpl implements OrdersDAO {
	private SessionFactory sessionFactory;

	public OrdersDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void createOrder(String userId, String restaurantId,double priceVal,int prepTime) {
		
		Orders order = new Orders();
		order.setUserid(userId);
		order.setRestaurantid(restaurantId);
		order.setTotalprice(priceVal);
		order.setTotalpreptime(prepTime);
		sessionFactory.getCurrentSession().save(order);		
	}

	@Override
	@Transactional
	public List<Orders> getOrder(int orderId) {
		@SuppressWarnings("unchecked")
		List<Orders> orderList = (List<Orders>) sessionFactory.getCurrentSession().createCriteria(Orders.class).add(Restrictions.eq("orderid", orderId))
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return orderList;
		
	}

	@Override
	@Transactional
	public int getLastInsertedId() {
		Long lastId = ((BigInteger) sessionFactory.getCurrentSession().createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).longValue();
		System.out.println("long:"+lastId);
		return lastId.intValue();
	}

}
