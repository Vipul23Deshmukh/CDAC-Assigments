package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	 void readFile(String fname);

	boolean addEmployee();

	void writeToFile(String string);

	List<Employee> getAll();

	boolean modifyById(int id, double sal);

	boolean deleteById(int id);

	

}
