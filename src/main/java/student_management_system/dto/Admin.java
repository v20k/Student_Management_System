package student_management_system.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Admin_Id;
    private String Admin_Name;
    @Column(unique = true)
    private String Admin_Email;
    private long Admin_Password;
    
    
    @OneToMany(mappedBy = "admin",fetch = FetchType.LAZY)
    
    List<Student> students;
    
	public int getAdmin_Id() {
		return Admin_Id;
	}
	public void setAdmin_Id(int admin_Id) {
		Admin_Id = admin_Id;
	}
	public String getAdmin_Name() {
		return Admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}
	public String getAdmin_Email() {
		return Admin_Email;
	}
	public void setAdmin_Email(String admin_Email) {
		Admin_Email = admin_Email;
	}
	public long getAdmin_Password() {
		return Admin_Password;
	}
	public void setAdmin_Password(long admin_Password) {
		Admin_Password = admin_Password;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
    

}
