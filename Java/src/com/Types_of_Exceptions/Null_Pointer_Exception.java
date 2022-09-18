package com.Types_of_Exceptions;

public class Null_Pointer_Exception {
	
	public static void PrintLength(String str) {
		System.out.println(str.length());
		
	}
    public static void main(String[] args) {
		
    	String str = null;
    	PrintLength(str);
	}
}
