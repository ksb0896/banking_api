package com.axisbankltd.banking_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.axisbankltd.banking_api.model.Customer;
import com.axisbankltd.banking_api.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		
	}

}
