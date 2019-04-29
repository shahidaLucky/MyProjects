package com.lucky.libraryManagement.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.lucky.libraryManagement.model.Book;

public class BookDao implements DaoInterface<Book, String> {

	private Session currentSession;
	private Transaction currentTransaction;

	public BookDao() {
	}

	private static SessionFactory getSessionFactory() {
//		Configuration configuration = new Configuration().configure();
//		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties());
//		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
//		return sessionFactory;
		try {
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();

		} catch (HibernateException he) {
			System.out.println("Session Factory creation failure");
			throw he;
		}
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public Session openCurrentSessionWithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSessionWithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTrasaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(Book entity) { // save
		getCurrentSession().save(entity);
	}

	public void update(Book entiry) {
		getCurrentSession().saveOrUpdate(entiry);
	}

	public Book findById(String id) {
		Book book = (Book) getCurrentSession().get(Book.class, id);
		return book;
	}

	public void delete(Book entity) {
		getCurrentSession().delete(entity);
	}

	public List<Book> findAll() {
		List<Book> books = (List<Book>) getCurrentSession().createQuery("from Book").getResultList();
		return books;
	}

	public void deleteAll() {
		List<Book> entityList = findAll();
		for (Book entiry : entityList) {
			delete(entiry);
		}
	}

}
