package com.demo.testMergeSort;

import com.demo.MergeSort.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		
		int [] arr=  {20,5,7,11,21,2,7,25,30,3};
		MergeSort.mergeascending(arr, 0,arr.length-1);

	}

}
