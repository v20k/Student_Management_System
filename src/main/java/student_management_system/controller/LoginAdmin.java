package student_management_system.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student_management_system.dao.Admin_DAO;
import student_management_system.dto.Admin;

@WebServlet("/Login")
public class LoginAdmin extends HttpServlet {
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	     String pwd = req.getParameter("password");
	long password=Long.parseLong(pwd);
	    
	Admin_DAO dao=new Admin_DAO();
	Admin adminAllData = dao.getLoginId_Pwd(email, password);
	
	if(adminAllData!=null) {
		HttpSession session = req.getSession();
		session.setAttribute("AdminAllData", adminAllData);
		
		
		req.getRequestDispatcher("DashBoard.jsp").forward(req, resp);
	}else {
		req.getRequestDispatcher("SignUpAdmin.jsp").forward(req, resp);
	}
	
	
	}
	
}
