package com.demo.test;
import java.util.Scanner;
import java.util.Set;

import java.util.*;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.beans.*;
public class Employeetest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int choice=0;
	EmployeeService eservice=new EmployeeServiceImpl();
	do {
		
		System.out.println("1. add new employee\n 2. display all\n3. search by id");
		System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
		System.out.println("8. search by salary \n 9.sort by id\n10.sort by name\n11. sort by salary\ne\n12.Exit ");
		System.out.println("enter choice:");
		choice=sc.nextInt();
		
	  switch(choice)
	  {
	  case 1->{boolean status=eservice.addNewEmployee();
	   if(status)
	   {
		   System.out.println("added successfully.!");
	   }
	   else
	   {
		   System.out.println("not added");
	   }
	  }
	   
	  case 2->{ Set<Employee> eset=eservice.displayAll();
	  eset.forEach(System.out::println);
	 
	 
	  }
	  case 3->{
		  System.out.println("Enter ID to be searched");
		  int id=sc.nextInt();
		  
		  Employee e=eservice.FindById(id);
		  if(e!=null) {
			  System.out.println(e);
		  }
		  
		  else {
			  System.out.println("not found");
		  }
	  }
	  case 4->{
		  System.out.println(" Enter name to search:");
		  String name=sc.next();
		  
		  Set<Employee> e=eservice.FindByName(name);
		  
		  if(e!=null)
		  {
			  System.out.println(e);
		  }
		  else {
			  System.out.println("not found");
		  }
	  }
		
	  case 5->{
		  System.out.println("Enter Id for salary updation");
		  int id1=sc.nextInt();
	  
		  System.out.println("Enter new salary");
		  double sal1=sc.nextDouble();
		  
		  boolean status =eservice.UpdateSalary(id1,sal1);
		  
		  if(status) {
			  System.out.println("Updated successfully");
			  
		  }
		  else {
			  System.out.println("Not Updated");
		  }
		  
		
		  
	  }
	 
	  case 6->{
		   System.out.println(" enter id to delete:");
		   int id=sc.nextInt();
		   
		   boolean status2=eservice.deleteById(id);
		   if(status2)
		   {
			   System.out.println("Deleted data");
		   }
		   else {
			   System.out.println("not deleted");
		   }
	  }
	  
	  case 7->{
		  System.out.println("enter sal to te deleted");
		  double sal3=sc.nextDouble();
		  
		  boolean status3=eservice.DeleteBySalary(sal3);
		  
		  if(status3) {
			  System.out.println("Salary Deleted Successfully");
		  }
		  
		  
		  else {
			  System.out.println("Not Deleted");
		  }
	  }
	  case 8->
	  {
		  System.out.println("enter salary to search data");
		  double sal4=sc.nextDouble();
		  
		  Set<Employee> e=eservice.findBySal(sal4);
		  if(e!=null)
		  {
			  System.out.println(e);
		  }
		  else {
			  System.out.println("not found");
		  }
	  }
	  
	  case 9->{
		  Set<Employee>eset=eservice.SortById();
		  
		  eset.forEach(System.out::println);
	  }
	  
	  case 10->{
		  List<Employee>eset1=eservice.SortByName();
		  
		  eset1.forEach(System.out::println);
	  }
	  case 11->{
		  List<Employee> lst=eservice.sortBySal();
		  lst.forEach(System.out::println);
	  }
	  case 12->
	  {
		  System.out.println("Exit...");
	  }
	  default->
	  {
		  System.out.println("use your unused brain......");
	  }
	  
	}
	 
	}while(choice!=12);

}
}