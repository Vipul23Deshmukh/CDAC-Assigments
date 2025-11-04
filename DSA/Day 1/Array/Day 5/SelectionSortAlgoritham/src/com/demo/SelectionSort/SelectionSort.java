package com.demo.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static int FindNthmin(int [] arr,int start) {
		int Minpos=start;
		int Min=arr[Minpos];
		
		for(int i=start;i<arr.length;i++) {
			
			if(Min>arr[i]) {
				Minpos=i;
				Min=arr[i];
				
			}
		}
		return Minpos;
	}
	
	public static void SelectionSort(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int Minpos=FindNthmin(arr, i);
			
			int temp=arr[i];
			arr[i]=arr[Minpos];
			arr[Minpos]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
