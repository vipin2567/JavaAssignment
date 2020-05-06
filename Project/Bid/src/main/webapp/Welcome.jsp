<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
<style>h1{
		color: green;
		text-align: center;
		border: 5px solid blue;
	}
	</style>
</head>
<body>
Today: <%=new Date()%>
	 <table>
	   <tr> 
	      <td> <h1>Welcome <%=request.getParameter("username") %></h1> </td>
	    </tr>
	    <tr>
	    	<td> <h2> You have successfully placed the bid for the item <%=request.getParameter("itemName") %> for Rs <%=request.getParameter("bvalue") %></h2> </td>
	    	</tr>
	    	<tr>
	    		<td>
	    		<a href="index.jsp">Back to Home Page</a>
	    		</td>
	    	</tr>
	    </table>
	
	
</body>
</html>