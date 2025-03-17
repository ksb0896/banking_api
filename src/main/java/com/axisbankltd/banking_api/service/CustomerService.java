package com.axisbankltd.banking_api.service;

import java.util.List;

import com.axisbankltd.banking_api.model.Customer;

public interface CustomerService {
	Customer createCustomer(Customer customer);
	Customer getCustomerById(Long id);
	List<Customer> getAllCustomers();
	Customer updateCustomer(Long id, Customer customer);

	void deleteCustomer(Long id);
}
