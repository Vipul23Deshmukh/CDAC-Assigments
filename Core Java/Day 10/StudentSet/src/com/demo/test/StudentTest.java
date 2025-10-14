package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.StudentInfo;
import com.demo.service.*;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		StudentService eservice=new StudentServiceImpl();
		do {
			System.out.println("1)Add Student Data \n2)Display All Students");
			System.out.println("3)Sort By Id \n4)Sort by name");
			
			
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				boolean status=eservice.addStudentData();
				if(status)
				{
					System.out.println(" student added successfully");
				}
				else
				{
					System.out.println("error");
				}
				
			}
			
			case 2->
			{
				Set<StudentInfo> set=eservice.displayAll();
				set.forEach(System.out::println);
				
			}
			}
		}while(choice!=9);
	}

}
