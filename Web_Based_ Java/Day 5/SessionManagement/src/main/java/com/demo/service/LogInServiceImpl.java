package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LogInDao;
import com.demo.dao.LogInDaoImpl;

public class LogInServiceImpl  implements LogInService{

	private  LogInDao ldao;
	
	public LogInServiceImpl(){
		
		ldao=new LogInDaoImpl();
	}
	@Override
	public MyUser validateUser(String uname, String pass) {
		
		return ldao.checkuser(uname,pass);
	}
	@Override
	public boolean adddata(MyUser u) {
		
		return ldao.insertdata(u);
	}
	@Override
	public boolean Changepass(String uname, String pass) {
		
		return ldao.Changepass(uname,pass);
	}
}