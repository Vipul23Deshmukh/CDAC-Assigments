package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;
public class TestJoinedTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new PerishableProduct(11, "lays", 10, 654, LocalDate.of(2020, 10, 10), LocalDate.of(2021, 12, 12));
		Product p1=new NonPerishable(13, "chair", 20, 234, LocalDate.of(2010, 10, 10), 4);
		
		session.save(p);
		session.save(p1);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
