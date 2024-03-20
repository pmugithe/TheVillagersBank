package com.thevillagersbank.accounts.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
// The default path for our application or stating point. 
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

	@GetMapping("/helloAccount")
	public String sayHello() {
		
		return("Hello From Account Controller");
	}
}
