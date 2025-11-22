package com.app.beans;

// target class
public class Student {
	
	private String name;
	private String email;
	private String username;
	
	private Course course;
	
	public Student() {
		System.out.println("Sudent.Sudent()");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Sudent [name=" + name + ", email=" + email + ", username=" + username + ", course=" + course + "]";
	}
	
	public void startMyCourse() {
		// dependent class is going to use
		course.startCourse();
	}
	
}
