 package com.inheritance.org;

public class Employee_Details extends Green_Tech  {
	
	
	public void employee_name() {
		
       System.out.println("GANESAN");	
	}
     public void employee_Age() {
    	 
    	 System.out.println("26");
     }
     public void employee_Job() {
    	 
    	 System.out.println("Quality engineer");
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Details eD = new Employee_Details();
      
      eD.employee_name();
      eD.employee_Age();
      eD.employee_Job();
      eD.course("Greens Technology");
      eD.course_name("Selinium Java");
      
      
	}

}
