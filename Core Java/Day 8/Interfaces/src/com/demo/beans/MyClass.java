package com.demo.beans;

import com.demo.Service.I1;
import com.demo.Service.I2;

public class MyClass implements I1,I2 {
	
	public void m1() {
		System.out.println("IN m1 methode");
	}

	
	public void m2(int x) {
		System.out.println("in m2 methode");
		System.out.println(x);
		
	}
	
	public void m3()
	{
		System.out.println("in m3 methode");
	}
}
