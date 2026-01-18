package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// target spring bean class
public class Student {
	
	private ZoomStreamingApi zoomApi;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void markAttendence() {
		System.out.println("attendence done");
	}
	
	public void giveTest() {
		System.out.println("Test is started");
	}
	
	public void viewExamResult() {
		System.out.println("Last semester result");
	}
	
	public void startOnlineLiveClass() {
		
		// zoom streaming API will be used
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
		zoomApi = context.getBean("api",ZoomStreamingApi.class);
		
		zoomApi.streamVideoClassOnline();
		
		((AbstractApplicationContext)context).close();
		
	}
}
