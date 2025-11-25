package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getAllProduct();

	

	boolean save(Product p);



	boolean deleteById(int id);



	Product FindById(int pid);



	boolean updateproduct(Product p);

}
