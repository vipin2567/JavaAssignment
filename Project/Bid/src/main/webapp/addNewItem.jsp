<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome  <%=request.getParameter("username") %></h3>
<form method="post" action="sellerItems" >
  <div class="container">
    <h1>Add New Item</h1>
    
    <hr>

    <input type="hidden" name="user" value="displayItem"> 
     <input type="hidden" name="username" value= <%=request.getParameter("username") %>> 
    <label for="itemName"><b>Item Name </b></label>
    <input type="text" placeholder="Enter Item name" name="sellerItemName" required>
    <div class="clearfix">
    
      <button type="submit" class="addbtn">Add</button>
    </div>
  </div>
</form>
</body>
</html>
