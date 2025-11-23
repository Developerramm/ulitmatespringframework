package com.app.beans;

// dependent spring bean class
public class Course {
	
	private String name;
	
	public Course() {
		System.out.println("Course.Course()");
	}
	
	public void startCourse() {
		System.out.println("Course is loading....");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
}
