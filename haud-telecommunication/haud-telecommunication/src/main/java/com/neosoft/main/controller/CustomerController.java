package com.neosoft.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;
import com.neosoft.main.repository.CustomerRepository;
import com.neosoft.main.repository.SimcardRepository;
import com.neosoft.main.serviceIntf.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	SimcardRepository simcardRepository;
	
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return ResponseEntity.ok("Customer saved successfully");
	}
	
	@GetMapping("/getcustomersim/{name}")
	public List<Simcard> getAllCustomerSim(@PathVariable String name)
	{
		List<Simcard>  simcard= customerService.getAllCustomerSim(name);

		
		return simcard;
	}
}
