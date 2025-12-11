package com.demo.beans;

public class Faculty {
	
	private int fid;
	private String fname;
	private Skill sskill;
	private Address add;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int fid, String fname, Skill sskill, Address add) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.sskill = sskill;
		this.add = add;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Skill getSskill() {
		return sskill;
	}
	public void setSskill(Skill sskill) {
		this.sskill = sskill;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", sskill=" + sskill + ", add=" + add + "]";
	}
	
	
	
	
	

}
