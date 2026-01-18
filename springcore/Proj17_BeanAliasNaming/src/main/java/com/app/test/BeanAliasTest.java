package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class BeanAliasTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = null;
		
		student = context.getBean("student",Student.class);
		System.out.println(student);
		
		student = context.getBean("s1",Student.class);
		System.out.println(student);
		
		student = context.getBean("s2",Student.class);
		System.out.println(student);
		
		student = context.getBean("s3",Student.class);
		System.out.println(student);
		
		
		
		((AbstractApplicationContext)context).close();
	}

}
