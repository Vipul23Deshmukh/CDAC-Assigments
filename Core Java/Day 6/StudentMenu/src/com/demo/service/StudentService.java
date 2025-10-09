package com.demo.service;
import java.util.*;
import com.demo.beans.Studentinfo;

public class StudentService {

	
	static Studentinfo std[];
	
	static int cnt;
	static {
		
		std=new Studentinfo[50];
	     std[0]=new Studentinfo(1,"sita",80,80,90);
	     std[1]=new Studentinfo(2,"gita",90,80,70);
	     std[2]=new Studentinfo(3,"nita",80,70,90);
		
		cnt=3;
		
	}
	
	public static boolean AcceptDetails() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the name of  student:");
		String name=sc.next();
		
		
		System.out.println("Enter marks for M1");
		int M1=sc.nextInt();
		
		System.out.println("Enter marks for M2");
		int M2=sc.nextInt();
		
		System.out.println("Enter marks for M3");
		int M3=sc.nextInt();
		
		Studentinfo s=new Studentinfo(id,name,M1,M2,M3);
		
		
		if(cnt==std.length) {
		return false;}
		
		else {
			std[cnt]=s;
			cnt++;
		
			return true;
		}
		
		
		
	}

	public static void DisplayData() {
		System.out.println("Student Information");
		
		for(int i=0;i<cnt;i++)
		{
			System.out.println(std[i]);
		}
		
	}

	public static Studentinfo findById(int sid) {
		
		for(Studentinfo a:std)
		{
			if(a!=null)
			{
				if(a.getId()==sid)
				
					return a;
				
				
			}
		}
	   return null;	
	}

	public static Studentinfo findbyname(String sname) {
		
		
		for(Studentinfo i:std) {
			if(i!=null)
			{
				if(i.getName().equals(sname)) {
					return i;
				}
			}
		}
		return null;
	}

	public static void Calculategpa(Studentinfo s) {
		
		//Studentinfo s=new Studentinfo();
		
		float gpa = 0.0f;
		
		
		 gpa=(1/3f)*s.getM1()+(1/2f)*s.getM2()+(1/4f)*s.getM3();
		
		
		
		System.out.println(" Gpa of student = "+ gpa);
		
		
	}
	

}
