package com.demo.beans;
import java.util.*;

public class Order {

	private  int orderid;
	private String oname;
	List<Product> plist;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, String oname, List<Product> plist) {
		super();
		this.orderid = orderid;
		this.oname = oname;
		this.plist = plist;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", oname=" + oname + ", plist=" + plist + "]";
	}
	
	
}
