package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	private LocalDate dob;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	public Employee(int id) {
		super();
		this.id=id;
	}
	
	
	public int compareTo(Employee o) {
	    System.out.println("inside compare to"+this.id+" "+o.id);
		return this.id-o.id;
	}
	
	@Override
	public int hashCode() {
		//return Objects.hash(id);
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		
		
		System.out.println("In Equals method"+this.id+"----"+((Employee)obj).id);

		return this.id==((Employee)obj).id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
	
	
	
}
