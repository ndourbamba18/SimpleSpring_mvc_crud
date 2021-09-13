package com.saraya.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		
		model.put("username", getLoggedInUserName());
		return "welcome"; 
	}
	
	public String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}

	
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String contactPage() {
		
		return "contact"; 
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String aboutPage() {
		
		return "about"; 
	}
	
}
