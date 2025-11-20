package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

//import com.mysql.cj.jdbc.CallableStatement;

public class TestCallableStatement {

	public static void main(String[] args) {
		Connection conn=null;
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url="jdbc:mysql://192.168.10.117:3306/dac101?useSSL=false";
		conn=DriverManager.getConnection(url, "dac101", "welcome");
		
		if(conn!=null) {
			System.out.println("connection done");
		}
		else {
			System.out.println("not done");
		}
		
		
		CallableStatement cst=conn.prepareCall("call getcnt(?,?)");
		
		cst.setInt(1,10);
		cst.registerOutParameter(2, java.sql.Types.INTEGER);
		cst.execute();
		
		
		int cnt=cst.getInt(2);
		System.out.println("Count is "+cnt);
		
		
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}

}
