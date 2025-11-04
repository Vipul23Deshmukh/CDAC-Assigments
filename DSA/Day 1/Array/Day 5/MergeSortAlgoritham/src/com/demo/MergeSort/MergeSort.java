package com.demo.MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int []arr,int start,int mid,int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;
		
		int leftarr[]=new int[n1];
		int rightarr[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftarr[i]=arr[start+i];
		}
		
		for(int i=0;i<n2;i++)
		{
			rightarr[i]=arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=start;
		
		while(i<n1 && j<n2)
		{
			if(leftarr[i]<rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=rightarr[j];
				k++;
				j++;
			}
		}
		//copy remaining
		
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
			
			
		}
		
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
			
		}
		
		System.out.println(start+ ","+mid+","+end);
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void mergeascending(int arr[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			
			mergeascending(arr, start, mid);
			
			mergeascending(arr, mid+1, end);
			
			merge(arr, start, mid, end);
		}
	}

}
