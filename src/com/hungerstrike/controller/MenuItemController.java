package com.hungerstrike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hungerstrike.dao.MenuItemDAO;
import com.hungerstrike.model.MenuItem;

/*
 * author: pxm131030
 *
 */

@Controller
public class MenuItemController {
	
	@Autowired
	private MenuItemDAO menuItemDao;

	@RequestMapping("/item")
	public ModelAndView menu(@RequestParam("id") String id,@RequestParam("resId")String resId) {
		List<MenuItem> listItems = menuItemDao.list(id);
        ModelAndView model = new ModelAndView("item");
        model.addObject("itemsList", listItems);
        return model;
	}
}