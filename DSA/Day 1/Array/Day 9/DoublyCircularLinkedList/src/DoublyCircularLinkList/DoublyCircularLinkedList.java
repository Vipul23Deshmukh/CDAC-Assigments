package DoublyCircularLinkList;

public class DoublyCircularLinkedList {
	
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			
			this.data = data;
			this.prev=null;
			this.next=null;
			
			
		}
		
	}
	
	
	public DoublyCircularLinkedList() {
		head=null;
	}

	public void addNode(int val) {
	    Node newnode = new Node(val);

	    if (head == null) {
	        head = newnode;
	        newnode.next = head;
	        newnode.prev = head;
	    } else {
	        Node temp = head;

	        // Traverse to the last node
	        while (temp.next != head) {
	            temp = temp.next;
	        }

	        // Insert newnode after temp (last node)
	        temp.next = newnode;
	        newnode.prev = temp;

	        newnode.next = head;
	        head.prev = newnode;
	    }
	}

	public void addatpos(int pos,int val)
	{
		Node newnode=new Node(val);
	    
	     if(head==null)
	     {
	    	 System.out.println("list is empty");
	     }
	    
	     if(pos==1)
	     {
	    	 Node temp=head.prev;
	    	
	    	
	    	 temp.next=newnode;
	    	 newnode.next=head;
	    	 newnode.prev=temp;
	    	 head.prev=newnode;
	    	 head=newnode;
	     }
	     
	     else
	     {
	    	 Node temp=head;
	    	 int i=0;
	    	 for(;i<pos-2 && temp.next!=head;i++)
	    	 {
	    		 temp=temp.next;
	    	 }
	    	 
	    	 if(i==pos-2)
	    	 {
	    		 newnode.next=temp.next;
	    		 newnode.prev=temp;
	    		 temp.next=newnode;
	    		 newnode.next.prev=newnode;
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("position not found");
	    	 }
	     }
	
	}
	
	
	public void AddByValue(int val ,int num) {
		
		Node newNode=new Node(num);
		if(head.data==val) {
			newNode.prev=head;
			newNode.next=head.next;
			head.next.prev=newNode;
			head.next =newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=head && temp.data!=val) {
				temp=temp.next;
				
			}
			
			if(temp.data==val) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				temp.next.prev=newNode;
			}
			else {
				System.out.println("Value not found");
			}
		}
		
	}
	
	public void deletebypos(int pos)
	{
		if(head==null)
		{
			System.out.println(" list is empty");
		}
		
		if(pos==1)
		{
			Node temp=head.prev;
			
			temp.next=head.next;
	        temp.next.prev=temp;
	        head.next=null;
	        head.prev=null;
	        head=temp.next;
		}
		else
		{
			Node temp=head;
			int i=0;
			for(;i<pos-1 && temp.next!=head;i++)
			{
				temp=temp.next;
			}
			if(i==pos-1)
			{
			   temp.prev.next=temp.next;
			   temp.next.prev=temp.prev;
			   temp.next=null;
			   temp.prev=null;
			}
			else
			{
				System.out.println("pos is beyond the limit");
			}
		}
	}
	
	public void DeleteByValue(int val) {
		
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			
			Node tail=head.prev;
			if(head.data==val) {
				if(head==tail) {
					head=null;
				}
				else {
					head.next.prev=tail;
					tail.next=head.next;
					Node temp=head;
					head=head.next;
					temp.next=null;
				}}
				else {
					Node temp=head;
					while(temp.next!=head &&  temp.data !=val) {
					temp=temp.next;	
					}
					if(temp.data==val) {
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						temp.prev=null;
						temp.next=null;
					}
					else {
						System.out.println(val+"not found");
					}
				}
			}
		
	}
	public void display()
	{
		Node temp=head;
		
		do
		{
			System.out.print(temp.data+"---->");
			temp=temp.next;
			
		}while(temp!=head);
		System.out.println();
	}
	public void DisplayInReverseOrder() {
		Node temp=head.prev;
		
		do {
			System.out.print(temp.data+"--->");
			temp=temp.prev;
			
		}
		while(temp!=head.prev);
	System.out.println();
	}
	
	

}
