package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.demo.beans.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/placeorder")
public class PlaceOrder extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		MyUser user=(MyUser)session.getAttribute("user");
		
		if(user!=null)
		{
			//retrive cart from session
			List<String > cart=(List<String>) session.getAttribute("cart");
			
			//display cart
			cart.stream().forEach(s->out.println(s));
			out.println("<h2>your order placed successfully</h2>");
			out.println("<a href='logout'>Logout</a>");
		}
	}

	

}
