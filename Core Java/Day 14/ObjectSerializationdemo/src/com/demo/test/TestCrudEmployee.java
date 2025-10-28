package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCrudEmployee {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		  
	    eservice.readFile("empinfo.txt");
	    
	    int choice=0;
	    do {
	    	System.out.println("1. add new Employee\n2.Display all \n");
			System.out.println("3. salary modify by id \n4.delete by id\n5. display by id\n6. exit\nchoice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				boolean status1=eservice.addEmployee();
				if(status1)
				{
					System.out.println("added successfully");
				}
				else
				{
					System.out.println("not added");
				}
			}
			case 2->{
				List<Employee> emp=eservice.getAll();
				
				emp.forEach(System.out:: println);
				
			}
			
			case 3->{
				System.out.println("enter id for modifying data :");
				int id=sc.nextInt();
				
				System.out.println(" enter new salary :");
				double sal=sc.nextDouble();
				
				boolean status3= eservice.modifyById(id,sal);
				
				if(status3)
				{
					System.out.println("data modified successfully");
				}
				else
				{
					System.out.println(" not modified....!!!!");
				}
				
			}
			
			case 4->
			{
				System.out.println(" enter id to delete data of that id:");
				int id=sc.nextInt();
				
				boolean status4=eservice.deleteById(id);
				if(status4)
				{
					System.out.println("data deleted successfully");
				}
				else
				{
					System.out.println(" not deleted...!!!!");
				}
				
				
			}
			case 5->
			{
				
			}
			
			case 6->
			{
				eservice.writeToFile("empinfo.txt");
				sc.close();
				
				System.out.println(" thank you for visiting....");
			}
			}
			
	    	
	    }while(choice!=6);
	}

}
