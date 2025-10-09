package com.demo.beans;

class Parent{
    
	 private int x=10;
		public final void m1()
		{
		System.out.println("inside class Parent");
		}
		
		public int getx()
		{
			return this.x;
		}
		public void display()
		{
			System.out.println(x);
		}
	
		
}

class Child extends Parent{
	
	private int y=20;
	
	public final void m2()
	{
		System.out.println(" inside class child");
	}
	public void display()
	{
		System.out.println("from child");
		  System.out.println(getx());
		 System.out.println(y);
	}
}


public class ClassA {

	public static void main(String args[]) {
		Child c=new Child();
		c.display();
		c.m1();
		c.m2();
	}

}
