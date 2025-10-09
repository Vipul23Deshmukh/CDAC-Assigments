package com.demo.test;
import java.util.*;

import com.demo.beans.FriendInfo;
import com.demo.service.FriendService;
public class FriendTest {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);

    System.out.println("1)accept Details");
	System.out.println("2)Display all Friends");
	System.out.println("3)Search by id");
	System.out.println("4)Search by name");
   System.out.println("5)Display all friend with a particular hobby");
   System.out.println("6)Exit");
	  
	int choice;
	
	do {
	    System.out.println("Enter choice");
	    choice=s.nextInt();
		switch(choice)
		{
		case 1:FriendService.AcceptData();
		break;
		
		case 2:FriendService.DisplayFriend();
		break;
		
		
		case 3:
			System.out.println("Enter id to be ");
			 int id=s.nextInt();
			 
			 FriendInfo f=FriendService.Searchbyid(id);
			 
			if(f !=null)
			{
				System.out.println(f);
			}
			
			else {
				System.out.println("ID not found");
			}
			break;
			
		case 4:
			System.out.println("Enter the namer to be search");
			String name=s.next();
			
			
			FriendInfo fn=FriendService.SearchByName(name);
			if(fn !=null)
			{
				System.out.println(fn);
			}
			
			else {
				System.out.println("ID not found");
			}
			break;
		
		}
		
		
	}while(choice!=6);

}}
