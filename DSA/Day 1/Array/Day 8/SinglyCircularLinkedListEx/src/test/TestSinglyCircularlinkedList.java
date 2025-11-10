package test;

import Scircularlinkedlist.SinglyCircularLinkedList;

public class TestSinglyCircularlinkedList {

	public static void main(String[] args) {
		
	SinglyCircularLinkedList sclist=new SinglyCircularLinkedList();
	sclist.addNode(10);
	//sclist.addNode(20);
	//sclist.addNode(30);
	sclist.addNode(40);
	//sclist.addNode(50);
	sclist.addNode(60);
	sclist.display();
	
	
	sclist.AddByPostion(1, 50);
	sclist.display();
		
	sclist.AddByPostion(3, 500);
	sclist.display();
	
	sclist.AddByPostion(10, 1111);
	sclist.display();
	
	sclist.AddByValue(80, 40);
	sclist.display();
	
	sclist.deletebyvalue(50);
	sclist.display();
	
	sclist.deletebyvalue(40);
	sclist.display();
	
	sclist.DeleteByPosition(1);
	sclist.display();
	
	sclist.displayReverse();

	}

}
