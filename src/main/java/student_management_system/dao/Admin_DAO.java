



package student_management_system.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import student_management_system.dto.Admin;

public class Admin_DAO {
 EntityManagerFactory factory=Persistence.createEntityManagerFactory("Beta");
 EntityManager manager=factory.createEntityManager();
 EntityTransaction transaction=manager.getTransaction();
 
 public void saveAdmin(Admin a) {
	 transaction.begin();
	 manager.persist(a);
	 transaction.commit();
 }
 public Admin getLoginId_Pwd(String e_mail,long pwd) {
	try {
		 Query q = manager.createQuery("select a from Admin a where a.Admin_Email=?1 and a.Admin_Password=?2");
	     q.setParameter(1, e_mail);
	     q.setParameter(2, pwd);
	     
	     Admin login_credentials =(Admin) q.getSingleResult();
	    
	     return login_credentials;
	     
	}catch (Exception e) {
		System.out.println(" noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
	    return null;
	}
 }
 
 public void update(Admin admin) {
	 transaction.begin();
	 manager.merge(admin);
	 transaction.commit();
 }
 
 
 
 
}
