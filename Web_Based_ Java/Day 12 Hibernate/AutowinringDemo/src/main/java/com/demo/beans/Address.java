package com.demo.beans;

public class Address {
	
	private String Street;
	private String city;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String pincode) {
		super();
		Street = street;
		this.city = city;
		this.pincode = pincode;
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
		return "Address [Street=" + Street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	

}
