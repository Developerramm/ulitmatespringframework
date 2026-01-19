package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonStaticFactoryBeanInstantiationTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		String string = context.getBean("s2",String.class);
		
		System.out.println(string);
		
		string = context.getBean("s4",String.class);
		System.out.println(string);
		
		
		((AbstractApplicationContext)context).close();
	}

}
