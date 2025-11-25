package com.demo.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServelet extends HttpServlet {

	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String btn=req.getParameter("btn");
		int n1=Integer.parseInt(req.getParameter("num1"));
		
		
		switch(btn)
		{
		
		case "add" ->{
			int n2=Integer.parseInt(req.getParameter("num2"));
			int Ans=n1+n2;
			out.println("<h1>Addition:"+Ans+"</h1>");
			
			
			
		}
		
		case "sub"->{
			int n2=Integer.parseInt(req.getParameter("num2"));
			int Ans=n1-n2;
			out.print("<h1> Substraction:"+Ans+"</h1>");
			
			
			
		}
		
		case "fact"->{
			int Ans=Factorial(n1);
			out.print("<h1> factorial:"+Ans+"</h1>");
			
			
			
		}
		
		}
	}

	private int Factorial(int n1) {
		
		int fact=1;
		
		for(int i=1;i<=n1;i++) {
			
			fact=fact*i;
			
		}
		return fact;
	}

}
