package com.thevillagersbank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/")
public class AccountController {

	@GetMapping("/helloAccount")
	public String sayHello() {
		
		return("Hello From Account Controller");
	}
}
