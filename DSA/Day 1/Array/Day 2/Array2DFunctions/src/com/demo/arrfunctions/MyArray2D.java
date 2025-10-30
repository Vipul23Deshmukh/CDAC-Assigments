package com.demo.arrfunctions;

import java.util.Scanner;

public class MyArray2D {

	 private int arr[][];
	 

public MyArray2D() {
	arr=new int[3][3];
	
}


public MyArray2D(int rows, int cols) {
	arr=new int[rows][cols];
	
}

//accepting data from user
public void AcceptData() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values ");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			
			arr[i][j]=sc.nextInt();
		}
	}
	
}

//displaying data entered by user
public void DisplayData() {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+"\t");
			
		}
		System.out.println();
	}
}



//transpose matrix
public int[][] tranpose(){
	
	int [][]temp=new int [arr.length][arr[0].length];

	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			
			temp[i][j]=arr[j][i];
			
		}
	}
	
	return temp;
}

//checking if array is symmetric or not
public boolean issymmetric()
{
	
	if(arr.length==arr[0].length)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]!=arr[j][i])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
	}
	return false;
	
}

//checking if array is identical or not
public boolean isIdentical()
{
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			if(i==j && arr[i][j]!=1)
			{
				return false;
			}
			else if(i!=j && arr[i][j]!=0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	return true;
	
}


//rotates rows either upward or downward
public void rotateArray(boolean flag ,int num){
	
	if(flag) {
		for(int cnt=0;cnt<num;cnt++) {
			
			int temp[]=arr[0];
			
			for(int i =0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=temp;
			
			
			
			
		}
	}
	else
	
	{
		for(int cnt=0;cnt<num;cnt++) {
		int temp1[]=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp1;
		
	
	   }
 }




}
public void rotateColumns(boolean flag, int num) {
    for (int cnt = 0; cnt < num; cnt++) {
        if (flag) {
            // Right rotation
            int[] temp = new int[arr.length];
            // Save last column
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i][arr[0].length - 1];
            }
            // Shift columns to the right
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr[0].length - 1; j > 0; j--) {
                    arr[i][j] = arr[i][j - 1];
                }
                arr[i][0] = temp[i]; // Place saved column at start
            }
        } else {
            // Left rotation
            int[] temp = new int[arr.length];
            // Save first column
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i][0];
            }
            // Shift columns to the left
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length - 1; j++) {
                    arr[i][j] = arr[i][j + 1];
                }
                arr[i][arr[0].length - 1] = temp[i]; // Place saved column at end
            }
        }
    }

}
}
