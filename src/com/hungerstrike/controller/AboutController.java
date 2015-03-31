package com.hungerstrike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hungerstrike.dao.MenuItemDAO;
import com.hungerstrike.dao.UsersDAO;
import com.hungerstrike.model.MenuItem;
import com.hungerstrike.model.Users;

/*
 * author: pxm131030
 *
 */

@Controller
public class AboutController {
	
	@Autowired
	private MenuItemDAO menuItemDao;

	@RequestMapping("/about")
	public ModelAndView about() {
		List<MenuItem> listItems = menuItemDao.list();
        ModelAndView model = new ModelAndView("about");
        model.addObject("itemsList", listItems);
        return model;
	}
}