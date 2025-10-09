package com.demo.test;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

import com.demo.beans.ContractEmp;
import com.demo.beans.SalariedEmp;

public class Testperson {

	public static void main(String[] args) {
		
		SalariedEmp s=new SalariedEmp("vpiul",new Date(15/8/1919),"Devlopment","Product owner",500,5);
		SalariedEmp s1=new SalariedEmp("syugoa",new Date(20/5/2004),"Tester","Testing",45000,541233);
		
		
		
		ContractEmp c=new ContractEmp("sumit",new Date(9/12/1887),"Hacker","Advance cybers ecurity",12,5000000);
		ContractEmp c1=new ContractEmp("tushar",new Date(16/01/1777),"scrum master","Agile development",15,78000);
System.out.println(s);
System.out.println(s1);
System.out.println(c);
System.out.println(c1);
	}

}
