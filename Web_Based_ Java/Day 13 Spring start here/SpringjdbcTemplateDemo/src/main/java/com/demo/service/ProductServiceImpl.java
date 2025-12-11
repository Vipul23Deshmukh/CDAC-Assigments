package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	@Override
	public boolean AddNewProduct() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter pid");
		int pid=sc.nextInt();
		
		System.out.println("enter pname");
		String pname=sc.next();
		
		System.out.println(" enter qty");
		int qty=sc.nextInt();
		
		System.out.println(" enter price");
		double price=sc.nextDouble();
		
		System.out.println(" enter manufacturing date");
		String dt=sc.next();
		
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(" enter cid");
		int cid=sc.nextInt();
		
		Product p=new Product(pid, pname, qty, price, ldt, cid);
		
		return pdao.save(p);
	}
	@Override
	public List<Product> findAllProduct() {
		
		return pdao.showAll();
	}
	@Override
	public List<Product> displayByCategory(int cid) {
		
		return pdao.findByCat(cid);
	}
	@Override
	public List<Product> displayById(int id) {
		
		return pdao.searchById(id);
	}
	@Override
	public boolean deleteById(int id) {
		
		return pdao.removeById(id);
	}
	@Override
	public boolean modifyById(int id, int qty, double price) {
		// TODO Auto-generated method stub
		return pdao.modify(id,qty,price);
	}
	@Override
	public List<Product> arrangeByPrice() {
		// TODO Auto-generated method stub
		return pdao.sortByPrice();
	}
	

}
