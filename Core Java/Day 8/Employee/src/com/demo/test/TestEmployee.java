package com.demo.test;
import java.util.*;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
public class TestEmployee {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1)Salaried Employee");
		System.out.println("1)Contract Employee");
		
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		
		Employee e1=null;
		Employee e2=null;
		
		switch(choice)
		{
		case 1:
			e1= new SalariedEmp("sita",new Date(10/2/2025),"ux","designer",45000,2000);
			e2=new SalariedEmp("gita",new Date(11/2/2025),"ui","developer",55000,5000);
			;
			break;
			
		case 2:
			e1= new ContractEmp("nita",new Date(10/2/2025),"ux","designer",8,2000);
			e2=new ContractEmp("gita",new Date(11/2/2025),"ui","developer",8,5000);
			break;
		case 3:
			System.out.println("Thanks for visiting......");
			break;
			
			
			
		}
		
		System.out.println("net Sal= "+e1.calculateSal());
    	System.out.println("net Sal= "+e2.calculateSal());

	}

}
