package com.capgemini.entities;

import java.util.Date;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Employee_Data")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	//@Transient
	private String emp_name;
	
	@Temporal(value=TemporalType.DATE)
	private Date joining_date;
	
	@Embedded
	Address address;

//	public Employee(int emp_id, String emp_name, Date joining_date, Address address) {
//		super();
//		this.emp_id = emp_id;
//		this.emp_name = emp_name;
//		this.joining_date = joining_date;
//		this.address = address;
//	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	
	
	
	
}
