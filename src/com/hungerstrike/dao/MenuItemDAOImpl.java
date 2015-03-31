package com.hungerstrike.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.hungerstrike.model.MenuItem;

public class MenuItemDAOImpl implements MenuItemDAO {
	private SessionFactory sessionFactory;

	public MenuItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<MenuItem> list() {
		@SuppressWarnings("unchecked")
		List<MenuItem> listMenuItems = (List<MenuItem>) sessionFactory.getCurrentSession()
				.createCriteria(MenuItem.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listMenuItems;
	}

}
