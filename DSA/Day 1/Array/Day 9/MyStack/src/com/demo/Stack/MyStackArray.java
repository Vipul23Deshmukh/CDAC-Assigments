package com.demo.Stack;

public class MyStackArray {
	private int arr[];
	private int top;
	
	

	public MyStackArray() {
		super();
		
	}
	
	public MyStackArray(int size) {
		
		arr=new int[size];
		top=-1;
		
	}
	
	public void push(int num)
	{
		if(!isfull())
		{
			top++;
			arr[top]=num;
			
			System.out.println("pushed"+num);
		}
		else
		{
			System.out.println("stack is full");
		}
	}

	public int pop()
	{
		if(!isEmpty())
		{
			int num=arr[top];
			top--;
			return num;
			
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	private boolean isEmpty() {
		
		return top==-1;
	}

	private boolean isfull() {
		
		return top==arr.length-1;
	}
	
	

}
