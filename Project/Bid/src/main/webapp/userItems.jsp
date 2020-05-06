<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
<%@page import="bidFeature.SellerItemDetails" %>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% ArrayList<SellerItemDetails> sellerItemsList = (ArrayList<SellerItemDetails>)session.getAttribute("SellerItems"); %>

<body>

<h2>Item Name </h2>
<form method="post" action="sellerItems" >


<tr><td>Item Names</td></tr> <br> <br>
<% if ( null != sellerItemsList && !sellerItemsList.isEmpty()) {
for(SellerItemDetails sellerItemDetails : sellerItemsList) { %>
<a href="userDetails.jsp?itemName=<%=sellerItemDetails.getSellerItem()%>"><tr><td><%=sellerItemDetails.getSellerItem()%></td></tr></a><br> <br>
<%} } else { %>
<tr><td>Currently List is Empty .Please add items!</td></tr><br> <br>
<%} %>
<a href="index.jsp">Back to Home Page</a>

</form>

</body>
</html>