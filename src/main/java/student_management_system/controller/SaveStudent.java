package student_management_system.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student_management_system.dto.Admin;
import student_management_system.dto.Student;
import student_management_system.dao.Admin_DAO;
import student_management_system.dao.Student_DAO;

@WebServlet("/SaveStudent")
public class SaveStudent extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		Admin adminAllData= (Admin) session.getAttribute("AdminAllData");
		 if(adminAllData!=null){
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		     String con = req.getParameter("contact");
		long contact=Long.parseLong(con);
		
		Student student1=new Student();
		student1.setName(name);
		student1.setEmail(email);
		student1.setContact_No(contact);
		student1.setAdmin(adminAllData);
		
		Student_DAO dao=new Student_DAO();
		dao.saveStudent(student1);
		
//		       Admin admin=new Admin();
//		admin.setAdmin_Email(email);
//		      admin.setAdmin_Id(adminAllData.getAdmin_Id());
//		admin.setStudents(student1);
//		List<Student> ad =
//		       admin.setStudents(null);
//				  admin.getStudents().add(student1);
		
//		ad.add(student1);
		
		adminAllData.getStudents().add(student1);
		
		Admin_DAO admin_dao=new Admin_DAO();
		
		admin_dao.update(adminAllData);
		
		resp.sendRedirect("DashBoard.jsp");
		
		 }else{
			 resp.sendRedirect("LoginAdmin.jsp");
		 }
	}
}

	