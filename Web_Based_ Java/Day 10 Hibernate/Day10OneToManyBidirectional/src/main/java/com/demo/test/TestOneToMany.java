package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {

		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.getCurrentSession();
		
		Transaction tr=session.beginTransaction();
		
		Department d=new Department(1, "Dept  of Research and development", "France",null);
		
		
		Department d1=new Department(2, "Medical Science", "China", null);
		
		Department d2=new Department(3, "Dept of Chemisty", "Germany", null);
		
		
		Employee e1=new Employee(7, "Sumit", LocalDate.of(2025, 05, 12), 4056, d);
		Employee e2=new Employee(18, "tushar", LocalDate.of(1999, 12, 15), 5000, d);
		
		Employee e3=new Employee(86, "Adams", LocalDate.of(2002, 04, 11), 5000, d);
		Employee e4=new Employee(12, "John", LocalDate.of(1995, 12, 29), 16000, d1);
		Employee e5=new Employee(56, "Sofey", LocalDate.of(2005, 07, 22), 60060, d1);
		Employee e6=new Employee(66, "raie", LocalDate.of(2007, 8, 17), 77000, d2);
		Employee e7=new Employee(01, "Alex", LocalDate.of(1999, 9, 8), 1500, d2);
		
		Set<Employee>  set1=new HashSet<Employee>();
		set1.add(e1);
		set1.add(e2);
		
		
		Set<Employee> set2=new HashSet<Employee>();
		set2.add(e3);
		set2.add(e4);
		
		d.setEset(set1);
		d.setEset(set2);
     session.save(d);
     session.save(d1);
     session.save(d2);
     session.save(e1);
     session.save(e2);
     session.save(e3);
     session.save(e4);
     session.save(e5);
     session.save(e6);
     session.save(e7);	
     
     
     tr.commit();
     
     sf.close();

	}

}
