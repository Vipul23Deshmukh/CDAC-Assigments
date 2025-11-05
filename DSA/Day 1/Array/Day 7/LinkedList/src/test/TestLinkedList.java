package test;

import linkedlist.SinglyLinkedList;

public class TestLinkedList {


	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
	  list.AddNum(4);
	  list.AddNum(8);
	  list.AddNum(9);
	  list.AddNum(2);
	  list.AddNum(5);
	  list.addByPosition(2, 10);
	  list.AddNumAfterGivingValue(5,10);
	  list.displaydata();
	  list.deletebyvalue(8);
	  list.displaydata();
	  list.deletebypos(4);
	  list.displaydata();
	
	  
	}	
}
