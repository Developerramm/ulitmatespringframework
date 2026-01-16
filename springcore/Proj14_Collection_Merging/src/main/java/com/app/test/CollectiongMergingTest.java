package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class CollectiongMergingTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = context.getBean("s1",Student.class);
		
		Student s2 = context.getBean("s2",Student.class);
		System.out.println(s2);
		
		Student s3 = context.getBean("com.app.beans.Student",Student.class);
		System.out.println(student);
		System.out.println(s3);
		
		((AbstractApplicationContext)context).close();
	}

}
