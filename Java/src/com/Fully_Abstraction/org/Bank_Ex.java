package com.Fully_Abstraction.org;

public class Bank_Ex implements Bank, Bank1 {
	@Override
	public void home_loan(){
		System.out.println("Home Loan is 5,00,000");
	}
	@Override
	public void education_loan(){
		System.out.println("Educational Loan is 4,00,000");
	}@Override
	public void personal_loan(){
		System.out.println("Personal Loan is 3,00,000");
	}
	@Override
	public void bike_loan(){
		System.out.println("Bike Loan is 2,00,000");
	}
	@Override
	public void car_loan(){
		System.out.println("Car Loan is 1,00,000");
	}
	
	 

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stubE
		 Bank_Ex eX = new  Bank_Ex();
		 eX.home_loan();
		 eX.education_loan();
		 eX.personal_loan();
		 eX.bike_loan();
		 eX.car_loan();

	}

}
