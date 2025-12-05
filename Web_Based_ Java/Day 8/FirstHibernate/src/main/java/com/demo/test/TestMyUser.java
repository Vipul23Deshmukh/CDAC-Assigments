package com.demo.test;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.SessionFactory;
public class TestMyUser {

	public static void main(String[] args) {
         org.hibernate.SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
	}

}
