package com.hungerstrike.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.hungerstrike.model.MenuItem;
import com.hungerstrike.model.OrderItemList;

public class OrderItemListDAOImpl implements OrderItemListDAO {
	private SessionFactory sessionFactory;

	public OrderItemListDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void insertInOrderItemList(int orderId, String itemId, String qty) {
		OrderItemList orderItemList = new OrderItemList();
		orderItemList.setOrderid(orderId);
		orderItemList.setItemid(itemId);
		orderItemList.setQuantity(Integer.parseInt(qty));
		sessionFactory.getCurrentSession().save(orderItemList);
	}

	@Override
	@Transactional
	public List<OrderItemList> getOrderItemList(int orderId) {
		@SuppressWarnings("unchecked")
		List<OrderItemList> listOrderItems = (List<OrderItemList>) sessionFactory.getCurrentSession()
				.createCriteria(OrderItemList.class).add(Restrictions.eq("orderid", orderId))
				.setResultTransformer(Criteria.ROOT_ENTITY).list();
		return listOrderItems ;
		
		/**@SuppressWarnings("unchecked")
		String sql = "SELECT * FROM orderitemlist WHERE orderid = :order_id";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		query.addEntity(OrderItemList.class);
		query.setParameter("order_id", orderId);
		List results = query.list();
		return results;**/
	}

}
