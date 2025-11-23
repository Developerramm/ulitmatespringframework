package com.app.beans;

// spring bean class
public class Student {
	
	// bean properties
	private String name;
	private String email;
	
	private Course course;
	
	public Student() {
		System.out.println("Zero param constructor is called");
	}
	
	public Student(String name, String email, Course course) {
		System.out.println("Parameterized constructor ");
		this.name = name;
		this.email = email;
		this.course = course;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCourse(Course course) {
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
