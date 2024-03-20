package com.thevillagersbank.accounts.mapper;

import com.thevillagersbank.accounts.dto.CustomerDTO;
import com.thevillagersbank.accounts.entity.Customer;


// Instead of doing or mapping (mapping Entity to DTOs ) manually, we do have some libraries, that maps automatically namely 
// --> modelmapper and MapStruct 
// NOT RECOMMENDED BY SPRING THOUGH...
public class CustomerMapper {

	
	public static CustomerDTO mapToCustomerDto(Customer customer, CustomerDTO customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDTO customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
