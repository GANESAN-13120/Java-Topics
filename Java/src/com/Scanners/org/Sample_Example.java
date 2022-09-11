package com.Scanners.org;
import java.util.Scanner;
public class Sample_Example {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String next = s1.next();
		System.out.println("The name is"+next);
		System.out.println("Enter all the name");
		s1.nextLine();
		String nextline = s1.nextLine();
		System.out.println("The names are"+nextline);
		System.out.println("Enter the age");
		int nextint = s1.nextInt();
		System.out.println("The age is"+nextint);

	}

}
