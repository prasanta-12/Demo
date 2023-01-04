package com.axis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.axis.model.Customer;



public class CustomerDao {

	public Customer insertIntoDatabase(Customer customer) {
		 Configuration con=new Configuration().configure().addAnnotatedClass(Customer.class);
	        ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	        SessionFactory factory=con.buildSessionFactory(registry);
	        Session session=factory.openSession();
	        Transaction transaction=session.beginTransaction();
	        session.save(customer);
	        transaction.commit();
	        System.out.println("Inserted into database");
	        return customer;
	        
	        
	}
}
