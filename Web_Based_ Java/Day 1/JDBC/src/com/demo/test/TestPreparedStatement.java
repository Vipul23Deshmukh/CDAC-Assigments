package com.demo.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
public class TestPreparedStatement {

	public static void main(String[] args) {
	Connection conn=null;
	
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		String url="jdbc:mysql://192.168.10.117:3306/dac102?useSSL=false";
		
		conn=DriverManager.getConnection(url, "dac102", "welcome");
		PreparedStatement pst=conn.prepareStatement("select * from myproduct");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println("pid :"+rs.getInt("pid"));
			System.out.println("pname : "+rs.getString("pname"));
			System.out.println("prize : "+rs.getDouble("prize"));
			System.out.println("qty : "+rs.getInt("qty"));
			System.out.println("date : "+rs.getDate("date"));
			System.out.println("....................................................");
		}
		
		PreparedStatement pst1=conn.prepareStatement("insert into myproduct values (?,?,?,?,?)");
		
		int pid=10;
		String pname="sipra";
		double prize=3400;
		int qty=20;
		LocalDate date= LocalDate.of(2000, 9, 11);
		String sqlDate=date.toString();

		pst1.setInt(1, pid);
		pst1.setString(2, pname);
		pst1.setDouble(3, prize);
		pst1.setInt(4,qty );
		pst1.setString(5, sqlDate);
		
		int n=pst1.executeUpdate();
		
		if(n>0) {
			System.out.println("Data is inserted successfully");
		}
		
		else {
			System.out.println("Data not inserted ");
			
			
		}
		
	}catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}

}}
