package com.demo.beans;
import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements BeanNameAware ,BeanFactoryAware,InitializingBean,DisposableBean{

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
	public void setBeanName(String name) {
		System.out.println(" in setbeanname");
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(" in setbeanfactory");
		
	}
	public void afterPropertiesSet() throws Exception {
		plist.forEach(System.out::println);
		
	}
	public void myinit() {
		System.out.println("in custom init myinit");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("in destroy of DisposableBean");
		
	}
	
	public void mydestroy() {
		System.out.println("in custom destroy mydestroy");
	}
	
}
