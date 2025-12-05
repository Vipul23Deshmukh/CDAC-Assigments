package com.demo.test;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Address;
import com.demo.bean.MyUser;
import com.mysql.cj.xdevapi.SessionFactory;

public class TestMyUser {

	public static void main(String[] args) {

		org.hibernate.SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		org.hibernate.Transaction tr=session.beginTransaction();
		
		/*Address a1=new Address(1, "M.G Road", "Pune", "441106");
		
		MyUser u1=new MyUser(101, "Vipul", "883338833", a1);
		MyUser u2=new MyUser(102, "Tushar", "77774444", a1);
		
		session.save(u1);
		session.save(u2);
		
		tr.commit();
		session.close();
		
		
		Session session2=sf.openSession();
		org.hibernate.Transaction tr1=session.beginTransaction();
		*/
		
		System.out.println("Before get");
		
		MyUser u3=session.get(MyUser.class, 101);
		
		System.out.println("after get");
		System.out.println(u3);
		tr.commit();
		session.close();
		sf.close();
		
		
		
		
	}

}
