package com.beans;

public class Course {
	private int cid;
	private String coursename;
	private int duration;
	private String faculty;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String coursename, int duration, String faculty) {
		super();
		this.cid = cid;
		this.coursename = coursename;
		this.duration = duration;
		this.faculty = faculty;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + ", duration=" + duration + ", faculty=" + faculty
				+ "]";
	}
	
	
	

}
