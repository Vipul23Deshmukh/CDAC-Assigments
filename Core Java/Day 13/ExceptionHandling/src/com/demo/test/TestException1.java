package com.demo.test;
import java.util.*;
import com.demo.exceptions.*;
public class TestException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("enter salary");
				double sal=sc.nextDouble();
				if(sal<0) {
					throw new NegativesalaryException("Salary cannot be -ve");
				}
				System.out.println("Salary "+sal);
				break;
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			} catch (NegativesalaryException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}

}
