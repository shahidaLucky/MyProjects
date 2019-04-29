package com.jpaLibraryManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Author {

	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int authorId;
	private String authorName;
	
	// Cosntructors
	public Author() {

	}

	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}
