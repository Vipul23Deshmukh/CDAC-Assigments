package com.demo.dao;

import com.demo.beans.MyUser;

public interface LogInDao {

	MyUser checkuser(String uname, String pass);



	boolean insertdata(MyUser u);



	boolean Changepass(String uname, String pass);

}
