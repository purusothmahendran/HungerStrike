package com.hungerstrike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: pxm131030
 *
 */

@Controller
public class RestaurantController {

	@RequestMapping("/restaurant")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>" + "<h3>Restaurant Controller</h3></div><br><br>";
		return new ModelAndView("restaurant", "message", message);
	}
}