package com.saraya.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.saraya.entities.Employee;

@Service
public class EmployeeService {
	
	private static List<Employee> employees = new ArrayList<Employee>();
	
	private static int count = 6;
	
	static {
		employees.add(new Employee(1, "Modou", "Ka", "ka-modou@gmail.com", "(+221)7752101214", "Thies", "Dev ops", "https://bootdey.com/img/Content/avatar/avatar1.png", "kjhgfr54217jkh", false, "Male", "THE DESCRIPTION"));
		employees.add(new Employee(2, "Mamadou", "Diop", "diop-fama@gmail.com", "(+221)785412121", "Diourbel", "UI Developer", "https://bootdey.com/img/Content/avatar/avatar7.png", "kjhgfr54542mlo", false, "Male", "THE DESCRIPTION"));
		employees.add(new Employee(3, "Iboulaye", "Ndiaye", "ndiayeibou@gmail.com", "(+221)778741121", "Louga", "Solfwer developer", "https://bootdey.com/img/Content/avatar/avatar2.png", "kjhgfr54451lkj", true, "Female", "THE DESCRIPTION"));
		employees.add(new Employee(4, "Aminata", "Bah", "bahamina@gmail.com", "(+221)775285421", "Dakar", "Graphic Designer", "https://bootdey.com/img/Content/avatar/avatar5.png", "kjhgfr54014kyt", false, "Male", "THE DESCRIPTION"));
		employees.add(new Employee(5, "Bintou", "Mbaye", "mbayebintou@gmail.com", "(+221)775210147", "Dakar", "Android Developer", "https://bootdey.com/img/Content/avatar/avatar3.png", "kjhgfr57840kju", true, "Female", "THE DESCRIPTION"));
	}
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
		
	
    List<Employee> employeeList = new ArrayList<>();
	
	// GET A  DETAIL EMPLOYEE
	/*public List<Employee> retrieveAll(Employee employeeData){
		for(Employee employee : employees) {
			if(employee.getFirstName().equalsIgnoreCase(firstName)) {
				employeeList.add(employee);
			}
		}
		  
		return employeeList;
	}*/
	
    // Service delete employee by id from the array list
	public void deleteEmployee(int id) {
		Iterator<Employee> iterator = employees.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getId()==id) {
			     iterator.remove();
			}
		}
	}
	
	// Service delete all employee on the array list
	public void deleteAllEmployees() {
		employees.clear();
	}
	
	public void addEmployee(Employee employeeData) {
		//employeeData.setEmployeeCode(UUID.randomUUID().toString());
		Employee employee = new Employee(count++, employeeData.getFirstName(), employeeData.getLastName(), employeeData.getEmail(),
				              employeeData.getPhoneNumber(), employeeData.getAddress(), employeeData.getJobTitle(), employeeData.getImageUrl(),
				              employeeData.getEmployeeCode(), employeeData.isMarried(), employeeData.getGender(),
				              employeeData.getDescription());
		
		employee.setEmployeeCode(UUID.randomUUID().toString());
		employees.add(employee);
	}
	
	// FIND BY ID A SINGLE EMPLOYEE ON THE ARRAY LIST
	public Employee findById(int id) {
		for(Employee employee : employees) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}
	
	public void updateEmployee(Employee employee) {
		employees.remove(employee);
		employees.add(employee);
	}

}
