package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class TestNioClass {

	public static void main(String[] args) {
	try {
		
		Path p=Paths.get("empdata.csv");
		
		List<String> lst=Files.readAllLines(p);
		for(String l:lst)
		{
			String str[]=l.split(",");
			
			if(str.length>=3) {
			System.out.println(str[0]+" "+str[1]+" "+str[2]);
			
		}
		}
		
		//add data
		List<String> lines=Arrays.asList("106,sneha,70000","108,shreya,50000");
		try {
			Files.write(p,lines,StandardOpenOption.APPEND);
			   //Files.write(p,lines);
			  System.out.println(" Data added successfully!!!");
			  
		}catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
		
		//refresh lines after writing
		lst = Files.readAllLines(p);
		
		List<String> lst2=Files.readAllLines(p);
		for(String l:lst)
		{
			String str[]=l.split(",");
			
			if(str.length>=3) {
			System.out.println(str[0]+" "+str[1]+" "+str[2]);
			
		}
		}
		System.out.println("Display employees with salary >4000");
		
	    
		for(String l2:lst2)
		{
			String str2[]=l2.trim().split(",");
			
			if(Double.parseDouble(str2[2].trim())>4000)
			{
			System.out.println(str2[0]+" "+str2[1]+" "+str2[2]);
			}
		}
		

	}catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}

}
}