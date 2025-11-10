package com.demo.TestStack;

import com.demo.Stack.MyStackArray;
import com.demo.Stack.MyStackList;

public class TestMyStack {

	public static void main(String[] args) {
	MyStackList ob=new MyStackList();
	
	System.out.println("THe stack is....");
	ob.push(5);
	ob.push(10);
	ob.push(15);
	ob.push(20);
	System.out.println(ob.pop());
	System.out.println(ob.pop());
	
	
	MyStackArray array= new MyStackArray(5);
	
	array.push(11);
	array.push(22);
	array.push(33);
	array.push(44);
	array.push(55);
	array.push(66);
	array.push(77);
	
	System.out.println(array.pop());
	System.out.println(array.pop());
	System.out.println(array.pop());
	System.out.println(array.pop());
	System.out.println(array.pop());
	}

}
