package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clazz")
public class Clazz {

	private Integer id;
	
	@Column(name="class_name")
	private String className;
	
	@Column(name="student_id")
	private Integer studentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Clazz [id=" + id + ", className=" + className + ", studentId=" + studentId + "]";
	}
	
	
	
}
