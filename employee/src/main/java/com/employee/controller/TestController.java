package com.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/t")
public class TestController {

	@RequestMapping("/test1")
	public String test1() {
		
		System.out.println("test");
		
		System.out.println("test");
		
		return "we are in test1 Controller class";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "we are in test2 Controller class";
	}
	
	
	
	//  http://localhost:8081/test1
    //  http://localhost:8081/test2
}
