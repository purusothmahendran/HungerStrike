package com.hungerstrike.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.hungerstrike.model.MenuItem;

public class MenuItemDAOImpl implements MenuItemDAO {
	private SessionFactory sessionFactory;

	public MenuItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<MenuItem> list(String id) {
		@SuppressWarnings("unchecked")
		List<MenuItem> listMenuItems = (List<MenuItem>) sessionFactory.getCurrentSession()
				.createCriteria(MenuItem.class).add(Restrictions.eq("menuid", id))
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listMenuItems;
	}

	@Override
	@Transactional
	public List<MenuItem> getItem(String itemid) {
		@SuppressWarnings("unchecked")
		List<MenuItem> listMenuItems = (List<MenuItem>) sessionFactory.getCurrentSession()
				.createCriteria(MenuItem.class).add(Restrictions.eq("itemId", itemid))
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listMenuItems;
	}

	@Override
	@Transactional
	public Map<String,Integer> getPriceAndTime(String itemid) {
		List<MenuItem> itemList = getItem(itemid);
		MenuItem item = itemList.get(0);
		int price = item.getPrice();
		int prepTime = item.getPreptime();
		Map<String,Integer> priceAndPrepTimeMap = new HashMap<String, Integer>();
		priceAndPrepTimeMap.put("price", price);
		priceAndPrepTimeMap.put("prepTime",prepTime);
		return priceAndPrepTimeMap;
	}

	
}
