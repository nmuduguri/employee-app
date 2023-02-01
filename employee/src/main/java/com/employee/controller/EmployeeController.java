package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody Employee employee) {
		
		System.out.println("Employee Object is :"+employee);
		
		employeeService.save(employee);
	
	
		return "Employee Saved Successfully";
	}
	
	
}
