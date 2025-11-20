package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.EmployeeInfo;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	Scanner sc= new Scanner(System.in);
	EmployeeDao edao;
	
	
	
	public EmployeeServiceImpl() {
	edao=new EmployeeDaoImpl();
	}



	@Override
	public boolean AddNewEmp() {
		System.out.println(" enter emp id:");
		int eid=sc.nextInt();
		
		System.out.println(" enter emp name:");
		String ename=sc.next();sc.nextLine();
		
		System.out.println(" enter emp credit:");
		int cr=sc.nextInt();
		
		System.out.println(" enter emp Salary:");
		Double sal=sc.nextDouble();
		
		System.out.println(" enter emp dob:");
		String date=sc.next();
		LocalDate ldt= LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		EmployeeInfo e=new EmployeeInfo(eid, ename, cr, sal, ldt);
		return edao.save(e);
	}



	@Override
	public boolean deleteEmployee(int id) {
		
		return edao.deleteEmp(id);
	}



	@Override
	public boolean ModifyByid(int id, int cr, double sal) {
	
		return edao.UpdateByid(id,cr,sal);
	}

}
