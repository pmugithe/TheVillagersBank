package com.thevillagersbank.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thevillagersbank.accounts.constants.AccountsConstants;
import com.thevillagersbank.accounts.dto.CustomerDTO;
import com.thevillagersbank.accounts.dto.ResponseDTO;
@RestController
//To map requests to controllers methods. 
//It has various attributes to match by URL, HTTP method, request parameters, headers, and media types. 
// Produces the result in JSON format
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

	@GetMapping("/helloAccount")
	public String sayHello() {
		
		return("Hello From Account Controller");
	}
	
	public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO){
		
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDTO(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
		
		
		
	}
	
	
}
