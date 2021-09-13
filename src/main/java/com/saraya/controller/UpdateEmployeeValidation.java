package com.saraya.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.saraya.entities.Employee;

public class UpdateEmployeeValidation {
	
	public Employee employeeValidation(ModelMap model, @ModelAttribute("employee")Employee employee) {
		model.addAttribute("firstName", employee.getFirstName());
		model.addAttribute("lastName", employee.getLastName());
		model.addAttribute("email", employee.getEmail());
		model.addAttribute("phoneNumber", employee.getPhoneNumber());
		model.addAttribute("address", employee.getAddress());
		model.addAttribute("jobTitle", employee.getJobTitle());
		model.addAttribute("imageUrl", employee.getImageUrl());
		model.addAttribute("married", employee.isMarried());
		model.addAttribute("gender", employee.getGender());
		model.addAttribute("description", employee.getDescription());
		
		return null;
	}

}
