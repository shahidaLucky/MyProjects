package com.jpaCustomerProduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	@Column(name= "id")
	private int cId;
	@Column(name="name")
	private String cName;
	@Column(name="email")
	private String cEmail;
	
	@OneToMany
	List<Product> cProducts;
	
	public Customer() {
		this.cId = 0;
		this.cName = "defaultName";
		this.cProducts = new ArrayList<Product>();
	}

	public Customer(int cId, String cName, String cEmail, List<Product> cProducts) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cProducts = cProducts;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cProducts=" + cProducts + "]";
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public List<Product> getcProducts() {
		return cProducts;
	}

	public void setcProducts(List<Product> cProducts) {
		this.cProducts = cProducts;
	}
	
}
