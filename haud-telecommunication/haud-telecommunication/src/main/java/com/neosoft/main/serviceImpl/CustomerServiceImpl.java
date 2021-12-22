package com.neosoft.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;
import com.neosoft.main.repository.CustomerRepository;
import com.neosoft.main.repository.SimcardRepository;
import com.neosoft.main.serviceIntf.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	SimcardRepository simcardRepo;

	@Override
	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}

	@Override
	public List<Simcard> getAllCustomerSim(String name) {
		Customer customer=customerRepo.findByName(name);
		System.out.println(customer);
		
		List<Simcard> simcard=simcardRepo.findByCustomer_Id(customer.getId());
	
		return simcard;
	}



	

}
