package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

	@Value("${thank.page}")
	private String testPageString;
	@GetMapping("/val")
	public String getAnswer() {
		return "Welcome to the" + testPageString;
	}
}