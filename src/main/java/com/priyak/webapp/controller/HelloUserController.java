package com.priyak.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloUserController {
	
	/*
	 * This method maps the /home URL to show a initial HTML form
	 */
	@RequestMapping("/home")
	public String showHomePage() {
		return "home-page-form";
	}
	
	/*
	 * This method maps the /showUserDetails URL to show a show the user details from the HTML Form
	 */
//	@RequestMapping("/userDetails")
//	public String disaplyUserDetails(HttpServletRequest httpServletRequest, Model model) {
//		String userName = httpServletRequest.getParameter("userName");
//		userName = userName.toUpperCase();
//		
//		// Add data to the Model object with attributes, which will be passed down to the view
//		model.addAttribute("userName", userName);
//		return "show-user-details";
//	}
	
	/*
	 * This method bind the paramter in the request using @RequestParam 
	 */
	@RequestMapping("/userDetails")
	public String disaplyUserDetails(@RequestParam("userName") String userName, Model model) {
		model.addAttribute("userName", userName.toLowerCase());
		return "show-user-details";
	}

}
