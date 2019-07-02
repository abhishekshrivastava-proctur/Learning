package com.proctur.uservehicle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class User {
	/* 
	 * all variables
	 *  
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String contact;
	
	/* 
	 * generating all getter and setters 
	 * 
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	/* 
	 * generating parameterized and default constructors 
	 * 
	 */
	public User(int id, String userName, String contact) {
		super();
		this.id = id;
		this.userName = userName;
		this.contact = contact;
	}
	public User() {
		super();
	}
	
	
}
