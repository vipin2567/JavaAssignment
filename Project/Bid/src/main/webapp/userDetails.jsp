<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="BidDetails" method="post">
    <label for="itemName"><b><%=request.getParameter("itemName") %></b></label><br/><br/><br/>
  
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required> <br>
	
	<input type="hidden" name="itemName" value=<%=request.getParameter("itemName") %> />
   
    <label for="email"><b>Bidder's Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required> <br>

    <label for="email"><b>Bidder's Phone</b></label>
    <input type="text" placeholder="Enter Phone" name="phone" > <br>

    <label for="email"><b>Bidder's Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" > <br>
    
    <label for="bidvalue"><b>Maximum Bid Value</b></label>
    <input type="text" placeholder="Enter Max Bid Value" name="bvalue" > <br>
    

    <input type="submit" value="Save" />
   
 

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</html>