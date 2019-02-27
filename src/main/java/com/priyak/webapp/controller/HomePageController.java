package com.priyak.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller to mark the controllers
 * @Controller extends from @Component and hence spring will scan for @Controller too
 */
@Controller
public class HomePageController {

	@RequestMapping("/")
	public String displayHomePage() {
		return "index";
	}

}
