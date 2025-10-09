package com.demo.test;
import com.demo.beans.*;
public class OverloadTest {

	public static void main(String[] args) {
		Functionoverload F=new Functionoverload();
		System.out.println(F.add(10,200));
		System.out.println(F.add(100, 200, 200));
		System.out.println(F.max(3.2f,3.5f));
		
	}

}
