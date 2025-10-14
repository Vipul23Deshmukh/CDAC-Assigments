package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee FindById(int id);

	Set<Employee> FindByName(String name);

	boolean UpdateSalary(int id1, double sal1);

	boolean deleteById(int id);

	boolean DeleteBySalary(double sal3);

	Set<Employee> findBySal(double sal4);

	Set<Employee> SortById();

	List<Employee> SortByName();

	List<Employee> sortBySal();

}
