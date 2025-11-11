package com.demo.test;
import java.util.*;
import com.demo.graphs.*;
public class testAdjacencyList {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();	
		MyGraph g=new MyGraph(v);
		storeGraph(g,v);
		//g.printGraph();
		g.DFSTraversal(0);
		g.BFSTraversal(0);
		
		
}

	private static void storeGraph(MyGraph g, int v) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("IS there a Sign between"+i+ "and"+j);
				int val=sc.nextInt();
			
				if(val>0) {
					g.AddEdge(i, j);
				}
			}
		}
	}}
