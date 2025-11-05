package DoublyLinkedlist;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			super();
			this.data = data;
			prev=null;
			next=null;
		}
		
	}
	public DoublyLinkedList() {
		head=null;
	}
	
	public void AddNode(int value) {
		Node Newnode=new Node(value);
		if(head==null) {
			head=Newnode;
			
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			
			
			}
			Newnode.prev=temp;
			temp.next=Newnode;
		}
	}
	
	public void addnypos(int pos,int value)
	{
	         Node newnode=new Node(value);
	         Node temp=head;
	         if(pos==1)
	         {
	        	 newnode.next=head;
	        	 
	        	 head.prev=newnode;
	        	 
	        	 head=newnode;
	         }
	         
	         else
	         {
	        	  temp=head;
	        	  
	        	  for(int i=1;temp!=null && i<pos-2;i++)
	        	  {
	        		  temp=temp.next;
	        		  
	        	  }
	        	  //position found
	        	  if(temp!=null)
	        	  {
	        		  newnode.next=temp.next;
	        		  newnode.prev=temp;
	        		  temp.next=newnode;
	        		  
	        	  }
	        	  
	        	  if(newnode.next!=null)
	        	  {
	        		  newnode.next.prev=newnode;
	        	  }
	        	  else
	        	  {
	        		  System.out.println(" position beyond the limit");
	        	  }
	        	 
	         }
	}
	
	public void DeleteByValue(int value) {
		
		Node temp=head;
		if(head.data==value) {
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}
		//Delete in middle
		
		else {
			while(temp!=null && temp.data!=value) {
				temp=temp.next;
				
			}
			if (temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				
				temp.prev=null;
				
			}
			else {
				System.out.println(value+"not found");
			}
		}
	}
	
	public void deletebypos(int pos)
	{
		Node temp=head;
		if(pos==1)
		{
			head=temp.next;
			temp.next=null;
		}
		
		else
		{
			for(int i=0;temp!=null && i<pos-2;i++)
			{
				
				temp=temp.next;
			}
			
			if(temp!=null)
			{
				
				temp.next=temp.next.next;
				
				if(temp.next !=null)
				{
					temp.next.prev=temp;
				}
				
			}
			
			else
			{
				 System.out.println("not found");
			}
		}
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}System.out.println("null");
	}
	

}
