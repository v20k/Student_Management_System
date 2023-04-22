package student_management_system.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student_management_system.dto.Admin;
@WebServlet("/logout")
public class AdminLogout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		 Admin AdminAllData=(Admin)session.getAttribute("AdminAllData"); 
		 if(AdminAllData!=null){
		 
			 session.setAttribute("AdminAllData", null);
//			 session.setAttribute("a", null);   //it creates new session so keep key as same as before so that you can properly make session close
		 }
		 else {
			 resp.sendRedirect("LoginAdmin.jsp");
		 }
		 
		 resp.sendRedirect("LoginAdmin.jsp");
	}
}
