package com.hungerstrike.dao;

import java.util.List;

import com.hungerstrike.model.Menu;
public interface MenuDAO {
	public List<Menu> getMenus(String restaurantId);

}
