
<%@page import="student_management_system.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
  display: flex;
  flex-direction:column;
  align-items: center;
  justify-content: center;
  margin-top: 100px;
}
a{
padding: 5px 10px;
text-decoration: none;
border: 2px solid red;
border-radius: 2em;
}
</style>

</head>
<body>
<% Admin adminAllData= (Admin) session.getAttribute("AdminAllData");
if(adminAllData!=null){
%>


<h1>WELCOME ADMIN</h1>
<h6>You can manage the students database here</h6>
<div><a href="SavePerson.jsp">Save_Student</a><a href="GetStudents.jsp">View_Students</a></div>
<br>
<br>
<br>
<br>
<a href="logout">Logout</a>
</body>
</html>
<%}else{
request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
}
%>





