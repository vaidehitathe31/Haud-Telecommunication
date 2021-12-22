package com.neosoft.main.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Simcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;

	private long sIMNumber;
	private int iMSINumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getsIMNumber() {
		return sIMNumber;
	}
	public void setsIMNumber(long sIMNumber) {
		this.sIMNumber = sIMNumber;
	}
	public int getiMSINumber() {
		return iMSINumber;
	}
	public void setiMSINumber(int iMSINumber) {
		this.iMSINumber = iMSINumber;
	}
	
	
	

}
