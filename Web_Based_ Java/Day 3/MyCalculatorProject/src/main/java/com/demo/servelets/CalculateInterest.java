package com.demo.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalculateInterest")

public class CalculateInterest extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int p=Integer.parseInt(req.getParameter("p"));
		int y=Integer.parseInt(req.getParameter("y"));
		float r=Float.parseFloat(req.getParameter("r"));
		
		double Answer=(p*r*y)/100;
		out.println("<h2> Total Instrest is :"+Answer+"</h2>");
		
		
	}
	
	
	
	

}
