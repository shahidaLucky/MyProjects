package titutionAssistanceProgram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	@Column(name = "EmployeeID")
	private int employeeID;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;

	@Override
	public String toString() {
		return "Login [employeeID=" + employeeID + ", email=" + email + ", password=" + password + "]";
	}

	public Login() {
		super();
		this.email = "default";
		this.employeeID = 0;
		this.password = "123";
	}

	public Login(int employeeID, String email, String password) {
		super();
		this.employeeID = employeeID;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
