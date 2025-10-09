package com.demo.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import java.util.Date;

import com.demo.beans.FriendInfo;

public class FriendService {
	
	
	 static FriendInfo farr[];
	 
	  static int cnt;
	  
	  static {
		farr= new FriendInfo[10];
		
		farr[0]=new FriendInfo(1,"Shail","Sharma",1234567892,new Date(14/8/2025),"Xyz@gmail.com","Indian","Cricket","hocky");
		farr[1]=new FriendInfo(2,"vipul","deshmulha",1224567892,new Date(15/4/2028),"vipul@gmail.com","Indian","hockey");
       cnt=2;
	  }

	public static boolean AcceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter last name");
		String lname=sc.next();
		
		System.out.println("enter mobile no ");
		long mobno=sc.nextLong();
		

		System.out.println("enter Date ");
		String bdate=sc.next();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    Date dt=null;
	    try {
		 dt=sdf.parse(bdate);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	    System.out.println("enter email");
		String email=sc.next();
		
		sc.nextLine();
		System.out.println("enter address");
		String address=sc.nextLine();
		
		System.out.println("enter hobbies");
		String hobbies=sc.nextLine();
		String[] hobby = hobbies.split("[ ,]+"); 
		
		FriendInfo f=new FriendInfo(id,name,lname,mobno,dt,email,address,hobbies);
		if(cnt==farr.length)
		{
			return false;
		}
		else {
			farr[cnt]=f;
			cnt++;
		return true ;
		}
		
	}

	public static void DisplayFriend() {
		System.out.println("Friend Information");
		
		for(int i=0;i<cnt;i++)
		{
			System.out.println(farr[i]);
		}
		
	}

	

	public static FriendInfo Searchbyid(int id) {
		
		
		
		for(FriendInfo i: farr) {
			
			if (i!=null) {
				
				if (i.getId()==id) {
					return i;
				}
			}
		}
		return null;
	}

	public static FriendInfo SearchByName(String name) {
		for(FriendInfo j:farr) {
			if(j!=null) {
				if(j.getName().equals(name)) {
					return j;
				}
			}
		}
		return null;
	}

}
