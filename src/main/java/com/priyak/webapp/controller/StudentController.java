package com.priyak.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priyak.webapp.model.Student;

@Controller
@RequestMapping("/studentLogin")
public class StudentController {
	
	@RequestMapping("/loginForm")
	public String studentLogin(Model model) {
		//Create a new Student object and add it to the model to be passed on to the View
		model.addAttribute("student", new Student());
		return "student-login-form";
	}
	
	@RequestMapping("/processForm")
	public String showStudentLoginPage(@ModelAttribute("student") Student student) {
		
		return "student-home-page";
	}

}
