package com.Types_of_Exceptions;

public class Array_Out_Of_Bound_Exception {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		System.out.println(a[6]);
		

}
}