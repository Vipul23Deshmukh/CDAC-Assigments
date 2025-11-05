package Test;

import DoublyLinkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		
		list.AddNode(5);
		list.AddNode(12);
		list.AddNode(10);
		list.AddNode(7);
		list.AddNode(52);
		list.AddNode(35);
		list.AddNode(45);
		list.AddNode(96);
		list.AddNode(23);
		list.AddNode(9);
		list.AddNode(1);
		list.display();
		
		list.addnypos(1, 20);
		list.display();
		list.addnypos(4, 120);
		
		list.DeleteByValue(35);
		
		
		list.display();;
		list.deletebypos(2);
		list.display();
		list.DeleteByValue(52);
		list.display();

	}

}
