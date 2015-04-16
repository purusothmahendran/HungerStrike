package com.hungerstrike.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.hungerstrike.model.Menu;

public class MenuDAOImpl implements MenuDAO {
	private SessionFactory sessionFactory;
	
	public MenuDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}

	@Override
	@Transactional
	public List<Menu> getMenus(String restaurantId) {
		@SuppressWarnings("unchecked")
		List<Menu> listMenu = (List<Menu>) sessionFactory.getCurrentSession()
				.createCriteria(Menu.class).add(Restrictions.eq("restaurantid", restaurantId))
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listMenu;
	}

}
