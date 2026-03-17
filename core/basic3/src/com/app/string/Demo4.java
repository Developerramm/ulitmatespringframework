package com.app.string;

class A{
	
}

public class Demo4 {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		A a1 = new A();
		A a2 = new A();
		
		String str1 = new String("Ram");
		String str2 = new String("Ram");
		
		System.out.println(i == j);
		System.out.println(a1 == a2);
		
		System.out.println(str1 == str2);
		
	}

}
