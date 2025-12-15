package com.app.student.entity;

import java.io.Serializable;

public class StudentEntity implements Serializable{
	
	private Integer id;
	private String name;
	private String courseName;
	private Integer obtMarks;
	private String grade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getObtMarks() {
		return obtMarks;
	}
	public void setObtMarks(Integer obtMarks) {
		this.obtMarks = obtMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
