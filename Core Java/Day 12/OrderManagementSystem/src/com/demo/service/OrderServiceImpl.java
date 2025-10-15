package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderService {

	Scanner sc=new Scanner(System.in);
	
	private OrderDao odao;
	
	public OrderServiceImpl() {
		super();
		this.odao=new OrderDaoImpl();
	}

	@Override
	public boolean AddCustomer() {
		
		//Accept customer details
		System.out.println("enter customer id:");
		int cid=sc.nextInt();
		
		System.out.println("Enter customer name:");
		String cname=sc.next();
		
		sc.nextLine();
		System.out.println("Enter mobile no:");
		String mobno=sc.next();
		
		Customer c=new Customer(cid,cname,mobno);
		
		//Accept item details
		
		List<Items> lst=new ArrayList<>();
		
		String ans=null;
		do {
			System.out.println("enter item id");
			int iid=sc.nextInt();
			System.out.println("Enter item name ");
			String iname=sc.next();
			System.out.println("Enter item quantity");
			int qt=sc.nextInt();
			System.out.println("Enter price");
			double price=sc.nextDouble();
			
			
			Items it=new Items(iid,iname,qt,price);
			lst.add(it);
			
			System.out.println("Do you want to continue y/n...?");
			ans=sc.next();
		}while(ans.equals("y"));
		
		 return odao.save(c,lst);
		
		
		
		
		
		
		
	}

	@Override
	public Map<Customer, List<Items>> displayAll() {
		return odao.showAll();
	
		
	}

	@Override
	public Entry<Customer, List<Items>> displayByCustomer(int cid) {
		
		return odao.ShowByCustomer(cid);
	}

	@Override
	public boolean DeleteByCustomer(int cid) {
	
		return odao.DeleteByCid(cid);
	}

	@Override
	public boolean AddNewItem(int cid, Items items) {
		
		return odao.AddNewitems(cid,items);
	}

	@Override
	public boolean RemoveById(int rid, int iid) {
		
		return odao.RemoveItembyID(rid,iid);
	}

}
