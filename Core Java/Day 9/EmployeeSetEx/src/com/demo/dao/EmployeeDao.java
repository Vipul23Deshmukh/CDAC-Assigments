package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	

	boolean save(Employee e);

	Set<Employee> showData();

	Employee SearchById(int id);

	Set<Employee> SearchByName(String name);

	boolean ModifySalary(int id1, double sal1);

	boolean deleteDataById(int id);

	boolean deleteDataBySal(double sal3);

	Set<Employee> searchBySal(double sal4);

	Set<Employee> SortByUsingId();

	List<Employee> SortByEmpName();

	List<Employee> sortEmpSal();

}
