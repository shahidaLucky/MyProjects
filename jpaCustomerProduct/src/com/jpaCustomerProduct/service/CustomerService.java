package com.jpaCustomerProduct.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaCustomerProduct.dao.CustomerDAO;
import com.jpaCustomerProduct.entity.Customer;
import com.jpaCustomerProduct.entity.Product;

public class CustomerService implements CustomerDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaCustomerProduct");
	static EntityManager entityManager = emf.createEntityManager();

	@Override
	public void addCustomer(int cId, String cName, String cEmail) {
		Customer customer = new Customer();
		customer.setcId(cId);
		customer.setcName(cName);
		customer.setcEmail(cEmail);
		saveCustomer(customer);
	}

	// save customer method for commit
	public void saveCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
	}

	@Override
	public List<Customer> getCustomers() {
		Query query = entityManager.createQuery("SELECT c FROM Customer c ");
		List<Customer> cList = query.getResultList();

		for (Customer customer : cList) {
			System.out.println("+++++++++++++++++++++++++++");
		}
		return cList;
	}

	@Override
	public Customer getCustomer(int cId) {
		Customer customer = entityManager.find(Customer.class, cId);
		return customer;
	}

	@Override
	public void addProductToCustomer(int cId, int pId) {
		Product product = entityManager.find(Product.class, pId);
		Customer customer = getCustomer(cId);
		List<Product> pList = customer.getcProducts();
		if (pList.contains(product)) {
			System.out.println("You've ordered the Product already!");
		} else {
			customer.getcProducts().add(product);
			saveCustomer(customer);
		}
	}

	@Override
	public void getCustomerProducts(int cId) {
		Customer customer = entityManager.find(Customer.class, cId);
		List<Product> cProducts = customer.getcProducts();
		System.out.println("Customer ID: " + customer.getcId());

		for (Product product : cProducts) {
			System.out.println(product.toString());
			System.out.println("+++++++++++++++++++++++++++");
		}
	}

	/*
	 * (non-JavaDoc)
	 * 
	 * @see jpa.dao.CustomerDAO # removeCustomer(int)
	 */
	@Override
	public void removeCustomer(int cId) {
		Customer customer = getCustomer(cId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.commit();
		System.out.println("Customer removed with id: " + cId);
	}

	// closing connection
	public static  void closeManagerAndFactory() {
		entityManager.close();
		emf.close();
	}
}
