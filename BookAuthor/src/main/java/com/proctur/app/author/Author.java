package com.proctur.app.author;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.proctur.app.book.Book;

@Entity
@Table
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String authorName;
	private String contact;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> book = new ArrayList<>();


	public Author(int id, String name, String contact) {
		super();
		this.id = id;
		this.authorName = name;
		this.contact = contact;
	}

	public Author() {
		super();
	}

	public Author(String name, String contact) {
		super();
		this.authorName = name;
		this.contact = contact;
	}
	
	

	public Author(int id, String authorName, String contact, List<Book> book) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.contact = contact;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String name) {
		this.authorName = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

}
