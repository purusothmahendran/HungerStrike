package com.hungerstrike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: pxm131030
 *
 */

@Controller
public class AboutController {

	@RequestMapping("/about")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>" + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from HungerStrikeHelloWorld.java **********</div><br><br>";
		return new ModelAndView("about", "message", message);
	}
}