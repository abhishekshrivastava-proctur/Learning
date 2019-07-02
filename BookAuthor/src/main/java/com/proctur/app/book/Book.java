package com.proctur.app.book;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.proctur.app.author.Author;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	private String title;
	private String description;
	@ManyToOne(cascade = CascadeType.ALL)
	private Author author;
	
	public Book() {
		
	}
	
	public Book(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public Book(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	

	public Book(int id, String title, String description, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
