package com.demo.insertion;

import java.util.Arrays;

public class InsertionSortEx {

	public static void InsertionSortAscending(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
		
			
			}
			
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	public static void InsertionSortDescending(int[] arr) {
		
	   for(int i=1;i<arr.length;i++)
	   {
		   int j=i-1;
		   int key=arr[i];
		   
		   while(j>=0 && arr[j]<key)
		   {
			   arr[j+1]=arr[j];
			   j--;
		   }
		   
		   arr[j+1]=key;
		   System.out.println(Arrays.toString(arr));
	   }
		
	}
}
