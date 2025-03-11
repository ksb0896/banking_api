package com.axisbankltd.banking_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbankltd.banking_api.model.Customer;
import com.axisbankltd.banking_api.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getCustomerById/{id}")
	public ResponseEntity<Customer> getCustomerById(@Valid @PathVariable Long id){
		return ResponseEntity.ok(customerService.getCustomerById(id));
	}
	
	@PutMapping("/updateCustomerById/{id}")
	public ResponseEntity<?> updateCustomer(@PathVariable Long id, @Valid @RequestBody Customer customer, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().body(bindingResult.getFieldErrors());
		}
		try {
			
		}catch() {
			
		}
		
		
		return null;
		
	}
	
	@PostMapping
	public ResponseEntity<?> createCustomer(@Valid @RequestBody Customer customer, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().body(bindingResult.getFieldErrors());
		}
		
		try {
			Customer createdCustomer = customerService.createCustomer(customer);
			return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
		} catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Customer with same email ID exists");
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occured while creating the customer");
		}
		/*
		 * return new ResponseEntity<>(customerService.createCustomer(customer),
		 * HttpStatus.CREATED);
		 */
		
	}
}
