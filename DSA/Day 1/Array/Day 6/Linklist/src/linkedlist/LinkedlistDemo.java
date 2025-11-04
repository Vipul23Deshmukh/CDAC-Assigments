package linkedlist;

public class LinkedlistDemo {
  Node head;
  class Node{
	  int data;
	  Node next;
	public Node(int data) {
		
		this.data = data;
		//this.next = next;
		
		next=null;
	}}
	
	public LinkedlistDemo() {
		head=null;
	}
	
	  
	  
  
  
 
  
  public void AddNum(int value)
  {
	   Node newnode=new Node(value);
	   
	   if(head==null) {
		   head=newnode;
		   
	   }
	   else {
		   Node temp=head;
		   
		   while(temp.next!=null) {
			   temp=temp.next;
		   }
		   temp.next=newnode;
	   }
	    
  }
  
  public void AddNumAfterGivingValue(int num,int value) {
	  Node NewNode=new Node(value);
	  
	  
	  Node temp=head;
	  
	  while(temp!=null && temp.data!=num) {
		  temp=temp.next;
	  }
	  
	  
	  if(temp!=null) {
		  
		  NewNode.next=temp.next;
		  temp.next=NewNode;
		  
	  }
	  
	  else {
		  System.out.println(num+"Not found");
	  }
  }
  
  public void addByPosition(int pos,int value)
  {
	  Node newNode=new Node(value);
	  
	  if(pos==1)
	  {
		  newNode.next=head;
		  head=newNode;
		  
	  }
	  else
	  {
		  Node temp=head;
		  for(int i=1;temp!=null  && i<=pos-2;i++)
		  {
			  temp=temp.next;
		  }
		  
		  if(temp!=null)
		  {
			  newNode.next=temp.next;
			  temp.next=newNode;
		  }
		  else
		  {
			  System.out.println("given position is beyond the length of list");
		  }
	  }
  }
  
  public void displaydata()
  {
	  if(head==null)
	  {
		  System.out.println(" list is empty");
	  }
	  
	  else
	  {
		  for(Node temp=head;temp!=null;temp=temp.next)
		  {
			  System.out.print(temp.data+"---->");
		  }
		  System.out.println("null");
	  }
  }
  
}


