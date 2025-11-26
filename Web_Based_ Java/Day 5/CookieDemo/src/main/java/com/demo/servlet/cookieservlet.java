package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet("/cookieservlet")
public class cookieservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String btn=request.getParameter("btn");
		
		
		switch(btn) {
		
		case "add"->{
			
			String val=request.getParameter("val");
			Cookie c =new Cookie(name,val);
			
			response.addCookie(c);
			out.println("<h1>Cookie added</h1>");
		}
		
		
		case "delete"->{
			
			
			Cookie[] carr=request.getCookies();
			for(Cookie c :carr)
			{
				if(c.getName().equals(name))
				{
					c.setMaxAge(0);
					response.addCookie(c);
					out.println("<h2>cookie deleted"+name+"</h2>");
                    break;
				}
			}
		}
		
		case "display"->{
			
			Cookie[] carr=request.getCookies();
			if(carr!=null) {
			for(Cookie c:carr)
			{
				out.println("name:"+c.getName()+"---->"+"value:"+c.getValue());
			}
		}
			else
			{
				out.println("cookie not found");
			}
		}
		
		}
		RequestDispatcher rd=request.getRequestDispatcher("CookieDemo.html");
		rd.include(request, response);
		
	}

	
}
