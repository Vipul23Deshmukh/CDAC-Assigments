<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>using jsp expression</h2>
Number1 : <%=request.getParameter("num1") %>
Number2 : <%=request.getParameter("num2") %>

Message:<%=request.getParameter("msg") %>


<hr>
<h2>using EL language</h2>
Number1 =${param.num1}
Number2=${param.num2}



</body>
</html>