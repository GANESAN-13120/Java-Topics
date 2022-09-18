package com.poly.org;

public class Method_Overriding2  extends  Method_Overriding1{
	@Override
	public void employee_Details(String name) {
		System.out.println("employee name is "+ name);
		
	}
	@Override
	public void employee_Details(int age) {
		System.out.println("emoloyee age is"+ age);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overriding2 m2 = new Method_Overriding2();
		m2.employee_Details("GANESAN");
		m2.employee_Details(26);
  
	}

}
