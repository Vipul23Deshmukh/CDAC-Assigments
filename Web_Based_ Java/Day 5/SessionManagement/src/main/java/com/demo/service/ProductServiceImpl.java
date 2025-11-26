package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	 private ProductDao pdao;
	 
	public ProductServiceImpl() {
		pdao=new ProductDaoImpl();
	}

	@Override
	public List<Integer> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.FindAllCategory();
	}

	@Override
	public List<Product> findByCategory(int cid) {
	
		return pdao.showByCategory(cid);
	}

	

}
