package com.demo.servletes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/showproduct")
public class ShowProduct extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		ProductService pservice=new ProductServiceImpl();
		
	      List<Product> plist=pservice.getAllProduct();
	      
	      out.println("PRODUCT DETAILS");
	      out.println("<table border=2>  <tr><th>pid</th> <th>pname</th> <th>qty</th> <th>price</th> <th>expdate</th> <th>cid</th><th>update</th></tr>");
	      for(Product p:plist)
	      {
	    	  out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>"
	    	  		+ "<td>"+p.getExpdate()+"</td><td>"+p.getCid()+"</td>");
	    	  out.println("<td><a href='deleteproduct?pid="+p.getPid()+"'>delete</a>/<a href='editproduct?pid="+p.getPid()+"'>edit</a></td></tr>");
	    	  
	      }
		
		out.println("</table>");
		
		out.println("<a href='AddProduct.html'>Add new product</a>");
	}

	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		
			doPost(request,response);
		
	}

}
