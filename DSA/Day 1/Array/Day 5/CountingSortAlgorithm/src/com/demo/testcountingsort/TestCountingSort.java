package com.demo.testcountingsort;

import java.util.Arrays;

import com.demo.CountingSort.CountingSortEx;

public class TestCountingSort {

	public static void main(String[] args) {
	int[] arr= {3,10,5,1,4,5,8,12,7,7};
	
	int[] output=CountingSortEx.countingsortex(arr);
	
	System.out.println(Arrays.toString(output));

	}

}
