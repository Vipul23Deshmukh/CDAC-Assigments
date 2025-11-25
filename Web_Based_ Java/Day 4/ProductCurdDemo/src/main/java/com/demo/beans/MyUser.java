package com.demo.beans;

import java.time.LocalDate;

public class MyUser {
private String Username;
private String Password;
private String Emailid;

private String gender;
private LocalDate DOB;
public MyUser() {
	super();
	// TODO Auto-generated constructor stub
}
public MyUser(String username, String password, String emailid, String gender, LocalDate dOB) {
	super();
	Username = username;
	Password = password;
	Emailid = emailid;
	gender = gender;
	DOB = dOB;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public String getgender() {
	return gender;
}
public void setgender(String gender) {
	gender = gender;
}
public LocalDate getDOB() {
	return DOB;
}
public void setDOB(LocalDate dOB) {
	DOB = dOB;
}
@Override
public String toString() {
	return "MyUser [Username=" + Username + ", Password=" + Password + ", Emailid=" + Emailid + ", Gender=" + gender
			+ ", DOB=" + DOB + "]";
}

}
