package com.java.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// @Value("${application.message:Hello World}")
	// private String message = "Hello World";

	@RequestMapping("/")
	public String goHome(Model model){
		model.addAttribute("message", "Stranger");
		return "welcome";
	}

	@RequestMapping(value="/",method = RequestMethod.POST)
	public String greetUserForm(Model model, @RequestParam("username") String username){
		model.addAttribute("message", username);
		return "welcome";
	}
	
	@RequestMapping(value="/{username}",method = RequestMethod.GET)
	public String greetUserUrl(Model model, @PathVariable("username") String username){
		model.addAttribute("message", username);
		return "welcome";
	}
	

}
