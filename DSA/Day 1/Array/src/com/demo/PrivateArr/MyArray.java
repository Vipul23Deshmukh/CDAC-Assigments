package com.demo.PrivateArr;

import java.util.Arrays;

public class MyArray {
private int[] arr;
private int count;
public MyArray() {
	arr=new int[10];
	count=0;
}
public MyArray(int[] arr, int count) {
	
	this.arr = arr;
	this.count = count;
}


public MyArray(int size) {
	arr=new int[size];
	count=0;
}



public int getcapacity()
{
	return arr.length;
}

public int getsize()
{
	return count;
}

public boolean add(int x)
{
	if(count<arr.length)
	{
		arr[count]=x;
		count++;
		return true;
	}
	return false;
}

public boolean addAtPos(int value,int pos)
{
	if(count<arr.length)
	{
		for(int i=count;i>pos;i--)
		{
			arr[i]=arr[i-1];
			
		}
		
		arr[pos]=value;
		count++;
		return true;
	}
	return false;
}

public boolean DeleteByPos(int pos) {
	if(pos<count) {
		for(int i=pos;i<count-1;i++) {
			arr[i]=arr[i+1];
			count--;
			
		}
		return true;
	
	
	}
	return false;
}

public int SearchByValue(int value) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==value) {
			return i;
		}
		
	}
	return -1;
}

public int[] reverseArray(boolean flag)
{
	if(flag)
	{
		for(int i=0,j=count-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
	else
	{
		int arr2[]=new int[count];
		for(int i=count-1,j=0;i>=0;i--,j++)
		{
			arr2[j]=arr[i];
		}
		return arr2;
	}
	
	
}

public int FindSum() {
	int sum=0;
	for(int i=0; i<count;i++) {
		sum+= arr[i];
	}
	return sum;
}


public int FindMax() {
	
	int max=arr[0];
	for(int i=1;i<count;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}

public int []rotateValues(boolean flag,int num)
{
	for(int j=0;j<num;j++)
	{
	if(flag)
	{
		int temp=arr[count-1];
		
		for(int i=count-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
	
		return arr;
	}
	
	else
	{
		int temp=arr[0];
		
		for(int i=0;i<count-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[count-1]=temp;
		
	}
	}
	return arr;
}

public int []exchangeIndex()
{
	
	int a=FindMax();
	
	int arr2[]=new int[a+1];
	
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=-1;
	}
	
	for(int i=0;i<arr2.length;i++)
	{
		int idx=arr[i];
		int value=i;
		
		arr2[idx]=value;
		
	}
	return arr2;
	
}











public String toString() {
	return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
}
}
