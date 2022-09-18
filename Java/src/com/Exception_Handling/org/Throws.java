package com.Exception_Handling.org;

public class Throws {
	
	public static void test() throws Exception{
		
		int i = 10;
		System.out.println(i/0);
		
		throw new Exception();
	}
	
	public static void main(String[] args)throws Exception {
		
		test();
		
		
		
	}

}
