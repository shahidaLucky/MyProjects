package bnym.casestudy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="address")
public class Address {

	@Id
	//@Column(name = "Address ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private Long id;
	
	//@Column(name = "Employee ID")
	//private int employeeID;
	
	//@Column(name = "Street Line1")
	@NotEmpty(message = "Please provide the streetLine1")
	private String streetLine1;
	
	//@Column(name = "Street Line2")
	@NotEmpty(message = "Please provide the streetLine2")
	private String streetLine2;
	
	//@Column(name = "City")
	@NotEmpty(message = "Please provide the city")
	private String city;
	
	//@Column(name = "State")
	@NotEmpty(message = "Please provide the state")
	private String state;
	
	//@Column(name = "Zip Code")
	@NotEmpty(message = "Please provide the zipcode")
	private String zipCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetLine1() {
		return streetLine1;
	}

	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	public String getStreetLine2() {
		return streetLine2;
	}

	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
