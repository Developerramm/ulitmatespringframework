package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.CollegeInfo;
import com.app.beans.Faculty;
import com.app.beans.Student;
import com.app.beans.User;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		Student student = null;
		Faculty faculty = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		student = context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println("--------------------------------------------");
		faculty = context.getBean("faculty",Faculty.class);
		System.out.println(faculty);
		System.out.println("----------------------------------------");
		User user = context.getBean("user",User.class);
		System.out.println(user);
		
		System.out.println("----------------------------------------");
		
		CollegeInfo info = null;
		info = context.getBean("info",CollegeInfo.class);
		System.out.println(info);
		
		((AbstractApplicationContext)context).close();
	}

}
