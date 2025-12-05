package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
   @Id
   
	private int facultyid;
	private String facultyname;
	private String Fskill;
	public Faculty() {
		super();
	}
	public Faculty(int facultyid, String facultyname, String fskill) {
		super();
		this.facultyid = facultyid;
		this.facultyname = facultyname;
		Fskill = fskill;
	}
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public String getFskill() {
		return Fskill;
	}
	public void setFskill(String fskill) {
		Fskill = fskill;
	}
	@Override
	public String toString() {
		return "Faculty [facultyid=" + facultyid + ", facultyname=" + facultyname + ", Fskill=" + Fskill + "]";
	}
	
	
}
