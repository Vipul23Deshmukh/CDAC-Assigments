package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestGetData {
public static void main(String[] args) {
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	Session session=sf.getCurrentSession();
	
	Transaction tr=session.beginTransaction();
	System.out.println("Before");
	Department d=session.get(Department.class,86 );
	System.out.println("After");
	System.out.println("----------------------------");
	System.out.println(d);
	
	System.out.println("before Employee");
	Employee e=session.get(Employee.class, 1);
	System.out.println("After employee");
	System.out.println("-----------------------------");
	System.out.println(e);
	System.out.println(e.getDept().getDname());
	
	
	
}
}
