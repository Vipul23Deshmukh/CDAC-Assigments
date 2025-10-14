package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.StudentInfo;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements  StudentService{
	
	private StudentDao edao;
	
	
	public StudentServiceImpl() {
		super();
		this.edao=new StudentDaoImpl();
	}
	
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean addStudentData() {
		
		System.out.println("enter student id");
		int id=sc.nextInt();
		
		System.out.println("enter student name:");
		String name=sc.next();
		
		System.out.println("enter m1:");
		int m1=sc.nextInt();
		
		System.out.println("enter m2:");
		int m2=sc.nextInt();
		
		System.out.println("enter m3:");
		int m3=sc.nextInt();
		
		
		System.out.println("enter birth date:");
		String bdt=sc.next();
		
		LocalDate ldt=LocalDate.parse(bdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		StudentInfo s=new StudentInfo(id, name, m1, m2, m3, ldt);
		return edao.save(s);
	}
	@Override
	public Set<StudentInfo> displayAll() {
		
		return edao.showAll();
	}

}
