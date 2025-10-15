package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Items;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class OrderManagementSystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		int choice=0;
		
		do {

				System.out.println("1. add new customer\n2. display all\n3. display by customer");
				System.out.println("4. delete customer\n5. add a new item in existing order");
				System.out.println("6. delete item from existing order\n7.exit");
				System.out.println("enter choice:");
				choice=sc.nextInt();
                 switch(choice) {
                 case 1->{
                	 boolean status=oservice.AddCustomer();
                	 if(status)
                	 {
                		 System.out.println("Customer added successfully...!!!");
                	 }
                	 else {
                		 System.out.println("Not added.....");
                	 }
                 }
                 
                 case 2->{
                	 Map<Customer, List<Items>> cmap=oservice.displayAll();
                	 Set<Customer> keys=cmap.keySet();
                	 keys.forEach(c->System.out.println(c+"----->"+cmap.get(c)));
                	 
                	 
                	 
                 }
                 
                 case 3->
                 {
                	 System.out.println("Enter customer id");
                	 int cid=sc.nextInt();
                	 
                	 Map.Entry<Customer, List<Items>> data=oservice.displayByCustomer(cid);
                	 if(data!=null)
                	 {
                		 System.out.println(data.getKey()+"   "+data.getValue());
                	 }
                	 
                	 
                 }
                 case 4->{
                	 System.out.println("enter customer id:");
                	 int cid=sc.nextInt();
                	 
                	 
                	 boolean status4=oservice.DeleteByCustomer(cid);
                	 
                	 if(status4)
                	 {
                		 System.out.println("deleted successfully");
                	 }
                	 else
                	 {
                		 System.out.println(" data is not deleted...");
                	 }
                 }
                 case 5->{
                	 
                	 
                	 System.out.println("enter customer id");
         			 int cid=sc.nextInt();
         			
                	 System.out.println("Enter the Iteam id");
                	 int id=sc.nextInt();
                	 
                	 System.out.println("Enter the name of new Iteam");
                	 String iname=sc.next();
                	 
                	 
                	 System.out.println("Enter the quantity of new Iteam");
                	 int qty=sc.nextInt();
                	 
                	 
                	 System.out.println("Enter the price of the new Iteam");
                	 double price=sc.nextDouble();
                	 
                	  
                	 
                	 boolean status5 =oservice. AddNewItem(cid,new Items(id,iname,qty,price));
                	 
                 

                	 if(status5)
                	 {
                		 System.out.println("Item added successfully");
                	 }
                	 else
                	 {
                		 System.out.println(" Item not added...............!!!!!!!!");
                	 }
                 }
                	 case 6->{
                		 System.out.println("Enter Customer id");
                		 int rid=sc.nextInt();
                		 
                		 
                		 System.out.println("Enter Item id");
                		 int iid=sc.nextInt();
                	
                	 
                	 boolean status6=oservice.RemoveById(rid,iid);
                	 
                	 if(status6) {
                		 System.out.println("Iteam Deleted Successfully");
                	 }
                	 else {
                		 System.out.println("Not deleted");
                	 }
                	 
                	 
                	 
                	 
                 }
                	 case 7->{
                		 System.out.println("Thank youu for visting");
                		 sc.close();
                	 }
                	 
                	 default->{
                		 System.out.println("Enter a Valid choice");
                	 }
               
                 }

	         }while(choice!=10);

}
}