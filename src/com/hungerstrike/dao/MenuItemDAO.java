package com.hungerstrike.dao;

import java.util.List;
import java.util.Map;

import com.hungerstrike.model.MenuItem;

public interface MenuItemDAO {
	public List<MenuItem> list(String menuid);
	public List<MenuItem> getItem(String itemid);
	public Map<String,Integer> getPriceAndTime(String itemid);

}
