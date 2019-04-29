package titutionAssistanceProgram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeJobBasic {

	@Id
	//@Column(name = "Job ID")
	private int jobID;
	
	//@Column(name = "Join Date")
	private String joinDate;
	
	//@Column(name = "Designation")
	private String designation;
	
	//@Column(name = "Start Date")
	private String startDate;
	
	//@Column(name = "End Date")
	private String endDate;

	@Override
	public String toString() {
		return "EmployeeJobBasic [jobID=" + jobID  + ", joinDate=" + joinDate
				+ ", designation=" + designation + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	public EmployeeJobBasic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeJobBasic(int jobID, String joinDate, String designation, String startDate,
			String endDate) {
		super();
		this.jobID = jobID;
		//this.employeeID = employeeID;
		this.joinDate = joinDate;
		this.designation = designation;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

//	public int getEmployeeID() {
//		return employeeID;
//	}
//
//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
