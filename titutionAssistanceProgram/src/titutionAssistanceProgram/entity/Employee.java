package titutionAssistanceProgram.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.eclipse.persistence.jpa.config.Cascade;


@Entity
public class Employee {

	@Id
	//@Column(name = "employee ID")
	private int employeeID;
	
	//@Column(name = "First Name")
	private String firstName;
	
	//@Column(name = "Last Name")
	private String lastName;
	
	//@Column(name = "Email")
	private String email;
	
	//@Column(name = "Home Address")
	@OneToOne(cascade = CascadeType.PERSIST)
	@MapsId
	HomeAddress homeAddress;
	
	//@Column(name = "Work address")
	@OneToOne(cascade = CascadeType.PERSIST)
	WorkAddress workAddress;
	
	//@Column(name = "Mobile")
	private String mobile;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	EmployeeJobBasic employeeJobBasic;

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + ", mobile=" + mobile + "]";
	}

//	public Employee() {
//		super();
//		this.employeeID = 0;
//		this.email = "default";
//		this.firstName = "default";
//		this.lastName = "defult";
//		this.mobile = "334";
//		this.homeAddress = null;
//		this.workAddress = null;
//		this.employeeJobBasic = null;
//	}
	
	
	public Employee() {
		
	}

	public Employee(int employeeID, String firstName, String lastName, String email, String mobile) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.homeAddress = null;
		this.workAddress = null;
		this.employeeJobBasic = null;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomeAddress() {
		return null;
	}

	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getWorkAddress() {
		return null;
	}

	public void setWorkAddress(WorkAddress workAddress) {
		this.workAddress = workAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public EmployeeJobBasic getEmployeeJobBasic() {
		return employeeJobBasic;
	}

	public void setEmployeeJobBasic(EmployeeJobBasic employeeJobBasic) {
		this.employeeJobBasic = employeeJobBasic;
	}
	
	
	
	
}
