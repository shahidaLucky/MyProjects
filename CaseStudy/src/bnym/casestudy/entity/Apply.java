package bnym.casestudy.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "apply")
public class Apply {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "total_tenure")
	private boolean totalTenure;

	@Column(name = "PA_score")
	private int pa_core;

	@Column(name = "current_job_location")
	private boolean currentJobLocation;

	@Column(name = "relocation_need")
	private boolean relocationNeed;

	@Column(name = "promise")
	private boolean promise;

	@Column(name = "current_skills")
	@ElementCollection(fetch=FetchType.EAGER, targetClass=String.class)
	@NotEmpty
	private List<String> currentSkills;

	@Column(name = "loan_amount")
	private String loanAmount;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public boolean isTotalTenure() {
		return totalTenure;
	}

	public void setTotalTenure(boolean totalTenure) {
		this.totalTenure = totalTenure;
	}

	public int getPa_core() {
		return pa_core;
	}

	public void setPa_core(int pa_core) {
		this.pa_core = pa_core;
	}

	public boolean isCurrentJobLocation() {
		return currentJobLocation;
	}

	public void setCurrentJobLocation(boolean currentJobLocation) {
		this.currentJobLocation = currentJobLocation;
	}

	public boolean isRelocationNeed() {
		return relocationNeed;
	}

	public void setRelocationNeed(boolean relocationNeed) {
		this.relocationNeed = relocationNeed;
	}

	public boolean isPromise() {
		return promise;
	}

	public void setPromise(boolean promise) {
		this.promise = promise;
	}

	public List<String> getCurrentSkills() {
		return currentSkills;
	}

	public void setCurrentSkills(List<String> currentSkills) {
		this.currentSkills = currentSkills;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
}
