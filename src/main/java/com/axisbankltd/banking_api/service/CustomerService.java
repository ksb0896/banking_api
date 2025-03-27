package com.axisbankltd.banking_api.service;

import java.util.List;

import com.axisbankltd.banking_api.dto.CustomerDto;
//import com.axisbankltd.banking_api.model.Customer;

public interface CustomerService {
	
	//POST
	CustomerDto createCustomer(CustomerDto createCustomer);
	//	Customer createCustomer(Customer customer); old imp

	//GET {id}
	CustomerDto getCustomerById(Long id);
	// Customer getCustomerById(Long id); old imp

	// GET ALL
	List<CustomerDto> getAllCustomers();

	//UPDATE BY ID
	CustomerDto updateCustomer(Long id, CustomerDto customer);

	//DELETE BY ID
	void deleteCustomer(Long id);
}
