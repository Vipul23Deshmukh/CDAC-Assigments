<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Creating a object--%>

<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>

<%--Assign form values to the object --%>

<jsp:setProperty property="*" name="p"/>


<%--retrieve the data from the object --%>


<h1>product Data</h1>

Product id<jsp:getProperty property="pid" name="p"/></br>
Product pname<jsp:getProperty property="pname" name="p"/></br>
Product qty<jsp:getProperty property="qty" name="p"/></br>
Product price<jsp:getProperty property="price" name="p"/></br>


</body>
</html>