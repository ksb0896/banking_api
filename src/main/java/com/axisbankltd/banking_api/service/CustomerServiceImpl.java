package com.axisbankltd.banking_api.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.axisbankltd.banking_api.model.Customer;
import com.axisbankltd.banking_api.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Customer not found!"));
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		Customer existingCustomer = getCustomerById(id);
		existingCustomer.setName(customer.getName());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setPhoneNumber(customer.getPhoneNumber());
		return customerRepository.save(existingCustomer);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		
	}

}
