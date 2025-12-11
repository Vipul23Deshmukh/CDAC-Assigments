package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean AddNewProduct();

	List<Product> findAllProduct();

	List<Product> displayByCategory(int cid);

	List<Product> displayById(int id);

	boolean deleteById(int id);

	boolean modifyById(int id, int qty, double price);

	List<Product> arrangeByPrice();

}
