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
<h3> Hey Seller !! Welcome <%=request.getParameter("username") %> </h3>
<h2>Item Name </h2>
<form method="post" action="sellerItems" >
<input type="hidden" name="user" value="addNewItem"> 
<input type="hidden" name="username" value=<%=request.getParameter("username") %>> 
<tr><td>Item Names</td></tr> <br> <br>
<% if ( null != sellerItemsList && !sellerItemsList.isEmpty()) {
for(SellerItemDetails sellerItemDetails : sellerItemsList) { %>
<a href="itemBidDetails.jsp?itemName=<%=sellerItemDetails.getSellerItem()%>"><tr><td><%=sellerItemDetails.getSellerItem()%></td></tr></a><br> <br>
<%} } else { %>
<tr><td>Currently List is Empty .Please add items!</td></tr><br> <br>
<%} %>
<tr><td> <button type="submit" class="signupbtn">Add New Item</button></td></tr>
<a href="index.jsp">Back to Home Page</a>

</form>

</body>
</html>