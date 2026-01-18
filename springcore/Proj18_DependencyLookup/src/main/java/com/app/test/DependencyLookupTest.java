package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class DependencyLookupTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(context);
		
		Student student = null;
		
		student = context.getBean("student",Student.class);
		student.markAttendence();
		student.viewExamResult();
		student.giveTest();
		student.startOnlineLiveClass();
		
		
		((AbstractApplicationContext)context).close();
	
	}

}
