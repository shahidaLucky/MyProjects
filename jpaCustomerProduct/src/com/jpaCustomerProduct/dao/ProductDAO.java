package com.jpaCustomerProduct.dao;

import java.util.List;

import com.jpaCustomerProduct.entity.Product;

public interface ProductDAO {

	// Add a Product
	public void addProduct(int pId, String pName);

	// Get all Products
	public List<Product> getProducts();

	// Get a Product
	public Product getProduct(int pId);
}
