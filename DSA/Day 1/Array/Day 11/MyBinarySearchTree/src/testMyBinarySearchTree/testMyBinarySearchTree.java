package testMyBinarySearchTree;

import MyBinarySearchTree.MyBinarySearchTree;

public class testMyBinarySearchTree {

	public static void main(String[] args) {
	MyBinarySearchTree bst=new MyBinarySearchTree();
	bst.insertNode(30);
	bst.insertNode(25);
	bst.insertNode(35);
	bst.insertNode(21);
	bst.insertNode(7);
	bst.insertNode(32);
	bst.insertNode(33);
	bst.insertNode(37);
	
	
	System.out.println("In order ..........");
	bst.inorder();
	
	System.out.println("PreOrder..........");
	bst.preorder();
	
	System.out.println("PostOrder..........");
	bst.postorder();
	 
	
	System.out.println("searchBinaryTreeNonRecurssive ");
	bst.searchBinaryTreeNonRecurssive(563);

	
	System.out.println("searchBinaryTreeNonRecurssive ");
	bst.searchBinaryTreeNonRecurssive(7);
	
	
	System.out.println("Node Deleted");
	bst.deleteNode(33);

	}

}
