package test;

import linkedlist.LinkedlistDemo;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedlistDemo list=new LinkedlistDemo();
	  list.AddNum(4);
	  list.AddNum(8);
	  list.AddNum(9);
	  list.AddNum(2);
	  list.AddNum(5);
	  list.addByPosition(2, 10);
	  list.AddNumAfterGivingValue(5,10);
	  list.displaydata();
	
	  
		

	}

}
