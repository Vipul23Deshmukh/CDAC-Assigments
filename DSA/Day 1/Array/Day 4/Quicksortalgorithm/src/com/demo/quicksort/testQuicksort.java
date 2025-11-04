package com.demo.quicksort;

import com.demo.quick.QuickSortAlgorithm;

public class testQuicksort {

	public static void main(String[] args) {
		int arr[]= {12,9,8,13,1,2,7,8,15};
		QuickSortAlgorithm.quicksort(arr, 0, arr.length-1);
	}

}
