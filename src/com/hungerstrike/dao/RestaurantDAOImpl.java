package com.hungerstrike.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.hungerstrike.model.Restaurant;


public class RestaurantDAOImpl implements RestaurantDAO {
	private SessionFactory sessionFactory;
	
	 public RestaurantDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Restaurant> getRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
