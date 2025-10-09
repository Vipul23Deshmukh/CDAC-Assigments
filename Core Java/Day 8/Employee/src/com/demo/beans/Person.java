package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	static int scount,vcount,ccount;
	
	static {
		scount=0;
		vcount=0;
		ccount=0;
		
		
	}
	
	private String id;
	private String name;
	private Date bdate;
	
	
	public Person() {
		id=generateId("s");
		name=null;
		bdate=null;
	}


	public Person(String emptype, String name, Date bdate) {
		
		id = generateId(emptype);
		this.name = name;
		this.bdate = bdate;
	}
	
	
	private String generateId(String emptype) {
		
		if(emptype.equals("s")) {
			scount++;
			return emptype+scount;
		}
		else if(emptype.equals("v")){
			vcount++;
			return emptype+vcount;
		}
		else if(emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}
	 
		return null;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String str=sdf.format(bdate);
		return "Person [id=" + id + ", name=" + name + ", bdate=" + bdate + "]";
	}
	
	
	
}
