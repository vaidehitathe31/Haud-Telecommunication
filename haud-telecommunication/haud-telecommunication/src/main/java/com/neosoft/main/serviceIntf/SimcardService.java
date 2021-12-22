package com.neosoft.main.serviceIntf;

import java.util.List;

import com.neosoft.main.model.Simcard;

public interface SimcardService {

	

	List<Simcard> getAllSimcards();

	void addSimToCustomer(String name, Simcard simcard);
	


}
