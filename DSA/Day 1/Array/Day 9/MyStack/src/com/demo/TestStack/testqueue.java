package com.demo.TestStack;

import com.demo.Stack.QueueList;

public class testqueue {

	public static void main(String[] args) {
	QueueList qlist=new QueueList();
	
	qlist.enqueue(11);
	qlist.enqueue(12);
	qlist.enqueue(13);
	qlist.enqueue(14);
	qlist.enqueue(15);

	while(!qlist.isempty())
	{
	   System.out.println(qlist.dequeue());	
	}
	
	
	System.out.println(qlist.dequeue());
	}

}
