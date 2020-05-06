<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList" %>
<%@page import="bidFeature.Users" %>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h3> Congratulations <%=request.getParameter("winnerName") %> </h3>
<h3> You have win the bid for <%=request.getParameter("max") %> </h3>
</body>
</html>