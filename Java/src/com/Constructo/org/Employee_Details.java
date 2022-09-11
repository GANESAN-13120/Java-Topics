package com.Constructo.org;

public class Employee_Details {
	public  Employee_Details   () {
		System.out.println("Employee name is ");
		}
	public Employee_Details(String name,int age) {
		System.out.println("Employee age is "+age);
		System.out.println("Employee name is "+name);
		
	}

	public static void main(String[]args) {
		Employee_Details e1 = new Employee_Details();
		Employee_Details e2 =  new Employee_Details("Raja",24);
	}
}
