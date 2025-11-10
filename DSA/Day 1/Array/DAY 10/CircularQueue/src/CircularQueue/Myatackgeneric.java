package CircularQueue;

public class Myatackgeneric<T> {
	Node top;
	
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data=data;
			this.next=null;
		}
		
		
	}

	public Myatackgeneric() {
		top=null;
	}
	
	public boolean isempty()
	{
		return top==null;
	}
	
	public void push(T num)
	{
		Node newnode=new Node(num);
		if(!isempty())
		{
			newnode.next=top;
		}
		top=newnode;
		
		System.out.println("pushed"+num);
		
	}
	
	public T pop()
	{
		
		if(!isempty())
		{
			Node temp=top;
			top=top.next;
			temp.next=null;
			
			return temp.data;
			
		}
		else {
			System.out.println("stack is empty");
			
			return null;
		}
	}
	

}
