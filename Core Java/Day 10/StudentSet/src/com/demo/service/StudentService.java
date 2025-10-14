package com.demo.service;

import java.util.Set;

import com.demo.beans.StudentInfo;

public interface StudentService {

	boolean addStudentData();

	Set<StudentInfo> displayAll();

}
