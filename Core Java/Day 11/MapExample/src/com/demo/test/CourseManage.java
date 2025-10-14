package com.demo.test;
import java.util.*;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;
public class CourseManage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		int choice=0;
		do {
			System.out.println("1. Add new Course\n 2. display all\n3. find by course name\n");
			System.out.println("4. modify course capacity\n 5. find by course capacity\n6. modify course name\n");
			System.out.println("7. display in sorted order of key\n 8. display  in sorted order of value\n");
			System.out.println("9. delete by course name\n10. delete by capacity\n 11.exit ");
			System.out.println("enter chice:");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				boolean status=cservice.AddCourse();
				if(status)
				{
					System.out.println("added successfully");
				}
				else {
					System.out.println("not added.");
				}}
			
				case 2->{
					Map<String,Integer> cmap=cservice.findAll();

					Set<Map.Entry<String,Integer>> ms=cmap.entrySet();
					ms.forEach(e->System.out.println(e.getKey()+"   "+e.getValue()));
				    
				}
				case 3->{
					System.out.println("Enter the courese name");
					String cname=sc.next();
					
					int capacity =cservice.FindByCname(cname);
					
					if (capacity!=-1) {
						
						System.out.println("Course Name:   "+ cname +"  "+ "Capacity"   +capacity);
					}
					
					else {
						System.out.println("Not found");
					}
				}
				
				case 4->{
					System.out.println("Enter course name");
					String cname=sc.next();
					
					
					System.out.println("Enter new Capacity");
					int newCapacity=sc.nextInt();
					
					boolean status1=cservice.ModifyByName(cname,newCapacity);
					
					if(status1) {
						System.out.println("Updated succcessfully");
					
					}
					
					else {
						System.err.println("Not upadated");
					}
				}
				
				case 5->{
				        System.out.println(" enter capacity");
				        int c=sc.nextInt();
				        
				        Set<String> cset=cservice.displayByCapacity(c);
				        
				        if(cset!=null)
				        {
				        	cset.forEach(System.out::println);
				        }
				        
			          	}
				case 6->{	System.out.println("Enter old course name");
				String oname=sc.next();
				System.out.println("Enter new course name");
				String nname=sc.next();
			
				boolean status2=cservice.UpdateCname(oname,nname);
				
				}
				
			
			}
			
		}while(choice!=10);
	}

}
