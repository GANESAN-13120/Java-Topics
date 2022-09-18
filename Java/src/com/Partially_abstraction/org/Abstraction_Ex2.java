package com.Partially_abstraction.org;

public class Abstraction_Ex2 extends Abstract_Ex  {
	@Override
	public void employee_Role(){
		System.out.println("Employee Role is Senior Software Tester");
	}
	@Override
	public void employee_Salary() {
		System.out.println("Employee Salary is 1,00,000");
	}
	public static void main(String[] args) {
		Abstraction_Ex2 a2 = new Abstraction_Ex2();
		a2.employee_name();
		a2.employee_age();
		a2.employee_Role();
		a2.employee_Salary();
		
		
		
	}

}
