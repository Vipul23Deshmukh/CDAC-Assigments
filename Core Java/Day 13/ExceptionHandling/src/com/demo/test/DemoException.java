package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {
  private static int divide(int x,int y) {
	  return x/y;
	
}
	public static void main(String[] args) {
		try {
			  Scanner sc =new  Scanner(System.in);
			  
			  System.out.println("Enter the first number");
			  int x= sc.nextInt();
			  
			  System.out.println("Enter the Second number");
			  int y= sc.nextInt();
			  
     int ans=divide(x, y);
     System.out.println("The Ans is"+ans);
     
     System.out.println("End of try block");
			  
		}
		
		
		
		catch(InputMismatchException e) {
			 System.out.println("Re enter the number");
		}
		
		catch(ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("This is finally block end of program");
		}

	}

}
