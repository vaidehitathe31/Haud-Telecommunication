package com.neosoft.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.model.Customer;
import com.neosoft.main.model.Simcard;

@Repository
public interface SimcardRepository extends JpaRepository<Simcard, Integer>{

	List<Simcard> findByCustomer(Customer customer);

	List<Simcard> findByCustomer_Id(int id);
}
