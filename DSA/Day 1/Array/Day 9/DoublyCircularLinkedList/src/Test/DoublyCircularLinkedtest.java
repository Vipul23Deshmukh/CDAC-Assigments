package Test;

import DoublyCircularLinkList.DoublyCircularLinkedList;

public class DoublyCircularLinkedtest {

	public static void main(String[] args) {
		DoublyCircularLinkedList dclist=new DoublyCircularLinkedList();
		dclist.addNode(10);
		dclist.addNode(20);
		dclist.addNode(30);
		dclist.display();
	
		dclist.addNode(100);
		dclist.addNode(200);
		dclist.addNode(300);
		
		 dclist.DisplayInReverseOrder();
		 dclist.addatpos(2, 11);
		 dclist.addatpos(4, 33);
		 dclist.display();
		 
		 dclist.AddByValue(30, 50);
		 dclist.display();
		 
		 dclist.deletebypos(1);
		 dclist.display();
		 dclist.deletebypos(3);
		 dclist.display();
		 
		 
		 dclist.DeleteByValue(200);
		 dclist.display();
		 
		

	}

}
