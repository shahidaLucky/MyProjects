package bnym.casestudy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @IdClass(AuthoritiesId.class)
@Table(name = "AUTHORITIES")
public class Authorities {
	  @Id
	  @Column(name = "AUTHORITY")
	  private String authority;

	  @Id
	  @ManyToOne
	  @JoinColumn(name = "USERNAME")
	  private UserProfile userProfile;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	  
}

 class AuthoritiesId implements Serializable{
	 private String authority;
	  private UserProfile userProfile;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
}
