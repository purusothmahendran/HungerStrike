package com.hungerstrike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hungerstrike.dao.MenuDAO;
import com.hungerstrike.model.Menu;

/*
 * author: pxm131030
 *
 */

@Controller
public class RestaurantController {
	
	@Autowired
	private MenuDAO menuDao;

	@RequestMapping("/restaurant")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>" + "<h3>Restaurant Controller</h3></div><br><br>";
		return new ModelAndView("restaurant", "message", message);
	}
	
	@RequestMapping("/menu")
	public ModelAndView restaurant(@RequestParam("id") String id) {
		List<Menu> listMenu = menuDao.getMenus(id);
        ModelAndView model = new ModelAndView("menu");
        model.addObject("resId",id);
        model.addObject("menusList", listMenu);
        return model;
	}
}