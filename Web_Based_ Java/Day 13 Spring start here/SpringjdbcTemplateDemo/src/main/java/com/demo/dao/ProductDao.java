package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> showAll();



	List<Product> findByCat(int cid);

	List<Product> searchById(int id);

	boolean removeById(int id);

	boolean modify(int id, int qty, double price);

	List<Product> sortByPrice();

}
