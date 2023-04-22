
<%@page import="student_management_system.dto.Admin"%>
<% Admin AdminAllData=(Admin)session.getAttribute("AdminAllData"); 
if(AdminAllData!=null){
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
<body>
<form action="SaveStudent" method="post">
<fieldset><legend>Student Details</legend>
<br><br>

<label>Student Name</label><br>
<input  type="text" name="name" placeholder="Enter Student Name " >
<br><br>
<label>Student Email</label><br>
<input type="text" name="email" placeholder="Enter Student Email " >
<br><br>
<label>Student Contact Number</label><br>
<input type="tel" name="contact" placeholder="Enter Student Contact Number " >
<br><br>
<input  type="submit" value="save">
</fieldset>
</form>
</body>
</html>

<%}else{
response.sendRedirect("LoginAdmin.jsp");
}%>