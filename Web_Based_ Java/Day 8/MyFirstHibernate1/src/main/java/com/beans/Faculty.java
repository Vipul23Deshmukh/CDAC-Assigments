package com.beans;

public class Faculty {

	private String faculty;
	private String skill;
	private int mobno;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(String faculty, String skill, int mobno) {
		super();
		this.faculty = faculty;
		this.skill = skill;
		this.mobno = mobno;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Faculty [faculty=" + faculty + ", skill=" + skill + ", mobno=" + mobno + "]";
	}
	
	
}
