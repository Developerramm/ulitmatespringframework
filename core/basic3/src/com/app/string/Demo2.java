package com.app.string;

public class Demo2 {
	public static void main(String[] args) {
		String str1 = new String("Ram");
		
		String str2 = str1.concat(" kumar");
		
		String str3 = str2.concat(" developer");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str3.length());
		
		String str = "Ram".concat(" kumar").concat(" maniyari");
		System.out.println(str);
		
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
	}

}
