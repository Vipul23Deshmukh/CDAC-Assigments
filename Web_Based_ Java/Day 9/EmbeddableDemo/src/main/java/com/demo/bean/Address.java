package com.demo.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	

	private  int id;
	private String Street;
	private String city;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String street, String city, String pincode) {
		super();
		this.id = id;
		Street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", Street=" + Street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
