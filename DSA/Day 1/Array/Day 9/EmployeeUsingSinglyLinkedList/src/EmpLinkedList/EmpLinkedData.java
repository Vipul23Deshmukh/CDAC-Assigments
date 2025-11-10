package EmpLinkedList;

import com.demo.beans.Employeedata;

public class EmpLinkedData {
	Node head;
	
	class Node{
		Employeedata data;
	    Node next;
		public Node(Employeedata obj) {
			super();
			this.data = obj;
			this.next = null;
		}
	    
	}

	public EmpLinkedData() {
		this.head=null;
	}
	
	
	public void addNode(Employeedata ob)
	{
		Node newnode=new Node(ob);
		if(head==null)
		{
			head=newnode;
		}
		else {
			Node temp=head;
			//will keep on moving temp on right, till it reaches to last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			//add node at the end
			temp.next=newnode;
			
		}
	}
	
	public void addByPosition(int pos,Employeedata ob) {
		Node newNode=new Node(ob);
		if(pos==1) {
			//add at the head node
			newNode.next=head;
			head=newNode;
		}else {
			//add in between or at the end
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Given position "+pos+"  is beyond the length of the list");
			}
		}
	}
	public void addAfterNum(Employeedata  ob,int empnum) {
		Node newNode=new Node(ob);
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empnum) {
			temp=temp.next;
		}
		//if num found
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		}else {
			System.out.println(empnum+"Not Found");
		}
		
	}
	
	public void deleteByValue(int empno) {
		Node temp=head;
		//delete from the head
		if(head.data.getEmpno()==empno) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data.getEmpno()!=empno) {
				prev=temp;
				temp=temp.next;
			}
			//value found
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println(empno + " not found");
			}
		}
	}
	
	public void modifysalById(int empno,double newsal) {
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empno) {
			temp=temp.next;
		}
		if(temp!=null) {
			temp.data.setSal(newsal);
			System.out.println("salary updated");
		}else{
			System.out.println(empno + " not found");
		}
	}
	//delete By position
			public void deleteByPosition(int pos) {
				Node temp=head;
				//delete from the head
				if(pos==1) {
					head=temp.next;
					temp.next=null;
				}else {
					Node prev=null;
					for(int i=0;temp!=null && i<pos-1;i++) {
						prev=temp;
						temp=temp.next;
					}
					if(temp!=null) {
						prev.next=temp.next;
						temp.next=null;
					}else {
						System.out.println(pos+ " is beyond the limit");
					}
				}
			}
	
	public void display()
	{
		
		
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			System.out.println(temp.data+"--->");
		}
		System.out.println();
	}

}
