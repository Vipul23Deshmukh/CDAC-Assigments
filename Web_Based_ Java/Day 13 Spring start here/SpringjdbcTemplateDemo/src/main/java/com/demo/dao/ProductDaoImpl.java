package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public boolean save(Product p) {
		
		int n=jdbcTemplate.update("insert into product values(?,?,?,?,?,?)",
				
				new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid()});
		return n>0;
	}
	
	
	@Override
	public List<Product> showAll() {
		
		List<Product> plist=jdbcTemplate.query("select * from product", (rs,n)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQty(rs.getInt(4));
			if(rs.getDate(5)==null) {
				p.setMfgdate(null);
			}else {
			   p.setMfgdate(rs.getDate(5).toLocalDate());
			}
			p.setCid(rs.getInt(6));
			
			return p;
		});
		return plist;
	}


	@Override
	public List<Product> findByCat(int cid) {
		List<Product> plist2=jdbcTemplate.query("select * from Product where cid=?", 
			new Object[] {cid},(rs,numrows)->{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getDouble(4));
				p.setMfgdate(rs.getDate(5).toLocalDate());
				p.setCid(rs.getInt(6));
				
				return p;
			});
		return plist2;
	}


	@Override
	public List<Product> searchById(int id) {
		List<Product> plist2=jdbcTemplate.query("select * from Product where pid=?", 
				new Object[] {id},(rs,numrows)->{
					Product p=new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setQty(rs.getInt(3));
					p.setPrice(rs.getDouble(4));
					p.setMfgdate(rs.getDate(5).toLocalDate());
					p.setCid(rs.getInt(6));
					
					return p;
				});
			return plist2;
	}


	@Override
	public boolean removeById(int id) {
		int n=jdbcTemplate.update("delete from Product where pid=?",new Object[] {id});
		return n>0;
	}


	@Override
	public boolean modify(int id, int qty, double price) {
	 
		int n=jdbcTemplate.update(" update Product set qty=?,price=? where pid=?",new Object[] {qty,price,id});
		
		return n>0;
	}


	@Override
	public List<Product> sortByPrice() {
		List<Product> plist7=jdbcTemplate.query("select * from Product order by price",(rs,numrows)->{
			
			Product p=new Product();
			
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p;
		});
		return plist7;
	}

}
