package com.demo.dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.demo.beans.StudentInfo;

public class StudentDaoImpl implements StudentDao {
	
	 static Set<StudentInfo> sset;
	static{
		sset=new HashSet<>();
		sset.add(new StudentInfo(1,"Gita",50,60,70,LocalDate.of(2001,11,11)));
		sset.add(new StudentInfo(2,"Sita",80,90,70,LocalDate.of(2002,11,10)));
		sset.add(new StudentInfo(3,"Nita",70,70,70,LocalDate.of(2003,11,9)));
		sset.add(new StudentInfo(4,"Sima",80,50,80,LocalDate.of(2004,11,8)));

		
	
	}

	@Override
	public boolean save(StudentInfo s) {
		return sset.add(s);
		
	}

	@Override
	public Set<StudentInfo> showAll() {
		
		return sset;
	}

	}


