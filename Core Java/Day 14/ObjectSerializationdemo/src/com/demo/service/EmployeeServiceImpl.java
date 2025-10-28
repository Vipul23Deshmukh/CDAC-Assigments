package com.demo.service;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements  EmployeeService {
  Scanner sc=new Scanner(System.in);

  private EmployeeDao edao;
  
public EmployeeServiceImpl() {
	super();
	this.edao=new EmployeeDaoImpl();
}

@Override
public void readFile(String fname) {

	edao.readFiles(fname);
}

@Override
public boolean addEmployee() {
	System.out.println(" enter emp id");
	int eid=sc.nextInt();
	
	System.out.println(" enter employee name");
	String ename=sc.next();
	
	System.out.println("enter designation :");
	String desg=sc.next();
	
	
	System.out.println(" enter salary:");
	double sal=sc.nextDouble();
	
	
	Employee e=new Employee(eid, ename, desg, sal);
	
	return edao.save(e);
  
  
  
}

@Override
public void writeToFile(String fname) {
	edao.writeData(fname);
	
}

@Override
public List<Employee> getAll() {
	
	return edao.DisplayAll();
}

@Override
public boolean modifyById(int id,double sal) {
	
	return edao.modifyById(id,sal);
}

@Override
public boolean deleteById(int id) {
	// TODO Auto-generated method stub
	return edao.deleteDataById(id);
}}
