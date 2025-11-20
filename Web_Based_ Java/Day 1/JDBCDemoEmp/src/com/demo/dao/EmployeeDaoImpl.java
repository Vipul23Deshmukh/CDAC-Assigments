package com.demo.dao;

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.demo.beans.EmployeeInfo;

public class EmployeeDaoImpl implements EmployeeDao {
	static Connection conn;
	static PreparedStatement insEmp,delEmp,updateEmp;
	static {
		
		conn=DBUtil.getMyConnection();
		try {
			insEmp=conn.prepareStatement("insert into Employee values (?,?,?,?,?)");
			delEmp=conn.prepareStatement("delete from employee where eid=?");
			updateEmp=conn.prepareStatement("update employee set credit=?,salary=? where eid=?");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


	@Override
	public boolean save(EmployeeInfo e) {
		
		
		try {
			insEmp.setInt(1, e.getEid());
			insEmp.setString(2, e.getEname());
			insEmp.setInt(3, e.getCredit());
			insEmp.setDouble(4, e.getSal());
			insEmp.setDate(5, java.sql.Date.valueOf(e.getLdt()));
			int n=insEmp.executeUpdate();
			return n>0;
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		return false;
		
	}


	@Override
	public boolean deleteEmp(int id) {
        try {
        	delEmp.setInt(1, id);
        	int n=delEmp.executeUpdate();
        	
        	if(n>0)
        	{
        		return true;
        	}
        	
        }catch(SQLException e)
        {
        	e.getMessage();
        }
		return false;
	}


	@Override
	public boolean UpdateByid(int id , int cr,double sal) {
		
		try {
			
			updateEmp.setInt(1, cr);
			updateEmp.setDouble(2, sal);
			updateEmp.setInt(3, id);
			
			
			int n=updateEmp.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
