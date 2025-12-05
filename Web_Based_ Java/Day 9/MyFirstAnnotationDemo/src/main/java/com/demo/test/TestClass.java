package com.demo.test;

import org.hibernate.cfg.Configuration;

import com.demo.bean.Course;
import com.demo.bean.Faculty;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.Session;
public class TestClass {

	public static void main(String[] args) {
		org.hibernate.SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		Course c1=new Course("java", 2, 1);
		Course c2=new Course("c++", 1, 2);
		
		Faculty f1=new Faculty(1, "kishori maam", "expert in java");
		Faculty f2=new Faculty(2, "sampada", "c++ programming");
		
		session.save(c1);
		session.save(c2);
		session.save(f1);
		session.save(f2);
		
		
		tr.commit();
		session.close();
		sf.close();
		
		

	}

}
