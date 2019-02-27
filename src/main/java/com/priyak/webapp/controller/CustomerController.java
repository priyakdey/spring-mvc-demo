package com.priyak.webapp.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priyak.webapp.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	/*
	 *	Adding an InitBinder to preprocess the form data
	 *	This preprocessor will trim all leading and trailing whitesapces 
	 *	The preprocessor will convert all whitespace String object to Null
	 */
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		return;
	}
	
	
	@RequestMapping("/login")
	public String customerLoginPage(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-login-form";
	}
	
	@RequestMapping("/processForm")
	public String welcomeCustomer(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
	
		if(bindingResult.hasErrors()) {
			return "customer-login-form";
		}
		else {
			return "customer-welcome-page";
		}
	}

}
