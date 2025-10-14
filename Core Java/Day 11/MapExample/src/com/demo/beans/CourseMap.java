package com.demo.beans;
import java.util.*;
public class CourseMap {

	public static void main(String args[])
	{
		Map<String,Integer> hm=new Hashtable<>();
		hm.put("PGdac",240);
		hm.put("DBDA", 200);
		hm.put("Dtis", 150);
		hm.put("Dttiiis", 180);
		
		Set<Map.Entry<String,Integer>> ms=hm.entrySet();
		ms.forEach(e->System.out.println(e.getKey()+"   "+e.getValue()));
		
	}
}
