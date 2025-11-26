package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html");
             PrintWriter out= response.getWriter();
             
             
             //check user if exist
             
             HttpSession session=request.getSession();
             MyUser user=(MyUser)session.getAttribute("user");
             
             if(user!=null) {
            	 
            	 ProductService pservice=new ProductServiceImpl();
            	 List<Integer> carr=pservice.getAllProduct();
            	 
            	 
            	 out.println("<form action='ShowProduct'> <select name ='category'>");
            	 for(int i :carr) {
            		 
            		 out.println("<option value='"+i+"'>"+i+"</option>");
            	 }
            	 out.println("</select>");
            	 out.println("<button type='submit' name='btn' id='btn' value ='show'>submit</button>");
     			out.println("<button type='submit' name='btn' id='btn' value ='order' >placeOrder</button>");
     			out.println("</form>");
     			out.println("<a href='logout'>Logout</a>");
     			
             }
             
             else {
            	 out.println("<h1> unautherized access</h1>");
            	 RequestDispatcher rd=request.getRequestDispatcher("login.html");
            	 rd.include(request, response);
             }
             
		
           
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
