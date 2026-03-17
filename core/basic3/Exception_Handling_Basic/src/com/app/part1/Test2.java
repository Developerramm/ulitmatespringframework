package com.app.part1;

class AB {
	int age = 30;
	
	void m1() {
		System.out.println("AB.m1()");
	}
}

class B extends AB{
	int j = 30;
	
	void m3() {
		System.out.println("B.m3()");
	}
}

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println("ram kumar");
		
		AB ab = new B();
		ab.m1();
		
		B b = (B) new AB();
		b.m3();
	}

}
