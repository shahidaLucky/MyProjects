package com.jpaCustomerProduct.dao;

import java.util.List;

import com.jpaCustomerProduct.entity.Customer;

public interface CustomerDAO {

	// Add A Customer
	public void addCustomer(int cId, String cName, String cEmail);

	// Get all Customer
	public List<Customer> getCustomers();

	// Get a Customer
	public Customer getCustomer(int cId);

	// Add Product to Customer
	public void addProductToCustomer(int cId, int pId);

	// Get a Customer Products
	public void getCustomerProducts(int cId);

	// Remove a Customer
	public void removeCustomer(int cId);
}
