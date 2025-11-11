package com.demo.graphs;

import com.demo.list.MyQueueList;
import com.demo.list.MyStackListGeneric;

public class MyGraph {

	LinkedList [] Graph;
	
	public MyGraph(int val) {
		this.Graph= new LinkedList[val];
		
		for(int i=0;i<this.Graph.length;i++) {
			Graph[i]= new LinkedList();
		}
	}
	
	public void AddEdge(int source ,int dest) {
		
		Graph[source].addNode(dest);
		
		
	}
	
	public void printgraph() {
		for(int i=0;i<Graph.length;i++) {
			System.out.println(i+"====>");
			Graph[i].display();
		}
	}
	
	//DFS traversal Algorithm
	
	public void DFSTraversal(int start)
	{
		System.out.println("DFS Traversal");
		
		boolean [] visited=new boolean[Graph.length];
		
		for(int i=0;i<Graph.length;i++)
		{
		visited[i]=false;
		}
		
		MyStackListGeneric<Integer> st=new MyStackListGeneric<>();
		
		st.push(start);
		String dfs="";
		while(!st.isempty())
		{
			int v=st.pop();
			
			if(!visited[v])
			{
				dfs+=v+",";
				visited[v]=true;
				
				
				int arr[]=new int[Graph.length];
				
				for(int i=0;i<Graph.length;i++)
				{
					arr[i]=-1;
				}
				
				Graph[v].getAdjacentNodes(arr);
				
				for(int i=0;i<Graph.length;i++)
				{
					if(arr[i]!=-1 && !visited[arr[i]])
					{
						st.push(arr[i]);
					}
				}
				
				
			}
			System.out.println("DFS"+dfs);
		}
		
	}
	
	public void BFSTraversal(int start)
	{
		boolean visited[]=new boolean[Graph.length];
		
		for(int i=0;i<Graph.length;i++)
		{
			visited[i]=false;
		}
		
		MyQueueList qlist=new MyQueueList();
		qlist.Enqueue(start);
		
		
		String BFs=" ";
		
		while(!qlist.isEmpty())
		{
			
			int v=qlist.Dequeue();
			
			if(!visited[v])
			{
				BFs+=v+",";
				
				visited[v]=true;
				
				int arr[]=new int [Graph.length];
				
				for(int i=0;i<Graph.length;i++)
				{
					arr[i]=-1;
				}
				
				Graph[v].getAdjacentNodes(arr);
				
				for(int i=0;i<Graph.length;i++)
				{
					if(arr[i]!=-1 && !visited[arr[i]])
					{
						qlist.Enqueue(arr[i]);
					}
				}
			}
			
			System.out.println("BFS"+BFs);
		}
		
	}
}
