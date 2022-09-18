package com.String_Functions_or_Manipulations;

public class String_Functions {

	public static void main(String[] args) {
		
		String s1 ="GANESAN is a quality testing Engineer";
		String s2 ="His joined package 20 lakhs";
		String s3 ="";
		//1 
		int length = s1.length();
		System.out.println(length);
		//2
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		//3
		boolean ecase = s2  .equalsIgnoreCase(s1);
		System.out.println(ecase);
		//4
		String uppercase = s1.toUpperCase();
		System.out.println(uppercase);
		//5
		String lowercase = s2.toLowerCase();
		System.out.println(lowercase);
        //6
		boolean startswith = s1.startsWith("gane");
		System.out.println(startswith);
		//7
		boolean endswith = s2.endsWith("lakhs");
		System.out.println(endswith);
		//8
		boolean contains = s2.contains("is");
 		System.out.println(contains);
		//9
		int indexof = s1.indexOf("e");
		System.out.println(indexof);
		//10
		int lastindexof = s2.indexOf("e");
		System.out.println(lastindexof);
		//11
		char charAt = s2.charAt(15);
		System.out.println(charAt);
		//12
		String replace = s1.replace("quality testing Engineer","Software developer");
		System.out.println(replace);
		//13
		String substring = s2.substring(6);
		System.out.println(substring);
		//14
		boolean empty = s3.isEmpty();	
		System.out.println(empty);

	}
 
}
