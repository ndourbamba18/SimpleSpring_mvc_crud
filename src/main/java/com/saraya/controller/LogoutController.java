package com.saraya.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	
	@RequestMapping(path = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth!=null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
		}
		return "redirect:/";
	}

}
