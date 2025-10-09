package com.demo.Test;
import com.demo.beans.*;
import com.demo.Service.*;

public class TestMyClassInterface {
	public static void main(String[] args) {
		
		MyClass m=new MyClass();
		m.m1();
		m.m2(50);
		m.m3();
		
		
		I1 m1=new MyClass();
		m1.m1();
		m1.m2(100);
	
		MyClass ob=new MyClass();
		ob.m2(10);
	    I1 ob2=new MyClass();
	    ob2.m1();
	    ((MyClass) ob2).m3();
	    I2 ob3=new MyClass();
	    ((MyClass)ob3).m1();
		
	
	}
	
	

}
