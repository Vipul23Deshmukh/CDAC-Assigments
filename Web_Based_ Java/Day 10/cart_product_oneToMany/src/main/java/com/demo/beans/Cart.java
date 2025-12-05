package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
    @Id
	private int cartid;
	private String cname;
	
	@OneToMany(mappedBy="cart")
	
	Set <Product> pset=new HashSet<Product>();

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartid, String cname, Set<Product> pset) {
		super();
		this.cartid = cartid;
		this.cname = cname;
		this.pset = pset;
	}

	public Cart(int cartid, String cname) {
		super();
		this.cartid = cartid;
		this.cname = cname;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Product> getPset() {
		return pset;
	}

	public void setPset(Set<Product> pset) {
		this.pset = pset;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", cname=" + cname + ", pset=" + pset + "]";
	}
	
	
}
