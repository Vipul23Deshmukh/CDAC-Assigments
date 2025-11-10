package com.demo.Stack;

public class QueueList {

	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		public Node(int data) {
		
			this.data = data;
			this.next = null;
		}
		
	}
	public QueueList() {
		front=null;
		rear=null;
	}
	
	public boolean isempty()
	{
		return front==null && rear==null;
	}
	public void enqueue(int val)
	{
		Node newnode = new Node(val);
		if(isempty())
		{
			front=newnode;
		}
		else
		{
			rear.next=newnode;
		}
		
		rear=newnode;
		
		System.out.println("Added"+val);
		
	}
	
	public int dequeue()
	{
		if(!isempty())
		{
		Node temp=front;
		front=front.next;
		
		if(front==null)
		{
			rear=null;
		}
		
		temp.next=null;
		
		return temp.data;
		}
		else {
			System.out.println("qoeue is empty");
		}
		return -1;
		
	}
	
	
}
