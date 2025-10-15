package com.demo.test;

import com.demo.exceptions.NegativesalaryException;
import com.demo.service.MyService;

public class TestExceptionEmployee {

	public static void main(String[] args) {
		
		MyService ms=new MyService();
		try {
			ms.acceptdata();
		
			
		}catch(NegativesalaryException e) {
			System.out.println(e.getMessage());
		}

	}

}
