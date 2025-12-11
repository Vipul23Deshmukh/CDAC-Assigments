package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> displayall();

	boolean deletebyid(int id);

	boolean modifybysal(int id, double sal);

//	boolean AddProjectToEmployee(int eid, int pid);

	boolean ProjecttoEmployee(Employee e, Project p);

	Employee findById(int eid);

	List<Employee> sortBySalary();

}
