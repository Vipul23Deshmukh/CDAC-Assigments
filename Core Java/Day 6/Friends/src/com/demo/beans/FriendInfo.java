package com.demo.beans;

import java.util.Arrays;
import java.util.Date;

public class FriendInfo {
	private int id;
	private String name;
	private String lastname;
	private long mobno;
	private Date dob;
	private String email;
	private String address;
	private String hobbies[];
	
	
	
	public FriendInfo(int id, String name, String lastname, long mobno, Date dob, String email, String address,
			String...hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mobno = mobno;
		this.dob = dob;
		this.email = email;
		this.address = address;
		this.hobbies = hobbies;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public FriendInfo() {
		super();
	}

	
	@Override
	public String toString() {
		return "FriendInfo [id=" + id + ", name=" + name + ", lastname=" + lastname + ", mobno="
				+ (mobno) + ", dob=" + dob + ", email=" + email + ", address=" + address + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}

}
