package com.demo.test;

import com.demo.enums.Coffee;

public class CoffeeTest {

	public static void main(String args[])
	{
		Coffee c=Coffee.small;
		switch(c)
		{
		case small->
		{
			System.out.println("small swlwcted"+c.getSize()+c.getPrice());
		}
		
		case large->
		{
			System.out.println("small swlwcted"+c.getSize()+c.getPrice());
		}
		case medium->
		{
			System.out.println("small swlwcted"+c.getSize()+c.getPrice());
		}
		}
	}
}
