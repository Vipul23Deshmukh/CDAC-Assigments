package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="ProjectCurd101")
public class Project {
@Id
	private int pid;
	private String pname;
	private LocalDate hiredate;
	@ManyToMany(mappedBy = "pset")
	
	
	Set<Employee> eset;


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Project(int pid, String pname, LocalDate hiredate, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.hiredate = hiredate;
		this.eset = eset;
	}


	public Project(int pid, String pname, LocalDate hiredate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.hiredate = hiredate;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public LocalDate getHiredate() {
		return hiredate;
	}


	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}


	public Set<Employee> getEset() {
		return eset;
	}


	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}


	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", hiredate=" + hiredate + "]";
	}
	
}
