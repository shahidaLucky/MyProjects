package com.jpaCustomerProduct.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@Column(name = "id")
	private int pId;
	@Column(name = "name")
	private String pName;

	public Product() {
		this.pId = 0;
		this.pName = "defaultProductName";
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}

	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

}
