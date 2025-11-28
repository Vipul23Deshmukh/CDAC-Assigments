<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Myheader.html"%>
<form action="getresult.jsp">

Num1 <input type="number" name="num1" id="num1"></br>
Num2 <input type="number" name="num2" id="num2"></br>


<button type ="submit" name="btn" id="btn" value="add">Addition</button>

<button type ="submit" name="btn" id="btn" value="factorial">factorial</button>


</form>
<%@include file="Footer.html" %>
</body>
</html>