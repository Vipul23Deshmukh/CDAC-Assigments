package com.demo.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.config.ServerAuthConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MSEBBill extends HttpServlet {

	double rate1,rate2,rate3;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		
		System.out.println(" inside init method");
		
		rate1=Double.parseDouble(config.getInitParameter("rate1"));
		rate2=Double.parseDouble(config.getInitParameter("rate2"));
		rate3=Double.parseDouble(config.getInitParameter("rate3"));
		
	}
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		double unit=Double.parseDouble(req.getParameter("unit"));
		
		double billamt=0;
		
		if(unit>100)
		{
			billamt=100*rate1;
		}
		else
		{
			billamt=unit*rate1;
		}
		
		if(unit>101)
		{
			double runit=unit-100;
			if(unit>500)
			{
				
				billamt=billamt+(500*rate2)+(runit-500)*rate3;
			}
			
			else
			{
				billamt=billamt+(runit*rate2);
			}
		}
		
		out.println("total bill    "+billamt);
	}
	public void destroy() {
		System.out.println("in destroy method");
	}
}
