package com.demo.graphs;

public class LinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data=data;
			this.next=null;
		}
		
		
	}
	
	public LinkedList()
	{
		head=null;
	}
	
	public void addNode(int val)
	{
		Node newnode=new Node(val);
		
		if(head!=null)
		{
			newnode.next=head;
		}
		
		head=newnode;
		
	}
	
	public boolean search(int val)
	{
		if(head==null) {
		return false;
		}
		else
		{
			Node temp=head;
			
			while(temp!=null && temp.data!=val)
			{
				temp=temp.next;
			}
			
			if(temp.data==val)
			{
				return true;
			}
			return false;
		}
		
	}
	
	public int[] getAdjacentNodes(int arr[])
	{
		
		Node temp=head;
		
		for(int i=0;temp!=null && i<arr.length;i++)
		{
			arr[i]=temp.data;
			temp=temp.next;
		}
		return arr;
		
	}
	
	
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			
			System.out.println("null");
			System.out.println();
		}
	}
	
}
