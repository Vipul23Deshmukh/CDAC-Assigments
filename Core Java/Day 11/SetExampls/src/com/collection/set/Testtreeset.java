package com.collection.set;
import java.util.*;
public class Testtreeset {

	public static void main(String[] args) {
		
		Set<Integer> tset=new TreeSet<>();
		
		tset.add(20);
		tset.add(40);
		tset.add(50);
		
		System.out.println(tset);

		
		
		for(Integer num:tset) {
			
			System.out.println(num);
	
		}
Iterator<Integer> it=tset.iterator();

while (it.hasNext()) {
	
	Integer num=it.next();
	if(num==50) {
		System.out.println("Deleted suvccessfully");
		it.remove();
		
	}
	System.out.println(num);
}
tset.forEach(System.out::print);
	}
	
	
	

}
