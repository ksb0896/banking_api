package com.axisbankltd.banking_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axisbankltd.banking_api.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
