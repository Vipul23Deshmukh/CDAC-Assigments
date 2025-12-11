package com.demo.beans;

public class Skill {
	
	private int skid;
	private String skname;
	private int Experience;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(int skid, String skname, int experience) {
		super();
		this.skid = skid;
		this.skname = skname;
		Experience = experience;
	}
	public int getSkid() {
		return skid;
	}
	public void setSkid(int skid) {
		this.skid = skid;
	}
	public String getSkname() {
		return skname;
	}
	public void setSkname(String skname) {
		this.skname = skname;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	@Override
	public String toString() {
		return "Skill [skid=" + skid + ", skname=" + skname + ", Experience=" + Experience + "]";
	}
	
	
	

}
