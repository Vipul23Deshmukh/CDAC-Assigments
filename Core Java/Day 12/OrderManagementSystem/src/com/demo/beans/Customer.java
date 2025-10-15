package com.demo.beans;

import java.util.Objects;

public class Customer {

	private int cid;
	private String cname;
	private String mobno;
	
	public Customer(int cid, String cname, String mobno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobno = mobno;
	}
	public Customer(int cid) {
		super();
	   this.cid=cid;
	}



public int hashCode() {
	System.out.println("in hashcode "+cid);
	return cid; ///+cname.hashCode();
}

public boolean equals(Object obj) {
	System.out.println("in equals method "+this.cid+"-----"+((Customer)obj).cid);
	return this.cid==((Customer)obj).cid;
}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobno=" + mobno + "]";
	}
	
	
	
}
