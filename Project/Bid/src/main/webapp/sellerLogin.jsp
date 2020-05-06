<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Login</h1>
 <p>Seller!!! Please Login </p>
<form id="sellerlogin" method="post" action="sellerItems" >
  <div class="container">
    <hr>
    <input type="hidden" name="user" value="login" />
    <label for="sellername"><b>Username</b></label>
    <input type="text" required="required" id="username" name="username" placeholder="Enter user name"><br> 
    <label for="psw"><b>Password</b></label>
    <input type="password" required="required" id="password" name="password" placeholder="Enter Password"><br>
    <div class="clearfix">
       <br>
       <button type="submit" class="loginbtn">Login</button>
       <button type="submit" class="cancelbtn">Cancel</button>
    </div>
  </div>
</form>
</body>
</html>
