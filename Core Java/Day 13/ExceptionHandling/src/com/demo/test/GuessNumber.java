package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num1=50;
		
		
		
		while(true)
		{
			try {

				System.out.println(" Enter num2:");
				int num2=s.nextInt();
				
				if(num1==num2)
				{
					
					System.out.println(" yey..!!you guessed correct");
					break;
				}
				else
				{
					if(num2<num1)
						throw new WrongNumberException("  this number is  smaller...");
					
					else
						throw new WrongNumberException(" This Number is Greater..");
				}
				
				
			} catch(WrongNumberException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
