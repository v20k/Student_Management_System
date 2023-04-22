

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

@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession();
		 Admin AdminAllData=(Admin)session.getAttribute("AdminAllData"); 
		 if(AdminAllData!=null){
			 
		 
		int Id=Integer.parseInt(req.getParameter("Id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String con = req.getParameter("contact");
		
		long contact=Long.parseLong(con);
		
		Student student=new Student();
		student.setId(Id);
		student.setName(name);
		student.setEmail(email);
		student.setContact_No(contact);
//		student.setAdmin(AdminAllData);
		
		
		Student_DAO dao=new Student_DAO();
		dao.updateStudent(student);
		
//		AdminAllData.getStudents().add(student);
//		new Admin_DAO().update(AdminAllData);
		
		
		
		req.getRequestDispatcher("GetStudents.jsp").forward(req, resp);
//		resp.sendRedirect("GetStudents");
	
		 }else{
				resp.sendRedirect("Login.jsp");
			}
		
	}
	
	
}
