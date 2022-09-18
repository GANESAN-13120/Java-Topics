package com.Exception_Handling.org;

import java.util.InputMismatchException;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		int i =100;
		try { 
			System.out.println(i/0);
		}
		
		catch(InputMismatchException in) {
			
		in.printStackTrace();
		
	}
		finally {
			System.out.println("Automation Tester");
		}

}} 
