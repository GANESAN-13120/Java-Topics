package com.Key_Words.org;

public class Sample1 extends sample {
	int a=85;
	public void test () {
		
		int a=100;
		System.out.println("Local variable is" + a);
		System.out.println("Class variable is" + this.a);
		System.out.println("Parent Class variable is" + super.a);
		
	}
	public static void main (String[]args) {
		
		Sample1 s1 = new Sample1();
		s1.test();
		s1.test1();
	}

}
