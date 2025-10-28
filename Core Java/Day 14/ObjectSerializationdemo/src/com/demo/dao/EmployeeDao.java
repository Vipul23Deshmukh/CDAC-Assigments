package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readFiles(String fname);

	boolean save(Employee e);

    void writeData(String fname);

	List<Employee> DisplayAll();

	boolean modifyById(int id, double sal);

	boolean deleteDataById(int id);

}
