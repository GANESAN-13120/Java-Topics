package com.GANESH_RESTURANT.org;

public class Food_Details {
	public void food_Items() {
		System.out.println("FOOD ITEM : BRIYANI");
		System.out.println("FOOD ITEM : FRIED RICE");
		System.out.println("FOOD ITEM : NOODLES");
	}
	public void food_Price() {
		System.out.println("BRIYANI IS   : RS 350");
		System.out.println("FRIED RICE IS: RS 300");
		System.out.println("NOODLES IS   : RS 250");
	} 
	public void juice_Items() {
		System.out.println("juice : Apple");
		System.out.println("juice : Orange");
		System.out.println("juice : Mango");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food_Details fD = new Food_Details();
		fD.food_Items();
		fD.food_Price();
		fD.juice_Items();
	}

}
