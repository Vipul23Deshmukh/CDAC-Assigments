package com.demo.test;

import com.demo.PrivateArr.Array2D;

public class Array2DTest {

	public static void main(String[] args) {
		
		Array2D ob=new Array2D();
		
		ob.AcceptData();

		ob.DisplayData();
		
		System.out.println(" rowwise addition:");
		int sumRow[]=ob.addRowwise();
		for(int i=0;i<sumRow.length;i++)
		{
		System.out.print(" "+  sumRow[i]);
		
		}
		
		System.out.println("  ");
		System.out.println("column wise addition:");
		int[] sumCol=ob.addColumnwise();
		for(int i=0;i<sumCol.length;i++)
		{
			System.out.print(" "+sumCol[i]);
		}

		
		int[][]a= {{1,2},{2,4}};
		int[][]b= {{3,1},{2,4}};
		
		Array2D ob1=new Array2D(a);
		Array2D ob2=new Array2D(b);
		
		System.out.println();
		int sum[][]=ob1.add2DArray(ob2);
		System.out.println("addition :");
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[0].length;j++)
			{
				System.out.print(" " +sum[i][j]);
			}
		}
	

	
	int[][]c= {{1,2},{2,4}};
	int[][]d= {{3,1},{2,4}};
	
	Array2D ob3=new Array2D(c);
	Array2D ob4=new Array2D(d);
	
	System.out.println();
	int sub[][]=ob3.Sub2DArray(ob4);
	System.out.println("Substraction :");
	for(int i=0;i<sub.length;i++)
	{
		for(int j=0;j<sub[0].length;j++)
		{
			System.out.print(" " +sub[i][j]);
		}
	}
}
}
