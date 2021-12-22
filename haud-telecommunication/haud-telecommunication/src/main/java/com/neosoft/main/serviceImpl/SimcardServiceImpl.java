package com.neosoft.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;
import com.neosoft.main.repository.CustomerRepository;
import com.neosoft.main.repository.SimcardRepository;
import com.neosoft.main.serviceIntf.SimcardService;

@Service
public class SimcardServiceImpl implements SimcardService{

	@Autowired
	SimcardRepository simRepo;
	
	@Autowired
	CustomerRepository customerRepository;
	

	@Override
	public List<Simcard> getAllSimcards() {
		return simRepo.findAll();
	}

	@Override
	public void addSimToCustomer(String name, Simcard simcard) {
		 Customer customer=customerRepository.findByName(name);

	        simcard.setCustomer(customer);
	        
	        simRepo.save(simcard);
		
	}
	
	

}
