package com.demo.dao;

import java.util.Set;

import com.demo.beans.StudentInfo;

public interface StudentDao {

	boolean save(StudentInfo s);

	Set<StudentInfo> showAll();


	

}
