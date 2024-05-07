package com.example.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/login")
	public String login() {
		return "test";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}

