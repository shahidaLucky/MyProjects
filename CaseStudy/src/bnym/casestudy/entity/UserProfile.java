package bnym.casestudy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class UserProfile {
	@Id
	@Column(name = "USERNAME")
	@NotEmpty(message = "Username can not be empty")
	private String username;

	@Column(name = "PASSWORD", nullable = false)
	@NotEmpty(message = "Password can not be empty")
	private String password;
	
	//String encoded=new BCryptPasswordEncoder().encode("admin@123");

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userProfile")
	private Set<Authorities> authorities = new HashSet<>();
	
	@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@NotNull
	@Valid
	private Employee employee;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}

