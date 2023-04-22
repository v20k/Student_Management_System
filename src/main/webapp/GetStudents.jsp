<%@page import="student_management_system.dto.Admin"%>
<% Admin AdminAllData=(Admin) session.getAttribute("AdminAllData"); 
if(AdminAllData!=null){
%>


<%@page import="student_management_system.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="student_management_system.dao.Student_DAO"%>
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
  display: flex;
  flex-direction:column;
  align-items: center;
  justify-content: center;
  margin-top: 100px;
}

</style>
<body>
<table border="" cellpadding=10px cellspacing=0>
<tr>
<th>Student_ID</th>
<th>Student_Name</th>
<th>Student_Email</th>
<th>Student_Contact_NO</th>
<th>Update</th>
<th>Delete</th>
</tr>
<%-- <%! int a=0; %>
 --%>
<%
Student_DAO dao=new Student_DAO();
List<Student> res= dao.getStudents();
/* List <Student> res= (List) request.getAttribute("Students"); */
for(Student r:res) { %>

<tr>
<td><%= r.getId()%></td>

<td><%= r.getName() %></td>
<td><%= r.getEmail() %></td>
<td><%= r.getContact_No() %></td>
<td><a  href="UpdateStudent.jsp?SId=<%= r.getId() %>">update</a></td>
<td><a href="DeleteStudent?StudentID=<%= r.getId() %>">Delete</a></td>
</tr>

<% } %>
</table>


<h4><a href="DashBoard.jsp">Close</a></h4>


</body>
</html>



<%}else{
	response.sendRedirect("LoginAdmin.jsp");
}%>