package com.app.beans;

// spring bean class 
public class Student {
	
	// bean property
	private String name;
	private String email;
	private Course course;
//	private String 
	
	public Student() {
		System.out.println("This is default constructor");
	}
	public Student(String name, String email,Course course) {
		this.name = name;
		this.email = email;
		this.course = course;
	}
	
	public void startMyCourse() {
		System.out.println("Student.startMyCourse()");
		course.startCourse();
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", course=" + course + "]";
	}
	
	

}
