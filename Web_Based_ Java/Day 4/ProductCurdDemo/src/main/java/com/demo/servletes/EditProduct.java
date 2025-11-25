package com.demo.servletes;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/editproduct")
public class EditProduct extends HttpServlet {
       
   
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		
		ProductService pservice=new ProductServiceImpl();
		
		Product p=pservice.getById(pid);
		
		out.println("<form action='updateproduct' method='post'>");
		out.println("Product Id:<input type ='text' name='pid' id='pid' value='"+p.getPid()+"' readonly></br>");
		out.println("Product pname:<input type ='text' name='pname' id='pname' value='"+p.getPname()+"'></br>");
		out.println("Product qty:<input type ='text' name='qty' id='qty' value='"+p.getQty()+"'></br>");
		
		out.println("Product price:<input type ='text' name='price' id='price' value='"+p.getPrice()+"' ></br>");
	    String sdt=p.getExpdate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	    
	    out.println("Product Expdate:<input type ='text' name='expdate' id='expdate' value='"+sdt+"'></br>");
	    out.println("Product cid:<input type ='text' name='cid' id='cid' value='"+p.getCid()+"'></br>");
	
	    out.println("<button type='submit' name='update' id='update'>update product</button>");
	    out.println("</form>");
	
	}


	

}
