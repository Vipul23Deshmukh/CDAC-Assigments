package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.demo.beans.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/ShowProduct")
public class ShowProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  HttpSession session=request.getSession();
	  MyUser user=(MyUser)session.getAttribute("user");
	  
	  if(user!=null)
	  {
	    String btn=request.getParameter("btn");
	    switch(btn)
	    {
	  
	    case "show"->{
	     int cid=Integer.parseInt(request.getParameter("category"));
	     ProductService pservice= new ProductServiceImpl();
	      List<Product> plist=pservice.findByCategory(cid);
	  
	
	
	     out.println("<form action='addtocart'>");
	
	     for(Product p:plist) {
		 out.println("<input type='checkbox' name='pname' id='"+p.getPid()+"' value='"+p.getPname()+"'><lable  for='"+p.getPid()+"'>"+p.getPname()+"</lable>");
	
	       }
	
	     out.println("<button type='submit' name= 'btn' id='btn'>Add To cart</button>");
	     out.println("</form>");	
	     out.println("<a href='logout'>Logout</a>");
	    }
	    
	    
	    case "order"->
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("placeorder");
	    	rd.forward(request, response);
	    }
	    
	    
	   }   }
	    else
	    {
           out.println("<h1>Unautherize access</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
	    }
	
	  
	}  }

