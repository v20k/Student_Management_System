package student_management_system.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student_management_system.dao.Student_DAO;
import student_management_system.dto.Admin;
import student_management_system.dto.Student;
@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet{


@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
	
	HttpSession session = req.getSession();
	 Admin AdminAllData=(Admin)session.getAttribute("AdminAllData"); 
	 if(AdminAllData!=null){

		Student_DAO dao=new Student_DAO();
//		Student student=new Student();
		
		int getId=Integer.parseInt(req.getParameter("StudentID"));
		
		
		Student Student=dao.getStudent(getId);
		
		dao.DeleteStudent(Student);
	
		req.getRequestDispatcher("GetStudents.jsp").forward(req, resp);
//		resp.sendRedirect("GetStudents.jsp");
		
	 }else{
			resp.sendRedirect("Login.jsp");
		}
		
	}
	
}
