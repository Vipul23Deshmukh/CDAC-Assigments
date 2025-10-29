package com.demo.PrivateArr;

import java.util.Scanner;

public class Array2D {

	private int[][]arr;

	public Array2D() {
		arr=new int[3][3];
		
	}
	
	public Array2D(int rows,int cols) {
		arr=new int[rows][cols];
	}
	

    public Array2D(int[][] arr) {
        this.arr = arr;
    }
	
	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}


	Scanner sc=new Scanner(System.in);
	public void AcceptData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter values of "+i+","+j);
				
				arr[i][j]=sc.nextInt();
			}
		}
	}

	public void DisplayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	public int[] addRowwise()
	{
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp[i]=temp[i]+arr[i][j];
			}
		}
		
		return temp;
		
	}
	

	public int[] addColumnwise()
	{
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp[i]=temp[i]+arr[j][i];
			}
		}
		
		return temp;
		
	}
	
	public int[][] add2DArray(Array2D ob)
	{
		int arr1[][]=this.arr;
		int arr2[][]=ob.getArr();
		
		
		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length)
		{
			System.out.println(" arrays length must be similar");
			return null;
		}
		
		int [][] result=new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		return result;
		
	}
	
	public int[][] Sub2DArray(Array2D obj){
		
		int arr1[][]=this.arr;
		int arr2[][]=obj.getArr();
		
		
		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length) {
			System.out.println("Arrys length must be same");
			return null;
		}
		int [][] result=new int [arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length;i++) {
			for (int j=0;j<arr1[0].length;j++) {
				result[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		return result;
	}
	
}
