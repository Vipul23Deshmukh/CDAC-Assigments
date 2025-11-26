package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.LogInService;
import com.demo.service.LogInServiceImpl;


 
@WebServlet("/validateuser")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		LogInService lservice=new LogInServiceImpl();
		
		MyUser user=lservice.validateUser(uname,pass);
		
		if (user!=null) {
			
			//store user in session
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("category");
			rd.forward(request, response);
			//out.println("<h2>valid user</h2>");
		}
		else
		{
			out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		}
		
	}

}
