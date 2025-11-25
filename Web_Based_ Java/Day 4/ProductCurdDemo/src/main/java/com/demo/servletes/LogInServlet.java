package com.demo.servletes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LogInService;
import com.demo.service.LogInServiceImpl;







//1. forget password and sign up.
//2. registration form name , email , gender , hobbies and city.
//3. place order and do payment.


@WebServlet("/validateuser")
public class LogInServlet extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		LogInService lservice=new LogInServiceImpl();
		
		MyUser user=lservice.validateUser(uname,pass);
		
		if (user!=null) {
			RequestDispatcher rd=request.getRequestDispatcher("/showproduct");
			rd.forward(request, response);
			out.println("<h2>valid user</h2>");
		}
		else
		{
			out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		}
		
		
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doPost(request, response);
	}


}
