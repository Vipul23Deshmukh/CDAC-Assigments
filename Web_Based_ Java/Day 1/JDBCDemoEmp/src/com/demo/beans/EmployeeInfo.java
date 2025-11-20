package com.demo.beans;

import java.time.LocalDate;

public class EmployeeInfo {
	private int eid;
	private String ename;
	private int credit;
	private double sal;
	private LocalDate ldt;
	
	public EmployeeInfo() {
		super();
		
	}

	public EmployeeInfo(int eid, String ename, int credit, double sal, LocalDate ldt) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.credit = credit;
		this.sal = sal;
		this.ldt = ldt;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public LocalDate getLdt() {
		return ldt;
	}

	public void setLdt(LocalDate ldt) {
		this.ldt = ldt;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [eid=" + eid + ", ename=" + ename + ", credit=" + credit + ", sal=" + sal + ", ldt=" + ldt
				+ "]";
	}
	
	

}
