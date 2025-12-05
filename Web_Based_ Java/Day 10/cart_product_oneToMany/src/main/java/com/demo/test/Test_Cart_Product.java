package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Product;

public class Test_Cart_Product {

	public static void main(String[] args) {
	
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		
		Transaction tr=session.beginTransaction();
		Cart c1=new Cart(1, "utensils");
		Cart c2=new Cart(2, "grocery");
		Cart c3=new Cart(3, "Skincare");
		
		Product p1=new Product(1, "soap", 30.20,c3);
		Product p2=new Product(2, "kadhai", 20000, c1);
		
		Product p3=new Product(3, "sunscreen", 20000, c3);
		
		Product p4=new Product(4, "sugar", 30.20,c3);
		Product p5=new Product(5, "glass", 20000, c1);
		
		Product p6=new Product(6, "facewash", 20000, c3);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p6);
		session.save(p4);
		session.save(p5);
		
		  
	     tr.commit();
	     
	     sf.close();

	}

}
