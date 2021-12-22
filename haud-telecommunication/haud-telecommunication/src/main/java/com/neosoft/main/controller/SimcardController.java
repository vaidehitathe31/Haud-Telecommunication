package com.neosoft.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;
import com.neosoft.main.serviceIntf.SimcardService;

@RestController
@RequestMapping("/simcard")
public class SimcardController {

	@Autowired
	SimcardService simService;

	

	
	@PostMapping("/savesimcard/{name}")
    public ResponseEntity<Simcard> addSimcard(@PathVariable("name") String name,@RequestBody Simcard simcard)
    {
    	
    	simService.addSimToCustomer(name,simcard);
    	
    	return new ResponseEntity<Simcard>(HttpStatus.OK);    	
    }
	
	@GetMapping("/getAllSim")
	public ResponseEntity<List<Simcard>> getAllSimcards()
	{
		List<Simcard> simList= simService.getAllSimcards();
		if(simList.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(simList));
	}
}
