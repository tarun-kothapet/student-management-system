package com.mvc.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer Id;
	private String Name;
	private String Course;
	
	
	public Student() {
		
		
	}
	
	public Student(Integer id , String name , String course) {
		
		
		this.Id=id;
		this.Name=name;
		this.Course=course;
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
	@Override
	public String toString() {
		return Id+" "+ Name+ " "+ Course;
		
		
	}
	
}
