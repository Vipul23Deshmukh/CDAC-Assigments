package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean AddNewEmployee();

	List<Employee> showall();

	boolean deleteEmployee(int id);

	boolean modifySal(int id, double sal);

	boolean ProjecttoEmployee(int eid, int pid);

	List<Employee> SortEmployeeBySalary();

}
