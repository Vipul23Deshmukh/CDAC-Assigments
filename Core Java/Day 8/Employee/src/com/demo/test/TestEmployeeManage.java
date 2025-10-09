package com.demo.test;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
public class TestEmployeeManage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. add new Employee \n2. Display all");
			System.out.println("3. Display by id \n4. change sal or charges");
			System.out.println("5. Display Salaried Employee \n6. Display Contract Employee");
			System.out.println("7. Search By Name \n8. calculate net salary \n9. exit\n Choice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println("1)Salaried Emp \n 2)C0ntract Emp");
			       System.out.println("enter your choice");
			       int ch=sc.nextInt();
			       
			       boolean status=EmployeeService.addEmployee(ch);
			       if(status)
			       {
			    	   System.out.println("employee added successfully");
			       }
			       else
			       {
			    	   System.out.println("error");
			       }
			       
			       break;
			       
			case 2:EmployeeService.displayAll();
			break;
			
			case 3:
				System.out.println("Enter Id to be searched");
				 String id=sc.next();
				 
				 Employee e=EmployeeService.SearchByID(id);

				if (e!=null) {
					System.out.println(e);
					
				}
				else
					System.out.println("Not found");
				break;
				
			
			case 4:System.out.println("enter id where you want to change sal or charges");
			       String Id=sc.next();
			       
			       System.out.println("enter new sal or charges");
			       double change=sc.nextDouble();
			      
			       boolean status1=EmployeeService.ModifybyId(Id,change);
			       if(status1)
			       {
			    	   System.out.println("updated successfullly");
			       }
			       else {
			    	   System.out.println("error");
			       }
			       
			        
			        
			        
				break;
			case 5:EmployeeService.displayOnlySalariedEmployee();
			
			break;
			
			case 6:EmployeeService.displayOnlyContractEmployee();
			break;
			
			case 7:
				System.out.println("Enter Id to be searched");
				 String name=sc.next();
				 
				 Employee em=EmployeeService.SearchByName(name);

				if (em!=null) {
					System.out.println(em);
					
				}
				else
					System.out.println("Not found");
				break;
				
			case 8:System.out.println("exit");
			
			}
			
			
			
		}while(choice!=8);

	}

}
