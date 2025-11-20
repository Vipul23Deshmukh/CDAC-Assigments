package com.demo.test;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
	
		EmployeeService eservice=new EmployeeServiceImpl();
		
		
		int choice=0;
		
		do {
		
			System.out.println("1.Add new Employee \n2.Delete Employee\n");
			System.out.println("3 .modify Employee\n4.Find by id\n5.Display all");
			System.out.println("6.Display data in sorted order\n7.Exit");
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Choice");
			choice =sc.nextInt();
			
			
			 switch(choice) {
			 
			 
			 case 1->{
				 
				 boolean status =eservice.AddNewEmp();
				 if(status) {
					 System.out.println("Added successfully");
					 
				 }
				 else {
					 System.out.println("Not added");
				 }
				 
			 }
			 
			 case 2->{
				 System.out.println(" enter id to delete employee data");
				 int id=sc.nextInt();
				 boolean status=eservice.deleteEmployee(id);
				 if(status)
				 {
					 System.out.println(" deleted successfully");
				 }
				 else
				 {
					 System.out.println(" not deleted");
				 }
			 }
			 
			 case 3->{
				 System.out.println("enter id");
				 int id=sc.nextInt();
				 System.out.println("Enter new Credit");
				 int cr=sc.nextInt();
				 
				 System.out.println("Enter new Salray");
				 double sal=sc.nextDouble();
				 boolean status =eservice.ModifyByid(id,cr,sal);
				 if(status) {
					 System.out.println("Modified successfully");
				 }
				 
				 else {
					 System.out.println("Not Able to modified");
				 }
			
			 }
			 
			 }
			
			
		}while(choice!=6);
		
	}

}
