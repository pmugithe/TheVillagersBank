package com.thevillagersbank.accounts.service;

import com.thevillagersbank.accounts.dto.CustomerDTO;

/**
 * @author prade
 *
 */

public interface IAccountsService {
	
	
	/**
	 * 
	 * @param customerDto
	 */
	public void createAccount(CustomerDTO customerDto);
	
	
}
