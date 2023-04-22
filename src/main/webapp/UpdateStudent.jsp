<%@page import="student_management_system.dto.Admin"%>
<% Admin AdminAllData=(Admin)session.getAttribute("AdminAllData"); 
if(AdminAllData!=null){
%>



<%@page import="student_management_system.dao.Student_DAO"%>
<%@page import="student_management_system.dto.Student"%>
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
box-shadow: 3px 3px 2px;
}
<%int rr=Integer.parseInt(request.getParameter("SId")); 
Student_DAO dao=new Student_DAO();
Student StudentDetails=dao.getStudent(rr);


%>
[type="submit"]:active {
	background-color: red;
}

</style>
<body>
<form action="UpdateStudent" method="post" >
<fieldset><legend>Update Student Details</legend>
<br><br>



<label>Student Id</label><br>
<input type="text" name="Id" value="<%= StudentDetails.getId() %>" readonly="readonly">
<br><br>
<label>Student Name</label><br>
<input  type="text" name="name" value="<%= StudentDetails.getName() %>" >
<br><br>
<label>Student Email</label><br>
<input type="text" name="email" value="<%= StudentDetails.getEmail() %>" >
<br><br>
<label>Student Contact Number</label><br>
<input type="text" name="contact" value="<%= StudentDetails.getContact_No() %>"  >
<br><br>
<input  type="submit" value="Update">

</fieldset>
</form>

</body>
</html>



<%}else{
	response.sendRedirect("Login.jsp");
}
%>