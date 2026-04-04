package com.app.beans;

// target spring bean class
public class Student {
	
	private String username;
	private String name;
	private String email;
	private Course course;
	
	public Student() {
		System.out.println("Student.Student()");
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void startMyCouser() {
		// dependent class object is being used here ...
		
		System.out.println("Hello " + name + " " + username);
		course.startCourse();
	}
	
	@Override
	public String toString() {
		return "Student [username=" + username + ", name=" + name + ", email=" + email + ", course=" + course + "]";
	}
	
}
