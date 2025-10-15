package com.demo.service;
import java.util.*;
import com.demo.beans.*;
import com.demo.exceptions.NegativesalaryException;
public class MyService {

	public void acceptdata() throws NegativesalaryException{
		// TODO Auto-generated method stub
		
		Employee  e=new Employee(1,"gita",120000);
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		
		
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		
		
		System.out.println("Enter employee salary");
		double sal=sc.nextDouble();
		if(sal<0)
		{
			throw new NegativesalaryException("sal can not be negative");
		}
		
		Employee e1=new Employee(id,ename,sal);
		//e.setSalary(-8764);
		System.out.println(e);
		System.out.println(e1);
		
	    
		
		
	}

}
