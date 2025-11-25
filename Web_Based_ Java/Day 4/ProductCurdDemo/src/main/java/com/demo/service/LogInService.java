package com.demo.service;

import com.demo.beans.MyUser;

public interface LogInService {

	MyUser validateUser(String uname, String pass);

	boolean adddata(MyUser u);

}
