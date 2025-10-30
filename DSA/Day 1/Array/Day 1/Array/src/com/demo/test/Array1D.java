package com.demo.test;

import java.util.Scanner;
import java.util.stream.IntStream;

import com.demo.PrivateArr.MyArray;

public class Array1D {

	public static void main(String[] args) {
		MyArray ob=new MyArray();
 
     ob.add(0);
     ob.add(4);
     ob.add(9);
     ob.add(8);
     ob.add(9);
     ob.add(6);
     ob.add(6);
     System.out.println(ob);
     
     ob.addAtPos(7, 0);
     System.out.println(ob);
     
   //  ob.DeleteByPos(2);
     //System.out.println(ob);
     
     System.out.println(ob.getcapacity());
     
     System.out.println(ob.getsize());
     
     //int a=ob.SearchByValue(9);
     //System.out.println(a);
   int arr[]=ob.reverseArray(true);
//     for(int i=0;i<arr.length;i++)
//     {
//    	 System.out.print(arr[i]);
//     }
//     
   IntStream.of(arr).forEach(e->System.out.print(e+","));
     
     System.out.println();
     System.out.println(ob.FindSum());
     
     
     System.out.println();
     System.out.println(ob.FindMax());
     
     int arr3[]=ob.rotateValues(false, 2);
      
     IntStream.of(arr3).forEach(e->System.out.print(e+","));
      
     System.out.println();
     
     int arr4[]=ob.exchangeIndex();
     
     IntStream.of(arr4).forEach(e->System.out.print(e+","));
      
     
	}

}
