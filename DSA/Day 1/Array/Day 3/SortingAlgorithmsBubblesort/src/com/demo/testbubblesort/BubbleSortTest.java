package com.demo.testbubblesort;

import java.util.stream.IntStream;

import com.demo.bubblesort.BubbleSortEx;

public class BubbleSortTest {

	public static void main(String[] args) {
		int arr[]= {21,2,5,1,7,8,10,3};
		
		
//		BubbleSortEx.bubblesortalgo(arr);
//		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
      
//		BubbleSortEx.bubblesortalgoImprovedAsc(arr);
//		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
//		
	
		BubbleSortEx.bubblesortalgoImprovedDes(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}

	
	
}
