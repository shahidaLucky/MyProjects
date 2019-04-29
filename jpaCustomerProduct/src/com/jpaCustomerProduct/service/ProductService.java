package com.jpaCustomerProduct.service;

import java.sql.Savepoint;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaCustomerProduct.dao.ProductDAO;
import com.jpaCustomerProduct.entity.Product;

public class ProductService implements ProductDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaCustomerProduct");
	static EntityManager entityManager = emf.createEntityManager();

	@Override
	public void addProduct(int pId, String pName) {
		Product product = new Product();
		product.setpId(pId);
		product.setpName(pName);
		saveProduct(product);
	}

	// saveProduct method to commit
	public void saveProduct(Product product) {
		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();
	}

	@Override
	public List<Product> getProducts() {
		Query query = entityManager.createQuery("SELECT p FROM Product p");
		List<Product> pList = query.getResultList();

		for (Product product : pList) {
			System.out.println(product.toString());
			System.out.println("++++++++++++++++++++++");
		}
		return pList;
	}

	@Override
	public Product getProduct(int pId) {
		Product product = entityManager.find(Product.class, pId);
		return product;
	}

	public static void closeManagerAndFactory() {
		entityManager.close();
		emf.close();
	}

}
