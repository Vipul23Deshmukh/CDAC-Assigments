package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	  private EmployeeDao edao;
	   private ProjectDao pdao;
	   
	   

	public EmployeeServiceImpl() {
	
		super();
		this.edao=new EmployeeDaoImpl();
		this.pdao= new ProjectDaoImpl();
		
		
	}



	public boolean AddNewEmployee() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		int eid=sc.nextInt();
		
		
		System.out.println(" enter emp name");
		String ename=sc.next();
		sc.nextLine();
		
		System.out.println(" enter hiredate");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		sc.nextLine();
		
		
		System.out.println(" enter salary");
		Double sal=sc.nextDouble();
		
		System.out.println(" enter project id");
		String pid=sc.next();
		
		
		String []parr=pid.split(",");
		Set<Project> pset=pdao.findByPid(parr);
			
		Employee e=new Employee(eid, ename, ldt, eid, pset);
		
		return edao.save(e);
	}



	@Override
	public List<Employee> showall() {
		return edao.displayall();
	}



	@Override
	public boolean deleteEmployee(int id) {
	
		return edao.deletebyid(id);
	}



	@Override
	public boolean modifySal(int id, double sal) {
		
		return edao.modifybysal(id,sal);
	}






	@Override
	public boolean ProjecttoEmployee(int eid, int pid) {
		Employee e=edao.findById(eid);
		Project p=pdao.findById(pid);
		if(e!=null && p!=null) {
			return edao.ProjecttoEmployee(e,p);
		}
		return false;
	}



	@Override
	public List<Employee> SortEmployeeBySalary() {
		// TODO Auto-generated method stub
		return edao.sortBySalary();
	}



}
