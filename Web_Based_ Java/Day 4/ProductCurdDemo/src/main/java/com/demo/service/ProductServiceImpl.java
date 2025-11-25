package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;


public class ProductServiceImpl implements ProductService{

	
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		
		pdao = new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAllProduct() {
		
		return pdao.getAllProduct();
	}

	@Override
	public boolean addproduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.save(p);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return pdao.deleteById(id);
	}

	

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.FindById(pid);
	}

	@Override
	public boolean updateproduct(Product p) {
	
		return pdao.updateproduct(p);
	}

	

}
