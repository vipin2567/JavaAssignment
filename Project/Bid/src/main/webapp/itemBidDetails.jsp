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
<% ArrayList<Users> usersList = (ArrayList<Users>)session.getAttribute("ProductsInCart"); %>
<body>

<form method="post" action="sellerItems" >
 <h3> Item Name : <label for="itemName"><b><%=request.getParameter("itemName") %></b></label> </h3> <br/><br/><br/>
  <input type="hidden" name="user" value="closebid" />
    <input type="hidden" name="itemName" value=<%=request.getParameter("itemName") %> />
 <table border = 8px solid>
<tr><td>Sr No</td>
<td>Auction price</td>
<td>Item</td>
<td>Name</td>
<td>Email</td>
<td>Phone</td>
<td>Postal Address</td></tr> <br>
<% if ( null != usersList && !usersList.isEmpty()) {
for(int i=0;i<usersList.size();i++) { %>
<tr><td><%=i+1 %></td>
<td><%=usersList.get(i).getMaxbid() %></td>
<td><%=usersList.get(i).getItemName() %></td>
<td><%=usersList.get(i).getName() %></td>
<td><%=usersList.get(i).getEmail() %></td>
<td><%=usersList.get(i).getPhone() %></td>
<td><%=usersList.get(i).getAddress() %></td></tr><br>
</table>

<%} } else { %>
<tr><td>Currently List is Empty .Please add items!</td></tr><br> <br>
<%} %>

    <button type="submit" class="closebid">Close Bid</button>
   </form>
</body>
</html>