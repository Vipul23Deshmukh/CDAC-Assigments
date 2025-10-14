package com.demo.service;
import java.security.DrbgParameters.Capability;
import java.util.*;
import java.util.Map.Entry;

import com.demo.dao.CourseDao;
import com.demo.dao.CoursedaoImpl;

public class CourseServiceImpl implements CourseService {

	
	private CourseDao cdao;
	
	
	public CourseServiceImpl() {
		super();
		this.cdao=new CoursedaoImpl();
	}


	@Override
	public boolean AddCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter course name:");
		String cname=sc.next();
		
		System.out.println("enter capacity");
		int capacity=sc.nextInt();
		
		
		return cdao.save(cname,capacity);
	}


	@Override
	public Map<String, Integer> findAll() {
	
		return cdao.showAll();
	}


	@Override
	public int FindByCname(String cname) {
		return cdao.SearchByName(cname);
		
	}


	@Override
	public boolean ModifyByName(String cname, int newCapacity) {
		
		return cdao.ModifyByName(cname,newCapacity);
	}


	@Override
	public Set<String> displayByCapacity(int c) {
		
		return cdao.showByCapacity(c);
	}


	@Override
	public boolean UpdateCname(String oname, String nname) {
		
		return cdao.ModifyCoursename(oname,nname);
	}


	@Override
	public Map<String, Integer> sortByNameKey() {
		// TODO Auto-generated method stub
		return cdao.ByNameKeySort();
	}


	@Override
	public Set<Entry<String, Integer>> sortByCapacity() {
		return cdao.ByCapacityKeysort();
	}


	@Override
	public boolean deleteByName(String cname) {
		return cdao.RemoveByName(cname);
	}


	@Override
	public boolean DeleteByCapacity(int cap) {
		
		return cdao.RemoveByCapacity(cap);
	}


	

}
