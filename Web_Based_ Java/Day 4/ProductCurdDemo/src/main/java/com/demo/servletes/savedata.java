package com.demo.servletes;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LogInService;
import com.demo.service.LogInServiceImpl;


@WebServlet("/savedata")
public class savedata extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Username=request.getParameter("uname");
		String Password=request.getParameter("pass");
		String Emailid=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dt=request.getParameter("dob");
		LocalDate DOB=LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		MyUser u=new MyUser(Username, Password, Emailid, gender, DOB);
		
		LogInService lservice=new LogInServiceImpl();
		boolean status=lservice.adddata(u);
		
		if(status)
		{
			out.print("<h2>Registration Successful</h2>");
			 RequestDispatcher rd=request.getRequestDispatcher("login.html");
			 rd.forward(request, response);
		}
		else
		{
			out.println("not registered. enter valid data");
		}
	}

}
