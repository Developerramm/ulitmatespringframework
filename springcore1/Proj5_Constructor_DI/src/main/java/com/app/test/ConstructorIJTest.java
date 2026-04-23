package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class ConstructorIJTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("config.xml");
		
//		System.out.println(context);
//		System.out.println(context.getClass().getName());
//		
		Student student = null;
		student = context.getBean("student",Student.class);
		
		System.out.println(student);
		System.out.println(student.hashCode());
		student.startMyCourse();
		
		
		((AbstractApplicationContext)context).close();
	}

}
