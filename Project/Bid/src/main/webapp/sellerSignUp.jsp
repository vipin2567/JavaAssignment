<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="sellerItems" >
  <div class="container">
    <h1>Sign Up</h1>
    <p>Seller!!! Please Sign UP </p>
    <hr>

	<input type="hidden" name="user" value="signUp" />
    <label for="sellername"><b>sellername</b></label>
    <input type="text" placeholder="Enter seller name" name="sellername" required><br>

	<label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter username" name="username" required><br>


    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required><br>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter email" name="email" > <br>
    
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" > <br>
    

    <div class="clearfix">
      <button type="submit" class="signupbtn">SignUp</button>
      <button type="button" class="cancelbtn">Cancel</button>
      
    </div>
  </div>
</form>
</body>
</html>
