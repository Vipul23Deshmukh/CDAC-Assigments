package com.demo.beans;

public class Functionoverload {

	public int add(int x,int y)
	{
		return x+y;
	}
	public int add(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public int max(int x,int y)
	{
		return x>y?x:y;
	}
	public float max(float x,float y)
	{
		return x>y?x:y;
	}
}
