package com.demo.test;
import com.demo.arrfunctions.*;
public class TestMyArray2D {

	public static void main(String[] args) {
		MyArray2D ob=new MyArray2D();
		
		ob.AcceptData();
		System.out.println(" displaying data from 2D Array:");
		ob.DisplayData();
		//System.out.println(ob);
		
		 int arrt[][]=ob.tranpose();
		 
	 
		 System.out.println(" Transpose of given array:");
		 for(int i=0;i<arrt.length;i++) {
				for(int j=0;j<arrt[0].length;j++) {
					
					System.out.print(arrt[i][j]+"\t");					
				}
				System.out.println();	
			}
			
	       System.out.println(" Array is Symmetric or not :"+ob.issymmetric());
	       System.out.println("Array is identical or not :"+ob.isIdentical());
			 
	       
	       System.out.println("this is down rotation");
	       ob.rotateArray(false, 1);
	       ob.DisplayData();
	       
	       
	       
	       
	       System.out.println("this is up rotation");
	       ob.rotateArray(true, 1);
	       ob.DisplayData();
	       
	       
	       System.out.println("right rotation of column");
	       ob.rotateColumns(true, 1);
	       ob.DisplayData();
	       
	       System.out.println("left rotation of column");
	       ob.rotateColumns(false, 1);
	       ob.DisplayData();
	}

}
