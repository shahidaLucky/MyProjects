package bnym.casestudy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	// @Column(name = "employee ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private Long id;

	// @Column(name = "First Name")
	@NotEmpty(message = "Applicant name can not be empty")
	@Size(max = 25, message = "Name must be less than 25 characters")
	private String firstName;

	// @Column(name = "Last Name")
	@NotEmpty(message = "Applicant name can not be empty")
	@Size(max = 25, message = "Name must be less than 25 characters")
	private String lastName;

	@Column(unique = true)
	@NotEmpty
	@Email(message = "Pleae provide you email")
	private String email;

	// @Column(name = "Home Address")
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@Valid
	Address address;

	// @Column(name = "Mobile")
	@NotEmpty
	private String mobile;

	@OneToOne(cascade = CascadeType.ALL)
	@Valid
	@NotNull
	EmployeeJobBasic employeeJobBasic;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	Apply application;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public Apply getApplication() {
		return application;
	}

	public void setApplication(Apply application) {
		this.application = application;
	}
	
	

}
