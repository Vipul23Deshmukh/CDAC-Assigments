package com.collection.set;
import java.util.*;
public class TestHashset {

	public static void main(String[] args) {
		Set<Integer> hset=new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(10);
		hset.add(5);
		
		//print using foreach loop
		//while using foreach loop dont change length
		System.out.println("print hashsetdata");
		for(Integer n:hset) {
			System.out.println(n);
			
			
		//print using itearator
			System.out.println("print hashset data using iiterator");
			Iterator<Integer> it=hset.iterator();
			while(it.hasNext())
			{
				Integer ob=it.next();
				System.out.println(ob);
			}
			
			System.out.println("print using for each loop");
			hset.forEach(System.out::println);
		}
	}

}
