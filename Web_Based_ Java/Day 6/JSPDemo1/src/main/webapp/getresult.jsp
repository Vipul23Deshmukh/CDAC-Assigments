<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- this is html comment -->
<%--this is jsp comment --%>
<%-- ! used for method declaration --%>
<%! public int factorial(int n1)
{
   int fact=1;
   for(int i=1;i<=n1;i++)
   {
	   fact=fact*i;
   }
	
   return fact;
}
%>

<%
   String btn=request.getParameter("btn");
   int n1=Integer.parseInt(request.getParameter("num1"));
  
   
   if(btn.equals("add"))
   {
	int n2=Integer.parseInt(request.getParameter("num2"));
   int ans=n1+n2;
   
%>

<h2> Addition = <%=ans %></h2>

<%} else {
	        int fact=factorial(n1);
%>

<h2>Factorial of number = <%=fact %></h2>
<%} %>

</body>
</html>