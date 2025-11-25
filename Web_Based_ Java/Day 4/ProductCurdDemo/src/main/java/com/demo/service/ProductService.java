package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	

	List<Product> getAllProduct();

	boolean addproduct(Product p);

	boolean deleteById(int id);

	Product getById(int pid);

	boolean updateproduct(Product p);



}
