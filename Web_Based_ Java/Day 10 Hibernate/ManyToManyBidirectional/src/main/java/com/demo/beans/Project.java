package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name="projectemp")
public class Project {

	@Id
	private int pid;
	private String pname;
	private LocalDate stardate;
	
	@ManyToMany(mappedBy="pset",cascade=CascadeType.ALL)
	
	Set<Employee> eset;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, LocalDate stardate, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.stardate = stardate;
		this.eset = eset;
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

	public LocalDate getStardate() {
		return stardate;
	}

	public void setStardate(LocalDate stardate) {
		this.stardate = stardate;
	}

	public Set<Employee> getEset() {
		return eset;
	}

	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", stardate=" + stardate + ", eset=" + eset + "]";
	}
	
	
}
