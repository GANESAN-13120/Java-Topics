package com.Array.org;

public class Test {

	public static void main(String[] args) {
		//Datatype variablename[] = new Datatype[length]
		
		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		System.out.println(a[3]);
		
		for(int i=0; i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	

	}

}
