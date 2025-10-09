
package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Studentinfo;
import com.demo.service.StudentService;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	     System.out.println("1)accept Details");
		System.out.println("2)Display all Students");
		System.out.println("3)Search by id");
		System.out.println("4)Search by name");
	    System.out.println("5)Calculate gpa");
	    System.out.println("6)Exit");
		  
		int choice;
      do {
    	  System.out.println("Enter your choice");
    	  choice=sc.nextInt();
    	  
    	  switch(choice)
    	  {
    	  case 1:StudentService.AcceptDetails();
    	  break;
    	  
    	  case 2:StudentService.DisplayData();
    	  break;
    	  
    	  case 3:System.out.println(" enter id for search by id");
    	        int sid=sc.nextInt();
    	        
    	        Studentinfo s=StudentService.findById(sid);
    	        
    	        if(s!=null)
    	        {
    	        	System.out.println(s);
    	        }
    	        else
    	        {
    	        	System.out.println("Not found");
    	        }
    	        
    	        break;
    	        
    	    case 4:System.out.println(" enter name for search by name");
    	           String sname=sc.next();
    	           
    	           Studentinfo n=StudentService.findbyname(sname);
    	           
    	           if(n!=null) {
    	        	   System.out.println(n);
    	           }
    	           
    	           else {
    	        	   System.out.println("Not found");
    	           }
    	           	break; 
    	    
    	    case 5:System.out.println(" Enter id of student to calculate gpa");
    	           int id=sc.nextInt();
    	          
    	           Studentinfo c=StudentService.findById(id);
    	           if( c!=null)
    	        	   
    	           { 
    	          	  StudentService.Calculategpa(c);
    	           }
    	           else {
    	        	   System.out.println(" Student does not exitst...");
    	           }
    	           break;
    	           
    	    
    	    case 6:System.out.println("Exit .Thanks for coming.dont visit again.");
    	           break;
    	           
    	     default:
    	    	 System.out.println("Use your unused brain.......");
    	 
    	  }
    	 
      }while(choice!=6);
        
		
	}

}
