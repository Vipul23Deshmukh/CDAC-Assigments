package com.demo.servletes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/deleteproduct")
public class deleteProduct extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("pid"));
		
		ProductService pservice =new ProductServiceImpl();
		boolean status=pservice.deleteById(id);
		
		RequestDispatcher rd=request.getRequestDispatcher("showproduct");
		rd.forward(request, response);
	}

}
