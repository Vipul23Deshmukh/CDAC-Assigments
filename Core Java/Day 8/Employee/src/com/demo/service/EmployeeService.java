package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeService {

	static Employee emp[];
	static int  count;
	 static {
		 emp=new Employee[100];
		 emp[0]=new SalariedEmp("sita",new Date(10/2/2025),"ux","designer",45000,2000);
		 emp[1]=new SalariedEmp("gita",new Date(11/2/2025),"ui","developer",55000,5000);
		 
		 emp[2]=new ContractEmp("nita",new Date(10/2/2025),"ux","designer",8,2000);
		 emp[3]=new ContractEmp("rita",new Date(11/2/2025),"ui","developer",8,5000);
		 count=4;
	 }
	
	
	public static boolean addEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		if(count<emp.length)
		{
			System.out.println("Enter name");
		    String nm=sc.next();
		    System.out.println("enter birth date(dd/MM/yyyy)");
		    String bdate=sc.next();
		    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		    Date dt=null;
		    try {
			 dt=sdf.parse(bdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("enter department");
		    String dept=sc.next();
		    sc.nextLine();
		    System.out.println("enter designation");
		    String desg=sc.next();
		    
		    
		    if(ch==1)
		    {
		    	System.out.println("enter salary");
		    	double sal=sc.nextDouble();
		    	

		    	System.out.println("enter sbonus");
		    	double bonus=sc.nextDouble();
		    	
		    	emp[count]=new SalariedEmp(nm,dt,dept,desg,sal,bonus);
		    	count++;
		    }
		    else if(ch==2)
		    {
		    	System.out.println("enter hours");
		    	float hrs=sc.nextFloat();
		    	System.out.println("enetr charges");
		    	double charges=sc.nextDouble();
		    	
		    	emp[count]=new ContractEmp(nm,dt,dept,desg,hrs,charges);
		    	
		    	count++;
		    }
		    else {
		    	
		    }
		    return true;
		}
		
		return false;
	}


	public static void displayAll() {
	
		for(Employee e:emp) {
			if(e!=null)
				System.out.println(e);
		}
		
	
	
	}


	public static void displayOnlySalariedEmployee() {
		
		for(Employee e:emp) {
			if(e!=null && e instanceof SalariedEmp)
				System.out.println(e);
		}
	}


	public static void displayOnlyContractEmployee() {
		// TODO Auto-generated method stub
		for(Employee e: emp) {
			if(e!=null && e instanceof ContractEmp) {
				System.out.println(e);
			}
		}
		
	}


	public static Employee SearchByID(String id) {
		for(Employee e: emp) {
			if(e!=null )
			{
				if(e.getId().equals(id))
					return e;
			}
		
		}
	
		return null;
	}


	public static Employee SearchByName(String name) {
		for(Employee e:emp)
		{
			if(e!=null)
			{
				if(e.getName().equals(name))
					return e;
			}
		}
		return null;
	}


	/**
	 * @param id
	 * @param change
	 * @return
	 */
	public static boolean ModifybyId(String id, double change) {
		Employee e=SearchByID(id);
		if(e!=null)
		{
			if(e instanceof SalariedEmp)
			{
				((SalariedEmp)e).setSal(change);
			}
			
			if(e instanceof ContractEmp)
			{
				((ContractEmp)e).setCharges(change);
			}
			return true;
		}
		
		return false;
	}
	

}
