package com.abhishek.springbootintro.teacher;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.abhishek.springbootintro.student.Students;


@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@GenericGenerator(name="system-uuid", strategy = "uuid"), generator="system-uuid"
	private int id;
	
	private String name;
	private String rollno;
	private String age;


	public Teacher() {

	}
	
	public Teacher (String name, String rollno, String age) {
		this.setName(name);
		this.setRollno(rollno);
		this.setAge(age);
	}

	public Teacher(int id, String name, String rollno, String age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	
	public Teacher(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
