package com.demo.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TetCollections {

	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(1,2,3,4,5,6,7,8,9,8,7);
		
		System.out.println(lst);
		System.out.println(" Maximum number :"+Collections.max(lst));
		System.out.println(" minimum number :"+Collections.min(lst));
		
		Collections.shuffle(lst);
		
		System.out.println("after shuffling"+lst);
		

		List<Integer> lst1=List.of(12,11,45,23,56);
		System.out.println(lst1);
		Map<Integer,String> cmap=Map.of(1,"a",2,"b",3,"c",4,"d");
		System.out.println(cmap);
		

	}

}
