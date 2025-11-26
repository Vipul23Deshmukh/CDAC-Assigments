package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LogInDaoImpl implements LogInDao {

	static Connection conn=null;
	static PreparedStatement seluser ,insertdata,changepass;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			seluser=conn.prepareStatement("select Username ,Password,Emailid,gender,DOB from `user` where Username=? and Password=?");
			insertdata=conn.prepareStatement("insert into `user`(Username, Password, Emailid, Gender, DOB) values(?,?,?,?,?)");
            changepass=conn.prepareStatement("update `user` set Password=? where Username=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public MyUser checkuser(String uname, String pass) {
	
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next())
			{
			 MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5).toLocalDate());
			 return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean insertdata(MyUser u) {
		
		try {
			insertdata.setString(1, u.getUsername());
			insertdata.setString(2, u.getPassword());
			insertdata.setString(3, u.getEmailid());
			insertdata.setString(4, u.getgender());
			insertdata.setDate(5, java.sql.Date.valueOf(u.getDOB()));
			
			int n=insertdata.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean Changepass(String uname, String pass) {
		
		try {
			changepass.setString(1, pass);
			changepass.setString(2, uname);
			int n=changepass.executeUpdate();
			return  n>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


}
