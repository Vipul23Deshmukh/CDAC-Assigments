package com.demo.test;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestbackColl {

	public static void main(String[] args) {
		
		Set<Integer> cset=new TreeSet<>();
		for(int i=1;i<20;i++)
		{
			cset.add(i+20);
		}
		cset.forEach(System.out::println);
		
		SortedSet<Integer> ss=((SortedSet<Integer>) cset).headSet(25);
		
		System.out.println(ss);
		
		SortedSet<Integer> ts=((SortedSet<Integer> )cset).tailSet(27);
		System.out.println(ts);
		
		cset.add(40);
		cset.add(85);
		System.out.println(ss);
        System.out.println(ts);
	}

}
