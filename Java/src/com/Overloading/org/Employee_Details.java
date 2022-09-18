package com.Overloading.org;

public class Employee_Details {
	public void employee(String name ,String Department) {
		System.out.println("Employee name is" +name);
		System.out.println("Employee department is" + Department);
		
	}
	public void employee(String age) {
		System.out.println("employee age is" +age);
	}
	public void Employee(String salary) {
		System.out.println("employee salary is" +salary);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee_Details eD = new  Employee_Details();
				 eD.employee("GANESAN","IT");
		         eD.employee("26");
		         eD.Employee("1,00,000");
 }

}
