package Scircularlinkedlist;

public class SinglyCircularLinkedList {
	
	 Node head;
	class Node{
		
		int data;
	     Node next;
		public Node(int data) {
			
			this.data = data;
			this.next=null;
		}
	    
	    
	}
	public SinglyCircularLinkedList() {
		head=null;
	}
	

	
	public void addNode(int val)
	{
		Node newNode=new Node(val);
		
		
		
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
			
		}
		
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			
			temp.next=newNode;
		    newNode.next=head;	
		}
		
		
	}
	
	public void display()
	{
		Node temp=head;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
		do
		{
			System.out.print(temp.data+"------>");
			temp=temp.next;
		}while(temp!=head);
		
		System.out.print("head");
		System.out.println();
	}
}
	
	public void displayReverse()
	{
		Node temp=head;
		Node prev=temp;
		
		
		while(temp.next!=head)
		{
			prev=temp;
			temp=temp.next;
		}
		
		while(prev.next!=temp)
		{
			System.out.println(temp.data);
			temp=prev;
		}
	}
	public void AddByPostion(int pos,int val) {
		
		Node newNode=new Node(val);
		
		if(head==null) {
			System.out.println("the list is empty");
		}//add at the first position
		if(pos==1) {
			Node temp=head;
		while(temp.next!=head) {
			temp=temp.next ;
		}
		newNode.next=head;
		head=newNode;
		temp.next=head;
		}
		else {
			//in between
			
			Node temp=head;
			int i=1;
			for(;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
				
			}
			if(i>pos-2) {
				
				newNode.next=temp.next;
				temp.next =newNode;
				
			}
			else {
				System.out.println(pos+"Is beyond the limit");
			}
			
			
		}
		
	}
	
	
	public void AddByValue(int val,int num) {
		
		Node newNode=new Node(val);
		
		//Node temp=head;
		
		//if num found at first position
		if(head.data==num)
		{
			newNode.next=head.next;
			head.next=newNode;
		}
		
		else {
			Node temp=head;
		
			do {
				temp=temp.next;
			}while(temp.next!=head && temp.data!=num);
			
			if(temp!=head)
			{
				
				newNode.next=temp.next;
				temp.next=newNode;
				
				
			}
			else {
				System.out.println("not found");
			}
			
		}
		
	}
	
	public void deletebyvalue(int val)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		
		Node temp=head;
		Node prev=temp;
		if(head.data==val)
		{
			while(temp.next!=head)
			{
				prev=temp;
				temp=temp.next;
			}
			
			head=head.next;
			temp.next=head;
		}
		
		else
		{
			do {
				prev=temp;
				temp=temp.next;
				
				
			}while(temp.next!=head && temp.data!=val);
			
			if(temp!=head)
			{
				prev.next=temp.next;
				
			}
			else
			{
				System.out.println("value not found");
			}
		}
	}
	
	public void DeleteByPosition(int pos) {
		if (head==null) {
			System.out.println("list is empty");
			
		}
		else {
			Node temp=head;
			if(pos==1) {
				Node tail=head;
				while(tail.next!=head) {
					tail=tail.next;
				}
				
				if(tail==head) {
					head=null;
				}
				else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}
			else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && i<pos-1;i++) {
					
					prev=temp;
					temp=temp.next;
					
				}
				if(i==pos-1) {
					prev.next=temp.next;
					temp.next=null;
				}
				
				else {
					System.out.println(pos+"Not found");
				}
			}
			
		}
	}
	} 

