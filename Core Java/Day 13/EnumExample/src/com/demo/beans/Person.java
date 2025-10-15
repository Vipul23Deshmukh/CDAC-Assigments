package com.demo.beans;

import com.demo.enums.Gender;

public class Person {

 private int id;
 private String name;
 private Gender gender;
 @Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
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
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public Person(int id, String name, Gender gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}
