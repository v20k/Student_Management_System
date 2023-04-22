<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
  margin-top:70px;
  display: flex;
  flex-direction:column;
  align-items: center;
  justify-content: center;
  
  
}
form{
width: 700px;
}
[type="submit"]{
background-color: grey;
color: white;
font-size:large;
height: 30px;
width: 100px;
border-radius: 2px ;
box-shadow: 3px 2px 2px;
}
</style>
</head>
<body>

<form action="Login" method="post">
<fieldset>
<legend>Login</legend>
<br><br>
<input type="email" name="email" placeholder="Enter Your Email"><br><br>
<input type="password" name="password" placeholder="Enter your password"><br><br>
<input type="submit" value="Login">
</fieldset>
</form>


</body>
</html>