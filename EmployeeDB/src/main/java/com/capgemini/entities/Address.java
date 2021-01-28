package com.capgemini.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	
	private String street;
	private String city;
	private String state;
	private int PIN;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	
//	public Address(String address, String city, String state, int pIN) {
//		this.address = address;
//		this.city = city;
//		this.state = state;
//		PIN = pIN;
//	}
	
	
	
	

}
