package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saraya.entities.Employee;
import com.saraya.services.EmployeeService;

@Controller
@SessionAttributes("employee")
public class EmployeeController {
	
	
	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String showEmployeeList(ModelMap model) {
		
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "home"; 
	}
	
	// GET A SINGLE EMPLOYEE BY ID
	@RequestMapping(path = "/detailEmployee", method = RequestMethod.GET)
	public String showDetailEmployee(@RequestParam("id") int id, ModelMap model) {
		
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "detailEmployee";
	}
	
	// GET A SINGLE EMPLOYEE FORM FROM THE ARRAY LIST
	@RequestMapping(path = "/newEmployeeForm", method = RequestMethod.GET)
	public String employeeForm(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "employeeForm";
	}
	
	// POST A NEW EMPLOYEE ON THE ARRAY LIST
	@RequestMapping(path = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
		
		/*if(bindingResult.hasErrors()) {
			return "employeeForm";
		}*/
		
		employeeService.addEmployee(employee);
		System.out.println(employee.toString());
		return "saveSuccess";
	}
	
	// UPDATE EMPLOYEE FORM BY ID ON THE ARRAY LIST
	@RequestMapping(path = "/updateFormEmployee", method = RequestMethod.GET)
	public String updateEmployeeForm(@RequestParam("id") int id, ModelMap model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		
		return "updateEmployeeForm";
	}
	
	
	@RequestMapping(path = "/save-update-employee", method = RequestMethod.POST)
	public String updateEmployee(@RequestParam("id") int id, @ModelAttribute("employee") Employee employee, ModelMap model) {
		
		/*Employee employee = employeeService.findById(id);
		
		employee.setFirstName(employeeData.getFirstName());
		employee.setLastName(employeeData.getLastName());
		employee.setEmail(employeeData.getEmail());
		employee.setPhoneNumber(employeeData.getPhoneNumber());
		employee.setAddress(employeeData.getAddress());
		employee.setJobTitle(employeeData.getJobTitle());
		employee.setImageUrl(employeeData.getImageUrl());
		employee.setMarried(employeeData.isMarried());
		employee.setGender(employeeData.getGender());
		employee.setDob(employeeData.getDob());
		employee.setDescription(employeeData.getDescription());*/
		// Save employee
		employeeService.updateEmployee(employee);
		
		System.out.println(employee);
		System.out.println(employee.toString());
		return "updatedSuccess";
	}
	
	// DELETE A SINGLE EMPLOYEE BY ID ON THE ARRAY LIST
	@RequestMapping(path = "/deleteEmployee", method = RequestMethod.GET)
	public String deleteEmployeeById(@RequestParam("id") int id, ModelMap model) {
		
		model.addAttribute("id", id);
		employeeService.deleteEmployee(id);
		model.clear();
		System.out.println("Object of id = "+ id + " deleted successfully !");
		return "successDelete";
	}
	
	// DELETE A SINGLE EMPLOYEE BY ID ON THE ARRAY LIST
	@RequestMapping(path = "/deleteAllEmployees", method = RequestMethod.GET)
	public String deleteAllEmployees() {
			
			employeeService.deleteAllEmployees();
			return "successDeleteAll";
	}


}
