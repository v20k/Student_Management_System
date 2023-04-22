package student_management_system.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_management_system.dao.Admin_DAO;
import student_management_system.dto.Admin;

@WebServlet("/SignUp")
public class SignUpAdmin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		  String pwd = req.getParameter("password");
		long password=Long.parseLong(pwd);
		
		Admin admin=new Admin();
	    admin.setAdmin_Name(name);	
	    admin.setAdmin_Email(email);
	    admin.setAdmin_Password(password);
	    
	    Admin_DAO dao=new Admin_DAO();
	    dao.saveAdmin(admin);
	    
	    req.getRequestDispatcher("LoginAdmin.jsp").forward(req, resp);
	}
	
}
