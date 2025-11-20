package com.demo.dao;

import com.demo.beans.EmployeeInfo;

public interface EmployeeDao {

	

	boolean save(EmployeeInfo e);

	boolean deleteEmp(int id);

	boolean UpdateByid(int id, int cr, double sal);

}
