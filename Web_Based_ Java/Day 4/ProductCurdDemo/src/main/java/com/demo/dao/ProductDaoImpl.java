package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;
import com.mysql.cj.protocol.Resultset;

public class ProductDaoImpl implements ProductDao {

	static Connection conn=null;
	static PreparedStatement getall,insproduct,delebyid,getById,updateproduct;
	static {
		conn=DBUtil.getMyConnection();
		try {
			getall=conn.prepareStatement("select * from product1");
			insproduct=conn.prepareStatement("insert into product1 values(?,?,?,?,?,?)");
			delebyid=conn.prepareStatement("delete from product1 where pid=?");
			getById=conn.prepareStatement("select * from product1 where pid=?");
			updateproduct=conn.prepareStatement("update product1 set pname=?,qty=?,price=?,expdate=?,cid=? where pid=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Product> getAllProduct() {
	
		List<Product> plist=new ArrayList<>();
		
		try {
			ResultSet rs=getall.executeQuery();
			
			while(rs.next())
			{
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6)));
			}
			
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	@Override
	public boolean save(Product p) {
		
		try {
			insproduct.setInt(1, p.getPid());
			insproduct.setString(2, p.getPname());
			insproduct.setInt(3, p.getQty());
			insproduct.setDouble(4, p.getPrice());
			insproduct.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			insproduct.setInt(6, p.getCid());
			
			int n=insproduct.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public boolean deleteById(int id) {
		
		try {
			delebyid.setInt(1, id);
			int n=delebyid.executeUpdate();
			
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public Product FindById(int pid) {
		
		try {
			getById.setInt(1, pid);
			ResultSet rs=getById.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	@Override
	public boolean updateproduct(Product p) {
		
		try {
			updateproduct.setString(1, p.getPname());
			updateproduct.setInt(2, p.getQty());
			updateproduct.setDouble(3, p.getPrice());
			updateproduct.setDate(4, java.sql.Date.valueOf(p.getExpdate()));
			updateproduct.setInt(5, p.getCid());
			updateproduct.setInt(6, p.getPid());
			int n=updateproduct.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
