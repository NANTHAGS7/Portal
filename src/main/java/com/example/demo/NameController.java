package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	
	private String name = "thomas shelby";
	@GetMapping("/name")
	public String getName() {
		return "My Name Is "+ name;
	}
}
