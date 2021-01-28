package com.capgemini.main;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.entities.Address;
import com.capgemini.entities.Employee;

public class MainApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeedb");     //database
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        // em.getTransaction().begin();

 
        Address address= new Address();
        address.setStreet("XYZ123");
        address.setPIN(452010);
        address.setCity("Ujjain");
        address.setState("MP");
        
        Address address1= new Address();
        address1.setStreet("ABC123");
        address1.setPIN(452010);
        address1.setCity("Ujjain");
        address1.setState("MP");
        
        Employee emp= new Employee();
        //emp.setEmp_id(101);
        emp.setEmp_name("Ashu");
        emp.setJoining_date(new Date());
        emp.setAddress(address);
 

        Employee emp1= new Employee();
        //emp1.setEmp_id(101);
        emp1.setEmp_name("Ayu");
        emp1.setJoining_date(new Date());
        emp1.setAddress(address1);

        em.persist(emp);
        em.persist(emp1);
        transaction.commit();
        
        em.close();
        emf.close();

	}

}
