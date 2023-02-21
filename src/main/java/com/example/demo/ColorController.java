package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
	
	private String favc = "Black";
	@GetMapping("/color")
	public String favColor() {
		return "My favourite color is " + favc;
	}
}
