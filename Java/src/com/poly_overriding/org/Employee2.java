 package com.poly_overriding.org;

public class Employee2 extends  Employee1 {

	
	public void employee1(int zip) {
		super.employee1(zip);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e2 = new Employee2();
		 e2.employee1("GANESAN");
		 e2.employee1(26);
		 e2.employee1(627808);

}
}
