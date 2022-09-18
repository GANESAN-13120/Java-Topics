package com.Exception_Handling.org;

import java.util.InputMismatchException;

public class Throw {
	
	public static void test() {
		int i = 50;
		System.out.println(i );
		
		throw new InputMismatchException("All is well");
	}
	
	public static void main(String[] args) {
		test();
	}

}
