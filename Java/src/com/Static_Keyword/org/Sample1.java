package com.Static_Keyword.org;

public class Sample1 extends Sample {
	static int a = 95;
	
	
	public static void test1() {
		
		int a = 75;
		System.out.println("Local variable is"+a);
		System.out.println("Static variable is");
	}
	static {
		System.out.println("Information Technology");
	}
	
	public static void main(String[]args) {
		
	    
		test1();
		System.out.println(a);
	}

}
