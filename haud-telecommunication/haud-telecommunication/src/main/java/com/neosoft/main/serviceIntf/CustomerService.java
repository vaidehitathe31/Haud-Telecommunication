package com.neosoft.main.serviceIntf;

import java.util.List;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;

public interface CustomerService {

	void saveCustomer(Customer customer);

	List<Simcard> getAllCustomerSim(String name);

	//List<Simcard> getCustomerSims(int id);

	
}
