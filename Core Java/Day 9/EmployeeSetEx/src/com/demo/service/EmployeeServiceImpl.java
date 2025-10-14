package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.beans.*;
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		super();
		this.edao=new EmployeeDaoImpl();
	}


	@Override
	public boolean addNewEmployee() {
		
		Scanner s=new  Scanner(System.in);
		
		System.out.println("enter employee id:");
		int id=s.nextInt();
		
		System.out.println("enter employee name:");
		String name=s.next();
		
		System.out.println("enter salary:");
		double sal=s.nextDouble();
		
		System.out.println("enter birth date:");
		String bd=s.next();
		 LocalDate ldt=LocalDate.parse(bd,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 
		Employee e=new Employee(id,name,sal,ldt);
		
		return edao.save(e);
	}


	@Override
	public Set<Employee> displayAll() {
		
		return edao.showData();
	}


	@Override
	public Employee FindById(int id) {
		
		return edao.SearchById(id);
	}


	@Override
	public Set<Employee> FindByName(String name) {
		
		return edao.SearchByName(name);
	}


	@Override
	public boolean UpdateSalary(int id1, double sal1) {
		
		return edao.ModifySalary(id1,sal1);
	}


	@Override
	public boolean deleteById(int id) {
		
		return edao.deleteDataById(id);
	}


	@Override
	public boolean DeleteBySalary(double sal3) {
		return edao.deleteDataBySal(sal3);
		
	}


	@Override
	public Set<Employee> findBySal(double sal4) {
		// TODO Auto-generated method stub
		return edao.searchBySal(sal4);
	}


	@Override
	public Set<Employee> SortById() {
		return  edao.SortByUsingId();
	}


	@Override
	public List<Employee> SortByName() {
		return edao.SortByEmpName();
		
	}


	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortEmpSal();
	}

}
