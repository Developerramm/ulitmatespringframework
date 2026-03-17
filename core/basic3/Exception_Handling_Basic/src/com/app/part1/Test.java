package com.app.part1;

import java.util.Date;

class A{
	
	int i = 10;
	
	void m1() {
		System.out.println("A.m1()");
	}
}

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Ram kumar maniyari");
		
		Date d = new Date();
		System.out.println(d.toString());
		
		d = null;
		
//		System.out.println(d.toString());
		
		A a = new A();
//		a = null;
		System.out.println(a.i);
		a.m1();
	}

}
