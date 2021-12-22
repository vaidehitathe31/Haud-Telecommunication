package com.neosoft.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Iterable<Customer> findAllById(int id);

	Customer findByName(String name);
	
	

}
