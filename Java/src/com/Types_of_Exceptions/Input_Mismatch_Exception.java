package com.Types_of_Exceptions;

import java.util.Scanner;

public class Input_Mismatch_Exception {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the name");
		int nextInt = s1.nextInt();
		System.out.println(nextInt);
	}

}
