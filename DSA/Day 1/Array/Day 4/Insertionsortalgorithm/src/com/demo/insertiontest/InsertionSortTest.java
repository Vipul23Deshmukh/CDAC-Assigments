package com.demo.insertiontest;

import com.demo.insertion.InsertionSortEx;

public class InsertionSortTest {

	public static void main(String[] args) {
		
	int []arr= {21,11,13,22,25,7,10,81};
	System.out.println(" insertion sort in ascending order");
	InsertionSortEx.InsertionSortAscending(arr);
	
	System.out.println("insertion sort in descending order");
	InsertionSortEx.InsertionSortDescending(arr);

	}

}
