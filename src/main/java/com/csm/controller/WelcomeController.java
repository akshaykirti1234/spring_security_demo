package com.csm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/notice")
	public String notice() {
		return "welcome to notice API";
	}

	@GetMapping("/userLogin")
	public String userLogin() {
		return "user login API";
	}
}
