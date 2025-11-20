package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;


public class TestCreateStatement {

	public static void main(String[] args) {
	   
		Connection conn=null;
	   try {
		  DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 String url="jdbc:mysql://192.168.10.117:3306/dac102?useSSL=false";
		 conn=DriverManager.getConnection(url, "dac102", "welcome");
		 
		 if(conn!=null)
		 {
			 System.out.println("connection done");
		 }
		 else
		 {
			 System.out.println("connection not done");
		 }
		 
		 //step 3
		 
		 Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from myproduct"); 
	   while(rs.next()) {
		   
		   System.out.println("pid: "+rs.getInt(1));
		   System.out.println("pname: "+rs.getString(2));
		   System.out.println("qty: "+rs.getInt(3));
		   System.out.println("price: "+rs.getDouble(4));
		   
		   System.out.println("-------------------------------");
	   }
	   
	   int pid=123;
	   String pname="xxx";
	   Double price=1200.0;
	   int qty=20;
	   
	   String query="insert into myproduct value("+pid+",'"+pname+"',"+price+","+qty+")";
	   System.out.println(query);
	   int n=st.executeUpdate(query);
	   
	   if(n>0)
	   {
		   System.out.println("inserted successfully");
	   }
	   
	   else
	   {
		   System.out.println("not inserted");
	   }
	   }
	   catch(SQLException e)
	   {
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
