package com.global.hr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeWS {
	
@GetMapping("/employee")
	public String getName() {
		return "Hello";
		
	}

}
