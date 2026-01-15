package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Car;

public class BeanInheritancedTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		Car car = null;
		
		car = context.getBean("car2",Car.class);
		System.out.println(car);
		
		Car car1 = context.getBean("car1",Car.class);
		System.out.println(car1);
		
		
		System.out.println(context);
		
		System.out.println("Ram kumar maniyari");
		System.out.println("This is java tutorial here below");
		
		
		((AbstractApplicationContext)context).close();
	}

}
