package com.demo.CountingSort;

import java.util.Arrays;

public class CountingSortEx {

	public static int findmax(int arr[])
	{
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int[] countingsortex(int arr[])
	{
		int n=findmax(arr);
		
		int count[]=new int[n+1];
		
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		
		System.out.println(" count arrray :");
		System.out.println(Arrays.toString(count));
		for(int i=0;i<arr.length;i++)
		{
			int pos=arr[i];
			count[pos]++;
			
			
		}
		System.out.println(" count arrray :");
		System.out.println(Arrays.toString(count));
		
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		System.out.println(" cummmulative sum :");
		System.out.println(Arrays.toString(count));
		
		int output[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int pos=arr[i];
			count[pos]--;
			int idx=count[pos];
			output[idx]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		return output;
	}
}
