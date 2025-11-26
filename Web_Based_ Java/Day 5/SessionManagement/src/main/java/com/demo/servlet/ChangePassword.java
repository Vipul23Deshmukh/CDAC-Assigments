package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LogInService;
import com.demo.service.LogInServiceImpl;


@WebServlet("/changepass")
public class ChangePassword extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	    String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		System.out.println(uname+""+pass);
		
		LogInService lservice=new LogInServiceImpl();
		
		boolean status=lservice.Changepass(uname, pass);
		
		if(status)
		{
			out.println("<h2>Password changed Succesfully ..</h2>");
		}
		else
		{
			out.println("<h2>Something went wrong..</h2>");
		}
}
}
