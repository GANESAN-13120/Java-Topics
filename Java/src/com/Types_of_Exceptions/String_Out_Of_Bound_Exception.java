package com.Types_of_Exceptions;

public class String_Out_Of_Bound_Exception {
	
	public static void main(String[] args) {
		
		String s1 = "Wonderful";
		System.out.println(s1);
		
		int length = s1.length();
		System.out.println(length);
		
		char charAt = s1.charAt(15);
		System.out.println(charAt);
		
	}

}
