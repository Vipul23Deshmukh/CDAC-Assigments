package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")

public class Course {

	@Id
	@GeneratedValue
	private int cid;
	private String course;
	private int duration;
	private int facultyid;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(String course, int duration, int facultyid) {
		super();
		this.course = course;
		this.duration = duration;
		this.facultyid = facultyid;
	}

	public Course(int cid, String course, int duration, int facultyid) {
		super();
		this.cid = cid;
		this.course = course;
		this.duration = duration;
		this.facultyid = facultyid;
	}
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = cid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", course=" + course + ", duration=" + duration + ", facultyid=" + facultyid + "]";
	}
	
	
	
}
