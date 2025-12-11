package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class testAddEmployee {

	public static void main(String[] args) {
	
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Employee e1=new Employee("sita", 30000, "ui", 20);
		Employee e2=new Employee("gita", 40000, "ux", 30);
		Employee e3=new Employee("rita", 50000, "ui", 40);
		Employee e4=new Employee("nita", 20000, "ux", 25);
		Employee e5=new Employee("ram", 20000, "HR", 20);
		Employee e6=new Employee("shyaam", 50000, "admin", 30);
		
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		
		tr.commit();
		session.close();
		sf.close();
		

	}

}
