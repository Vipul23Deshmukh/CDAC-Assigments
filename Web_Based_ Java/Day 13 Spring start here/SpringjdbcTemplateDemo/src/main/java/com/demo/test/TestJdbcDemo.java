package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJdbcDemo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService pservice=(ProductService) ctx.getBean("productServiceImpl");
		int choice=0;
		
		do {
			System.out.println("1.Add product");
			System.out.println("2.display all");
			System.out.println("3.display by category");
			System.out.println("4.display by pid");
			System.out.println("5.delete by pid");
			System.out.println("6.modify by id");
			System.out.println("7.arrange in sorted order");
			System.out.println("exit");
			System.out.println(" enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				boolean status=pservice.AddNewProduct();
				if(status)
				{
					System.out.println(" added successfully");
				}
				else
				{
					System.out.println(" not added");
				}
				
			}
			
			case 2->{
				List<Product> plist=pservice.findAllProduct();
				plist.forEach(System.out::println);
			}
			
			
			case 3->{
				
				System.out.println("enter category id");
				int cid=sc.nextInt();
				
				List<Product> plist2=pservice.displayByCategory(cid);
				plist2.forEach(System.out::println);
				
			}
			
			case 4->{
				System.out.println(" enter id of which data you want to see");
				int id=sc.nextInt();
				
				List<Product> plist3=pservice.displayById(id);
				plist3.forEach(System.out::println);
				
			}
			
			case 5->{
				System.out.println(" enter id to delete data");
				int id=sc.nextInt();
				boolean status2=pservice.deleteById(id);
				
				if(status2)
				{
					System.out.println(" deleted successfully");
				}
				else
				{
					System.out.println(" not deleted");
				}
			}
			
			case 6->{
				System.out.println(" enter id for modification of data");
				int id=sc.nextInt();
				
				System.out.println(" enter new quantity");
				int qty=sc.nextInt();
				
				System.out.println(" enter new price");
				double price=sc.nextDouble();
				
				boolean status6=pservice.modifyById(id,qty,price);
				if(status6)
				{
					System.out.println(" modified successfully");
				}
				else
				{
					System.out.println(" not modified");
				}
			}
			
			case 7->{
				List<Product> plist7=pservice.arrangeByPrice();
				plist7.forEach(System.out::println);
				
			}
			}
			
			
		}while(choice!=8);

	}

}
