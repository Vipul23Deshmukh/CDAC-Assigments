package MyBinarySearchTree;

public class MyBinarySearchTree {

	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	public MyBinarySearchTree() {
	
		root=null;
		
	}
	
	public void insertNode(int key)
	{
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
	
		Node newnode=new Node(key);
		if(root==null)
		{
			root=newnode;
			return root;
		}
		else
		{
			if(key<root.data)
			{
				root.left=insertData(root.left, key);
			}
			else
			{
				root.right=insertData(root.right, key);
			}
			return root;
		}
		
		
		
	}
	
	public void inorder()
	{
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
	
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.println(root.data+",");
			inorderTraversal(root.right);
		}
		
	}
	
	
	public void preorder()
	{
		//inorderTraversal(root);
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
	
		if(root!=null)
		{
			System.out.println(root.data+",");
			
			preorderTraversal(root.left);
			
			preorderTraversal(root.right);
		}
		
	}
	
	public void postorder()
	{
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
	
		if(root!=null)
		{
		
			postorderTraversal(root.left);
			
			postorderTraversal(root.right);
			System.out.println(root.data+",");
		}
		
	}
	
	public void deleteNode(int key)
	{
		root=deleteData(root,key);
		
	}

	private Node deleteData(Node root, int key) {
	
		if(root==null)
		{
			return root;
		}
		
		if(key<root.data)
		{
			root.left=deleteData(root.left, key);
		}
		
		else if(key>root.data)
		{
			root.right=deleteData(root.right, key);
		}
		
		else
		{
			if(root.left==null && root.right==null)
				return null;
			
			else if(root.left==null)
				return root.right;
			else if(root.right==null)
			   return root.left;
			
			
			root.data=minvalue(root.right);
			root.right=deleteData(root.right,root.data);
		}
		return root;
	}

	private int minvalue(Node root) {
	
		int min=root.data;
		
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
	
	
	public boolean search(int key) {
		return searchBinaryTree(root,key);
	}
	

	private boolean searchBinaryTree(Node root2, int key) {
		if(root!=null) {
			if(root.data==key) {
				System.out.println(key+ "data found");
				return true;
			}
			else if(key<root.data) {
				return searchBinaryTree(root.left, key);
			}
			else {
				return searchBinaryTree(root.right, key);
			}
		}
		
		System.out.println("DATA NOT FOUND>>>>..");
		return false;
		
	}
	
	public boolean  searchBinaryTreeNonRecurssive(int key) {
		return  searchBinaryTreeNonRecurssive(root,key);
	}

	private boolean searchBinaryTreeNonRecurssive(Node root, int key) {
		if (root!=null) {
			Node temp=root;
			while(temp!=null){
			if(temp.data==key) {
				System.out.println(key+ "Data found");
			return true;
			}
			else if(key<temp.data) {
				temp=temp.left;
			}
			else {
				temp=temp.right;
						}
			}
			System.out.println("Not Found........");
		}
		return false;
	}
	
}
