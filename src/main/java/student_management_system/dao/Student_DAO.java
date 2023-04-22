package student_management_system.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import student_management_system.dto.Student;

public 

class Student_DAO {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Beta");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveStudent(Student s) {
		transaction.begin();
		manager.persist(s);
		transaction.commit();

	}
	public List getStudents() {
		return  manager.createQuery("select s from Student s").getResultList(); 
           
	}
	public Student getStudent(int d) {
		return manager.find(Student.class,d );
	}
	
	public void updateStudent(Student a) {
		transaction.begin();
		manager.merge(a);
		transaction.commit();        
	}

	public void DeleteStudent(Student a) {
		transaction.begin();
		manager.remove(a);
		transaction.commit();
	}
	
}
