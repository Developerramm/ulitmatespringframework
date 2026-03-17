package com.app.string;

public class Demo3 {
	
	public static void main(String[] args) {
		String str1 = new String("Ram");
		String str2 = str1.concat(" ");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = "Ram";
		
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
	}

}
