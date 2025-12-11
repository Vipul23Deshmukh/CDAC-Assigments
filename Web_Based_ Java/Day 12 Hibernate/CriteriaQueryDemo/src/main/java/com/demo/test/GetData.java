package com.demo.test;

import java.util.List;
import java.util.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class GetData {
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		//basic criteria setup
		
		CriteriaBuilder cb= session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		
		Root<Employee> root=cq.from(Employee.class);
		
		
		
		//fetch employees with age=25 or dept="ux"
		
		
		cq.select(root)
	.where(cb.or(
				cb.equal(root.get("age"),25),
				cb.equal(root.get("dept"),"ux"))
				);
		
		List<Employee> elist=session.createQuery(cq).getResultList();
		elist.forEach(System.out::println);
	
		
		//fetch all employee with dept ="ui" and (salary>50000 or age<30)
		
		cq.select(root)
		  .where(
		      cb.and(
		          cb.equal(root.get("dept"), "ui"),
		          cb.or(
		              cb.gt(root.get("salary"), 20000.00),
		              cb.lt(root.get("age"), 20)
		          )
		      )
		  );

		List<Employee> elist2 = session.createQuery(cq).getResultList();
		elist2.forEach(System.out::println);
		
		
		
		
		//selct employee where dept="admin" and salary>20000 and age>20
		Predicate p1=cb.equal(root.get("dept"),"admin");
		Predicate p2=cb.gt(root.get("salary"),20000);
		Predicate p3=cb.gt(root.get("age"),30);
		
		cq.where(cb.and(p1,p2,p3));
		
		List<Employee> elist3 = session.createQuery(cq).getResultList();
		elist3.forEach(System.out::println);
		
		
		
		//accepting values from user
		Scanner sc=new Scanner(System.in);
		List<Predicate> predicates = new ArrayList<>();
        System.out.println("enetr dept");
        String dept=sc.next();
		if (dept != null)
		    predicates.add(cb.equal(root.get("dept"), dept));
		System.out.println("enetr min salary");
        int minSalary=sc.nextInt(); 
		if (minSalary != 0)
		    predicates.add(cb.gt(root.get("salary"), minSalary));
		System.out.println("enetr max age");
        int maxage=sc.nextInt();
		if (maxage != 0)
		    predicates.add(cb.lt(root.get("age"), maxage));

		cq.where(cb.and(predicates.toArray(new Predicate[0])));
		
		List<Employee> elist5= session.createQuery(cq).getResultList();
		elist5.forEach(System.out::println);
		
		
		//using like
		
		cq.where(
				cb.or(
						cb.like(root.get("ename"),"G%"),
						cb.like(root.get("ename"), "N%")
						)
				);
		
		
		List<Employee> elist4= session.createQuery(cq).getResultList();
		elist4.forEach(System.out::println);
		
		}

	

	
}
