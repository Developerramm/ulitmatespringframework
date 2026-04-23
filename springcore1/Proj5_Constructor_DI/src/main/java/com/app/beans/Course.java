package com.app.beans;

public class Course {
	
	private String name;
	
	public Course() {
		System.out.println("Course.Course()");
	}
	
	public void startCourse() {
		System.out.println("Course is loading....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	
}
